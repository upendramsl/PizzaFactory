package com.PlainClasses.model;

import java.util.List;

public class Order {
    private List<Pizza> pizzas;
    private List<Side> sides;
    private int totalPrice;

    public Order(List<Pizza> pizzas, List<Side> sides, int totalPrice)
    {
        this.pizzas = pizzas;
        this.sides = sides;
        this.totalPrice =totalPrice;

}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public List<Side> getSides() {
		return sides;
	}

	public void setSides(List<Side> sides) {
		this.sides = sides;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setTotalAmount(double totalAmount) {
		// TODO Auto-generated method stub
		
	}
    
}
