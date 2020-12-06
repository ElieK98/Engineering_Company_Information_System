package com.IntegrationProject1.developmentservice.models;

public class Developer {

	private String Id;
	private String fullName;
	private String codingLanguage;
	
	public Developer() {}
	
	public Developer(String id, String fullname, String clanguage) {
		Id = id;
		this.fullName = fullname;
		this.codingLanguage = clanguage;
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

	public void setFullName(String fullname) {
		this.fullName = fullname;
	}

	public String getCodingLanguage() {
		return codingLanguage;
	}

	public void setClanguage(String clanguage) {
		this.codingLanguage = clanguage;
	}
	
	
}
