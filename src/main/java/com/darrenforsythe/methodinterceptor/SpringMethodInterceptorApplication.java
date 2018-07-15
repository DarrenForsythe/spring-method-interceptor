package com.darrenforsythe.methodinterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringMethodInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMethodInterceptorApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer initializrWebMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoggingMethodInterceptor());
            }
        };
    }
}
