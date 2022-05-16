package LinkedListLearning;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LLConcepts {
	public static void main(String[] args) {
		
		LinkedList<String> names=new LinkedList<>();
		
		names.add("Tom");
		names.add("naveen");		
		names.add("Sree");
		names.add("Krish");
		names.add("Cherry");
		
		System.out.println(names);
		
		LinkedList<String> users=new LinkedList<>();
		users.add("Peter");
		users.add("Mukesh");
		
		names.addAll(2,users);
		System.out.println(names);
		
		Iterator<String> it = names.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.sort(names);
		
		System.out.println(names);
	}
}
