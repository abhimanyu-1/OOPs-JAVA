import java.util.*;
import packet.Arp;

public class FindArea
{
	public static void main(String[] args)
	{
		float area,perimeter;
		Scanner sc = new Scanner(System.in);
		
		Arp h = new Arp();
		
		System.out.println("Enter length of the rectangle:");
		float a=sc.nextFloat();
		System.out.println("Enter breadth of the rectangle:");
		float b=sc.nextFloat();
		
		Arp.Rectangle r = h.new Rectangle();
		area = r.area(a,b);
		perimeter=r.perimeter(a,b);
		System.out.println("\nRectangle :\nArea ="+area+"\nPerimeter ="+perimeter);
		
		System.out.println("Enter the radious");
		float x = sc.nextFloat();
		
		Arp.Circle c = h.new Circle();
		float pi=3.14f;
		area=c.area(x,pi);
		perimeter=c.perimeter(x,pi);
		System.out.println("\nCIRCLE: \nArea ="+area+"\nPerimeter ="+perimeter);
	}
}