package org.mohan.app.model;

public class User {
	private String userName;
	private String password;
	private long lastSeen;
	private String ipAddress;
	
	public User(String userName, String password, long lastseen, String ipAddress) {
		this.userName = userName;
		this.password = password;
		this.lastSeen = lastseen;
		this.ipAddress = ipAddress;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(long lastSeen) {
		this.lastSeen = lastSeen;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
}
