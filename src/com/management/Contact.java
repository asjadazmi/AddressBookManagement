package com.management;

public class Contact {
	public static String first_name;
	public static String last_name;
	public static String Address;
	public static String city;
	public static String state;
	
	public static long phone_number;
	public static String email;
	
	public Contact(String first_name, String last_name,String Address,String city,String state, long phone_number, String email) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.Address=Address;
		this.city=city;
		this.state=state;
		
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
	public String toString()
    {
        return " Address book contanct details are as follows : \nFirst Name is :"+first_name+"\nLast Name is "+last_name+"\nAddress is :"+Address+"\nCity is "+city
                +"\nState is "+state+"\nZip code is "+"\nPhone number  is "+phone_number+"\nEmail id is "+email;
    }
	

}
