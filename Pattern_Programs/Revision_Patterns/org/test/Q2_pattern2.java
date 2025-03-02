package org.test;

public class Q2_pattern2 {

	public static void main(String[] args) 
	{
		boolean flag = true;
		
		for(int i=1 ; i<=6 ; i++)
		{			
			for(int j=1 ; j<=11 ; j++)
			{
				if(j<=6 && j>=i && flag==true)
				{
					System.out.print("* ");
					flag=false;
				}
				else if(j>6 && j<=12-i && flag==true)
				{
					System.out.print("* ");
					flag=false;
				}
				else
				{
					System.out.print("  ");
					flag=true;
				}
			}
			System.out.println();
		}
	}

}
