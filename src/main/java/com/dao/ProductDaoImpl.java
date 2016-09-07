package com.dao;

import java.util.*;

import com.model.Product;
import com.dao.ProductDAO;

public  class ProductDaoImpl implements ProductDAO {
 
	List<Product> products;

	   public ProductDaoImpl(){
	      products = new ArrayList<Product>();
	      Product product1 = new Product(1,"x","y",10);
	      Product product2 = new Product(2,"a","b",20);
	      products.add(product1);
	      products.add(product2);		
	   }
	   
	   public void deleteProduct(Product product) {
		   products.remove(product.getId());
	      System.out.println("Product: Id " + product.getId() + ", deleted from database");
	   }

	   //retrive list of students from the database
	   
	   public List<Product> getAllProducts() {
	      return products;
	   }

	   
	   public Product getProduct(int id) {
	      return products.get(id);
	   }

	   
	   public void updateProduct(Product product) {
		   products.get(product.getId()).setName(product.getName());
		   products.get(product.getId()).setCategory(product.getCategory());
		   products.get(product.getId()).setPrice(product.getPrice());
	      System.out.println("Product: Id" + product.getId() + ", updated in the database");
	   }
	}