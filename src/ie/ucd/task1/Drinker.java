package ie.ucd.task1;

import ie.ucd.people.*;
import ie.ucd.items.*;

public class Drinker extends Person {
	private int numberOfDrinks =0;
	private String firstName;
	private String lastName;
	private double weight;
		
	public Drinker(String firstName,String lastName, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight=weight;
	}
	
	public void drunk() {
		 if (weight/numberOfDrinks <= 10){
			 System.out.println(firstName +" is drunk");
		 }
		 else {
			 System.out.println(firstName +" can keep drinking");
		 }
	 }

	@Override
	public boolean drink(Drink drink) {
		numberOfDrinks += 1;
		System.out.println(firstName + " drank some "+ drink.getName());
		return false;
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
