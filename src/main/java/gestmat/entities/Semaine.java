package gestmat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Semaine implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String semaine;
	private int mois;
	private int anne;
	private String delai;
	private String emploi;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSemaine() {
		return semaine;
	}
	public void setSemaine(String semaine) {
		this.semaine = semaine;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnne() {
		return anne;
	}
	public void setAnne(int anne) {
		this.anne = anne;
	}
	public String getDelai() {
		return delai;
	}
	public void setDelai(String delai) {
		this.delai = delai;
	}
	public String getEmploi() {
		return emploi;
	}
	public void setEmploi(String emploi) {
		this.emploi = emploi;
	}
	public Semaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Semaine(Long id, String semaine, int mois, int anne, String delai, String emploi) {
		super();
		this.id = id;
		this.semaine = semaine;
		this.mois = mois;
		this.anne = anne;
		this.delai = delai;
		this.emploi = emploi;
	}
	
	

}
