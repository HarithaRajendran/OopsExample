package exceptionHandling;

import java.io.FileNotFoundException;

public class Class_1 {
	static void Share(int a) throws ExcepetionClassDemo {
		System.out.println("In Share method...");
			Class_1.send(a);
		System.out.println("Out of share method...");
	}
	
	static void  send(int a) throws ExcepetionClassDemo{
		System.out.println("in send method..");
			if(a==1) {
				throw new ExcepetionClassDemo();
			}
			else {
				System.out.println("Fine");
			}
		System.out.println("out of send method..");
	}
}
