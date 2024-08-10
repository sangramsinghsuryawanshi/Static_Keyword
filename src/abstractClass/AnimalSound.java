package abstractClass;
abstract class Animal
{
	abstract void eat();
	abstract void sleep();
}
class lion extends Animal
{
	void eat()
	{
		System.out.println("Abstract class method Lion eating..");
	}
	void sleep()
	{
		System.out.println("Abstract class method Lion sleeping..");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Abstract class method Tiger eating..");
	}
	void sleep()
	{
		System.out.println("Abstract class method Tiger sleeping..");
	}
}
class Deer extends Animal
{
	void eat()
	{
		System.out.println("Abstract class method Deer eating..");
	}
	void sleep()
	{
		System.out.println("Abstract class method Deer sleeping..");
	}
}
public class AnimalSound 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		lion l = new lion();
		l.eat();
		l.sleep();
		Tiger t = new Tiger();
		t.eat();
		t.sleep();
		Deer d = new Deer();
		d.eat();
		d.sleep();
		
	}
}
