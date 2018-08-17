/**
 * BookRepository.java
 * Title: Oscar Wei Java Project
 * Copyright: Copyright(c)2018, oscarwei168
 *
 * @author Oscar Wei
 * @since 2018/8/14
 * <p>
 * H i s t o r y
 * 2018/8/14 Oscar Wei v1
 * + File created
 */
package tw.com.oscar.spring.springboot.book.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import tw.com.oscar.spring.springboot.entity.Book;

import java.util.List;
import java.util.Optional;

/**
 * <p>
 * Title: BookRepository.java<br>
 * </p>
 * <strong>Description:</strong> //TODO <br>
 * This function include: - <br>
 * <p>
 * Copyright: Copyright (c) 2018<br>
 * </p>
 * <p>
 * Company: oscarwei168 Inc.
 * </p>
 *
 * @author Oscar Wei
 * @version v1, 2018/8/14
 * @since 2018/8/14
 */
// @Repository
@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    
    // extends JpaRepository
    // Use RestAPI instead of Spring Data
    
    List<Book> findByName(@Param("name") String name);
    
    // Prevents GET /books/:id
    // @Override
    // Optional<Book> findOne(Integer id);
    
    @Override
    Page<Book> findAll(Pageable pageable);

//    @Override
//    Book save(Book s);
//
//    @Override
//    @RestResource(exported = false)
//    void delete(Book t);
    
}
