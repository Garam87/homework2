package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		String result;
		
		if(num <= 0) {
			result = "양수만 입력해주세요";
		} else if(num % 2 == 0) {
			result = "짝수입니다";
		} else {
			result = "홀수입니다";
		}
		System.out.println(result);
	}
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3;
		String result;
		
		if((kor < 40 || mat < 40 || eng < 40) || (avg < 60)) { 
			//세과목의 점수가 40점 미만이거나 평균값이 60점 미만일때
			result = "불합격입니다.";
		} else { 
			//세과목의 점수가 40점 이상이고 평균값이 60점 이상일때
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n",
								kor, mat, eng, sum, avg);
			result = "축하합니다, 합격입니다!";
		}
		System.out.println(result);
	}
	
	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		int day; 
		
		switch(month) {
		
		case 1 : case 3 : case 5 : case 7 : 
		case 8 : case 10 : case 12 : 
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 2 :
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		default :
			System.out.println(month +"월은 잘못 입력된 달입니다.");
		}
	}

	public void practice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi >= 18.5 && bmi < 23) {
			result = "정상체중";
		} else if(bmi >= 23 && bmi < 25) {
			result = "과체중";
		} else if(bmi >= 25 && bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
	}

	public void practice5() {
		System.out.print("중간 고사 점수 : ");
		double exam1 = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double exam2 = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double exam3 = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();
		
		double sum1 = exam1 * 0.2;
		double sum2 = exam2 * 0.3;
		double sum3 = exam3 * 0.3;
		
		double total = sum1 + sum2 + sum3 + att;
		
		System.out.println("============결과============");
		
		if(att <= 14) {
			System.out.println("Fail [출석 횟수 부족 (" + att + "/20)");
		} else {
			if(total < 70.0) {
				System.out.println("중간 고사 점수(20) : " + sum1);
				System.out.println("기말 고사 점수(30) : " + sum2);
				System.out.println("과제 점수     (30) : " + sum3);
				System.out.println("출석 점수     (20) : " + (double)att);
				System.out.println("총점 : " + total);
				System.out.println("Fail [점수미달]");
			} else {
				System.out.println("중간 고사 점수(20) : " + sum1);
				System.out.println("기말 고사 점수(30) : " + sum2);
				System.out.println("과제 점수     (30) : " + sum3);
				System.out.println("출석 점수     (20) : " + (double)att);
				System.out.println("총점 : " + total);
				System.out.println("PASS");
			}
		}
	}
}


