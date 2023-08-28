package ch01;

class Book extends Object{
	private String author;
	private String title;
	
	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return title + ", " + author;
	}
	
	
	
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("조정래", "태백산맥");
		
		System.out.println(book.toString());
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
		
		Integer integer = new Integer(100);
		System.out.println(integer);
	}

}
