package ch03;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		//String을 계속 연결하면 메모리낭비 ->strign builder나 string buffer사용하기
		
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
//		System.out.println(System.identityHashCode(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); //상수 풀에서 가져다씀
	}

}
