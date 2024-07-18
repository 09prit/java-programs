package demo;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       		 System.out.println("Enter any number :");
		int a=sc.nextInt();
		if (a<0)
		{
			System.out.println("you enter negative number : "+a);
		}
		else if(a>0)
		{
			System.out.println("you enter positive number :"+a);
		}
		else
		{
			System.out.println("Please enter less than or greater than 0 .");
		}
	 }
}

