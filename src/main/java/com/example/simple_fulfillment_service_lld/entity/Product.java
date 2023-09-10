package com.example.simple_fulfillment_service_lld.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {

	private int productId;
	private int amount;
	private String name;
	
}
