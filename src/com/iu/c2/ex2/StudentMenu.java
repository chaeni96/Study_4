package com.iu.c2.ex2;

import java.util.Scanner;


public class StudentMenu {
	
	//메서드명 start
	//1.전체 정보 출력
	//2.학생 번호 검색
	//3.학생 정보 추가 - 학생 한명을 배열에 추가
	//4.성적 순서 출력
	//5.프로그램 종료
	
	public void start() {
		Scanner sc= new Scanner(System.in);
		
		StudentView sv = new StudentView();//객체
		
		StudentInput si = new StudentInput();
		
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt(); //학생 수 변수 선언
		
		//학생을 모을 배열 선언
		Student [] students = new Student[count];
		
		
		
		for(int i=0; i<students.length;i++) {
			//Student student = si.makeStudent();
			//students[i] = student;
			students[i] = si.makeStudent();
			}
		boolean flag = true;
		
		while(flag) {
			System.out.println("1.전체 정보 출력");
			System.out.println("2.학생 번호 검색");
			System.out.println("3.학생 정보 추가");
			System.out.println("4.성적 순서 출력");
			System.out.println("5.프로그램 종료");
			
			int select = sc.nextInt(); //선택 번호 변수
			
			switch(select) {
			case 1:
				sv.viewAll(students);
				break;
				
			case 2:
				System.out.println("검색할 번호를 눌러주세요");
				int num = sc.nextInt(); //누른 번호 변수
				
				Student student = null;
				for(int i=0; i<students.length;i++) {
					if(students[i].num == num) {
						student = students[i];
						break;
					}
				}
				if(student != null) {
					sv.viewOne(student);
				}else {
					System.out.println("정보가 없습니다");
				}
				
				break;
			
			case 3:
				System.out.println("정보 추가");
				break;
			
			case 4: 
				System.out.println("성적순 출력");
			
			default :
				System.out.println("종료합니다");
				flag = false;
			}
		
		}
	}
	}		


