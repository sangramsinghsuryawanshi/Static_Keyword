package staticoops;

class Parent
{
	public static void staticMethod()
	{
		System.out.println("Static mehtod from parent class..");
	}
	public void mainMethod()
	{
		System.out.println("Main method from parent class..");
	}
}
class Child extends Parent
{
	public static void staticMethod()
	{
		System.out.println("Static mehtod from Child class..");
	}
	public void mainMethod()
	{
		System.out.println("Main method from Child class..");
	}
}
public class MethodHiding 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.mainMethod();
		p.staticMethod();
		
		Child c = new Child();
		c.mainMethod();
		c.staticMethod();
		
		
	}

}
