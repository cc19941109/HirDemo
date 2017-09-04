package com.chen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.chen.controller")
public class WebConfig extends WebMvcConfigurerAdapter{
	/**
	 * 如果什么都不配置
	 * 1. 没有配置视图解析器，spring默认使用BeanNameViewResolver,这个视图解析器会查找ID与视图名称匹配的bean，
	 * 这个bean要实现view接口
	 * 2. 没有启动组件扫描，spring只能找到显式配置类中的控制器
	 * 3. dispatcherServlet会映射所有请求，包括对静态资源的请求，但这可能并不太好
	 * 
	 */
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		
		return resolver;
		
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		//静态资源处理
		configurer.enable();
		
	}
	
}




