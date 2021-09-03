/*
5. Downward Triangle Star Pattern
Enter the number of rows: 5

* * * * * 
* * * * 
* * * 
* * 
* 

*/
import java.util.Scanner;
public class Q5DownwardTriangleStarPattern
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
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