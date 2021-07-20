package com.iu.c2.ex2;

import java.util.Scanner;

public class StudentInput {
	
	//addArray
	//1.새로운 배열 생성, 길이는 기존배열보다 1칸 많게
	//2.기존 배열의 값을 복사
	
	
	
	
	
	
	//makeStudent 메서드명
	//학생 한명 생성
	//이름, 번호, 국어, 영어, 수학, 입력 받고
	//총점, 평균 계산
	
	public Student makeStudent() {
		Scanner sc = new Scanner(System.in);
		
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
		
		return student;
		
	}

}
