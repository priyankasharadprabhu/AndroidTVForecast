package com.ps.tvforecast.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import android.util.Log;

// This class represents a single entry (post) in the XML feed.
// Model for show XML : http://services.tvrage.com/feeds/episodeinfo.php?sid=8511
// It includes the data members for show
public  class ShowInfo {
	
    //properties of show
    public static final String SHOW = "show";
    public static final String SHOW_NAME = "name";
    public static final String SHOW_STATUS = "status";
    public static final String SHOW_COUNTRY = "country";
    public static final String SHOW_STARTED = "started";
    public static final String SHOW_LINK = "link";
    
    public static final String SHOW_LATEST_EPISODE_DATE = "latestepisode_airdate";
    public static final String SHOW_LATEST_EPISODE_TITLE = "latestepisode_title";
    public static final String SHOW_LATEST_EPISODE_NUMBER = "latestepisode_number";
    
    public static final String SHOW_NEXT_EPISODE_DATE = "nextepisode_airdate";
    public static final String SHOW_NEXT_EPISODE_TITLE = "nextepisode_title";
    public static final String SHOW_NEXT_EPISODE_NUMBER = "nextepisode_number";
    
    //TODO @ Pri extract <airtime format="GMT+0 NODST">1382652000</airtime> to get time
    
    Map<String, String> properties = new HashMap<String, String>();
    
    
    public ShowInfo(Map<String, String> properties) {
    	this.properties = properties;
    }
    
    public String getPropertyByName(String propertyName) {
    	if( properties!=null && properties.containsKey(propertyName)) {
    		return properties.get(propertyName);
    	}
    	else return null;
    }
    
    public void setPropertyByName(String property, String value) {
    	properties.put(property, value);
    }
    
    public void setProperties(Map<String, String> properties) {
    	this.properties = properties;
    }
    
    public boolean hasProperty(String property) {
    	return (properties.containsKey(property) && properties.get(property)!=null);
    }
    
    public void printProperties() {
    	Log.d("DEBUG", "Printing properties");
    	for( String property : properties.keySet()) {
    		Log.d("DEBUG", "key : " + property + " value: " + properties.get(property));
    	}
    }
    
    
}