package top.cocoawork;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.cocoawork.service.IndexService;

public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

		IndexService indexService = applicationContext.getBean(IndexService.class);
		System.out.println(indexService);
	}
}
