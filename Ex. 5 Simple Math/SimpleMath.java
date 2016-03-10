/*
 * Simple Math - takes in the numbers and 
 * prints the sum, diff, prod and quotient
 */

public class SimpleMath {		
		
	public static void main(String[] args){
		
		System.out.println("Enter the first number: " + args[0] + "\n");
		
		System.out.println("Enter the second number: " + args[1] + "\n");
		
		int firstNo = Integer.parseInt(args[0]);
		
		int secondNo = Integer.parseInt(args[1]);
		
		System.out.println("Sum: " + firstNo + " + " + secondNo + " = " +(firstNo + secondNo) + "\n");
		
		System.out.println("Difference: " + firstNo + " - " + secondNo + " = " + (firstNo - secondNo) + "\n");
		
		System.out.println("Product: " + firstNo + " * " + secondNo + " = " + (firstNo * secondNo) + "\n");
	
		System.out.println("Quotient: " + firstNo + " / " + secondNo + " = " + (firstNo / secondNo) + "\n");
	}
}


