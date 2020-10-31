package labassignment;

import java.util.List;

public class mainmethod {

public static void main(String[] args) {
		
		Book book = new Book(1,"Database management systemn","Raghu Ramakrishnan");
		Book book1 = new Book(2, "Operating System", "Abraham Silberschatz");
		Book book3 = new Book(3, "cloud computing ", "Erl, Thomas");
		
		
		
		BookCollection bookCollection = new BookCollection();
		bookCollection.bookList.add(book);
		bookCollection.bookList.add(book1);
		bookCollection.bookList.add(book3);
		
		System.out.println("---------------before sorting---------------");
		printBooks(bookCollection.bookList);
		
		//Book bookUpdate = new Book("Let us c", "Yashavant Kanetkar");
		//bookCollection.hasBook(bookUpdate);
		
		//sort
		System.out.println("---------------after sorting by book title---------------");
		bookCollection.sortByBookName();
		

		System.out.println("---------------after sorting by author ---------------");
		bookCollection.sortByAuthor();
	}
	
	private static void printBooks(List<Book> bookList) {
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}
