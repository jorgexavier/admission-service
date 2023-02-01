package com.example.Hypothetical.Hospital.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Hypothetical.Hospital.model.DiseasesList;
import com.example.Hypothetical.Hospital.model.EmployeesList;
import com.example.Hypothetical.Hospital.model.Pacient;



@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	List <Pacient> pacients = Arrays.asList(
			new Pacient("P1", "Jorge", "Cape verde"),
			new Pacient("P2", "Antonio", "Portugal"),
			new Pacient("P3", "Aires", "França"));
			
	@RequestMapping("/physicians")
	public  EmployeesList getPhysicians() {
		EmployeesList employeesList = restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
		
		return employeesList;
	}
	
	@RequestMapping("/diseases")
	public  DiseasesList getDiseases() {
		DiseasesList diseasesList = restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseasesList.class);
		
		return diseasesList;
	}
	
	@RequestMapping("/pacients")
	public List<Pacient> getPacient(){
		return pacients;
	}
	
	@RequestMapping("/pacients/{Id}")
	public Pacient getPacientById(@PathVariable("Id") String Id){
		Pacient d = pacients.stream()
				.filter(Pacient -> Id.equals(Pacient.getId()))
				.findAny()
				.orElse(null);
		return d;
	}
	
	

}
