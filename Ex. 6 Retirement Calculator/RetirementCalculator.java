/*
 * Retirement Calculator - takes in the user's current age and the age that they want to retire. 
 */

import java.time.Year;

public class RetirementCalculator {		
		
	public static void main(String[] args){
		
		System.out.println("What is your current age? " + args[0] + "\n");
		
		System.out.println("At what age would you like to retire? " + args[1] + "\n");
		
		int currentAge = Integer.parseInt(args[0]);
		
		int retirementAge = Integer.parseInt(args[1]);
		
		int difference = retirementAge - currentAge;
		
		int year = Year.now().getValue();
		
		System.out.println("You can retire in " + (difference) + " years." + "\n");
		
		System.out.println("It's " + year + ", So you can retire in " + (year + difference) + ".\n");
		
	}
}


