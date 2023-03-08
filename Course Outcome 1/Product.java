import java.util.Scanner;

class cost
{
	int pcode;
	String pname;
	int price;
	void display(String y,int x,int z)
	{
		pcode=x;
		pname=y;
		price=z;
	}
}

class Product
{
	public static void main(String[] args)
	{
		int f3,y2,y3,z2,z3,f2;
		String f1,y1,z1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first phone name :");
		f1=s.nextLine();
		System.out.println("Enter the phone price :");
		f2=s.nextInt();
		System.out.println("Enter the phone code :");
		f3=s.nextInt();
		
		System.out.println("Enter the Second phone name :");
		y1=s.next();
		System.out.println("Enter the phone price :");
		y2=s.nextInt();
		System.out.println("Enter the phone code :");
		y3=s.nextInt();
		
		System.out.println("Enter the third phone name :");
		z1=s.next();
		System.out.println("Enter the phone price :");
		z2=s.nextInt();
		System.out.println("Enter the phone code :");
		z3=s.nextInt();
	
		
		cost p1= new cost();
		cost p2= new cost();
		cost p3= new cost();
	
		p1.display(f1,f2,f3);
		p2.display(y1,y2,y3);
		p3.display(z1,z2,z3);
		
		if(p1.price < p2.price && p1.price < p3.price)
		{
			System.out.println("The lowest price phone is : "+p1.pname);
		}
		else if(p2.price < p1.price && p2.price < p3.price)
		{
			System.out.println("The lowest price phone is : "+p2.pname);
		}
		else
		{
			System.out.println("The lowest price phone is : "+p3.pname);
		}
	}
}
