import java.util.Scanner				;
public class SumOfDigit		
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in)	;
		int n = sc.nextInt()			;
		int temp = n				;
		int a					;
		int sum = 0 				;
		while(temp>0)
		{
			a = temp%10			;
			temp /= 10			;
			sum += a			;
		}
		System.out.println(sum);
	}
}