package homework1;

public class Book {
    private final String titleOfTheBook;
    private final Author author;
    private int publicationYear;

    public Book(String titleOfTheBook, Author author, int publicationYear) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitleOfTheBook(){
        return titleOfTheBook;
    }
    public Author getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
