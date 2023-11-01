package studio7;

public class Complex {

	private double real;
	private double im;

	public Complex(double a, double b) {
		real = a;
		im = b;
	}

	public String add(Complex b) {

		double r = real + b.real;
		double i = im + b.im;

		return r + " + " + i + "i";
	}

	public String multi(Complex b) {

		double r = real * b.real - im * b.im;
		double i = real * b.im + im * b.real;

		return r + " + " + i + "i";
	}
}
