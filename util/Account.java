package util;

public class Account {
	
	private String creator;
	
	private String username;
	private String password;
	
	private Double salePrice;
	
	public Account(String c, String u, String p, double s) {
		this.creator = c;
		this.username = u;
		this.password = p;
		this.salePrice = s;
	}

	/**
	 * @return the creator
	 */
	protected String getCreator() {
		return creator;
	}

	/**
	 * @return the username
	 */
	protected String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	protected String getPassword() {
		return password;
	}

	/**
	 * @return the salePrice
	 */
	protected Double getSalePrice() {
		return salePrice;
	}
}
