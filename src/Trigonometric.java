import java.util.Scanner;

public class Trigonometric{
	double t;
	public Trigonometric(double x)
	{
		t=x;
	}
	void func()
	{
		double x;
		Scanner in =new Scanner(System.in);
		System.out.println("\nEnter the number:");
		x=in.nextDouble();
		double ans;
		if(t==6)
		{
			ans=Math.sin(x);
			System.out.println("\nsin(x)=" +ans);
		}
		else if(t==5)
		{
		    ans=Math.tan(x);
			System.out.println("\ntan(x)=" +ans);
		}
		else if(t==7)
		{
			ans=Math.cos(x);
			System.out.println("\ncos(x)=" +ans);
		}
			
	}
	
}
