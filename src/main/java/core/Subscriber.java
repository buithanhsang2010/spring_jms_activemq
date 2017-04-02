package core;

import org.springframework.stereotype.Component;

@Component("subscriber")
public class Subscriber {
	
	public void consumeMessage(String message) throws InterruptedException {
		System.out.println("Is consumming");
		System.out.println(message);
       //Thread.sleep(10000);

	}
}
