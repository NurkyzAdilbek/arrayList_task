import enums.Gender;
import enums.Genre;
import methods.impl.BookSeviceImpl;
import methods.impl.LibraryServiceImpl;
import methods.impl.ReaderServiceImpl;
import models.Book;
import models.Library;
import models.Reader;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Reader reader1= new Reader(1L,"Asan","asan06@gamil.com",778699343, Gender.MALE);
       Reader reader2= new Reader(2L,"Uson","uson06@gamil.com",778699345, Gender.MALE);
       Reader reader3= new Reader(3L,"Batma","batma06@gamil.com",778699453, Gender.FEMALE);
       Reader reader4= new Reader(4L,"Zuura","zuura06@gamil.com",778349343, Gender.FEMALE);
       Reader reader5= new Reader(5L,"Bolot","bolot06@gamil.com",772299343, Gender.MALE);
       Reader reader6= new Reader(6L,"Bekbolot","bekbolot@gamil.com",713249343, Gender.MALE);
       Reader reader7= new Reader(7L,"Guljan","guljan@gamil.com",723499343, Gender.FEMALE);
       Reader reader8= new Reader(8L,"Aijan","aijangamil.com",778324343, Gender.FEMALE);
       Reader reader9= new Reader(9L,"Nurzat","nurzat@gamil.com",234459343, Gender.FEMALE);
       Reader reader10= new Reader(10L,"Bekzat","bekzat@gamil.com",463439343, Gender.MALE);

       List<Reader>readers=new ArrayList<>();
       readers.add(reader1);
       readers.add(reader2);
       readers.add(reader3);
       readers.add(reader4);
       readers.add(reader5);
       List<Reader>readers1=new ArrayList<>();
       readers1.add(reader6);
       readers1.add(reader7);
       readers1.add(reader8);
       readers1.add(reader9);
       readers1.add(reader10);
        Book book1 = new Book(1L, "The Hobbit", "J.R.R. Tolkien", Genre.FANTAZY);
        Book book2 = new Book(2L, "Pride and Prejudice", "Jane Austen", Genre.ROMANCE);
        Book book3 = new Book(3L, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", Genre.HISTORY);
        Book book4 = new Book(4L, "The Alchemist", "Paulo Coelho", Genre.TRAVEL);
        Book book5 = new Book(5L, "Hamlet", "William Shakespeare", Genre.DRAMA);
        Book book6 = new Book(6L, "The Raven", "Edgar Allan Poe", Genre.POETRY);
        Book book7 = new Book(7L, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", Genre.CHILDRENS);
        Book book8 = new Book(8L, "1984", "George Orwell", Genre.DRAMA);
        Book book9 = new Book(9L, "The Odyssey", "Homer", Genre.POETRY);
        Book book10 = new Book(10L, "The Catcher in the Rye", "J.D. Salinger", Genre.DRAMA);

List<Book>books1=new ArrayList<>();
books1.add(book1);
books1.add(book2);
books1.add(book3);
books1.add(book4);
books1.add(book5);
List<Book>books2=new ArrayList<>();
books2.add(book6);
books2.add(book7);
books2.add(book8);
books2.add(book9);
books2.add(book10);

        Library library1 = new Library(1L, "Central Library", "123 Main St", books1, readers);
        Library library2 = new Library(2L, "Westside Library", "456 West St", books2, readers1);
        List<Library>libraries=new ArrayList<>();
        List<Library>libraries1=new ArrayList<>();

        libraries.add(library1);
        libraries1.add(library2);

        ReaderServiceImpl readerService=new ReaderServiceImpl();
        LibraryServiceImpl libraryService=new LibraryServiceImpl();
        BookSeviceImpl bookSevice=new BookSeviceImpl();
       //READERSERVICE
      /*  System.out.println("SAVE");
        readerService.saveReader(reader2);
        readerService.saveReader(reader1);  //erfolgreich
        readerService.saveReader(reader3);
        readerService.saveReader(reader4);
           System.out.println("GET_ALL_READERS");
      //  System.out.println(readerService.getAllReaders());
       System.out.println("GET_READERS_BY_ID");
        System.out.println(readerService.getReaderById(2L));
        System.out.println("UPDATE");
        System.out.println(readerService.updateReader(3L, reader5));
        */
// bookservice
        System.out.println("SAVE");
       Book book11 = new Book(11L, "The Great Gatsby", "F. Scott Fitzgerald", Genre.DRAMA);
       System.out.println(bookSevice.saveBook(1L, book11));
        System.out.println("GET_ALL_BOOKS");
        System.out.println(bookSevice.getAllBooks(1L));
        System.out.println("GET_BOOK_BY_ID");
     //   System.out.println(bookSevice.getBookById(2L, 5L));
        System.out.println("DELETE_BOOK_BY_ID");
      //  System.out.println(bookSevice.deleteBook(1L, 1L));
        bookSevice.clearBooksByLibraryId(1L);
        System.out.println(library1);
        System.out.println(bookSevice.saveBook(2L, book6));
        System.out.println(library1);


//libraryService
       /* System.out.println("SAVE");
       System.out.println(libraryService.saveLibrary(libraries));
        System.out.println(libraryService.saveLibrary(libraries1));
        System.out.println("GET_ALL");
       System.out.println(libraryService.getAllLibraries());
        System.out.println("GETBYID");
        System.out.println(libraryService.getLibraryById(1L));
        System.out.println("DELETE");
        System.out.println(libraryService.deleteLibrary(1L));
        System.out.println(libraryService.getAllLibraries());
        System.out.println(library2);
        System.out.println("UPDATE");
        System.out.println(libraryService.updateLibrary(2L, library1));*/



    }
}