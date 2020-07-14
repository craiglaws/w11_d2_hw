import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void getBook(Library library, Book book){
        Book newBook = library.removeBook(book);
        this.collection.add(newBook);
    }


}
