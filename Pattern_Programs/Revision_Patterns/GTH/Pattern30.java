package GTH;

public class Pattern30 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if(i==5 || j==6-i || j==4+i || j==5 || j==14-i || j==i-4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
