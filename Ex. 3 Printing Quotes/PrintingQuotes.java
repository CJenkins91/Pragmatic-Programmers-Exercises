/*
 * What is the quote? - takes in a quote and an author 
 * and prints them
 */

public class PrintingQuotes {		
		
	public static void main(String[] args){
		
		System.out.println("What is the quote? " + args[0]);
		
		System.out.println("Who is the author? " + args[1]);
		
		System.out.println(args[1] + " says " + args[0]);
	}
}


