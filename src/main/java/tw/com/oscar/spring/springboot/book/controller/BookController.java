/**
 * BookController.java
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
package tw.com.oscar.spring.springboot.book.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tw.com.oscar.spring.springboot.book.dao.BookRepository;
import tw.com.oscar.spring.springboot.book.vo.BookVO;
import tw.com.oscar.spring.springboot.entity.Book;

/**
 * <p>
 * Title: BookController.java<br>
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
@Api(tags = "Book")
@RestController
@RequestMapping(value = "/api")
public class BookController {
    
    @Autowired
    private BookRepository bookRepository;
    
    @ApiOperation(value = "取得書本", notes = "取得所有書本")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/book/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Iterable<Book> getAll() {
        return bookRepository.findAll();
    }
    
    @ApiOperation(value = "新增書本", notes = "新增書本的內容")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "存擋成功")})
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/book/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType
            .APPLICATION_JSON_VALUE)
    public BookVO create(@ApiParam(required = true, value = "書本內容") @RequestBody BookVO bookVO) {
        Book book = new Book();
        book.setName(bookVO.getName());
        book.setAuthor(bookVO.getAuthor());
        book = bookRepository.save(book);
        bookVO.setBookId(book.getBookId());
        return bookVO;
    }
    
    @ApiOperation(value = "取得書本內容", notes = "取得書本內容")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "書本資訊")})
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/book/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BookVO get(
            @ApiParam(required = true, name = "name", value = "書名") @PathVariable String name) {
        // Book book = bookRepository.findOne(bookid);
        Book book = bookRepository.findByName(name).get(0);
        BookVO bookDto = new BookVO();
        bookDto.setBookId(book.getBookId());
        bookDto.setName(book.getName());
        bookDto.setAuthor(book.getAuthor());
        return bookDto;
    }
}
