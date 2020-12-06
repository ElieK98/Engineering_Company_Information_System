package com.IntegrationProject1.developmentservice.models;

public class Employee {
	private String Id;
	private String fullName;
	private String department;
	
	public Employee() {}

	public Employee(String id, String fullName, String department) {
		Id = id;
		this.fullName = fullName;
		this.department = department;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
