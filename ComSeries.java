import java.util.Scanner		;
public class ComSeries
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in)		;
		int n = sc.nextInt()				;
		float sum = 0					;
		float sub = 0					;
		for(float i=1;i<=n;i=i+2)
		{
			sum += 1/i				;
		}
		for(float j=2;j<=n;j=j+2)
		{
			sub += 1/j				;
		}
		System.out.println(sum-sub)			;
	}
}