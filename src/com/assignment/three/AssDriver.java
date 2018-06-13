package com.assignment.three;

import java.util.Scanner;

public class AssDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose a path --('D' for Decimal to Binary conversion "
				+ "| 'W' for Word frequency)");
		Scanner scanner = new Scanner(System.in);
		String literal = scanner.nextLine();
		
		if(literal.equalsIgnoreCase("D")) {
			DecToBits d2b = new DecToBits();
			System.out.println("Enter a Decimal number to get Binary Conversion");
			d2b.decimalToBits(scanner.nextInt());
		} else if(literal.equalsIgnoreCase("W")) {
			WordFrequency word= new WordFrequency();
			System.out.println("Enter a text to get the frequency.,");
			String text = scanner.nextLine();
			String[] words = text.split(" ");
			String[] repeatedWords;
			int count =0;
			repeatedWords = word.getWordFrequencyCount(words);
			
			for(String word1: repeatedWords) {
				if(word1 == null) {
					break;
				}
				for (String str: words) {
					if(word1.equals(str)){
						count++;
					}
				}
				System.out.println("Frequency of this ["+word1+"] is "+count);
				count = 0;
			}
		} else {
			System.out.println("You are bowled very Badly,.., Bye");
		}
		scanner.close();
		System.exit(0);
	}

}
