package edu.kh.valiable.ex1;

public class ValiableExample1 {
	//예시)생성된 ValiableExample1.java 파일과 class 오른쪽에 작성된 이름은 같아야 한다.
	
	public static void main(String[] args) {
		
		System.out.println(2 * 3.14555634 * 5);
		System.out.println(3.1434553366 * 5 * 5);
		System.out.println(3.142131312 * 5 * 5 * 20);
		System.out.println(4 * 3.14555634 * 5 * 5);
		
		/* 변수(Variable)
		 * 
		 * -메모리(RAM)에 값을 기록하는 공간
		 * 
		 * -> 공간에 기록되는 값(data)이 변할수있어서 변수라한다
		 * 
		 * 변수는 여러종류 (저장되는 값의 형태, 크기가 다름)
		 * 
		 * 
		 * 
		 * 
		 * <변수사용의 장점>
		 * 
		 * 1.가독성증가(읽기 편해짐)
		 * 
		 * 2.재사용성 증가(한번 만든 변수를 계속사용)
		 * 
		 * 3.코드길이 감소한다.
		 * 
		 * 4.유지보수성 증가(코드수정이 간단해짐)
		 * 
		 * */
		
		//변수사용
		double pi = 3.14555634; //원주율
		int r = 5; 				 //반지름(radius)
		int h = 20;				 //높이(height)		
		
		System.out.println("----------------");
		System.out.println(2 * pi * r); //원의둘레
		System.out.println(pi * r *r); //원의넓이
		System.out.println(pi * r *r * h); //원기둥의 부피
		System.out.println(4 * pi *r * r); //구의 겉넓이
		
	}
}
