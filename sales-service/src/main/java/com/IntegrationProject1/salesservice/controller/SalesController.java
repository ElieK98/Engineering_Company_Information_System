package com.IntegrationProject1.salesservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.IntegrationProject1.salesservice.models.Product;
import com.IntegrationProject1.salesservice.models.ProductList;

@RestController
@RequestMapping("/sales")
public class SalesController {

	private List<Product> products=Arrays.asList(
			new Product("P1","Social Media Intelligence Tool","Social"),
			new Product("P2","Credit Card Fraud detection tool","Banking"),
			new Product("P3","Covid-19 platform","Health")
			);
	
	@RequestMapping("/products")
	public ProductList getProducts(){
		ProductList productsList = new ProductList();
		productsList.setProducts(products);
		
		return productsList;
	}
	@RequestMapping("/products/{Id}")
	public Product getProductById(@PathVariable("Id")String Id) {
		Product p=products.stream()
				.filter(product->Id.equals(product.getId()))
				.findAny()
				.orElse(null);
		
		return p;
	}
}
