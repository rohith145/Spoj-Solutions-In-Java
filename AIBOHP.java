import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Mincharaddtomakepalindrome {
static int lcs(String s1,String s2,int n)
{
	int l[][]=new int[n+1][n+1];
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(i==0 || j==0)
				l[i][j]=0;
			else if(s1.charAt(i-1)==s2.charAt(j-1))
				l[i][j]=l[i-1][j-1]+1;
			else
				l[i][j]=Math.max(l[i][j-1],l[i-1][j]);
		}
	}
	/*for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=n;j++){
			System.out.print(l[i][j] + " ");
	}
	System.out.println();
	}*/
	return l[n][n];
}
static String rev(String s1)
{
	String r1="";
	for(int i=s1.length()-1;i>=0;i--)
		r1=r1+s1.charAt(i);
	return r1;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0)
	{
	String s1=sc.nextLine();
	String s2=rev(s1);
	System.out.println(s1.length()-lcs(s1,s2,s1.length()));
}
}
}
