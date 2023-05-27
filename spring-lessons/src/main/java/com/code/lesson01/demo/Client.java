package com.code.lesson01.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		// 1 配置文件
		String beanXml = "classpath:/bean.xml";

		// 2 创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

		// 3 从容器中获取需要的bean
		HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

		// 4 使用对象
		helloWorld.say();

	}

}
