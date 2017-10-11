

public class Binary {
	public double a;
	private double b;
	public Binary (double x,double y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		double z=a+b;
		System.out.println("\nAddition of x and y=" +z);
	}
	void sub()
	{
		double z=a-b;
		System.out.println("\nSubtraction of x and y=" +z);

	}
	void mul()
	{
		double z=a*b;
		System.out.println("\nMultiplication of x and y=" +z);
	}
	void div()
	{
		double z=a/b;
		System.out.println("\nDivition of x and y=" +z);
	}

}
