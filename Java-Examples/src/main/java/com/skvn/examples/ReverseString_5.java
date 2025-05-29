package com.skvn.examples;

public class ReverseString_5 {
	public static void main(String[] args) {
		String orig = "Where are you?";
		String reversed = new ReverseString_5().RevStr(orig);
		System.out.println("" + reversed);
	}
	public String RevStr(String str) {
		if (str == null || str.length() <= 1)
			return str;
		return RevStr(str.substring(1)) + str.charAt(0);
	}
}
