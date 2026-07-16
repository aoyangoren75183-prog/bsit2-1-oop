public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Borrow the book
    public void borrow() {
        isBorrowed = true;
    }

    // Return the book
    public void returnBook() {
        isBorrowed = false;
    }

    // Display book information
    public String describe() {
        String status = isBorrowed ? "Borrowed" : "Available";
        return "Title: " + title + " | Author: " + author + " | Status: " + status;
    }
}
}
