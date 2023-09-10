package com.example.simple_fulfillment_service_lld.service;

import java.util.List;

import com.example.simple_fulfillment_service_lld.entity.Product;
import com.example.simple_fulfillment_service_lld.exception.ProductNotFoundException;

public interface ProductService {

	
	public void addInventory(int productId, int amount, String productName);
	public void removeInventory(int productId) throws ProductNotFoundException;
	public List<Product> viewInventory();
}

