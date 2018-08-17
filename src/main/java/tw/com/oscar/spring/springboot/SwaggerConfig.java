/**
 * SwaggerConfig.java
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
package tw.com.oscar.spring.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * Title: SwaggerConfig.java<br>
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
@Configuration
@EnableSwagger2
// @Import({SpringDataRestConfiguration.class})-->fixed in Springfox v3.0
public class SwaggerConfig {
}
