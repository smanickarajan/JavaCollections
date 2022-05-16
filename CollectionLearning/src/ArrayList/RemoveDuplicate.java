package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,7,8));
	
	LinkedHashSet<Integer> withoutduplicate = new LinkedHashSet<Integer>(numbers);
	
	ArrayList<Integer> numberswithoutduplicate= new ArrayList<Integer>(withoutduplicate);
	
	System.out.println(numberswithoutduplicate);
	
	
ArrayList<String> names= new ArrayList<String>(Arrays.asList("vijay","vikram","ajith","Vijay","surya","vikram"));
	
	LinkedHashSet<String> withoutduplicate1=new LinkedHashSet<String>(names);
	
	ArrayList<String> namewithoutduplicate= new ArrayList<String>(withoutduplicate1);
	
	System.out.println(namewithoutduplicate);
}
}
