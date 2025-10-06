// Ulises Cantor
// 10/6/2025
// Menchukov
// Computer Programming 3
// Online Store Project
// This Book class creates a Book object with an Author and publisher and is the child class for the ItemForSale class

public class Book extends ItemForSale {
    private String publisher;
    private Author author;

    public Book(String t, int p, String d, String pub, Author a) {
        super(t, p, d);
        publisher = pub;
        author = a;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCreator() {
        return author.getFullName();
    }

    public String getAuthorDOB() {
        return author.getDOB();
    }

    public void setCreator(Author a) {
        author = a;
    }

    public void setPublisher(String p) {
        publisher = p;
    }
}
