package com.coderscampus;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SetExerciseApplication {

	static // Instantiate new hashset

	Set<String> pokerHands = new HashSet<>();

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		// extract the data from the CSV
		fileService.readFile();

		// remove ACE HIGH and QUEEN HIGH
		pokerHands.remove(" ACE HIGH");
		pokerHands.remove("QUEEN HIGH");
		printToConsole(pokerHands);

		// Update PAIR to DEUCES
		   if (pokerHands.contains("PAIR")) {
	            pokerHands.remove("PAIR");
	            pokerHands.add("DEUCES");
	        }
		   printToConsole(pokerHands);
	}

	public static void printToConsole(Set<String> pokerHands) {
		for (String hand : pokerHands) {
			System.out.println(hand);

		}
	}

	public static Set<String> extractDataFromCSV(String fileName) {

		return null;
	}

}
