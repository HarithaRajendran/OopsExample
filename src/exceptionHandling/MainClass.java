package exceptionHandling;

import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		try {
			Class_1.Share(1);
		} catch (ExcepetionClassDemo e) {
			// TODO Auto-generated catch block
			e.demo();
		}
	}

}
