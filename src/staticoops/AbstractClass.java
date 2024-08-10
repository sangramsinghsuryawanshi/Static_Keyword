package staticoops;
abstract class AbstractClassDemo
{
	public abstract void print();
	AbstractClassDemo()
	{
		System.out.println("Abstrct class constructor..");
	}
	void disp()
	{
		System.out.println("Abstsrct class method disp..");
	}
}
public class AbstractClass extends AbstractClassDemo
{
	AbstractClass()
	{
		super();
		System.out.println("AbstactClass constructor..");
	}
	public void print()
	{
		System.out.println("abstartc class print method:");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractClass a = new AbstractClass();
		a.disp();
		a.print();
	}

}
