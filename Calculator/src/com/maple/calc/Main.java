package com.maple.calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 10;
		
		Calculator c = new Calculator();
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("plus(a+b) : " + c.plus(a,b));
		System.out.println("sub(a-b) : " + c.sub(a,b));
		System.out.println("multiply(a*b) : " + c.multiply(a,b));
		System.out.println("div(a/b) : " + c.div(a,b));
		System.out.println("hexa(b) : " + c.hexa(b));
	}
	

}