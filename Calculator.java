import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in)		;
		System.out.println("Enter first number")	;
		int a = sc.nextInt()				;
		System.out.println("Enter Second number")	;
		int b = sc.nextInt()				;
		System.out.println("Enter Second number")	;
		System.out.println("Enter the operation")	;
		sc.nextLine()					;
		char operation = sc.next().charAt(0)		;
		int result = 0					;
		switch(operation)
		{
			case '+' : result = a+b			;
				   break			;
			case '-' : result = a-b			;
				   break			;
			case '*' : result = a*b			;
				   break			;
			case '/' : result = a/b			;
				   break			;
			default  : 
			System.out.println("INVALID OPERATION")	;
		}
		System.out.println("The answer is "+result)	;
	}
} 