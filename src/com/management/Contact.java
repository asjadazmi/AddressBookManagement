package com.management;

public class Contact {
	public static String first_name;
	public static String last_name;
	public static String Address;
	public static String city;
	public static String state;
	public static int zip;
	public static long phone_number;
	public static String email;
	
	public Contact(String first_name, String last_name,String Address,String city,String state,long phone_number,String email) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.Address=Address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phone_number=phone_number;
		this.email=email;
		
		
	}


	public static String getFirst_name() {
		return first_name;
	}
	public static void setFirst_name(String first_name) {
		Contact.first_name = first_name;
	}
	public static String getLast_name() {
		return last_name;
	}
	public static void setLast_name(String last_name) {
		Contact.last_name = last_name;
	}
	public static String getAddress() {
		return Address;
	}
	public static void setAddress(String address) {
		Address = address;
	}
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Contact.city = city;
	}
	public static String getState() {
		return state;
	}
	public static void setState(String state) {
		Contact.state = state;
	}
	public static int getZip() {
		return zip;
	}
	public static void setZip(int zip) {
		Contact.zip = zip;
	}
	public static long getPhone_number() {
		return phone_number;
	}
	public static void setPhone_number(long phone_number) {
		Contact.phone_number = phone_number;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Contact.email = email;
	}

	@Override
	public String toString() {
		return "Contact []";
	}

	
	

}
