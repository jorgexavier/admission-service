package com.example.Hypothetical.Hospital.model;

public class Pacient {
	
	private String id;
	private String name;
	private String nacionality;
	
	public Pacient() {
		
	}
	
	
	public Pacient(String id, String name, String nacionality) {
		
		this.id = id;
		this.name = name;
		this.nacionality = nacionality;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNacionality() {
		return nacionality;
	}


	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}
	
	
	
	

}
