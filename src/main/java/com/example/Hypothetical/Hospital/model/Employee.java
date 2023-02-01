package com.example.Hypothetical.Hospital.model;

public class Employee {
	
	private String id;
	private String fistname;
	private String lastname;
	private String especialist;
	
	public Employee() {
		
	}
	
	public Employee(String id, String fistname, String lastname, String especialist) {
		
		this.id = id;
		this.fistname = fistname;
		this.lastname = lastname;
		this.especialist = especialist;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEspecialist() {
		return especialist;
	}

	public void setEspecialist(String especialist) {
		this.especialist = especialist;
	}
	
	
	
	

}
