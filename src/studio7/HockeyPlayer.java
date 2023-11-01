package studio7;

public class HockeyPlayer {

	private int jersey;
	private String name;
	private int game;
	private int goals;
	private int assists;
	
	public HockeyPlayer(int j, String n) {
		jersey = j;
		name = n;
	}
	
	public String game()
	{
		game++;
		goals = (int) (Math.random()*10000 + 1);
		assists = (int) (Math.random()*10000 + 1);
		return "GAMED";
	}

	
}
