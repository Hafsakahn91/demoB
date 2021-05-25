
public class Customer {
	 private String bookname;
	 public Customer(String bookname) {
		 this.bookname = bookname;
	 }
	 public String getBookName() {
		 return bookname;
	 }
	 public void setName(String bookname) {
	 this.bookname = bookname;
	 }
	 public void confirm(int price)
	 {
	 String message = null;
	Library.order(bookname,price, message);
	
	 }
public void sendconfirm(String message){
Library.order(this,message);
}
}