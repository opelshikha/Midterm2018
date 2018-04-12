package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<Integer, String> map= new HashMap<Integer,String>();
		map.put(10, "MD");
		map.put(12, "Herry");
		map.put(13, "Ziggy");
		map.put(16, "Siam");

		for(Map.Entry key :map.entrySet()){
			System.out.println(key.getKey()+ " "+ key.getValue());
		}
		System.out.println();
		Iterator<Map.Entry<Integer, String>> m=map.entrySet().iterator();
		while (m.hasNext()){
			System.out.println(m.next());
		}
	}

}