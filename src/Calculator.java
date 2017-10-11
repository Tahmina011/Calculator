import java.util.Scanner;
public class Calculator {
	double z;

	public static void main(String[] args) {
		//double x,y;
		int x;
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.tan\n6.sin\n7.cos\n");
		System.out.println("Enter a number:");
		x=in.nextInt();
		
		if(x==5||x==6||x==7)
		{
			Trigonometric s=new Trigonometric(x);
			s.func();
		}
		else
		{
			double a,c;
			System.out.println("\nEnter a and b:" );
			a=in.nextDouble();
			c=in.nextDouble();
			Binary b=new Binary(a,c);
			if(x==1)
			{
				b.add();
			}
			else if(x==2)
			{
				b.sub();
			}
			else if(x==3)
			{
				b.mul();
			}
			else if(x==4)
			{
				b.div();
			}
			
		}

	}

}
