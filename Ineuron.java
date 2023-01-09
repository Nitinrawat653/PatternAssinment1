
public class Ineuron {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				// I alphabet is written 
				if( j==(n-1)/2)
				{
				System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			for(int j=0;j<n;j++)
			{
				// N alphabet is written 
				if(j==0 || j==n-1 || i==j)
				{
				System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			for(int j=0;j<n;j++)
			{
				// E alphabet is written 
				if(j==1 || i==0 && j!=0 || i==(n-1)/2 && j!=0 || i==n-1 && j!=0)
				{
				System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			for(int j=0;j<n;j++)
			{
				// U alphabet is written 
				if(j==1 || j==n-1 || i==n-1 && j!=0)
				{
				System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			for(int j=0;j<n;j++)
			{
				// R alphabet is written 
				if(j==1 || i==0 && j>0 && j<n-1 || i==(n-1)/2 && j!=0 && j!=n-1 || j==n-1 && i!=0 && i<(n-1)/2 || i>(n-1)/2 && i==j )
				{
				System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			for(int j=0;j<n;j++)
			{
				// O alphabet is written 
				if(j==1 && i>0 && i<n-1 || j==n-2 && i!=0 && i!=n-1 || i==0 && j>1 && j<n-2 || i==n-1 && j>1 && j!=n-2 )
				{
				System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			for(int j=0;j<n;j++)
			{
				// N alphabet is written 
				if(j==0 || j==n-1 || i==j)
				{
				System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
