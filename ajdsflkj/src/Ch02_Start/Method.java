package Ch02_Start;

public class Method {
	int a;
	
	public static void main(String[] args) {
		
		//참조변수 me 에는 주소값이 들어있다.
		
		MethodSub me = new MethodSub(); //MethodSub 은 타입으로 불린다. (변수 me) 변수 앞은 타입
		me.printCharacter('*', 30);
		System.out.println("hello");
		me.printCharacter('#', 30);
		
		System.out.println(); /////// 위에는 MethodSub의 호출 함수가 Static 변수가 아닌 경우, 아래는 Static 변수인 경우
		
		
		MethodSub.printCharacter('*', 30);
		System.out.println("hello");
		MethodSub.printCharacter('#', 30);
		
		System.out.println();
	
			
		Method m = new Method();
		System.out.println(m.a);
		
		System.out.println(me); //주소값
		System.out.println(m); //
		
	}	
	
}


