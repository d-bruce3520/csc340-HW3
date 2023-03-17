package com.csc340sp23.bookmanager.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author unclu
 */
@Service
public class BookService {
    
    @Autowired
    private BookRepository repo;
    
    public List<Book> getAllBooks(){
        return repo.findAll();
    }
    
    public Book getBook(long bookId){
        return repo.getReferenceById(bookId);
    }
    
    public void deleteBook(long bookId){
        repo.deleteById(bookId);
    }
    
    void saveBook(Book book){
        repo.save(book);
    }
}
