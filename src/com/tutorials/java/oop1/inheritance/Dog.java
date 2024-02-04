package com.tutorials.java.oop1.inheritance;

public class Dog extends Animal{
	
	int x = 4;
	
	public Dog() {
		super();
	}
	
	
	public void sepak() {
		System.out.println(super.x);
	}

}
