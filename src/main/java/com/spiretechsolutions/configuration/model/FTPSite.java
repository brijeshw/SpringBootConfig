package com.spiretechsolutions.configuration.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class FTPSite implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String host;
	private int port;
	private String username;
	private String password;
	
	public FTPSite() {
		
	}
	
	public FTPSite(String name, String host, int port, String username, String password) {
		super();
		this.name = name;
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "FTPSite [name=" + name + ", host=" + host + ", port=" + port + ", username=" + username + ", password="
				+ password + "]";
	}
	
	

}
