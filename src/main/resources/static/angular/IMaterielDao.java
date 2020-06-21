package gestmat.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestmat.entities.Materiel;

public interface IMaterielDao extends JpaRepository<Materiel, Long>{
	
	@Query("select m from Materiel m where m.intitule like :x")
	public Page<Materiel> materielParSearch(@Param("x")String search,Pageable p);
	
	public List<Materiel> findByIntitule(String intitule);
	
	public Page<Materiel> findByIntitule(String intitule, Pageable p);
	
}
