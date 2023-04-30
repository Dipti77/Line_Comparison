package com.bridgelabz;

import java.util.Scanner;

public class Point {

	double x1, y1, x2, y2;

	public Point() {
		super();
	}

	public Point(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	public void getPoints() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 co-ordinate: ");
		x1 = sc.nextInt();
		System.out.println("Enter y1 co-ordinate: ");
		y1 = sc.nextInt();
		System.out.println("Enter x2 co-ordinate: ");
		x2 = sc.nextInt();
		System.out.println("Enter y2 co-ordinate: ");
		y2 = sc.nextInt();
	}
	
	
}
