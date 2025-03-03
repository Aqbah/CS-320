package Contact;

import java.security.SecureRandom;

public class Contact {
	private final String contID;
	private String fName;
	private String lName;
	private String phone;
	private String addr;

	public Contact(String firstName, String lastName, String phone, String address) {

		this.contID = genRandId();
		
		//Validation and assignment of fields
		this.fName = valName(firstName, "First Name", 10);
		this.lName = valName(lastName, "Last Name", 10);
		this.phone = valNo(phone);
		this.addr = valAddr(address, 30);
	}
	
	private String genRandId() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder uniqueId = new StringBuilder();
		SecureRandom rand = new SecureRandom();
		
		for (int i = 0; i < 10; i++) {
			uniqueId.append(chars.charAt(rand.nextInt(chars.length())));
		}
		
		return uniqueId.toString();
	}
	
	private String valName(String name, String nameField, int lenMax) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException(nameField + " cannot be empty or null!");
		}
		if (name.length() > lenMax) {
			throw new IllegalArgumentException(nameField + " cannot be longer than " + lenMax + " characters!");
		}
		return name;
	}
	
	private String valNo(String phone) {
		if (phone == null || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Phone Number should be exactly 10 digits!");
		}
		return phone;
	}
	
	private String valAddr(String addr, int lenMax) {
		if (addr == null || addr.isEmpty()) {
			throw new IllegalArgumentException("Address field cannot remain empty or null!");
		}
		if(addr.length() > lenMax) {
			throw new IllegalArgumentException("Address cannot be longer than " + lenMax + " characters!");
		}
		return addr;
	}
	
	//Getters for the fields
	public String getContId() {
		return contID;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public String getNo() {
		return phone;
	}
	
	public String getAddr() {
		return addr;
	}
	
	//Setters for fields which are updatable
	public void setFName(String fName) {
		this.fName = valName(fName, "First Name", 10);
	}
	
	public void setLName(String lName) {
		this.lName = valName(lName, "Last Name", 10);
	}
	
	public void setNo(String phone) {
		this.phone = valNo(phone);
	}
	
	public void setAddr(String addr) {
		this.addr = valAddr(addr, 30);
	}
		
}