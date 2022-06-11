package com.management;

import java.util.Scanner;

public class AddressBookMain extends Contact {

	public static void main(String[] args) {
		System.out.println("welcome to the address book management");
		   Scanner sc=new Scanner(System.in);
			System.out.println("enter the first name");
			first_name=sc.next();
			System.out.println("enter the last name");
			last_name=sc.next();
			System.out.println("enter the Address");
			Address=sc.next();
			System.out.println("enter the city");
			city=sc.next();
			System.out.println("enter the state");
			state=sc.next();
			System.out.println("enter the zip");
			zip=sc.nextInt();
			System.out.println("enter the phone number");
			phone_number=sc.nextInt();
			System.out.println("enter the email");
			email=sc.next();
			
			
			AddressBookMain c1=new AddressBookMain(); 
			System.out.println("my name is :"+c1.first_name+" "+c1.last_name+"\nAddress: "+c1.Address+".\nmy city :"+c1.city+"\nmy state"+c1.state+"\nphone number:"+c1.phone_number+"\nemail"+c1.email);
			
		
	}
	
}
