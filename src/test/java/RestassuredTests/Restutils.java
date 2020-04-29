package RestassuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class Restutils {
	

// body data for post	
//	{
//		
//		"FirstName":"kkk",
//		"LastName":"yyy",
//		"UserName":"qwe34",
//		"Password":"ffff",
//		"Email":"sadsa@fdd.com"
//
//}
	
	private static String firstname;
	private static String lastname;
	private static String username;
	private static String password;
	private static String email;
	
	
	public static String getFirstname() {
		String generateStringFirstName = RandomStringUtils.randomAlphabetic(1);
		
		return ("krishna"+generateStringFirstName);
		
	}

	public static String getLastname() {
		String generateStringLastname = RandomStringUtils.randomAlphabetic(1);
		
		return ("uppara"+generateStringLastname);
	}

	public static String getUsername() {
String generateStringUsername = RandomStringUtils.randomAlphabetic(1);
		
		return ("uppara"+generateStringUsername);
	}

	public static String getPassword() {
String generateStringPassword = RandomStringUtils.randomAlphabetic(1);
		
		return ("uppara"+generateStringPassword);
	}

	public static String getEmail() {
String generateStringEmail = RandomStringUtils.randomAlphabetic(1);
		
		return ("uppara"+generateStringEmail);
	}
	
	public static String getSalary() {
		String generateStringSalary = RandomStringUtils.randomNumeric(5);
				
				return ("uppara"+generateStringSalary);
			}
	
	public static String getAge() {
		String generateStringAge = RandomStringUtils.randomNumeric(2);
				
				return ("uppara"+generateStringAge);
			}
	
	
	}



