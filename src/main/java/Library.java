import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private int capacity;

    public Library() {
        this.book = new ArrayList<>();
        this.capacity = 3;
    }

    public boolean hasCapacity(){
        return capacity > this.book.size();
    }

    public void addBook(Book book) {
        if(hasCapacity()) {
            this.book.add(book);
        }
    }

    public int bookCount(){
        return this.book.size();
    }
}
