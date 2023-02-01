package homework1;

import java.sql.SQLOutput;
public class Launch {
    public static void main(String[] args) {
        Author johnStrelecky = new Author("John", "Strelecky");
        Book firstBook = new Book("The why cafe", johnStrelecky, 2011);
        System.out.println(firstBook);
        Book secondBook = new Book("Vingt Mille Lieues Sous les Mers", new Author("Jules", "Verne"), 1870);
        firstBook.setPublicationYear(2012);
        System.out.println(secondBook);
    }
}
