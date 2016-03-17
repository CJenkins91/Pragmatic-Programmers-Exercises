/*
 * PaintCalculator - takes in the length and width of a room in feet. 
 * It then uses this to determine how many gallons of paint are needed.
 * We need a gallon for every amount of feet up to 350 feet so:
 * 10 feet requires 1 gallon
 * 700 feet requires 2 gallons
 * 701 feet requires 3 gallons  
 */


public class PaintCalculator {		
		
	public static void main(String[] args){
		
		
		System.out.println("How long (ft)? " + args[0] + "\n");
		
		System.out.println("How wide (ft)? " + args[1] + "\n");
		
		int length = Integer.parseInt(args[0]);
		
		int width = Integer.parseInt(args[1]);
		
		int area = length * width;
		
		int gallonsOfPaint = area / 350;
		
		int remainder = area % 350;
		
		if (area < 350)
			gallonsOfPaint = 1;
		
		if (remainder != 0)
			gallonsOfPaint += 1;
			
		System.out.println("The area of the room is " + area + ". \n");
		
		System.out.println("We need " + gallonsOfPaint + " gallon(s) to paint the room. \n");
		
		
	}
}


