import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("A Feast For Crows", "George RR Martin", "Fantasy");
        book2 = new Book("Prisoners of Geography", "Tim Marshall", "Non-Fiction");
        book3 = new Book("Bleeding Hearts", "Ian Rankin", "Crime");
        book4 = new Book("A Storm of Swords", "George RR Martin", "Fantasy");
        borrower = new Borrower();
    }

    @Test
    public void libraryBookCountStartsAtZero(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void wontAddBookIfCapacityisFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book1);
        library.addBook(book3);
        borrower.getBook(library, book1);
        assertEquals(1, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canReturnGenreCheck(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        System.out.println(library.genreCheck());
        assertEquals(3, library.genreCheck().size());
    }
}
