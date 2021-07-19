package com.iu.c1;

import java.util.Scanner;

public class ClassStudy_2 {
	
	public static void main(String[] args) {
	System.out.println("Study2 Start");
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("학생 수를 입력하세요");
	int count = sc.nextInt();
	
	//학생을 모을 배열 선언
	Student [] students = new Student[count];
	
	
	
	for(int i=0; i<students.length;i++) {
		
		Student student = new Student();
		
		System.out.println("이름을 입력하세요");
		student.name = sc.next();
		System.out.println("번호를 입력하세요");
		student.num = sc.nextInt();
		System.out.println("국어점수를 입력하세요");
		student.kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		student.eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		student.math = sc.nextInt();
		
		student.total = student.kor+student.eng+student.math;
		student.avg = student.total / 3.0;
		students [i] =student;
		
		}
		//1. 전체 정보 출력
		//2. 학생 번호 검색
		//3. 학생 정보 추가 - 학생 한명을 배열에 추가
		//4. 성적 순서 출력
		//5. 프로그램 종료
	
	boolean flag =true;
	while(flag) {
		System.out.println("번호를 입력해주세요 - 1.전체 정보 출력 2.학생 번호 검색 3.학생 정보 추가 4.성적 순서 출력 5.프로그램 종료");
		int select = sc.nextInt();
		
		switch(select) {
		
		case 1: 
			System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
			System.out.println("====================================================");
		
			for(int i = 0;i<students.length;i++) {
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].num+"\t");
			System.out.print(students[i].kor+"\t");
			System.out.print(students[i].eng+"\t");
			System.out.print(students[i].math+"\t");
			System.out.print(students[i].total+"\t");
			System.out.println(students[i].avg);
			System.out.println("------------------------------------------------");
			
			flag =!flag;
			
			}
			break;
			
		case 2: System.out.println("검색할 번호를 입력해주세요");
			int selectnum = sc.nextInt();
			
			boolean check = false;
			if(check) {
				for(int i=0; i<students.length;i++) {
					if(selectnum == students[i].num) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
						System.out.println("====================================================");
					
						for(int j = 0;j<students.length;j++) {
						System.out.print(students[selectnum].name+"\t");
						System.out.print(students[selectnum].num+"\t");
						System.out.print(students[selectnum].kor+"\t");
						System.out.print(students[selectnum].eng+"\t");
						System.out.print(students[selectnum].math+"\t");
						System.out.print(students[selectnum].total+"\t");
						System.out.println(students[selectnum].avg);
						System.out.println("------------------------------------------------");	
						}
						
						
							
						}else {
							System.out.println("정보가 없습니다");
						}
	
					
					
				}
	
			
		
			}	
		
	
	}
	
	}
	System.out.println("Study2 Finish");
	}
}

