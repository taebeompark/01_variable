package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		// '/'는 나누기한 몫이고  
		// '%'는 나머지이다
		System.out.println( iNum1 / iNum2 ); // 2
		
		System.out.println((int)dNum ); // 2
		
		System.out.println( iNum2*dNum ); // 10.0
		
		System.out.println((double)iNum1 ); // 10.0   
		
		System.out.println( (double)iNum1/ iNum2 ); // 2.5
		
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3
	
		System.out.println( iNum1/ (int)fNum ); // 3
		
		
		
		//float /double 차이점
		//float : 소수점 아래 8번째 자리까지 연산후 반올림
		//double: 소수점아래 16번째 자리까지 연산후 반올림
		//double 은 뒤에가 5 로끝나는 이유?
		//->컴퓨터는 숫자를 2진수로 표현한다
		//-> 3.3333.. 이런 실수도 11.01011011011... 이런식으로
		//2진수로 실수를 표현하면 무한히 반복되는 경우가 많다
		//따라서 일정한 크기만큼 계산하고 적당한 위치에서 잘라내어 반올림하는데
		//2진수->10진수로 변환했을때
		//float 7~8자리까지 자르고, double은 15`16자리까지자름
		//자르는 위치가 다르니까 숫자가 다르게 나올수잇다.
		//-> 2진수로 소수점 이하를 정확하게 표현하지 못하는 경우가 많아서
		//근사치가 출력하게 된다. 2진수->10진수 변환이 잘못된경우
		// 				     10   3.0f
		System.out.println( iNum1/ fNum );// 3.3333333
		System.out.println( iNum1/ (double)fNum ); // 3.3333333333333335
		
		
		
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'
		
		//ch 와 iNum1 더하기 ==> int로 자동변환
		//그값을 char형태로 강제형 변환
		//양옆에 + 로 문자열 연결해주기
	}
}
