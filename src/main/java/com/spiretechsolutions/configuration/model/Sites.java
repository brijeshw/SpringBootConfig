package com.spiretechsolutions.configuration.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("ftp")
public class Sites implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String connectionTimeout;
	private String idleTimeout;
	private Map<String, FTPSite> sites = new HashMap<>();
	private List<String> protocols = new ArrayList<String>();

	public Map<String, FTPSite> getSites() {
		return sites;
	}

	public void setSites(Map<String, FTPSite> sites) {
		this.sites = sites;
	}

	public List<String> getProtocols() {
		return protocols;
	}

	public void setProtocols(List<String> protocols) {
		this.protocols = protocols;
	}

	public String getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(String connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public String getIdleTimeout() {
		return idleTimeout;
	}

	public void setIdleTimeout(String idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	@Override
	public String toString() {
		return "Sites [connectionTimeout=" + connectionTimeout + ", idleTimeout=" + idleTimeout + ", sites=" + sites
				+ ", protocols=" + protocols + "]";
	}
	
	

}
