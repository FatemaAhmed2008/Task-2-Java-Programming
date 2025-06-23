import java.util.ArrayList;

public class Library {

    // Nested static Book class
    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
        Book book2 = new Book("Ben Hur", "Lewis Wallace");
        Book book3 = new Book("Time Machine", "H.G. Wells");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Books in the library:");
        for (Book b : library.getBooks()) {
            System.out.println(b);
        }

        // Remove "Ben Hur"
        library.removeBook(book2);

        System.out.println("\nBooks in the library after removing Ben Hur:");
        for (Book b : library.getBooks()) {
            System.out.println(b);
  }
 }
}

