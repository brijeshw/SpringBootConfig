package com.spiretechsolutions.configuration.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spiretechsolutions.configuration.model.FTPSite;
import com.spiretechsolutions.configuration.model.Sites;


@RestController
public class WebController {
	
	@Autowired
	private Sites ftpsites;

	@GetMapping("/mapprop")
	public Map<String, FTPSite> getProperties(){
		Map<String,FTPSite> sites = ftpsites.getSites();
		Set<Entry<String, FTPSite>>ftp = sites.entrySet();
		for (Entry<String, FTPSite> e : ftp) {
			System.out.println(String.format("key: %s, ",e.getKey()));
			System.out.println(e.getValue().toString());
		}
		return sites;
	}
	
	@RequestMapping(path = "/listprop",method = RequestMethod.GET)
	public List<String> getPropertyList(){
		return ftpsites.getProtocols();
	}
	
	
}
