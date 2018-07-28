package in.sureshsarda;

import java.io.File;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {

	private static String INPUT_FILE_PATH = "/home/suresh/Desktop/Documents/data-to-experiment/pride-and-prejudice.txt";

	public static void main(String[] args) throws Exception {
		System.out.println("Hello, Hadoop!");

		MapReduce mr = new MapReduce(new File(INPUT_FILE_PATH));
		Map<String, Integer> wordCount = mr.process();

		wordCount.entrySet().stream().forEach(e -> {
			System.out.println(String.format("%s - %d", e.getKey(), e.getValue()));
		});
	}
}
