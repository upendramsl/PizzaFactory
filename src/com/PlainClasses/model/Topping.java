package com.PlainClasses.model;

public class Topping {
    private String name;
    private double price;
    private ToppingType type;

    public Topping(String name, double price2, ToppingType initialQuantity) {
        this.name = name;
        this.price = price2;
        this.type = initialQuantity;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ToppingType getType() {
		return type;
	}

	public void setType(ToppingType type) {
		this.type = type;
	}

    
}

