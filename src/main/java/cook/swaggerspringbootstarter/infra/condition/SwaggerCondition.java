package cook.swaggerspringbootstarter.infra.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

/**
 * @ClassName swaggerspringbootautoconfigure
 * @Author cookr
 * @Date 2019/12/13 11:57 上午
 * @Version 1.0
 * @Description
 **/


public class SwaggerCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String title = context.getEnvironment().getProperty("swagger.title");
        String description = context.getEnvironment().getProperty("swagger.description");
        String basePackage = context.getEnvironment().getProperty("swagger.base-package");

        if (StringUtils.isEmpty(title)) {
            throw new RuntimeException("Lack of swagger configuration:swagger.title");
        } else if (StringUtils.isEmpty(description)) {
            throw new RuntimeException("Lack of swagger configuration:swagger.description");
        } else if (StringUtils.isEmpty(basePackage)) {
            throw new RuntimeException("Lack of swagger configuration:swagger.base-package");
        } else {
            return true;
        }

     }
}
