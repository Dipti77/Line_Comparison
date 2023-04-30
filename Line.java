package com.bridgelabz;

public class Line {

	Point point = new Point();
		
	public double calculateLineLength() {
		
		double length = Math.sqrt(Math.pow(point.getX2()-point.getX1(), 2) + Math.pow(point.getY2()-point.getY1(), 2));
		
		return length;
	}
	

	public void getPointsInput() {
//		System.out.println("Enter points co-ordinate: ");
		point.getPoints();
	}

	
	public static void checkEquals(Line line1, Line line2) {
		
		Double length1 = line1.calculateLineLength();
		Double length2 = line2.calculateLineLength();
		
		System.out.println("Length of line 1 is: " + length1);
		System.out.println("Length of line 2 is: " + length2);
		
		if (length1.equals(length2) == true) {
			System.out.println("Both lines are equal");
		}
		else {
			System.out.println("Both lines are not equal");
		}
		System.out.println();
	}

	
	public static void compareLines(Line line1, Line line2) {
		
		Double length1 = line1.calculateLineLength();
		Double length2 = line2.calculateLineLength();
		
		System.out.println("Length of line 1 is: " + length1);
		System.out.println("Length of line 2 is: " + length2);
		
		int result = length1.compareTo(length2);
		
		if (result == 0) {
			System.out.println("Length of line 1 is equal to length of line2");
		}
		else if(result == 1) {
			System.out.println("Length of line 1 is greater than length of line 2");
		}
		else {
			System.out.println("Length of line 1 is less than length of line 2");
		}
	}
}
	
