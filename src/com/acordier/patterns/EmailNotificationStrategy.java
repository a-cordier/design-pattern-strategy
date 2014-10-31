package com.acordier.patterns;
/* Strategy (aka Policy) implementation */
public class EmailNotificationStrategy implements NotificationStrategy {

	private String recipientAddress;
	private String subject;

	public EmailNotificationStrategy(String recipientAddress) {
		this.recipientAddress = recipientAddress;
		this.subject = "[noreply] Automatic notification";
	}

	
	public EmailNotificationStrategy(String recipientAddress, String subject) {
		this.recipientAddress = recipientAddress;
		this.subject = subject;
	}


	@Override
	public void notify(String msg) {
		System.out.printf(
				"Sending email notification to %s with subject \"%s\" ...\n",
				recipientAddress, subject);

	}

}
