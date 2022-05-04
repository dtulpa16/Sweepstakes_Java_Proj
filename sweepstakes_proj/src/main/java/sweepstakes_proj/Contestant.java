package sweepstakes_proj;

public class Contestant {
	public int id;
	public String firstName;
	public String lastName;
	public String email;
	public Boolean winner;
	
	public Contestant() {
	}

	public Contestant(int id, String firstName, String lastName, String email, Boolean winner) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setWinner(winner);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getWinner() {
		return winner;
	}

	public void setWinner(Boolean winner) {
		this.winner = winner;
	}
	
}
