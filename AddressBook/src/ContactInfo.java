
public class ContactInfo {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;

    // Creates Contact object based on parameters.
    public ContactInfo(String firstName, String lastName, String phoneNumber, String email) {
    	this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.email=email; 
    }

    // Changes phone number of contact
   
    public void changeFirstName(String newfirst) {
		firstName = newfirst;
    }
    public void changeLastName(String newlast) {
		lastName = newlast;
    }
    public void changeNumber(String newnum) {
		phoneNumber = newnum;
    }
    public void changeEmail(String newemail) {
		email = newemail;
    }
    // Implements the passing of Contact's birthday.

    // Returns the name of a Contact
    public String getFirstName() {
		return firstName;
    }

    // Returns the age of a Contact
    public String getLastName() {
		return lastName;
    }


    // Returns the phone number of a Contact
    public String getNumber() {
		return phoneNumber;
    }
    public String getEmail() {
		return email;
    }
    // Prints all information about a contact out.
    public void printContact() {
		System.out.print('\n' + "First Name: " + firstName + '\n' + " Last Name: " + lastName + '\n' + " Phone#: " + phoneNumber + '\n' + " Email: " +email);
		
    }
    
	@Override
	public String toString() {
		return "ContactInfo [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
   

}
