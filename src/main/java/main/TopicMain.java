package main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.Publisher;

public class TopicMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:topic_context.xml");
	    Publisher publisher = (Publisher) ctx.getBean("jmsPublisher");
	  
	    int number = 10000;
	    for(int i = 0; i < number; i++) {
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   publisher.publishObjectMessage("HelloTopic", "Hello");
		   System.out.println("Is running");
	    }    
	   
	}
	

}
