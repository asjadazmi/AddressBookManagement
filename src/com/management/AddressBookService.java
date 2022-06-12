package com.management;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookService extends Contact{
	public AddressBookService(String first_name, String last_name, String Address, String city, String state,
			long phone_number, String email) {
		super(first_name, last_name, Address, city, state, phone_number, email);
		// TODO Auto-generated constructor stub
	}
	static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> arrayOfContacts = new ArrayList<>();
public static void addcontact() {
	System.out.println("Please enter your first name :");
    String first_name = sc.next();
    System.out.println("Please enter your last name :");
    String last_name = sc.next();
    sc.nextLine();
    System.out.println("Please enter your Address :");
    String Address = sc.nextLine();
    System.out.println("Please enter your city :");
    String city = sc.next();
    System.out.println("Please enter your state :");
    String state = sc.next();
    System.out.println("Please enter your phone number :");
    long phone_number = sc.nextLong();
    System.out.println("Please enter your email id :");
    String email = sc.next();
    Contact contact=new Contact(first_name,last_name,Address,city,state,phone_number,email);
    arrayOfContacts.add(contact);
}
public static void edit_contact() {
	 for(Contact con : arrayOfContacts)
     {
         System.out.println(con);
     }
	System.out.println("Please enter your first name :");
    String first_name = sc.next();
    System.out.println("Please enter your last name :");
    String last_name = sc.next();
    sc.nextLine();
    System.out.println("Please enter your Address :");
    String Address = sc.nextLine();
    System.out.println("Please enter your city :");
    String city = sc.next();
    System.out.println("Please enter your state :");
    String state = sc.next();
    System.out.println("Please enter your phone number :");
    long phone_number = sc.nextLong();
    System.out.println("Please enter your email id :");
    String email = sc.next();
    Contact contact=new Contact(first_name,last_name,Address,city,state,phone_number,email);
    arrayOfContacts.add(contact);
	
}
public static void delete() {
	System.out.println("Enter the first name to be deleted :");
    String first_name = sc.next();
    if(first_name.equals(first_name))
    {
        System.out.println("The details are found!!");
        first_name="";
        last_name="";
        Address="";
        phone_number=(Long) null;
        state="";
        city="";
        email="";

        System.out.println("finally your contact deleted");
    }
}

    public static void display()
    {

        for(Contact con : arrayOfContacts)
        {
            System.out.println(con);
        }
}}