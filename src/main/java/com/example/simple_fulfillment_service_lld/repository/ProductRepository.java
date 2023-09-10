package com.example.simple_fulfillment_service_lld.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.simple_fulfillment_service_lld.entity.Product;
import com.example.simple_fulfillment_service_lld.exception.ProductNotFoundException;

public class ProductRepository {

	
	Map<Integer, Product> map = null;
	public ProductRepository() {
		
		map = new HashMap<>();
	}
	
	
	public void addInventory(int productId, int amount, String productName) {
	
		map.put(productId, new Product(productId, amount, productName));
	}
	
	
	public void removeInventory(int productId) throws ProductNotFoundException {
		
		if(!map.containsKey(productId))
			throw new ProductNotFoundException("Product with id is not present");
	
		map.remove(productId);
	}
	
	public List<Product> viewInventory(){
		
	  List<Product> productList = 
							map.entrySet().stream()
									      .map(prod -> prod.getValue())
									      .collect(Collectors.toList());
		
		return productList;
	}
}
