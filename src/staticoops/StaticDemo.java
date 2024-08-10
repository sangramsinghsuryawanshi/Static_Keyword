package staticoops;

public class StaticDemo 
{
	int id;
	String name;
	static String clg="codenera";
	static int cnt=0;
	public StaticDemo(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
		System.out.println("Counter: "+cnt);
		cnt++;
	}
	public static void add()
	{
		System.out.println(cnt);
	}
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("Defualt method");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticDemo s = new StaticDemo(1,"sangram");
		StaticDemo s1 = new StaticDemo(2,"harshad");
		StaticDemo s2 = new StaticDemo(3,"aditya");
		StaticDemo s3 = new StaticDemo(4,"omkar");
		System.out.println(s.id+" "+s.name+" "+StaticDemo.clg);
		System.out.println(s1.id+" "+s1.name+" "+StaticDemo.clg);
		System.out.println(s2.id+" "+s2.name+" "+StaticDemo.clg);
		System.out.println(s3.id+" "+s3.name+" "+StaticDemo.clg);
		StaticDemo.add();
		System.out.println("Static method: ");
		System.out.println(StaticDemo.cnt);
	}

}
