package ArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayList {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> list1=new CopyOnWriteArrayList<String>();
	
	list1.add("ABC");
	list1.add("EFG");
	System.out.println(list1);
	list1.add(1, "DYZ");
	System.out.println(list1);
}
}
