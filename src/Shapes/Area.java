package Shapes;

public class Area implements ICommon{
	double side;
	int radius;
	double width;
	double height;
	
	Area(double side){
		this.side=side;
	}
	
	Area(int radius){
		this.radius=radius;
	}
	
	Area(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double square() {
		return side*side;	
	}
	
	@Override
	public double circle() {
		//PI_VALUE=3.8;
		return PI_VALUE*radius*radius;
	}
	
	public double rectangle() {
		return width*height;
	}
}
