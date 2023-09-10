package com.example.simple_fulfillment_service_lld;

import com.example.simple_fulfillment_service_lld.entity.Product;
import com.example.simple_fulfillment_service_lld.exception.ProductNotFoundException;
import com.example.simple_fulfillment_service_lld.repository.ProductRepository;
import com.example.simple_fulfillment_service_lld.service.ProductService;
import com.example.simple_fulfillment_service_lld.service.ProductServiceImpl;

/**
 * Simple Fulfillment service

You have to design and implement a Fulfillment Service that allows us to keep track of inventory. 

Requirements:
The fulfillment service will receive requests to add or remove inventory. 
There can be any number of different product ids. 
The remove inventory function will just remove one item of the specified product id. 
If the removal of inventory is not possible because there are no products available, the appropriate error should be shown to the user. 
The following functionalities have to be implemented: 
Mandatory:
Note: The given parameters are the mandatory parameters, you are free to add more parameters as part of your apis if you feel the need to do so. The return type of each api is up to you but make sure it provides the relevant information needed. 
addInventory(productId, amount)
This will add the specified amount of inventory for the productId in the system.
removeInventory(productId)
This will remove one item from the inventory for the specified productId.
viewInventory()
This will give a view of the whole inventory system. It will print all the products available and their count. It can be printed in any format as long as it is readable. 


Guidelines:
You should store the data in-memory using a language-specific data-structure.
You can print the output in console. 
Implement clear separation between your data layers and service layers. 
Expectations:
Your code should cover all the mandatory functionalities explained above. 
Your code should be executable and clean.
Your code should be properly refactored, and exceptions should be gracefully handled.
 *
 */
public class App 
{
    public static void main( String[] args ) throws ProductNotFoundException
    {
        
    	ProductRepository productRepository = new ProductRepository();
    	ProductService productService = new ProductServiceImpl(productRepository);
    	
    	Product p1 = new Product(1, 2000, "DS&Algo");
    	Product p2 = new Product(2, 3000, "DBMS");
    	Product p3 = new Product(3, 5000, "Machine learning");
    	Product p4 = new Product(4, 3500, "OOPS");
    	Product p5 = new Product(5, 4000, "Java");
    	
    	productService.addInventory(p1.getProductId(), p1.getAmount(), p1.getName());
    	productService.addInventory(p2.getProductId(), p2.getAmount(), p2.getName());
    	productService.addInventory(p3.getProductId(), p3.getAmount(), p3.getName());
    	productService.addInventory(p4.getProductId(), p4.getAmount(), p4.getName());
    	productService.addInventory(p5.getProductId(), p5.getAmount(), p5.getName());
    
    	System.out.println("------------Product List-------------");
    	System.out.println(productService.viewInventory());
    	
    	productService.removeInventory(2);
    	
    	System.out.println("-----------After remove one inventory---------");
    	
    	System.out.println(productService.viewInventory());
    	
    	//productService.removeInventory(10);
    }
}
