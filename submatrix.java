package submatrix;
import java.util.*;
public class sbmm {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int n=s.nextInt();
	int i,j;
	int h[][]=new int[m][n];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			h[i][j]=s.nextInt();
		}
	}
	int a=0,b=0;
	int k=2;
	while(k<m)
	{
		a=0;
	//	b=0;
		System.out.println();
	while(a<=m-k)
	{
		b=0;
		while(b<=n-k)
		{
		for(i=a;i<a+k;i++)
		{
			System.out.println();
			for(j=b;j<b+k;j++)
			{
				System.out.print(h[i][j]+" ");
			}
		}
		b++;
		}
		System.out.println();
		a++;
	}
	
	k++;
	
	}
}
}
