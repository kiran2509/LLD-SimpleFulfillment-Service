package com.example.simple_fulfillment_service_lld.service;

import java.util.List;

import com.example.simple_fulfillment_service_lld.entity.Product;
import com.example.simple_fulfillment_service_lld.exception.ProductNotFoundException;
import com.example.simple_fulfillment_service_lld.repository.ProductRepository;


public class ProductServiceImpl implements ProductService{

	
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public void addInventory(int productId, int amount, String productName) {
		// TODO Auto-generated method stub
		productRepository.addInventory(productId, amount, productName);
	}

	@Override
	public void removeInventory(int productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		productRepository.removeInventory(productId);
	}

	@Override
	public List<Product> viewInventory() {
		return productRepository.viewInventory();
	}

}
