package org.test;

/*
5         
4 5       
3 4 5     
2 3 4 5   
1 2 3 4 5
 */

public class Q1_Pattren1 {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++)
		{
			int count = 6-i;
			for(int j=1; j<=5 ; j++)
			{
				if(i>=j)
				{
					System.out.print((count++) +" ");
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
