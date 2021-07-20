package com.iu.c2.ex1;

public class PhoneView {
	
	public void view(Phone phone) {
		
		System.out.println(phone.company);
		System.out.println(phone.brand);
		System.out.println(phone.color);
		System.out.println(phone.size);
		System.out.println(phone.price);
		
	}
	
	//핸드폰의 합계 금액을 계산해서 출력 매개변수는 하나만 선언
	
	public void makePrice(Phone [] phones) {
		
		int sum = 0; //가격의 총합
		
		for(int i=0; i<phones.length;i++) {
			sum = sum+phones[i].price;
		}
		System.out.println("최종 가격 : "+sum);
	}

}
