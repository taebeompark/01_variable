package edu.kh.valiable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		/* 자바 기본자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte) ,int(4byte) ,long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 * */
		
		
		//변수 선언 : 메모리에 값을 저장할 공간을 할당(공간배정)하는것. ex)int Num;
		//변수 값 대입 (집어넣기): 변수에 값을 집어 넣는것. ex)Num=3; 대입
		//int num = 30; 선언과동시 초기화
		
		
		// * 카멜(낙타) 표기법:연결이되는 두 단어중 후속단어의 첫 문자를 대문자로 표기
	
		boolean booleanData;
		//메모리에 논리 값(true/false)을 저장할 공간을 1바이트 할당하고
		// 할당된 공간을  booleanData라고 부르겠다
		
		booleanData =true; //booleanData 변수에 true값을 집어넣기
		System.out.println("booleanData : "+ booleanData);
		
		
		byte byteNumber =127; //128넣는순간 에러난다.
		//메모리에 정수 값을 저장할 공간을 1byte할당하고
		//할당된 공간을 byteNumber라고 부르겠다
		//선언된 byteNumber 변수에 처음으로 127넣음.
		//초기화: 처음변수에 값을 대입
		
		
		System.out.println("byteNumber : " + byteNumber);
		
		
		short shortNumber = 32767; //변수 선언 및 초기화
		
		//정수 자료형 기본형(short, byte는 옛날코드의 잔재)
		int intNumber = 2147483647; //변수 선언 및 초기화
		
		//자료형 변수명 = 리터럴;
			//프로그래밍에서는 대입되는 이 데이터(값 자체)를 리터럴 이라는 단어로도 표현합니다
			//**리터럴 : 변수에 대입되거나 작성 되어지는 값자체
			//+자료형에 따라 리터럴 표기법이 다름.

		long longNumber = 10000000000L; //L또는 소문자l
		//the literal 10000000000 of type int is out of rang
		//->100억 이라는 값은int범위를 벗어났다 21억 몇까지만 가능
		//뒤에 L 붙여줌으로써 long 자료형인것을 나타냄
		
		
		float floatNumber = 1.2345f;//F 또는 소문자 f
		//1.2345까짐나 쓰면 에러남. 자료형 맨 앞글자인 f
		
		double doubleNumber = 3.141592;
		//double이 실수형 중에서 기본형
		//(리터럴 표기법이 없는 실수는 double로 인식)
		//d를 뒤에 쓸수는 있다-> 3.141592d;
		//실수형은 float, double 두 개밗에 없기때문에
		//자바는 double을 그냥 리터럴 표기법 안붙이고 쓰는애로 정함
		
		
		
		//문자형 리터럴 표기법: ''홀따옴표)
		//-> 문자 하나
		char ch = 'A';
		char ch2 = 66;
		/*char 자료형에 숫자가 대입될수 있는 이유?
		 * 컴퓨터에는 문자표가 존재하고 있는데
		 * 숫자에 따라 지정된 문자모양이 매핑되어있고
		 * 'B' 문자 그대로가 대입되면 변수에 숫자66으로 변환되어 저장
		 * ->반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는것이가능
		 * */
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		//유니코드에서 대문자 A는 65
		
		
		//변수 명명 규칙
		// 1. 대소문자 구분, 길이제한x
		int asdf1234143134;
		int asdG1234143134; //G다름
		
		// 2. 예약어 사용 x
		//double double;
		
		// 3. 숫자로시작 x
		//char 1abc;  에러
		char dd;
		
		// 4. 특수문자 $, _만 사용가능(하지만 쓰지않는다)
		int $number;
		int int_Number; //자바는 카멜표기법 사용
		//_작성표기법 DB사용 예)in_name
		
		
		//5.카멜표기법
		//변수명 작성시 여러단어를 이어서하는경우
		//띄어쓰지않고 후속단어 첫글자를 대문자로 작성
		char helloPtbHiTomato;
		
		
		// 6. 변수명은 언어를 가리지 않음(하지만 쓰지않음)
		int 정수1번;
		double 실수2번 =3.14;
		System.out.println(실수2번);
		
		
		//-------------------------------------------------------------
		
		int number = 10;
		System.out.println("number : "+number);
		
		number = 20;
		System.out.println("number : "+number);
		
		
		
		final double PI_VALUE = 3.14; //상수는변수를쓸때 _언더바쓴다
		//PI_VALUE = 2.3333; //에러! 재대입불가
		
		/*상수 (항상 같은수) :
		 * 변수의 한종류
		 * 한번 값이 대입되면 다른값을 재대입 할수없음 
		 * 자료형 앞에 final 키워드를 작성
		 * 
		 * 상수의 명명 규칙 : 모두 대문자, 여러단어 작성시 _(언더바) 사용
		 * 
		 * 
		 * 
		 * 상수를 사용하는경우
		 * 1) 변하면 안되는 고정된 값을 저장할때
		 * 2)특정한 값에 의미를 부여하는 경우
		 * 
		 * */
		final int LEFR_MOVE =-1;
		final int RIGHT_MOVE =1;
		
		
		
		
	}
}
