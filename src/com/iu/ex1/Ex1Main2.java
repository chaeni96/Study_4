package com.iu.ex1;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("Main2 Start");
		Pet pet1= new Pet();
		pet1.name = "멍구리";
		
		Pet pet2 = new Pet();
		pet2.name = "춘식이";
		
		Character c1 = new Character();
		c1.p1 = pet1;
		c1.p2 = pet2;
		
		System.out.println(c1.p1.name);
		System.out.println(c1.p2.name);
		
		//배열
		//배열은 같은 데이터타입
		Pet [] pets = new Pet[2];
		pets[0] = pet1;
		pets[1] = new Pet();
		pets[1].name = "구리구리";
		
		for(int i= 0; i<pets.length;i++) {
			System.out.println(pets[i].name);
		}
		System.out.println("Main2 Finish");

	}

}
