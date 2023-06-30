package zerobase.weather.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(title = "날씨일기 프로젝트 API 명세서",
                description = "날씨 일기 프로젝트 CRUD API",
                version = "v1"))
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .contact(new Contact().name("YesunPark").email("lynn08082@gmail.com"));
//                .license(new License().name("Apache License Version 2.0").url("http://www.apache.org/licenses/LICENSE-2.0.html"));

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}