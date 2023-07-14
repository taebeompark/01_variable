package edu.kh.valiable.ex1;

public class ValiableExample3 {
	
	public static void main(String[] args){
		/*형변환(Casting):값의 자료형을 변환하는것(단,boolean 제외)
		 * 
		 * **형변환은 왜 필요할까?
		 * 컴퓨터는 기본적으로 같은 자료형 끼리만 연산이 가능함
		 * 다른 자료형과 연산시 오류발생
		 * -->이러한 상황을 해결하기 위해서 필요한 기술이 형변환.
		 * 자동 / 강제 형변환이 존재
		 * 
		 * */
		int num1 =10;
		double num2=3.5;
		System.out.println("자동 형변환 결과: "+(num1+num2));
		//원래 에러가 발생되어야하지만 "자동 형변환"덕분에 발생하지 않음.
		//실수 + 정수 = 실수
		int i1 = 3;
		double d1 =i1;
		System.out.println("i1 :"+i1); //3
		System.out.println("d1 :"+d1); //3.0
		//double은 실수만 저장할수있는 자료형
		//정수가 대입되는 연산이 수행되면
		//정수-> 실수로 자동 형변환

		System.out.println(d1 + num2); //double + double
		
		
		
		
		
		// int ->long 형변환
		int i2 =2_100_000_000; //21억
		long l2 = 10_000_000_000L; //100억 
		
		long result2 = i2+ l2;
		//int + long -> long + long =long
		
		System.out.println("result2 : "+ result2);
		
		
		
		
		
		
		//char -> int 형변환
		/*char 자료형은 문자형 이지만 실제 지정하는 값은
		 * 0부터 6만5천번 사이에있는 숫자
		 * 
		 * */
		
		char ch3 ='A';
		int i3 = ch3;
		System.out.println(i3);
		
		
		char ch4 ='가';
		int i4 = ch4;
		System.out.println(i4);
		
		
		
		
		//오버플로우 현상은 컴퓨터가 미리 예측할수없다
		// -> 개발자가 미리 예측해야함
		
		int i6 = 2147483647; //int 최대값
		int result6 = i6 +1; //1더하면 -부호가 붙는다
		System.out.println(result6);//-2147483648

	}
}
