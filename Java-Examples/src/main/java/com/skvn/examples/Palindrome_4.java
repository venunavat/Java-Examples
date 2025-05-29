package com.skvn.examples;

public class Palindrome_4 {

	public static void main(String[] args) {
		String str = "tattarrattat";
		System.out.println(new Palindrome_4().isPalindrome(str));

	}

	private boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			} else {
				start++;
				end--;
			}
		}
		return true;
	}
}