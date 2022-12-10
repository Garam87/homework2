package edu.kh.control.loop.practice.service;

import java.util.Scanner;

public class LoopPracticeService {
	
	Scanner sc = new Scanner(System.in); 
	
	public void practice1() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		}
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		}
		
		for(int i = input; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice3() {
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " + ");
			sum += i;
			if(i == input) {
				System.out.print(" = ");
			}
		}
		System.out.println(sum);
	}
	
	public void practice4() {
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			for(int j = num2; j <= num1; j++) {
				System.out.print(j + " ");
			}
		}
			
	}
	
	public void practice5() {
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "�� =====");
		for(int i = num; i <= num; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(num + " X " + j + " = " + (num*j));
			}
		}
	}
	
	public void practice6() {
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 ���� ���ڸ� �Է����ּ���.");
		} else {
			for(int i = num; i <= num; i++) {
				for(int j = i; j <= 9; j++) {
					System.out.println("===== " + j + "�� =====");
					for(int k = 1; k <= 9; k++) {
						System.out.println(j + " X " + k + " = " + (j*k));
					}
				}
			}
		}
	}
	
	public void practice7() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = i; j <= input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int count = 0;

		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		//����� ���ϴ� ���� �� �𸣰ٽ��ϴ�.	
	}
	
	public void practice10() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = input; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i == input) {
				for(int k = 1; k < input; k++) {
					for(int l = k; l < input; l++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
	
	public void practice12() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 1; j < input-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= input; j++) {
				if((i == 1 || i == input) || (j == 1 || j == input)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
				
	
			
}
		
		
			
	
		
		
			
			
			
				

