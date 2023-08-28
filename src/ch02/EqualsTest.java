package ch02;


public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Student Lee1 = new Student("Lee1", 100);
		Student Lee2 = Lee1;
		Student Shun = new Student("Lee1", 100);
		
		Student Lees = (Student) Lee1.clone();
		
		System.out.println(Lees.toString());
		
//		System.out.println(Lee1.hashCode());
//		System.out.println(Shun.hashCode());
//		
//		//원래 address확인
//		System.out.println("identityHashCode: "+System.identityHashCode(Lee1));
//		System.out.println("identityHashCode: "+System.identityHashCode(Shun));
		
		
//		System.out.println(Lee1.equals(Lee2));
//		System.out.println(Lee1 == Lee2);//address체크
//		
//		
//		System.out.println(Lee1.equals(Shun));
//		System.out.println(Lee1 == Shun); //address비교, 물리다르지만 논리적으로같음
//
		String str1 = new String("test");
		String str2 = new String("test");
//		
		System.out.println("equals: " +str1.equals(str2)); //내용은 같으니까
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());//equals값을 재정의 하면 hashcode값도재정의해야함 
		
		
	}

}
