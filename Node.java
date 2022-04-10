public class Node  {

 private String firstName;
 private String lastName;
 private String phoneNumber;
 private String city;
 private String address;
 private String sex;
 private String email;

	Node next;
	
	
	public Node() {
		//data = -1;
		next = null;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}
 
 public String getLastName() {
		return lastName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
 
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
 
 
 	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
 	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
 
 

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString() {
		return "firstName = " + firstName + ", lastName = " + lastName + " , Phone Number = "
				+ phoneNumber + " , city = " + city + " ,  address = " + address +  " , sex = " + sex + " , Email = " + email;
	}
}
