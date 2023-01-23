import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class seta2{
	public static void main(String a[]) throws IOException{
		String c;
		int i;
		System.out.println("Enter the Number of Cities");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			LinkedList<String> a1 = new LinkedList<String>();
			for(i = 0;i<n;i++) {
				System.out.println("Enter City Name");
				c = sc.next();
				a1.add(c);
			}
			
			
			System.out.println("Cities are");
			System.out.println(a1);
			a1.removeAll(a1);
			System.out.println("After Removing array elements are =" +a1);
		}
		

	}
}