package com.dxc.ms.iot;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * 
 * @author kkumar92
 *
 */
public class RemoteUserRepository implements UserRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteUserRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
		System.out.println("serviceUrl -- " + serviceUrl);
	}
	
	@Override
	public String getAllUsers() {
		String result = restTemplate.getForObject(serviceUrl, String.class);
		System.out.println(result);
		
		return result;
	}
	
}
