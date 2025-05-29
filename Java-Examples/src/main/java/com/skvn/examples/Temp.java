package com.skvn.examples;

public class Temp {
	public static void main(String[] args) {
		String orig = "Where are you?";
		System.out.println("" + new Temp().reverseStr(orig));
	}

	private String reverseStr(String str) {
		if (str == null || str.length() <= 1)
			return str;
		return reverseStr(str.substring(1)) + str.charAt(0);
	}
}
