import java.util.*;
public class DuplicateNumbers {

	public static void main(String[] args) {
		int [] a = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
			System.out.println();
		}
		System.out.println("Dupicate Numbers are as follows: ");
		for(int i = 0; i<a.length; i++) {
			for(int j = i + 1; j<a.length ; j++) {
				if(a[i]== a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
