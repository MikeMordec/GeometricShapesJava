public class Square extends Shape {
	private double side;

	// constructor
	public Square(double s) {
		side = (s < 0 ? 0 : s);
		shapeName = "Square";
	}

	// return the area of a Square
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return this.side*4;
	}

	public double getSide() {
		// TODO Auto-generated method stub
		return this.side;
	}

} // end class Square