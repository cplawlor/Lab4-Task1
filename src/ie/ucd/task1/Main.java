package ie.ucd.task1;

import ie.ucd.items.*;

public class Main {
	
	public static void main (String[] args) {
		
		/* Initialize Drinkers and NotDrinkers */
		Drinker drinker = new Drinker("Fred", "Johnson", 80);
		NotDrinker notDrinker = new NotDrinker("George","White", 100);
		
		/* Test correct implementation of class Drinker */
		System.out.print("Testing correct implementation of class Drinker.\n");
		System.out.print("Name: " + drinker.getFirstName() + " " + drinker.getLastName() + ".\nWeight: " + drinker.getWeight()  + "Kg \n\n");
		
		/* Test correct implementation of class NotDrinker */
		System.out.print("Testing correct implementation of class NotDrinker.\n");
		System.out.print("Name: " + notDrinker.getFirstName() + " " + notDrinker.getLastName() + ".\nWeight: " + notDrinker.getWeight()  + "Kg \n\n");
		
		//Create drinks
		Drink wine = new Wine("Red", 15, 15, null);
		Drink coke = new SoftDrink("Coke", 0.33);
		
		//Test if people can drink alcoholic drinks
		System.out.print("Can drinker drink alcohol?: " + drinker.drink(wine) + "\n");
		System.out.print("Can notDrinker drink alcohol?: " + notDrinker.drink(wine)+ "\n\n");
		
		//Test if people can drink not alcoholic drink
		System.out.print("Can drinker drink nonalcoholic drink?: " + drinker.drink(coke) + "\n");
		System.out.print("Can notDrinker drink nonalcoholic drink?: " + notDrinker.drink(coke)+ "\n\n");
		
		//Drinker drinks a lot of drinks
		for(int i=1; i<11; i++){
			drinker.drink(wine);
       }
		
		//Test if drinker is drunk
		System.out.println("Is " + drinker.getFirstName() + " drunk?: " + drinker.drunk()+ "\n");
		
	
		
		System.out.print("******* End of the program *********");
		
	}

}