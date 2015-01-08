package com.maple.calc;

public class Calculator {
	String plus(double n1, double n2) {
		String retStr = null;
		retStr = Double.toString(n1 + n2);
		return retStr;
	}

	String sub(double n1, double n2) {
		String retStr = null;
		retStr = Double.toString(n1 - n2);
		return retStr;
	}

	String multiply(double n1, double n2) {
		String retStr = null;
		retStr = Double.toString(n1 * n2);
		return retStr;
	}

	String div(double n1, double n2) {
		String retStr = null;
		retStr = Double.toString(n1 / n2);
		return retStr;
	}

	String hexa(int n) {
		String retStr = null;
		retStr = Integer.toHexString(n);
		return retStr;
	}
}
