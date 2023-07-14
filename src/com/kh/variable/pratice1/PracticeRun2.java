package com.kh.variable.pratice1;
import java.util.Scanner;
public class PracticeRun2 {
//문실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
//이 때 총점과 평균은 정수형으로 처리하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		////
		System.out.print("국어 :");
		double input1 = sc.nextDouble();
		
		System.out.print("영어 :");
		double input2 = sc.nextDouble();
		
		System.out.print("수학 :");
		double input3 = sc.nextDouble();
		
		//CASE2 1
		System.out.printf("\n총점 : %.0f\n",input1+input2+input3);
		
		System.out.printf("평균 : %.0f",(input1+input2+input3)/3);
		
		
		// CASE 2
		
		//System.out.printf("\n총점 : %d\n",(int)input1+input2+input3);
		
		//System.out.printf("평균 : %d",(int)(input1+input2+input3)/3);
	
	}
}
