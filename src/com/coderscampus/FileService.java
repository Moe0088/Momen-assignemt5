package com.coderscampus;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import java.util.Set;

public class FileService {

	public Set<String> readFile() throws IOException {
		Set<String> hands = new HashSet<>();
		BufferedReader reader = new BufferedReader(new FileReader("PokerHands.csv"));
		String line;

		while ((line = reader.readLine()) != null) {

			hands.add(line);

		}
		reader.close();
		return hands;

	}
}
