package com.romejanic.pw.utils;

public class Utils {

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
	
}