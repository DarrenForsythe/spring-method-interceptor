package com.darrenforsythe.methodinterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

public class LoggingMethodInterceptor implements HandlerInterceptor {
    Logger log = LoggerFactory.getLogger(LoggingMethodInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod method = (HandlerMethod) handler;

        GetMapping mapping = method.getMethodAnnotation(GetMapping.class);

        log.info("URL is {}", Arrays.toString(mapping.value()));

        return true;
    }
}
