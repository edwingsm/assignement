package com.credit.suisse.assignment.domain;

public class StartCache extends AbrstractConcurrentEventCache implements CacheListner{

	@Override
	public void saveEvent() {
		System.out.println("START");
		
	}

	@Override
	public void deleteEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int checkCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notify(String eventId) {
		// TODO Auto-generated method stub
		deleteEvent();
	}

	@Override
	public void notify(EventModel eventId) {
		// TODO Auto-generated method stub
		
	}

}
