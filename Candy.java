import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Spojcandy {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=-1)
	{
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		if((sum%n)!=0)
			System.out.println(-1);
		else
		{
			int avg=sum/n;
			int mov=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]<avg)
					mov=mov+(avg-a[i]);
			}
			System.out.println(mov);
		}
		n=sc.nextInt();
	}
}
}
