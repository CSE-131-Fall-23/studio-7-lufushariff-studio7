package studio7;

public class Die {

	private int sides;

	public static void main(String[] args) {
		Die aa = new Die(6);
		
		System.out.println(aa.roll());
		System.out.println(aa.roll());
		System.out.println(aa.roll());
		System.out.println(aa.roll());
		System.out.println(aa.roll());
		System.out.println(aa.roll());
	}

	public Die(int n) {
		sides = n;
	}

	public int roll() {
		int random = (int) (Math.random() * sides) + 1;
		return random;
	}
}
