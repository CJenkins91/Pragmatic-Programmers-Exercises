/*
 * Retirement Calculator - takes in the user's current age and the age that they want to retire. 
 * NOTE - may or may not be correct
 */


public class RectangularRoomAreaCalculator {		
		
	public static void main(String[] args){
		
		final double AREA_FEET_TO_METERS = 0.09290304;
		
		System.out.println("What is the length of the room in feet? " + args[0] + "\n");
		
		System.out.println("What is the width of the room in feet? " + args[1] + "\n");
		
		double length = Integer.parseInt(args[0]);
		
		double width = Integer.parseInt(args[1]);
		
		double area = length * width;
		
		double areaMeters = (area * area) * AREA_FEET_TO_METERS;
		
		System.out.println("You entered dimensions of " + length + " feet by " + width + " feet. \n");
		
		System.out.println("The area of the room is " + area + " square feet \n");
		
		System.out.println("The area of the room in square meters is " + areaMeters);
		
	}
}


