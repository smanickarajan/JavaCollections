package SetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HastSetLearning {
	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		
		hs.add("Test");		
		hs.add("Alpha");
		hs.add("Beta");
		hs.add(null);
		hs.add("A");
		hs.add("B");
		
		System.out.println(hs);
		
		for(String e:hs) {
			//System.out.println(e);
		}
		Set<Integer> first =new HashSet<>();
		first.addAll(Arrays.asList(new Integer[] {9,1,2,3,4,5}));
		
		Set<Integer> second =new HashSet<>();
		second.addAll(Arrays.asList(new Integer[] {6,7,3,4,5}));
		
		
		Set<Integer> union =new HashSet<>();
		union.addAll(first);
		union.addAll(second);
		
		System.out.println(union);
		
		Set<Integer> intersection =new HashSet<>();
		intersection.addAll(first);
		intersection.retainAll(second);
		
		System.out.println(intersection);
		
		Set<Integer> diff =new HashSet<>();
		diff.addAll(first);
		diff.removeAll(second);
		
		System.out.println(diff);
	}
}
