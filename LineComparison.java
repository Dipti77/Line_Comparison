package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	static void calculateLength(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2)
	{
		
		Double line1Length = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println("Length of line 1: " + line1Length);
		
		Double line2Length = Math.sqrt(Math.pow(a2-a1, 2)+Math.pow(b2-b1, 2));
		System.out.println("Length of line 2: " + line2Length);
		
		
		if (line1Length.equals(line2Length) == true) {
			System.out.println("Both lines are equal");
		}
		else {
			System.out.println("Both lines are not equal");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 co-ordinate: ");
		int x1 = sc.nextInt();
		System.out.println("Enter y1 co-ordinate: ");
		int y1 = sc.nextInt();
		System.out.println("Enter x2 co-ordinate: ");
		int x2 = sc.nextInt();
		System.out.println("Enter y2 co-ordinate: ");
		int y2 = sc.nextInt();
		System.out.println("Enter a1 co-ordinate: ");
		int a1 = sc.nextInt();
		System.out.println("Enter b1 co-ordinate: ");
		int b1 = sc.nextInt();
		System.out.println("Enter a2 co-ordinate: ");
		int a2 = sc.nextInt();
		System.out.println("Enter b2 co-ordinate: ");
		int b2 = sc.nextInt();
		
		calculateLength(x1, y1, x2, y2, a1, b1, a2, b2);
		
	}
}

