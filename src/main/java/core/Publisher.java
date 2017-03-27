package core;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component("jmsPublisher")
public class Publisher {
	@Autowired
    private JmsTemplate jmsTemplate;
	
	@Autowired
    private JmsTemplate jmsTemplateQueue;

    public void publishObjectMessage(String topic, final String message) {
        if (topic == null)
            throw new IllegalArgumentException("topic name cannot be null!");

        jmsTemplate.send(topic, new MessageCreator() {

			public Message createMessage(Session session) throws JMSException {
				ObjectMessage msg = session.createObjectMessage(message);
				return msg;
			}
        	
        });
    }
    
    /**
     * @param queue
     * @param delay^[[>0;95;0c
     *            (in sec)
     * @param message
     */
    public void publishObjectMessageToQueue(String queue, final String message) {
    	jmsTemplateQueue.send(queue, new MessageCreator() {

			public Message createMessage(Session session) throws JMSException {
				ObjectMessage msg = session.createObjectMessage(message);
				return msg;
			}
    		
    	});
    }

    public void publishObjectMessageToQueueWithTimeToLive(String queue, final int timeToLive, final String message) {
    	jmsTemplateQueue.send(queue, new MessageCreator() {

			public Message createMessage(Session session) throws JMSException {
				ObjectMessage msg = session.createObjectMessage(message);
				return msg;
			}
    		
    	});
    }
}
