package com.assignment.three;

public class WordFrequency {

	public String[] getWordFrequencyCount(String[] words) {
		String[] repeatedWords = new String[words.length];
		repeatedWords[0] = words[0];
		int repeatedWordIndex = 1;
		boolean wordAlreadyExists = false;
		for(int i=1; i< words.length; i++) {
			for(int j=0; j<=repeatedWordIndex; j++) {
				if(words[i].equals(repeatedWords[j])) {
					wordAlreadyExists = true;
				}
			}
			if(!wordAlreadyExists) {
				repeatedWords[repeatedWordIndex] = words[i];
				repeatedWordIndex++;
			}
			wordAlreadyExists = false;
		}
		return repeatedWords;
	}

}
