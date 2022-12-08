package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		String result;
		
		if(num <= 0) {
			result = "����� �Է����ּ���";
		} else if(num % 2 == 0) {
			result = "¦���Դϴ�";
		} else {
			result = "Ȧ���Դϴ�";
		}
		System.out.println(result);
	}
	
	public void practice2() {
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int mat = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3;
		String result;
		
		if((kor < 40 || mat < 40 || eng < 40) || (avg < 60)) { 
			//�������� ������ 40�� �̸��̰ų� ��հ��� 60�� �̸��϶�
			result = "���հ��Դϴ�.";
		} else { 
			//�������� ������ 40�� �̻��̰� ��հ��� 60�� �̻��϶�
			System.out.printf("���� : %d\n���� : %d\n���� : %d\n�հ� : %d\n��� : %.1f\n",
								kor, mat, eng, sum, avg);
			result = "�����մϴ�, �հ��Դϴ�!";
		}
		System.out.println(result);
	}
	
	public void practice3() {
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		int day; 
		
		switch(month) {
		
		case 1 : case 3 : case 5 : case 7 : 
		case 8 : case 10 : case 12 : 
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 2 :
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		default :
			System.out.println(month +"���� �߸� �Էµ� ���Դϴ�.");
		}
	}

	public void practice4() {
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result;
		
		if(bmi < 18.5) {
			result = "��ü��";
		} else if(bmi >= 18.5 && bmi < 23) {
			result = "����ü��";
		} else if(bmi >= 23 && bmi < 25) {
			result = "��ü��";
		} else if(bmi >= 25 && bmi < 30) {
			result = "��";
		} else {
			result = "����";
		}
		System.out.println("BMI ���� : " + bmi);
		System.out.println(result);
	}

	public void practice5() {
		System.out.print("�߰� ��� ���� : ");
		double exam1 = sc.nextDouble();
		System.out.print("�⸻ ��� ���� : ");
		double exam2 = sc.nextDouble();
		System.out.print("���� ���� : ");
		double exam3 = sc.nextDouble();
		System.out.print("�⼮ Ƚ�� : ");
		int att = sc.nextInt();
		
		double sum1 = exam1 * 0.2;
		double sum2 = exam2 * 0.3;
		double sum3 = exam3 * 0.3;
		
		double total = sum1 + sum2 + sum3 + att;
		
		System.out.println("============���============");
		
		if(att <= 14) {
			System.out.println("Fail [�⼮ Ƚ�� ���� (" + att + "/20)");
		} else {
			if(total < 70.0) {
				System.out.println("�߰� ��� ����(20) : " + sum1);
				System.out.println("�⸻ ��� ����(30) : " + sum2);
				System.out.println("���� ����     (30) : " + sum3);
				System.out.println("�⼮ ����     (20) : " + (double)att);
				System.out.println("���� : " + total);
				System.out.println("Fail [�����̴�]");
			} else {
				System.out.println("�߰� ��� ����(20) : " + sum1);
				System.out.println("�⸻ ��� ����(30) : " + sum2);
				System.out.println("���� ����     (30) : " + sum3);
				System.out.println("�⼮ ����     (20) : " + (double)att);
				System.out.println("���� : " + total);
				System.out.println("PASS");
			}
		}
	}
}


