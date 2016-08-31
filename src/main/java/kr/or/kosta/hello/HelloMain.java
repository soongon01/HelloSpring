package kr.or.kosta.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.hello.service.HelloService;
import kr.or.kosta.hello.service.HelloServiceImpl;

public class HelloMain {

	public static void main(String[] args) {

		//1. 헬로우서비스 컴포넌트를 생성한다.
		//HelloService service = new HelloServiceImpl();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		HelloService service = context.getBean(HelloService.class);
		
		//2. 생성된 컴포넌트에서 기능(서비스)을 호출한다.
		String greeting = service.sayHello();
		
		System.out.println(greeting);
	}
}
