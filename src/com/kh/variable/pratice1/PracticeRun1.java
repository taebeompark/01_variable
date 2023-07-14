package com.kh.variable.pratice1;
import java.util.Scanner;
public class PracticeRun1 {
//키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자입력 :");
		char input1 = sc.next().charAt(0); //A
		
		
		System.out.printf("%s unicode : %d",input1, (int)input1);
	
		
		
	}

}
