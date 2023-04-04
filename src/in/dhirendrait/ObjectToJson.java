package in.dhirendrait;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson 
{
	public static void main(String[] args) throws Exception
	{
		Student s = new Student();
		s.setFirstName("Dhirendra");
		s.setLastName("Raju");
		s.setId("1");
		
		ObjectMapper m = new ObjectMapper();
		String json = m.writeValueAsString(s);
		System.out.println(json);
		
		
	}
}
