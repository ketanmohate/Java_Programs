package Assignment_09_08_2024.com;

/* 
Pattern
 
1   2   3   4   5     
6   7   8   9   10     
11  12  13  14  15    
16  17  18  19  20    
21  22  23  24  25  

End
*/

public class Pattern_Q1 
{
	public static void main(String[] args) 
	{
		int count = 1;
		
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				if(i<=2)
				{
					System.out.print(count + "   ");
					count++;
				}
				else if(i>=2)
				{
					System.out.print(count + "  ");
					count++;
				}
			}
			System.out.println("  ");
		}

	}
}
