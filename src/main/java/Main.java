import media.Books;
import media.Films;
import mediaContainers.LibraryGen;
import mediaContainers.Library;

public class Main {
    public static void main(String[] args) throws Exception {
        try {

            LibraryGen<Films> filmsArray = new LibraryGen<>();

            for (int i = 0; i < 10; ++i) {
                filmsArray.add(new Films("Lord Of The Ring " + i));
            }
            filmsArray.showLibrary();
            filmsArray.removeByIndex(4);
            filmsArray.showLibrary();
            filmsArray.removeByName("Lord Of The Ring 5");
            filmsArray.showLibrary();
            Films getFilm1 = filmsArray.extractByIndex(1);
            System.out.println(getFilm1);
            Films getFilm2 = filmsArray.extractByName("Lord Of The Ring 10");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            try {
        Library booksArray = new Library();
        for (int i = 0; i < 10;++i){
            booksArray.add(new Books("Harry Potter "+i));
        }
        booksArray.showLibrary();
        booksArray.removeByIndex(9);
        booksArray.showLibrary();
        booksArray.removeByName("Harry Potter 1");
        booksArray.showLibrary();
        Books getBook1 = (Books)(booksArray.extractByName("Harry Potter 3"));
        System.out.println(getBook1);
        Books getBook2 = (Books)(booksArray.extractByIndex(10));
        System.out.println(getBook1);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
