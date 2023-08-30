
public class Member {
	private String username, email, password, phonenumber;
	
	public Member() {
		super();
	}

	public Member(String username, String email, String password, String phonenumber) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	

}
