package com.maple.calc;

public class Calculator {
	protected String plus(double num1, double num2) {
		String retStr = null;
		retStr = Double.toString(num1 + num2);
		return retStr;
	}

	protected String sub(double num1, double num2) {
		String retStr = null;
		retStr = Double.toString(num1 - num2);
		return retStr;
	}

	protected String multiply(double num1, double num2) {
		String retStr = null;
		retStr = Double.toString(num1 * num2);
		return retStr;
	}

	protected String div(double num1, double num2) {
		String retStr = null;
		retStr = Double.toString(num1 / num2);
		return retStr;
	}

	protected String toHexa(int num) {
		String retStr = null;
		retStr = Integer.toHexString(num);
		return retStr;
	}
}
