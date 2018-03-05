package doublyLinkedList;

public class Person {
	private String firstName;
	private String lastName;
	private String employer;
	
	public Person() {
		this(null, null, null);
	}
	
	public Person(String f, String l, String e) {
		firstName = f;
		lastName = l;
		employer = e;
	}
	
	public Person(String f, String l) {
		firstName = f;
		lastName = l;
		employer = null;
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

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}
	
	
}