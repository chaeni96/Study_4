package com.iu.c2.ex1;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
		
		PhoneView phoneview = new PhoneView();
		
		Phone phone =new Phone(); 
		phone.company = "Apple";
		phone.brand = "iphone 12";
		phone.color = "black";
		phone.size = 5;
		phone.price = 1500000;
		
		Phone phone2 = new Phone();
		phone2.company = "SAMSUNG";
		phone2.brand = "Galaxy 20";
		phone2.color = "Pink";
		phone2.size = 15;
		phone2.price = 9700000;
		
		phoneview.view(phone);		
		
		Phone [] phones = new Phone[2];
		phones [0] = phone;
		phones [1] = phone2;
		
		phoneview.makePrice(phones);
		
		System.out.println("Ex1 Finish");
	}

}
