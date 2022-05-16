package HashMapLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SyncandConcurrentHaspMap {
	public static void main(String[] args) {
	
	HashMap<String,Integer> map1=new HashMap<>();
	
	map1.put("A",100);
	map1.put("B",200);
	map1.put("C",300);
	map1.put("D",400);
	map1.put("D",500);
	map1.put("E",600);
	
	Map<String, Integer> syncmap = Collections.synchronizedMap(map1);
	
	
	System.out.println(syncmap);
	
	ConcurrentHashMap<Integer,String> concurrmap=new ConcurrentHashMap<>();
	concurrmap.put(1, "java");
	concurrmap.put(2, "python");
	concurrmap.put(3, "C#");
	System.out.println(concurrmap);
}
}
