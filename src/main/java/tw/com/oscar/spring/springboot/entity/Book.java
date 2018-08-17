/**
 * Book.java
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
package tw.com.oscar.spring.springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>
 * Title: Book.java<br>
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
 * @since 2018/8/14
 * @version v1, 2018/8/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "BOOK")
public class Book implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Long bookId;
    private String name;
    private String author;
}
