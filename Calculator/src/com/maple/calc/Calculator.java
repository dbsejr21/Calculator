package com.maple.calc;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 10;
		System.out.println("a = " + Double.toString(a) + ", b = " + Double.toString(b) );
		System.out.println("plus(a+b) : " + plus(a,b));
		System.out.println("sub(a-b) : " + sub(a,b));
		System.out.println("multiply(a*b) : " + multiply(a,b));
		System.out.println("div(a/b) : " + div(a,b));
		System.out.println("hexa(b) : " + hexa(b));
	}
	
	static String plus(double n1, double n2){
		String retStr = null;
		retStr = Double.toString(n1 + n2);
		return retStr;
	}
	
	static String sub(double n1, double n2){
		String retStr = null;
		retStr = Double.toString(n1 - n2);
		return retStr;
	}
	
	static String multiply(double n1, double n2){
		String retStr = null;
		retStr = Double.toString(n1 * n2);
		return retStr;
	}
	
	static String div(double n1, double n2){
		String retStr = null;
		retStr = Double.toString(n1 / n2);
		return retStr;
	}
	
	static String hexa(int n){
		String retStr = null;
		retStr = Integer.toHexString(n);
		return retStr;
	}
}
