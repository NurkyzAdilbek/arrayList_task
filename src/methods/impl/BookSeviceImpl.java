package methods.impl;

import methods.BookService;
import models.Book;
import models.Library;

import java.util.ArrayList;
import java.util.List;

public class BookSeviceImpl implements BookService {
    List<Book>books=new ArrayList<>();
    List<Library>libraries=new ArrayList<>();


    @Override
    public Book saveBook(Long libraryId, Book book) {

        for (Library library:libraries){
            if (library.getId().equals(libraryId)){
               library.getBooks().add(book);

               return book;
            }
        }


        return null;
    }

    @Override //erfolgreich
    public List<Book> getAllBooks(Long libraryId) {

        return books;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (Library library:libraries){
            if (library.getId().equals(libraryId)){
                for (Book book:library.getBooks()){
                    if (book.getId().equals(bookId)){
                        return book;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (Library library:libraries){
            if(library.getId().equals(libraryId)){
                for (Book book:books){
                    if (book.getId().equals(bookId)){
                        books.remove(book);
                    }
                }
            }
        }

        return null;
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library library:libraries){
            if (library.getId().equals(libraryId)){
                libraries.clear();
            }
        }

    }
}
