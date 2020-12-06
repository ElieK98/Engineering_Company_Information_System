package com.IntegrationProject1.developmentservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.IntegrationProject1.developmentservice.models.Developer;
import com.IntegrationProject1.developmentservice.models.EmployeesList;
import com.IntegrationProject1.developmentservice.models.ProductList;

@RestController
@RequestMapping("/development")
public class DevelopmentController {

	@Autowired
	private RestTemplate restTemplate;
	
	private List<Developer> developers = Arrays.asList(
			new Developer("D1","Elie Khalbourji","Java"),
			new Developer("D2","Maria Zraibi","React Native"),
			new Developer("D3","John Kassab","C++"),
			new Developer("D4","Julie Wartanian","Python")
			);
	//to call HR service
	@RequestMapping("/employeeslist")
	public EmployeesList getListOfEmployees() {
		EmployeesList employeesList=restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
		
		return employeesList;
	}
	
	@RequestMapping("/productslist")
	public ProductList getListOfProducts() {
		ProductList productsList=restTemplate.getForObject("http://sales-service/sales/products", ProductList.class);
		
		return productsList;
	}
	
	@RequestMapping("/developers")
	public List<Developer> getDevelopers(){
		
		return developers;
	}
	@RequestMapping("/developers/{Id}")
	public Developer getDeveloperById(@PathVariable("Id")String Id) {
		
		Developer d = developers.stream()
				.filter(developer ->Id.equals(developer.getId()))
				.findAny()
				.orElse(null);
		
		return d;
		
	}
}
