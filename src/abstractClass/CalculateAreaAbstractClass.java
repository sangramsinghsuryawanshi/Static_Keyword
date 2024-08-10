package abstractClass;
abstract class Shape
{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
class Circle extends Shape
{
	void calculateArea()
	{
		double pi=3.14;
		int r=2;
		System.out.println("Abstract class calculateArea method from circle: "+(2*(pi*(r*r))));
	}
	void calculatePerimeter()
	{
		double pi=3.14;
		int r=3;
		System.out.println("Abstract class calculatePerimeter method from circle: "+(2*(pi*r)));
	}
}
class Triangle extends Shape
{
	void calculateArea()
	{
		int b=2,h=4;
		System.out.println("Abstract class calculateArea method from triangle: "+(double)(0.5*(b*h)));
	}
	void calculatePerimeter()
	{
		int a=3,b=9,c=8;
		System.out.println("Abstract class calculatePerimeter method from trianglr: "+(a+b+c));
	}
}
public class CalculateAreaAbstractClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Shape c = new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		
		Shape t = new Triangle();
		t.calculateArea();
		t.calculatePerimeter();
		
	}

}
