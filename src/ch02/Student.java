package ch02;

public class Student implements Cloneable{

	private String studentName;
	private int studentId;
	
	
	
	
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}




	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(this.studentId == std.studentId) {
				return true;
			}else
				return false;
		}
		
		return false;
	}




	//같은 해쉬코드 값을 반환하기위해
	@Override
	public int hashCode() {
		return studentId;
	}




	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}




	@Override
	public String toString() {
		return studentName;
	}


	
	

	
	
	
}
