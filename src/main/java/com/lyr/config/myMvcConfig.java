package com.lyr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class myMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有页面除了"/index","/","/login","/css/**","/img/**"
        registry.addInterceptor(new userInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index","/","/login","/css/**","/img/**");
    }
}
