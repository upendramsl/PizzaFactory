package com.PlainClasses.model;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<String> toppings;
    private ArrayList<String> crusts;
    private ArrayList<String> sides;
    
    public Inventory() {
        toppings = new ArrayList<String>();
        crusts = new ArrayList<String>();
        sides = new ArrayList<String>();
    }
    
    public void addTopping(String topping) {
        toppings.add(topping);
    }
    
    public void removeTopping(String topping) {
        toppings.remove(topping);
    }
    
    public void addCrust(String crust) {
        crusts.add(crust);
    }
    
    public void removeCrust(String crust) {
        crusts.remove(crust);
    }
    
    public void addSide(String side) {
        sides.add(side);
    }
    
    public void removeSide(String side) {
        sides.remove(side);
    }
    public boolean placeOrder (Order order)
    {

    	boolean isValidOrder = true;

    	// Check inventory and update ingredients for (Pizza pizza: order.getPizzas()) {
    	for(Pizza pizza :order.getPizzas())
    	{
    	if (!checkInventory(pizza))
    	{

    	isValidOrder = false;

    	break;

    	}
    	
    	updateInventory(pizza);
    }
    	double totalAmount = 0;

    	for (Pizza pizza: order.getPizzas()) 
    	{ totalAmount += calculatePizzaCost (pizza);

    	}

    	for (Side side :order.getSides())
    	{ 
    		totalAmount += calculateSideCost (side);

    	} 
    	order.setTotalAmount (totalAmount);

    	// Return order validity

    	return isValidOrder; 

    }

	private boolean checkInventory(Pizza pizza)
	{
		return false;
	}

	private void updateInventory(Pizza pizza)
	{
		
		
	}

	private double calculatePizzaCost(Pizza pizza)
	{
		return 0;
	}

	private double calculateSideCost(Side side)
	{
		return 0;
	}
}