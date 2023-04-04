package in.dhirendrait;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student
{
	private String FirstName;
	private String LastName;
	private Long id;
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
	public Long getId() {
		return id;
	}
	public void setId(String string) {
		this.id = id;
	}
	
	
}
