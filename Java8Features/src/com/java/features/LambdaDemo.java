package com.java.features;

interface A {
	void show ();
}

//class B implements A {
//	
//	public void show() {
//		System.out.println("hELLO");
//	}
//}

interface C {
	int square(int n);
}

public class LambdaDemo {

	public static void main(String[] args) {
	
//		A obj = new B();
//		obj.show();
		
//		A obj = new A() {    // Anonymous inner class
//			public void show ( ) {
//				System.out.println("Hello using Anonymous inner class");
//			}
//		};
//		
//		obj.show();
		
		//implementing interface with Lambda expression

		A obj = () -> {
			System.out.println("Hello using Lambda expression");
		};
		obj.show();
		
		obj = () -> System.out.println("Hello using Lambda expression in one line");
	
		obj.show();
		
		//implementing interface Lambda with arguments and return values 
		//C cobj = (int i) ->  i * i;
		//C cobj = (i) ->  i * i;
		C cobj =   i ->  i * i;
		
		System.out.println(cobj.square(6));
	
	}

}
