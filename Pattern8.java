import java.util.Scanner		;
public class Pattern8
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in)	;
		int n = sc.nextInt()			;
		int sp = -1				;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ") ;
			}
			for(int j=1;j<=1;j++)
			{
				System.out.print(" * ") ;
			}
		//	for(int j=1 ; j<=i-1;j++ )
		//	{
		//		System.out.print("   ") ;
		//	}
			for(int j=1;j<=sp;j++)
			{
				System.out.print("   ") ;	
			}
			sp = sp+2			;
			if(i!=1)
			{
			for(int j=1;j<=1;j++)
			{
				System.out.print(" * ") ;
			}
			}
			System.out.println()		;
		}
			sp = sp-4;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ")	;
			}
			for(int j=1;j<=1;j++)
			{
				System.out.print(" * ")	;
			}
			for(int j=1;j<=sp;j++)
			{
				System.out.print("   ") ;
			}
			sp = sp-2			;
	//		for(int j=1;j<=(n-i-1);j++)
	//		{
	//			System.out.print("   ")	;
	//		}
			if(i!=(n-1))
			{
			for(int j=1;j<=1;j++)
			{
				System.out.print(" * ")	;
			}
			}
			System.out.println()		;
		}
	}
}
			