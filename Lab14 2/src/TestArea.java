public class TestArea {
	public static void main(String args[]) {
		double side = 5.0;
		double length = 10.0;
		double width = 12.0;
		int size = 5;
		Shape arrayOfShapes[] = new Shape[size];
		// fill in your array to reference five various shapes from your
		// child classes. Include differing data points (i.e., length,
		// width, etc) for each object
		arrayOfShapes[0] = new Rectangle(10.0, 12.0);
		arrayOfShapes[1] = new Square(5.0);
		arrayOfShapes[2] = new Rectangle(11.0, 12.0);
		arrayOfShapes[3] = new Square(6.0);
		arrayOfShapes[4] = new Rectangle(12.0, 12.0);

		/*
		 * create a for - enhanced loop to iterate over each arrayofShapes to
		 *
		 * display the shape name and associated area for each object
		 */
		System.out.printf("%-20s%-20s%-20s%-20s%-16s%-20s\n", "Shape", "Area", "Perimeter", "Length", "Width", "Side");
		/*
		 * create a for - enhanced loop to iterate over each arrayofShapes to display
		 * the shape name and associated area for each object
		 */
		int countSqr = 0;
		int countRect = 0;
		for (Shape shape : arrayOfShapes) {
			System.out.printf("%-20s", shape.getClass().getSimpleName());
			System.out.printf("%-20.2f", shape.getArea());
			System.out.printf("%-20.2f", shape.getPerimeter());
			if (shape instanceof Square) {
				countSqr++;
				System.out.printf("%40.2f\n", ((Square) shape).getSide());
			} else {
				countRect++;
				System.out.printf("%-20.2f%-20.2f\n", ((Rectangle) shape).getLength(),
						((Rectangle) shape).getWidth());
			}

		}
		System.out.println("----");
		System.out.println("Rectangle shape count: " + countRect);
		System.out.println("Square shape count:" + countSqr);


	} // end main
} // end class TestArea