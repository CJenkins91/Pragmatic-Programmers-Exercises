/*
 * Mad Lib - takes in a noun, verb, adjective and adverb
 * and constructs a sentence from them
 */

public class MadLib {		
		
	public static void main(String[] args){
		
		System.out.println("Enter a noun: " + args[0]);
		
		System.out.println("Enter a verb: " + args[1]);
		
		System.out.println("Enter an adjective: " + args[2]);
		
		System.out.println("Enter an adverb: " + args[3]);
		
		System.out.println("Do you " + args[1] + " your " + args[2] + " " + 
						args[0] + " " + args[3] + "? That's Hilarious!");
	}
}


