package in.sureshsarda;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class MapReduce {
	/*
	 * This implementation is not generic enough to take input from anywhere and
	 * process any object. We will make it generic later.
	 * 
	 * This implementation doesn't have parallelism, we will do this later
	 */

	private File inputFile;

	public MapReduce(File inputFile) {
		this.inputFile = inputFile;
	}

	public Map<String, Integer> process() throws Exception {
		Mapper mapper = new Mapper(this.inputFile);
		Iterator<Map<String, Integer>> itr = mapper.process();

		Reducer reducer = new Reducer(itr);
		return reducer.process();

	}

}
