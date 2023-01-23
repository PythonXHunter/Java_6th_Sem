import java.util.*;

public class MyHastSet{
	public static void main(String a[]) {
		HashSet hs = new HashSet(5,0.5f);
		System.out.println(hs.add("one"));
		System.out.println(hs.add("two"));
		System.out.println(hs.add("three"));
		System.out.println(hs.add("four"));
		System.out.println(hs.add("five"));
		hs.add("one");
		hs.add("seven");
		System.out.println(hs);
		Boolean b = hs.add("one");
		
		
		
		
		System.out.println("Duplicate = " + b);
		System.out.println(hs);

	}
}