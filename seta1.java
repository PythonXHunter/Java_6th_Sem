import java.util.*;

public class seta1{
	public static void main(String a[]) {
		String c;
		int i;
		System.out.println("Enter the Number of Cities");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> a1 = new ArrayList();
		for(i = 0;i<n;i++) {
			System.out.println("Enter Name");
			c = sc.next();
			a1.add(c);
		}
		
		
		System.out.println("Cities are");
		System.out.println(a1);
		a1.removeAll(a1);
		System.out.println("After Removing array elements are =" +a1);
		

	}
}