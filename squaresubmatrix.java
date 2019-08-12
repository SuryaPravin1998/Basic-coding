import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int m=s.nextInt();
    int n=s.nextInt();
    int i,j,f=0;
    int a[][]=new int[m][n];
    int b[][]=new int[2][2];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            a[i][j]=s.nextInt();
        }
    }
    for(i=0;i<m-1;i++)
    {
        for(j=0;j<n-1;j++)
        {
         for(int k=i;k<i+2;k++)
         {
             for(int l=j;l<j+2;l++)
             {
                 System.out.print(a[k][l]+" ");
             }
             System.out.println();
         }
        }
    }
	}
}
