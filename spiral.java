import java.util.*;
public class spiral
{
	public static void main(String args[])
	{
		int r,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value on row and column, respectively, for a 2D array");
		r=s.nextInt();
		c=s.nextInt();
		int[][] a=new int[r][c];
		System.out.println("Enter the value in the matrix row-vise");
		for(int p=0;p<r;p++)
			for(int q=0;q<c;q++)
				a[p][q]=s.nextInt();
		
		System.out.println("The entered matrix is:");
		for(int p=0;p<r;p++)
			for(int q=0;q<c;q++)
			{
				System.out.print(a[p][q]+"\t");
			    if(q==(c-1))
					System.out.println();
			}
		System.out.println("The output is:");
		
		int T=0, D=r-1, L=0, R=c-1;
		int k=0;
		int dir=0;
		
		while(T<=D && L<=R)
		{
			if(dir ==0)
			{
				for(int i=L;i<=R;i++)
					System.out.println(a[T][i]);
				T++;
			}
			else if(dir==1)
			{
				for(int i=T;i<=D;i++)
					System.out.println(a[i][R]);
				R--;
			}
			else if(dir==2)
			{
				for(int i=R;i>=L ;i--)
					System.out.println(a[D][i]);
				D--;
			}
			else if(dir==3)
			{
				for(int i=D;i>=T;i--)
					System.out.println(a[i][L]);
				L++;
			}
			dir=(dir+1)%4;
		}
	}
}
