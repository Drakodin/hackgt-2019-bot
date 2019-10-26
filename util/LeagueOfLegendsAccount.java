package util;

public class LeagueOfLegendsAccount extends Account {
	
	private String rank;
	private int level;
	
	public LeagueOfLegendsAccount(String c, String u, String p, String r, int l) {
		super(c, u, p);
		this.rank = r;
		this.level = l;
	}
	
}
