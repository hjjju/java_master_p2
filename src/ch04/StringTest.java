package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		/**
		 * 컴파일하는 시점에 데이터타입을 지정할수 x때 사용
		 */
		Class c = Class.forName("java.lang.String"); //동적로딩
		System.out.println(c.getName());
		
//		String str;
		
		Constructor<String>[] cons = c.getConstructors();
		
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		Method[] methods = c.getMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
		
	}

}
