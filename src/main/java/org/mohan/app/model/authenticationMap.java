package org.mohan.app.model;

import java.util.HashMap;
import java.util.UUID;

import org.hibernate.loader.custom.Return;
import org.moham.app.exception.NotFoundException;

public class authenticationMap {
	private HashMap<String, User> headers;
	private final long TIME_OUT = 600000;
	private final String SEPARATOR = "|";
	private final String DOTE = ".";
	
	public authenticationMap() {
		headers = new HashMap<String, User>();
	}
	
	public String generateKey(User value) {
		if(headers.containsValue(value)) {
			return null;
		}
		String key = UUID.randomUUID().toString() + SEPARATOR + System.currentTimeMillis();
		value.setLastSeen(System.currentTimeMillis());
		headers.put(key, value);
		return key;
	}
	
	public void delete(String key) {
		headers.remove(key);
	}
	
	public User getUser(String key) {
		return isValide(key) ? headers.get(key) : null;
	}
	
	public void setLastSeen(String key){
		headers.get(key).setLastSeen(System.currentTimeMillis());
	}
	
	private Boolean isValide(String key){
		if(headers.get(key) != null) {
			long lastseen = headers.get(key).getLastSeen();
			if(System.currentTimeMillis() <= (lastseen + TIME_OUT)) {
				return true;
			}
			delete(key);
		}
		return false;
	}
}
