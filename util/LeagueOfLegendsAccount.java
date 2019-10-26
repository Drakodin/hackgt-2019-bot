package util;

public class LeagueOfLegendsAccount extends Account {
	
	private String rank;
	private int level;
	
	public LeagueOfLegendsAccount(String c, String u, String p, double s, String r, int l) {
		super(c, u, p, s);
		this.rank = r;
		this.level = l;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %s : %s : %d : %.2f", 
			super.getCreator(), super.getUsername(), this.rank,
			this.level, super.getSalePrice());
	}

	/**
	 * @return the rank
	 */
	protected String getRank() {
		return rank;
	}

	/**
	 * @return the level
	 */
	protected int getLevel() {
		return level;
	}
}
