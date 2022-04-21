package com.Store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Store.Repository.ProductTypeRepository;
import com.Store.model.ProductType;
@Service
public class ProductTypeServiceImp implements ProductTypeService {
	
	private ProductTypeRepository productRepository;
	@Autowired
	public ProductTypeServiceImp(ProductTypeRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<ProductType> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public ProductType addNewProduct(ProductType product) {
		return this.productRepository.save(product);
	}

	@Override
	public ProductType updateProduct(Integer No, ProductType product) {
		ProductType products = getProductById(No);
		products.setProductName(product.getProductName());
		products.setProductType(product.getProductType());
		products.setColour(product.getColour());
		products.setDimension(product.getDimension());
		ProductType prod = productRepository.save(products);
		return prod;
	}

	@Override
	public ProductType getProductById(Integer No) {
		return productRepository.findById(No).get();
	}

	@Override
	public boolean existsById(Integer No) {
		return productRepository.existsById(No);
	}

	@Override
	public void deleteProduct(Integer No) {
		productRepository.deleteById(No);
		
	}

}
