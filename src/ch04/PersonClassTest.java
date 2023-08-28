package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Person person = new Person("james");
		System.out.println(person);
		
		Class c = Class.forName("ch04.Person");
		
		Class[]	parameterTypes = {String.class}; 
		
		Constructor cons = c.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"};
		Person personKim = (Person) cons.newInstance(initargs);
		System.out.println(personKim);
				
	}

}
