package com.sys.ihrm.config;

import com.sys.ihrm.common.config.BaseSwaggerConfig;
import com.sys.ihrm.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.sys.ihrm")
                .title("iHRM")
                .description("iHRM项目相关接口文档")
                .contactName("ihrm")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
