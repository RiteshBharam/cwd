package com.tutorials.java.oop1.abstraction;

public class Circle implements Shape {

	@Override
	public void calculateArea(int r) {
		System.out.println("Area of circle is "+(Math.PI*r*r));
	}
	
	public static void main(String[] args) {
		Shape s1 = new Circle();
		s1.calculateArea(2);
	}

}
