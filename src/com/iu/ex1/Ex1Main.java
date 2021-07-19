package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
		//캐릭터 생성
		Character ch = new Character();
		ch.name ="전사1";
		ch.level = 1;
		ch.hp = 200;  //체력
		ch.mp = 50;  //마나
		System.out.println(ch.weapon);
	
		
		//무기 생성
		Weapon weapon = new Weapon();
		weapon.name = "낡은검";
		weapon.damage = 10;
		weapon.critical= 0.4;
		weapon.upgrade = 1;
		
		ch.weapon = weapon;
		System.out.println(ch.weapon.name);
		
		//ch가 가지고 있는 무기의 이름을 변경하고 출력
		ch.weapon.name = "지팡이";
		System.out.println(ch.weapon.name);
		
		weapon.name = "도끼";
		System.out.println(ch.weapon.name);
		//몬스터 생성
		
		Monster monster = new Monster();
		monster.name = "오크";
		monster.level = 2;
		monster.hp = 300;
		monster.mp = 100;
		monster.gold = 30;
		monster.weapon = new Weapon();
		monster.weapon.name = "몽둥이";
		monster.weapon.damage = 500;
		monster.weapon.critical = 0.8;
		monster.weapon.upgrade = 3;
		
		
		ch.gold = ch.gold + monster.gold;
		
		ch.weapon = monster.weapon;
		
		System.out.println("Name : "+ch.name);
		System.out.println("Level : "+ch.level);
		System.out.println("HP : "+ch.hp);
		System.out.println("MP : "+ch.mp);
		System.out.println("Gold : "+ch.gold);
		System.out.println("Wepaon : "+ch.weapon.name);
		System.out.println("Weapon.damage : "+ch.weapon.damage);
		
		
		
		System.out.println("Ex1 Finish");

	}

}
