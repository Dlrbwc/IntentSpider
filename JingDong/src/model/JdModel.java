package model;

public class JdModel {
	
	private String bookId;
	
	private String bookName;
	
	private String bookPrice;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "bookID:"+getBookId()+"\t"+"bookPrice:"+getBookPrice()+"\t"+"bookName:"+getBookName();
	}
	
	
}
