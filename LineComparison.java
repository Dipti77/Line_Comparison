package com.bridgelabz;

public class LineComparison {

	public static void main(String[] args) {
		
		Line line1 = new Line();
		System.out.println("Enter the points for line 1: ");
		line1.getPointsInput();
		
		Line line2 = new Line();
		System.out.println("Enter the points for line 2: ");
		line2.getPointsInput();
		
		Line.checkEquals(line1, line2);
		Line.compareLines(line1, line2);
	}

}

