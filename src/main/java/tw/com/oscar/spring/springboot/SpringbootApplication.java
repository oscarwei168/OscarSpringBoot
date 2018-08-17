package tw.com.oscar.spring.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@ComponentScan(basePackages = {"tw.com.oscar.spring.springboot"})
@EntityScan("tw.com.oscar.spring.springboot.entity")
public class SpringbootApplication {
    
    // @SpringBootApplication is a convenience annotation that adds all of the @Configuration/@EnableAutoConfiguration/
    // @EnableWebMvc/@ComponentScan annotations by default
    public static void main(String[] args) {
        // SpringApplication.run(SpringbootApplication.class, args);
        final SpringApplication application = new SpringApplication(SpringbootApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
    
    @Bean
    public Docket api() {
        // ??? of this bean usage
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

//	@RestController
//	class SimpleController {
//
//		@GetMapping
//		public Map hello() {
//			Map map = new HashMap();
//			map.put("say", "hello");
//			return map;
//		}
//	}
}
