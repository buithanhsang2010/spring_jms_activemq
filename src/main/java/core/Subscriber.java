package core;

import org.springframework.stereotype.Component;

@Component("subscriber")
public class Subscriber {
	
	public void consumeMessage(String message) {
		System.out.println("Is consumming");
		System.out.println(message);
	}
}
