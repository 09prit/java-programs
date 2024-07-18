package demo;
import java.util.Scanner;
public class Cube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number : ");
        int a=sc.nextInt();
     
        int cube= (a*a*a);
		System.out.println("Cube of all Numbers is : "+cube);
	}
}
