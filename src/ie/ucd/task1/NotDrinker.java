package ie.ucd.task1;

import ie.ucd.people.*;
import ie.ucd.items.*;

public class NotDrinker extends Person {
	private String firstName;
	private String lastName;
	private double weight;
		
	public NotDrinker(String firstName,String lastName, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	
	@Override
	public boolean drink(Drink drink) {
		if (drink instanceof AlcoholicDrink) {
			System.out.println(firstName +" can not drink alcohol");
			return true;
		}
		else {
			System.out.println(firstName +" drank the "+drink.getName());
			return false;
		}
	}

	@Override
	public boolean eat(Food arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String getLastName() {
		return lastName;
	}
	@Override
	public double getWeight() {
		return weight;
	}
}