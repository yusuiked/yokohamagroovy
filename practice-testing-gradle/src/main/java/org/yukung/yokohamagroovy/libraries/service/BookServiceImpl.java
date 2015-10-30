package org.yukung.yokohamagroovy.libraries.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yukung.yokohamagroovy.libraries.entity.Book;
import org.yukung.yokohamagroovy.libraries.repository.BooksRepository;

/**
 * @author yukung
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BooksRepository repository;

    @Override
    public Book create(Book book) {
        return repository.save(book);
    }

    @Override
    public Book find(Long bookId) {
        return null;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(Book book) {

    }
}