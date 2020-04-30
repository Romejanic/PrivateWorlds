package com.romejanic.pw.utils;

public class Utils {

	/**
	 * Joins an array of strings together, with a given connective
	 * string inserted between each of them.
	 * @param arr The array to join
	 * @param conn The connector to use
	 * @return A string containing the joined elements of the array
	 */
	public static String join(String[] arr, String conn) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if(i < arr.length - 1) {
				sb.append(conn);
			}
		}
		return sb.toString();
	}
	
	/**
	 * Tries to find the closest matching string in the array to the
	 * string given. If no string matches by at least 25%, then no
	 * string is returned.
	 * @param arr The array of strings to test.
	 * @param test The string to test against.
	 * @return The string with at least 25% characters matching, or
	 * null if no such string exists.
	 */
	public static String closestMatching(String[] arr, String test) {
		String closest = null;
		float percentage = 0f;
		for(String s : arr) {
			s = s.toLowerCase(); // ignore case
			int count = 0;
			for(int i = 0; i < s.length(); i++) {
				if(test.contains(String.valueOf(s.charAt(i)))) count++;
			}
			float match = (float)count / s.length();
			if(match > percentage) {
				percentage = match;
				closest = s;
			}
		}
		return percentage < 0.25f ? null : closest;
	}
	
}