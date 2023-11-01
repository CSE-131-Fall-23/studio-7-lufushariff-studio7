package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public static void main(String[] args) {
		Fraction a = new Fraction(2, 4);
		
		Fraction b = new Fraction(3, 6);
		
		System.out.println(a.multi(a, b));
		
		System.out.println(b.reciprocal(b));
		
	}
	
	public Fraction(int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	
	public String add(Fraction a, Fraction b)
	{
		Fraction temp;
		
		int tempD = a.denominator * b.denominator;
		int tempN = a.numerator * b.denominator + b.numerator * a.denominator;
		
		temp = new Fraction(tempN, tempD);
		
		return tempN + "/" + tempD;
	}
	
	public String multi(Fraction a, Fraction b)
	{
		Fraction temp;
		
		int tempN = a.numerator * b.numerator;
		int tempD = a.denominator * b.denominator;
		
		temp = new Fraction(tempN, tempD);
		
		return tempN + "/" + tempD;
	}
	
	public String reciprocal(Fraction a)
	{
		Fraction temp = new Fraction(a.denominator, a.numerator);
		
		return a.denominator + "/" + a.numerator;	
		
	}
	
	public String simplify()
	{
		int greatest = gcd(numerator, denominator);
		
		Fraction temp = new Fraction(numerator/greatest, denominator/greatest);

		return numerator/greatest + "/" + denominator/greatest;
	}
	
	public static int gcd(int p, int q) {
		
		// FIXME compute the gcd of p and q using recursion
		
		if(q == 0)
		{
			return p;
		}
		else 
		{
			int temp = q;
			q = p % q;
			p = temp;
			
			return gcd(p, q);
		}
	
		
	
}
}
