/*
 * PizzaParty - takes in the number of pizzas and the number of people. 
 * It then tries to split them equally between the people and lets the 
 * user know how many pieces each person gets and how many pieces remain. 
 */


public class PizzaParty {		
		
	public static void main(String[] args){
		
		
		System.out.println("How many people? " + args[0] + "\n");
		
		System.out.println("How many pizzas? " + args[1] + "\n");
		
		int people = Integer.parseInt(args[0]);
		
		int pizzas = Integer.parseInt(args[1]);
		
		int result = pizzas / people;
		
		int remainder = pizzas % people;
		
		System.out.println("Each person gets " + result + " pieces each. \n");
		
		System.out.println("There are " + remainder + " pieces remaining. \n");
		
		
	}
}


