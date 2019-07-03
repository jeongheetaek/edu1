package p01_again;

public class BasicEx {
	//main(): 프로그램의 시작점
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++)
			sum += i;
		System.out.println(sum);
		
		//#1.객체생성 : RAM안의 JVM에 클래스를 통째로 복사해서 CPU에서 사용할 수 있도록 만들어준다.
		BasicEx be = new BasicEx();
		System.out.println(be.a);
		//#2. static : 
		System.out.println(b);
		System.out.println(BasicEx.b); //클래스 명.변수 (Static에 해당)
		
	}
	
	int a=5;
	static int b=3; //JVM 안에 있다는 것 --> MEMORY의 부하가 일어날 수 있다.
	
	
}
