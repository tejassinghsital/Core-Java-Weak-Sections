/*
9. Right Pascal’s Triangle
Enter the number of rows: 5

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
import java.util.Scanner;
public class Q9RightPascalsTriangle
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
        System.out.println("  ");
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*"+" ");
            }
        System.out.println("  ");
        }

    }
}