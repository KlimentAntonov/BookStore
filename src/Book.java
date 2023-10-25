public class Book {
    String title;
    Author author = new Author();
    BookType type = BookType.BOOK;
    int numOfAvailables;
    double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int getNumOfAvailables() {
        return numOfAvailables;
    }

    public void setNumOfAvailables(int numOfAvailables) {
        this.numOfAvailables = numOfAvailables;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
