package com.builder.screen;

public class ScreenProp {
	
	private String brand;
	
	private String type;
	
	private Integer price;

	public ScreenProp(String brand, String type, Integer price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ScreenProp [brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
