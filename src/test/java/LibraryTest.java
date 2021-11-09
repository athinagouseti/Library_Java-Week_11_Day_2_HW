import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("LOTR", "J.R.R.Tolkien", "Fantasy");
        book2 = new Book("The way of Kings", "Brandon Sanderson", "Fantasy");
    }

    @Test
    public void libraryHasBooks(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }



}
