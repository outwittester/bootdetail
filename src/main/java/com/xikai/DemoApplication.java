package com.xikai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@Configuration this class is bean source and this will go into the spring context
//@EnableAutoConfiguration
//@ComponentScan search in current package
@ComponentScan({"com.foo","com.xikai"})
public class DemoApplication {

//	@Bean
//	public User user() {
//		return new User("Dan", "Vega");
//	}

//	@Bean
//	public MessageSource messageSource() {
//		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//		messageSource.setBasename("classpath:messages");
//		messageSource.setDefaultEncoding("UTF-8");
//		return messageSource;
//	}

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//
//		for (String each : beanNames) {
//			System.out.println(each);
//		}

//		System.out.println(ctx.getBean("user").toString());
//		MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
//		System.out.println(config.toString());
//
//		System.out.println(ctx.getBean("datasource").toString());
//		System.out.println(ctx.getBean("user").toString());
//		System.out.println(ctx.getBean("myAppConfig"));
//		System.out.println(ctx.getBean("dataSourceConfig"));
//		System.out.println(ctx.getBean("user"));
		System.out.println(ctx.getBean("messageSource"));
	}
}
