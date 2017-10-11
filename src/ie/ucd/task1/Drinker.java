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
	
	/*This method returns a boolean to show if drunk
	 * return true if drinker is drunk
	  */
	public boolean isDrunk() {
		 if (weight/numberOfDrinks <= 10)
			 return true;
		 else {
			 return false;
		 }
	 }
	/* Overrides the drink methods to allow for counter
	 * keeps track of drink drunk
	 */
	@Override
	public boolean drink(Drink drink) {
		numberOfDrinks += 1;
		return true;
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
