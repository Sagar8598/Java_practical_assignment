//Write a java program to exchange the values of two variables of integer type A and B without using third temporary variable.
import java.util.Scanner;
public class Assg1Q8
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the 1st number:");
		int num1=s.nextInt();
		System.out.print("Enter the 2nd number:");
		int num2=s.nextInt();
		System.out.println("The 1st number is : "+num1+"The 2nd number is : "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping ");
		System.out.println("The 1st number is : "+num1+"The 2nd number is : "+num2);
	}
}