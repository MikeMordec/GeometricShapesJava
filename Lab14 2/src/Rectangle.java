public class Rectangle extends Shape {
	private double length, width;

	// constructor
	public Rectangle(double s1, double s2) {
		length = (s1 < 0 ? 0 : s1);
		width = (s2 < 0 ? 0 : s2);
		shapeName = "Rectangle";
	}

	// return the area of a Rectangle
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.length*2+this.width*2;
	}

	public double getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	public double getLength() {
		// TODO Auto-generated method stub
		return this.length;
	}
} // end class Rectangle