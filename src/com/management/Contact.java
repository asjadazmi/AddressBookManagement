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
  
	public String toString()
    {
        return " Address book contanct details are as follows : \nFirst Name is :"+first_name+"\nLast Name is "+last_name+"\nAddress is :"+Address+"\nCity is "+city
                +"\nState is "+state+"\nPhone number  is "+phone_number+"\nEmail id is "+email;
    }
	

}
