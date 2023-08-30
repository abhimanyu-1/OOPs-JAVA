import java.text.*;
import java.util.Date;

interface calc
{
	void total();
}
class product1 implements calc
{
	int pid=101,qty=2,pr=25,total;
	String name="A";
	
	public void total(){
		
		total = qty*pr;
	}
}

class product2 extends product1 implements calc
{
	int p_id=102,qnty=1,_pr=100,totl;
	String nam="B";
	DateFormat df = new SimpleDateFormat("dd/mm/yy");
	Date d = new Date();

	public void total()
	{
		super.total();
		totl = qnty*_pr;
	}
	public void display()
	{
		System.out.println("Order No.56\n");
		System.out.println("Date:"+df.format(d));
		System.out.println("\nProduct\t\tName\t\t\tQuantity\t\tunitprice\t\t\tTotal");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println(pid+"\t\t\t"+name+"\t\t\t"+qty+"\t\t\t"+pr+"\t\t\t"+total);
		System.out.println(p_id+"\t\t\t"+nam+"\t\t\t"+qnty+"\t\t\t"+_pr+"\t\t\t"+totl);
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tNet.Amount"+"\t\t\t\t"+(total+totl));
	}
}
public class InterfaceProduct
{
	public static void main(String[] args)
	{
		product1 p1 = new product1();
		product2 p2 = new product2();		
		p1.total();
		p2.total();
		p2.display();
	}
}
	
