package ArrayList;

import java.util.ArrayList;

public class BasicConcepts {
public static void main(String[] args) {
	ArrayList<String> list1= new ArrayList<String>();
	
	list1.add("ABC");
	list1.add("EFG");
	System.out.println(list1);
	list1.add(1, "XYZ");
	System.out.println(list1);
}
}
