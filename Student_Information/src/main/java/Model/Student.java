package Model;

public class Student {
	private int ID;
	private String FirstName, LastName, Email, Gender, Password;
	private long Mobile;

	public int getID() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [id=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Gender=" + Gender + ", Password=" + Password + ", Mobile=" + Mobile + "]";
	}

}
