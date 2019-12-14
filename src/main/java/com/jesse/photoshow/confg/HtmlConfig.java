package com.jesse.photoshow.confg;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 21:46 2019/12/14
 **/
@Configuration
public class HtmlConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index").setViewName("index.html");
    }
}
