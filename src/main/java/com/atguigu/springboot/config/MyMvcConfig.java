package com.atguigu.springboot.config;
import com.atguigu.springboot.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//Springboot2.0之后需要实现接口WebMvcConfigurer才可以对SpringMvc进行功能增强
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //作用和@Controller一样
        registry.addViewController("/index").setViewName("login");
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自己的拦截器,并设置拦截路径，拦截多个可以全一个list集合,addPathPatterns(/**)这种写法会是页面出现问题
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/","/index","/dashboard").excludePathPatterns("/index","/dashboard");
    }

}
