package org.test;

public class Q3_pattern3 {

	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			char ch = 64;
			
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=i)
				{
					System.out.print((++ch) + " ");
				}
				else if(j<=i*2-1)
				{
					System.out.print((--ch) + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
