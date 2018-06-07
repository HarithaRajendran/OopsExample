package exceptionHandling;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {
	String res="ggggggggg<code>hello haiiii";
	String a="a";
	{
//		System.out.println(res.contains(a));
//		System.out.println(res.indexOf(a));
		try {
			System.out.println(a+"->"+Arrays.toString(a.getBytes("UTF-16")));
			System.out.println(a+"->"+Arrays.toString(a.getBytes("UTF-16LE")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		StringTest s1=new StringTest();
		
	}
			
}
