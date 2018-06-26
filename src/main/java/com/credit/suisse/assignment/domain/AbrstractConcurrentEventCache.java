package com.credit.suisse.assignment.domain;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbrstractConcurrentEventCache implements EventCache {
	protected Map<String, EventModel> cache = new ConcurrentHashMap<>(); 
}
