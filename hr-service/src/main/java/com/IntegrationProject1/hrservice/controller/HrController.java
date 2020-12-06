package com.IntegrationProject1.hrservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IntegrationProject1.hrservice.models.Employee;
import com.IntegrationProject1.hrservice.models.EmployeesList;

@RestController
@RequestMapping("/hr")
public class HrController {
	
	private List<Employee> employees = Arrays.asList(
			new Employee("E1","Elie Khalbourji","Development"),
			new Employee("E2","John Kassab","Sales"),
			new Employee("E3","Maria Zraibi","HR"),
			new Employee("E4","Julie Wartanian","HR")
			);
	
	//call HR service 
	@RequestMapping("/employees")
	public EmployeesList getEmployees(){
		EmployeesList employeesList = new EmployeesList();
		employeesList.setEmployees(employees);
		
		return employeesList;
	}
	
	
	
	@RequestMapping("/employees/{Id}")
	public Employee getEmployeeById(@PathVariable("Id")String Id) {
		Employee e = employees.stream()
				.filter(employee -> Id.equals(employee.getId()))
				.findAny()
				.orElse(null);
		return e;
	}
}
