package com.gowtham;

public class LeetCodeValidNumber {
	
	//Validate if a given string is numeric.
	
	
	public boolean isNumber(String s) {
		int i = 0, n = s.length();
		while (i < n && Character.isWhitespace(s.charAt(i)))
			i++;
		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
			i++;
		boolean isNumeric = false;
		while (i < n && Character.isDigit(s.charAt(i))) {
			i++;
			isNumeric = true;
		}
		if (i < n && s.charAt(i) == '.') {
			i++;
			while (i < n && Character.isDigit(s.charAt(i))) {
				i++;
				isNumeric = true;
			}
		}
		while (i < n && Character.isWhitespace(s.charAt(i)))
			i++;
		return isNumeric && i == n;
	}

}
