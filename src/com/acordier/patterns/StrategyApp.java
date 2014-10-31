package com.acordier.patterns;
/* Simple test application */
public class StrategyApp {
	
	public static void main(String[]args) {
		Notifier notifier = new Notifier("Please call me back ! ");
		notifier.notify(new EmailNotificationStrategy("no@way.com"));
		notifier.notify(new SmsNotificationStrategy("003366677888"));
	}
}
