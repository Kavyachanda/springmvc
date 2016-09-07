package com.dao;

import com.model.Product;

public class DaoDemo {

	public static void main(String[] args) {
			      ProductDAO productDao = new ProductDaoImpl();

			      //print all students
			      for (Product product : productDao.getAllProducts()) {
			         System.out.println("Product: [ID : " + product.getId() + ", Name : " + product.getName() + ", Category : " + product.getCategory() + ", Price : " + product.getPrice() + " ]");
			      }


			      //update student
			      Product product =productDao.getAllProducts().get(0);
			      product.setName("c");
			      productDao.updateProduct(product);

			      //get the student
			      productDao.getProduct(0); 
			      System.out.println("Product: [Id : " + product.getId() + ", Name : " + product.getName() + ", Category : " + product.getCategory() + ", Price : " + product.getPrice() + " ]");		
			   }
			}
