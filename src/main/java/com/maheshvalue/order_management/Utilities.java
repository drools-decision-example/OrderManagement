package com.maheshvalue.order_management;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.MissingResourceException;
import java.util.Properties;

/**
 * 
 * @author jugalpatel
 *
 */
public class Utilities implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Properties properties = null;
	
	public static String getProperty(String propertiesFile, String key) throws MissingResourceException {
        String result = null;
        try {
        	if (properties == null)
                properties = new Properties();
        	
            if (properties.getProperty(key) == null)
                properties.load(new FileInputStream(propertiesFile));
            
        } catch (Exception e) {
            properties = null;
            throw new MissingResourceException("ERROR loading property file", propertiesFile, key);
        }
        result = properties.getProperty(key);
        return result;
    }
}
