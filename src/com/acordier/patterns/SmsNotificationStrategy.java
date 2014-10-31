package com.acordier.patterns;
/* Strategy (aka Policy) implementation */
public class SmsNotificationStrategy implements NotificationStrategy {

	private String recipientNumber;

	public SmsNotificationStrategy(String recipientNumber) {
		this.recipientNumber = recipientNumber;
	}

	@Override
	public void notify(String msg) {
		System.out.printf("Sending sms notification to %s ...\n",
				recipientNumber);

	}

}
