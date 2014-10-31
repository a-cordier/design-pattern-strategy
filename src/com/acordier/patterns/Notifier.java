package com.acordier.patterns;
/* Strategy (aka Policy) client */
public class Notifier {
	
	private String message;
	
	public Notifier(){}
	
	public Notifier(String message) {
		this.message = message;
	}
	
	public void notify(NotificationStrategy strategy){
		strategy.notify(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
