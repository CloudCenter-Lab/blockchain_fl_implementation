package com.blockChain.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author YJL
 * @create 2022-10-02 15:38
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    //请求地址为:http://localhost:8080/doc.html
    @Bean
    public Docket createRestApi(){

        return new Docket(DocumentationType.SWAGGER_2)          //指定Api类型为Swagger2
                .apiInfo(apiInfo())                             //指定文档汇总信息
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.blockChain.demo.controller")) //指定controller包路径
                .paths(PathSelectors.any())                     //指定展示所有controller
                .build();

    }

    private ApiInfo apiInfo(){
        //返回一个apiInfo
        return new ApiInfoBuilder()
                .title("api接口文档")                                       //文档页标题
                .contact(
                        new Contact(
                                "YJL",
                                "",
                                "228662572@qq.com")
                )                                                           // 联系人信息
                .description("api文档")                                       // 详细信息
                .version("1.0.1")                                           // 文档版本号
                .termsOfServiceUrl("https://www.baidu.com")                  //网站地址
                .build();
    }
}
