/*
1. Pyramid Program
    * 
   * * 
  * * * 
 * * * * 
* * * * *

*/
import java.util.Scanner;
public class Q1PyramidProgram
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

		for(int i=1; i<=5;i++)
		{

			for(int j=i; j<=n;j++)
			{
				System.out.print(" ");
			}

			for(int j=1; j<=i;j++)
			{
				System.out.print(" "+"*");
			}
		System.out.println();
		}
	}
}
