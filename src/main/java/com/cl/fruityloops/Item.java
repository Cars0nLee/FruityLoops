package com.cl.fruityloops;

public class Item {
	// Member variables
	private String name;
	private double price;
	
	// Constructor
	public Item(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
