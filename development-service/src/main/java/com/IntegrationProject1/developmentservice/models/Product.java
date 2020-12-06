package com.IntegrationProject1.developmentservice.models;

public class Product {

	private String Id;
	private String productName;
	private String category;
	
	public Product() {}

	public Product(String id, String productName, String category) {
		
		Id = id;
		this.productName = productName;
		this.category = category;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
