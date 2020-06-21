package gestmat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestmat.dao.IMaterielDao;
import gestmat.entities.Materiel;

@RestController
public class MaterielController {
	
	@Autowired
	private IMaterielDao materielDao;
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/ajout")
	public Materiel ajoutMateriel(@RequestBody Materiel m) {
		materielDao.save(m);
		return m;
	}
	
	@RequestMapping("/listes")
	public List<Materiel> listeMateriels() {
		return materielDao.findAll();
	} 
	
	@RequestMapping("/materiels")
	public Page<Materiel> listeMateriels(int page) {
		return materielDao.findAll(new PageRequest(page, 5));
	}
	
	@RequestMapping("/materielsParSearch")
	public Page<Materiel> listeMateriels(String search,int page) {
		return materielDao.materielParSearch("%"+search+"%", new PageRequest(page, 5));
	}
	
	@RequestMapping("/get")
	public Materiel getMateriel(Long id) {
		return materielDao.findById(id).orElse(null);
	}
	
	@RequestMapping("/update")
	public Materiel update(@RequestBody Materiel m) {
		materielDao.saveAndFlush(m);
		return m;
	}
	
	@RequestMapping("/delete")
	public boolean delete(Long id) {
		materielDao.deleteById(id);
		return true;
	}
	
	
}
 