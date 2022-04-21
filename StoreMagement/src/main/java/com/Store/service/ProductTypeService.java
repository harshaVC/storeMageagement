package com.Store.service;

import java.util.List;

import com.Store.model.ProductType;


public interface ProductTypeService {
List<ProductType> getAllProduct();
	
	ProductType addNewProduct(ProductType product);
	
	ProductType updateProduct(Integer No, ProductType product);
	ProductType getProductById(Integer No);
	boolean existsById(Integer No);
	
	void deleteProduct(Integer No);

}
