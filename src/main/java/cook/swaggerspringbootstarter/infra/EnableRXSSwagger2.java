package cook.swaggerspringbootstarter.infra;

import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.*;

/**
 * @author cookr
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SwaggerServiceAutoConfiguration.class})
@EnableSwagger2
public @interface EnableRXSSwagger2 {
}