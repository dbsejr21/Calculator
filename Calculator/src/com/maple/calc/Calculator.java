package com.maple.calc;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	String plus(int n1, int n2){
		String retStr = null;
		retStr = Integer.toString(n1 + n2);
		return retStr;
	}
	
	String sub(int n1, int n2){
		String retStr = null;
		retStr = Integer.toString(n1 - n2);
		return retStr;
	}
	
	String multiply(int n1, int n2){
		String retStr = null;
		retStr = Integer.toString(n1 * n2);
		return retStr;
	}
	
	String div(int n1, int n2){
		String retStr = null;
		retStr = Integer.toString(n1 / n2);
		return retStr;
	}
}
