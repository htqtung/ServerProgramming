package fi.haagahelia.ExerciseTwo.java;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getEmail() {
		return this.email;
	}
}
