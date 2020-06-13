package com.practice;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		String[] str = { "Nagpur", "Pune", "Mumbai", "Ahamadabad" };
		int min = str[0].length();
		int max = str[0].length();
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() > max) {
				max = str[i].length();
			} else {
				if (str[i].length() < min) {
					min = str[i].length();
				}
			}

			
		}
		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);

	}
}
