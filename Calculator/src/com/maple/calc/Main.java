package com.maple.calc;

public class Main {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 10;
		
		Calculator c = new Calculator();
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		System.out.println("plus(num1+num2) : " + c.plus(num1,num2));
		System.out.println("sub(num1-num2) : " + c.sub(num1,num2));
		System.out.println("multiply(num1*num2) : " + c.multiply(num1,num2));
		System.out.println("div(num1/num2) : " + c.div(num1,num2));
		System.out.println("hexa(num2) : " + c.toHexa(num2));
	}
	

}