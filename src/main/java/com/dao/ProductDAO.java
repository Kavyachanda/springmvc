package com.dao;

import java.util.*;

import com.model.Product;

public interface ProductDAO {

	public List<Product> getAllProducts();
	public Product getProduct(int id);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	
}
