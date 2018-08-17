/**
 * BookVO.java
 * Title: Oscar Wei Java Project
 * Copyright: Copyright(c)2018, oscarwei168
 *
 * @author Oscar Wei
 * @since 2018/8/16
 * <p>
 * H i s t o r y
 * 2018/8/16 Oscar Wei v1
 * + File created
 */
package tw.com.oscar.spring.springboot.book.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * Title: BookVO.java<br>
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
 * @since 2018/8/16
 * @version v1, 2018/8/16
 */
@Data
@ApiModel(description = "Book Information")
public class BookVO {
    
    @ApiModelProperty(value = "序號", required = true)
    private Long bookId;
    @ApiModelProperty(value = "書名", required = true)
    private String name;
    @ApiModelProperty(value = "作者", required = true)
    private String author;
}
