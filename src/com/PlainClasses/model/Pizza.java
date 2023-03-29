package com.PlainClasses.model;

import java.util.List;

public class Pizza {
    private String name;
    private PizzaSize size;
    private Crust crust;
    private List<Topping> toppings;
    private int price;

    public Pizza(String name, PizzaSize size, Crust crust, List<Topping> toppings, int price) {
        this.name = name;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public Crust getCrust() {
		return crust;
	}

	public void setCrust(Crust crust) {
		this.crust = crust;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    

}

