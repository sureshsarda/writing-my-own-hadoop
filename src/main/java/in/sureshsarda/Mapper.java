package in.sureshsarda;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mapper {

	private Scanner in;

	public Mapper(File input) throws Exception {
		in = new Scanner(new FileInputStream(input));

	}

	public Iterator<Map<String, Integer>> process() {
		List<Map<String, Integer>> out = new LinkedList<Map<String, Integer>>();
		while (in.hasNextLine()) {
			
			String line = in.nextLine();
			String[] words = line.split(" ");

			Map<String, Integer> record = new HashMap<String, Integer>();
			for (String rawWord : words) {
				String processed = rawWord.trim().toLowerCase();
				int count = record.getOrDefault(processed, 0) + 1;
				record.put(processed, count);
			}

			out.add(record);
		}
		return out.iterator();
	}
}
