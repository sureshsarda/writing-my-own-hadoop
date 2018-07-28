package in.sureshsarda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Reducer {

	private Iterator<Map<String, Integer>> itr;

	public Reducer(Iterator<Map<String, Integer>> itr) {
		this.itr = itr;
	}

	public Map<String, Integer> process() {
		Map<String, Integer> out = new HashMap<String, Integer>();

		while (itr.hasNext()) {
			Map<String, Integer> currentRecord = itr.next();
			for (String key : currentRecord.keySet()) {
				int count = out.getOrDefault(key, 0) + currentRecord.get(key);
				out.put(key, count);
			}
		}
		return out;
	}

}
