package HashMapLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoversiontoArrayList {
	public static void main(String[] args) {
	
	HashMap<String,Integer> map1=new HashMap<>();
	
	map1.put("A",100);
	map1.put("B",200);
	map1.put("C",300);
	map1.put("D",400);
	map1.put("D",500);
	map1.put("E",600);
	
	List<String> list1=new ArrayList<>(map1.keySet());
	
	System.out.println(list1);
	
List<Integer> list2=new ArrayList<>(map1.values());
	
	System.out.println(list2);
	
	
}
}
