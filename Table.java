import java.util.Scanner;
public class Table
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int i , j ;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.print(i*j+"  ");
			}
			System.out.println()		  ;
		}
	}
}