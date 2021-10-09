package com.builder.screen;

public class ScreenBuilder {
	
	private String brand;
	
	private String type;
	
	private Integer price;

	public ScreenBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public ScreenBuilder setType(String type) {
		this.type = type;
		return this;
	}

	public ScreenBuilder setPrice(Integer price) {
		this.price = price;
		return this;
	}
	
	public ScreenProp build() {
		return new ScreenProp(brand, type, price);
	}
	

}
