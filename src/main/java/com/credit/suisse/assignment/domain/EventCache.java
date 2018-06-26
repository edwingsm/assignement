package com.credit.suisse.assignment.domain;

public interface EventCache {
	
	void saveEvent();
	void deleteEvent();
	void getEvent();
	int checkCacheSize();
	
}
