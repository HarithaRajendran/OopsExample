package Shapes;

public class Perimeter implements ICommon{
	
	double side;
	int radius;
	double width;
	double height;
	
	Perimeter(double side){
		this.side=side;
	}
	
	Perimeter(int radius){
		this.radius=radius;
	}
	
	Perimeter(double width,double height){
		this.width=width;
		this.height=height;
	}
	

	@Override
	public double square() {
		return 4 * side;
	}

	@Override
	public double circle() {
		return 2*ICommon.PI_VALUE*radius;
	}

	@Override
	public double rectangle() {
		return 2*(width+height);
	}
	
}
