package main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.Publisher;

public class QueueMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:queue_context.xml");
	    Publisher publisher = (Publisher) ctx.getBean("jmsPublisher");
	    int number = 1;
	    for(int i = 0; i < number; i++) {
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   publisher.publishObjectMessageToQueue("HelloQueue", "Hello");
		   System.out.println("Is running");
	    }
	    
	}

}
