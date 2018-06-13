package com.assignment.three;

public class DecToBits {

	public void decimalToBits(Integer number) {
		Integer[] bits = new Integer[10];
		Integer index = 0;
		while(number > 0) {
			bits[index++] = number%2;
			number = number/2;
		}
		for(int i=index-1; i>=0; i--) {
			System.out.print(bits[i]);
		}
	}
	
}
