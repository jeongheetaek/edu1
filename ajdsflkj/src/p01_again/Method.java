package p01_again;

public class Method {
	int a;
	
	public static void main(String[] args) {
		Method me = new Method();
		me.printCharacter('*', 30);
		System.out.println("hello");
		me.printCharacter('#', 30);
		
	}	
	public void printCharacter(char ch, int num) {
		for(int i=0;i<num;i++)
			System.out.print(ch);
		System.out.println(); //ln은  \n을 포함하고 있다. ln을 지우면 \n도  적용 안 됨.
	}
}


