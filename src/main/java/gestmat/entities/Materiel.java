package gestmat.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Materiel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	private String dimension;
	private int quantite;
	private Date dateAcquisition;
	private String etat;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public String getDimension() {
		return dimension;
	}
	
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public Date getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public String getEtat() {
		return etat;
	}
	
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materiel(Long id, String intitule, String dimension, int quantite, Date dateAcquisition,
			String etat) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.dimension = dimension;
		this.quantite = quantite;
		this.dateAcquisition = dateAcquisition;
		this.etat = etat;
	}

	public Materiel(String intitule, String dimension, int quantite, Date dateAcquisition, String etat) {
		super();
		this.intitule = intitule;
		this.dimension = dimension;
		this.quantite = quantite;
		this.dateAcquisition = dateAcquisition;
		this.etat = etat;
	}
}
