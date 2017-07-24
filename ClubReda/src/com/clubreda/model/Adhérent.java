package com.clubreda.model;

public class Adhérent {
	
	private String Code;
	private String Nom;
	private String Prenom;
	private short Age;
	private String Sexe;
	private String Tele;
	private String Adresse;
	private String image;
	
	public  Adhérent(){
		super();
	}
	
	public Adhérent(String Code,String Nom,String Prenom,short Age,String Sexe,String Tele,String Adresse,String image){
		super();
		this.Code=Code;
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Age=Age;
		this.Sexe=Sexe;
		this.Tele=Tele;
		this.Adresse=Adresse;
		this.image=image;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public short getAge() {
		return Age;
	}

	public void setAge(short age) {
		if(Age==16)
		Age = age;
	}

	public String getSexe() {
		return Sexe;
	}

	public void setSexe(String sexe) {
		Sexe = sexe;
	}

	public String getTele() {
		return Tele;
	}

	public void setTele(String tele) {
		Tele = tele;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

}
