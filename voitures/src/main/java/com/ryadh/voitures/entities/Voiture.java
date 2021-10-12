package com.ryadh.voitures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long idVoiture;
	private String nomVoiture;
	private String matVoiture;
	private Double prixVoiture;
	private Date datecreation;
	
	 
	
	public Voiture() {
		super();
	}
	
	
	public Voiture(String nomVoiture, String matVoiture, Double prixVoiture, Date datecreation) {
		super();
		this.nomVoiture = nomVoiture;
		this.matVoiture = matVoiture;
		this.prixVoiture = prixVoiture;
		this.datecreation = datecreation;
	}


	public long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getNomVoiture() {
		return nomVoiture;
	}
	public void setNomVoiture(String nomVoiture) {
		this.nomVoiture = nomVoiture;
	}
	public String getMatVoiture() {
		return matVoiture;
	}
	public void setMatVoiture(String matVoiture) {
		this.matVoiture = matVoiture;
	}
	public Double getPrixVoiture() {
		return prixVoiture;
	}
	public void setPrixVoiture(Double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}


	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", nomVoiture=" + nomVoiture + ", matVoiture=" + matVoiture
				+ ", prixVoiture=" + prixVoiture + ", datecreation=" + datecreation + "]";
	}
	
	
	

}
