package ie.ucd.task1;

import ie.ucd.items.*;

public class Main {
	
	public static void main (String[] args) {
		
		/* Initialise Drinkers and NotDrinkers */
		Drinker drinker = new Drinker("Fred", "Johnson", 80);
		NotDrinker notdrinker = new NotDrinker("George","White", 100);
		
		/* Test correct implementation of class Drinker */
		System.out.print("Testing correct implementation of class Drinker.\n");
		System.out.print("Name: " + drinker.getFirstName() + " " + drinker.getLastName() + ".\nWeight: " + drinker.getWeight()  + "Kg \n\n");
		
		/* Test correct implementation of class NotDrinker */
		System.out.print("Testing correct implementation of class NotDrinker.\n");
		System.out.print("Name: " + notdrinker.getFirstName() + " " + notdrinker.getLastName() + ".\nWeight: " + notdrinker.getWeight()  + "Kg \n\n");
		
		Drink wine = new Wine("Red", 15, 15, null);
		Drink coke = new SoftDrink("Coke", 0.33);
		
		drinker.drink(wine);
		notdrinker.drink(wine);
		
		drinker.drink(coke);
		notdrinker.drink(coke);
		
		//Get Drinker drunk
		for(int i=1; i<11; i++){
			drinker.drink(wine);
       }
		
		drinker.drunk();
	
		
		System.out.print("******* End of the program *********");
		
	}

}