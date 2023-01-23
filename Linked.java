import java.util.*;

public class Linked{
	public static void main(String arg[]) {
		LinkedList<String> a1 = new LinkedList<String>();
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ravi");
		a1.add("Ajay");
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}