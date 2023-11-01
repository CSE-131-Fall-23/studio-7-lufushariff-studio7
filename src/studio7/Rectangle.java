package studio7;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * length + 2 * width;
	}

	public boolean compare(Rectangle a, Rectangle b) {
		if (a.area() < b.area()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean square(Rectangle a) {
		if (a.length == a.width) {
			return true;
		} else {
			return false;
		}

	}
}
