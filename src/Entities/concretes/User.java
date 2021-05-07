package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	private int Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private boolean Validated;
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email, String password) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		Validated = false;
	}

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isValidated() {
        return Validated;
    }

    public void setValidated(boolean Validated) {
        this.Validated = Validated;
    }

	
}
