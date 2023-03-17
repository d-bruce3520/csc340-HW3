package com.csc340sp23.bookmanager.book;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author unclu
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
