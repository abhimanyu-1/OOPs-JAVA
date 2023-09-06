package packet;
public class Arp
{
	interface arpe
	{
		float area(float x,float y);
		float perimeter(float a,float b);
	}
	
	public class Rectangle implements arpe
	{
		public float area(float x, float y)
		{
			float sum=x*y;
			return sum;
		}
		public float perimeter(float a,float b)
		{
			float sum=2*(a+b);
			return sum;
		}
	}
	public class Circle implements arpe
	{
		public float area(float x,float y)
		{
			float sum =x*x*y;
			return sum;
		}
		public float perimeter(float a,float b)
		{
			float sum=2*a*b;
			return sum;
		}
	}
}