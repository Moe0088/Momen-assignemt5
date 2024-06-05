package com.coderscampus;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import java.util.Set;

public class FileService {

	public Set<String> readFile() throws IOException {
		Set<String> hand = new HashSet<>();
		BufferedReader reader = new BufferedReader(new FileReader("PokerHands.csv"));
		String line;

		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(",");
			String name = parts[0];
			String flush = parts[1];
			hand.add(line);

		}
		reader.close();
		return hand;

	}
}
