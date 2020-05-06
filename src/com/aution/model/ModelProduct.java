package com.aution.model;

public class ModelProduct {

	private String productName;
	private String model;
	public String getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "products [productName=" + productName + ", model=" + model + "]";
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
