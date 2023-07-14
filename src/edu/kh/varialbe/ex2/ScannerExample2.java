package edu.kh.varialbe.ex2;

import java.util.Scanner;
//Scanner 클래스를  사용하기 위해서는 class명 윗줄에 import문이필요하다.

public class ScannerExample2 {
	public static void main(String[] args) {
		//scanner 객체생성
		//System.in : 키보드에서 사용자로부터 키입력을 받기 위해서는 System.in사용
		Scanner sc = new Scanner(System.in);  
		//sc는 객체명이다
		
		
		//사칙연산 계산기
		//->두 실수를 입력받아 사칙연산 결과를 모두 출력
		//-> 단, 출력된 결과값은 소수점 이하 2째짜리까지만
		
		//정수 : sc.nextInt();
		//실수 : sc.nextDouble();
		
		//sc.nextDouble() : 입력받은 다음 실수 읽어옴
		System.out.printf("실수 1 입력: ");
		double input1 = sc.nextDouble();
		System.out.printf("실수 2 입력: ");
		double input2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n",input1,input2, (input1+input2));
		
		System.out.printf("%.2f - %.2f = %.2f\n",input1,input2, (input1-input2));
		
		System.out.printf("%.2f * %.2f = %.2f\n",input1,input2, (input1*input2));
		
		System.out.printf("%.2f / %.2f = %.2f\n",input1,input2, (input1/input2));
		
		
		
		
		
		
	}
}