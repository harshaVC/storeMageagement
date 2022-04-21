package com.Store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Store")
public class ProductType {
	@Id
	private Integer productNo;
	@Column
	private String productName;
	@Column
	private String productType;
	@Column
	private String colour;
	@Column
	private String dimension;
	
	public ProductType() {
		super();
	}
	public ProductType(Integer productNo, String productName, String productType, String colour, String dimension) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productType = productType;
		this.colour = colour;
		this.dimension = dimension;
	}
	public Integer getProductNo() {
		return productNo;
	}
	public void setProductNo(Integer productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	

}
