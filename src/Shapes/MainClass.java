package Shapes;

public class MainClass {
	
	public static void main(String[] args) {
		
		Area a=new Area(10.0);
		System.out.println("Area Of Square: "+a.square());
		
		a=new Area(9);
		System.out.println("Area of Circle: "+a.circle());
		
		a=new Area(1,10);
		System.out.println("Area of rectangle: "+a.rectangle());
		
		
		Perimeter p=new Perimeter(10.0);
		System.out.println("Perimeter of square: "+p.square());
		
		p=new Perimeter(9);
		System.out.println("Perimeter of circle: "+p.circle());
		
		p=new Perimeter(10,8);
		System.out.println("Perimeter of rectangle: "+p.rectangle());
		
		
	}
}
