# GeometricShapesJava
Java implementations of geometric shape classes and calculations.
This repository contains Java implementations of geometric shape classes and calculations. It includes classes for rectangles, squares, and a generic shape class that serves as the base for specific shapes.
Features

    Rectangle: Represents a rectangle with methods to calculate area and perimeter.
    Square: Represents a square with methods to calculate area and perimeter.
    Shape: Abstract base class for geometric shapes, providing common functionality like retrieving shape name, area, and perimeter.

Usage

To use the classes in your Java project, follow these steps:

    Clone the repository to your local machine:

    bash

    git clone https://github.com/your-username/GeometricShapesJava.git

    Import the classes into your Java project.

    Instantiate objects of Rectangle, Square, or other shape classes as needed and use their methods to perform calculations.

Example

Here's a simple example demonstrating how to use the Rectangle and Square classes:

java

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(7);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
