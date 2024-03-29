package homework1;

import java.util.Objects;

public class Book {
    private final String titleOfTheBook;
    private final Author author;
    private int publicationYear;

    public Book(String titleOfTheBook, Author author, int publicationYear) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(titleOfTheBook, book.titleOfTheBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, author, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfTheBook='" + titleOfTheBook + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
