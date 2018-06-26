package com.credit.suisse.assignment.domain;

public interface CacheListner {
	void notify(String eventId);
	//void removalNotification(String eventId);
	void notify(EventModel eventId);
}
