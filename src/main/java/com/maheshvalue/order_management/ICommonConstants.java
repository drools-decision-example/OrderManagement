package com.maheshvalue.order_management;

import java.io.File;

/**
 * 
 * @author jugalpatel
 *
 */

public interface ICommonConstants {

	public String SERVER_PROPERTY_DIR = "D:\\Jugal Project\\Jboss Jbpm\\jbpm-server-7.47.0.Final-dist\\standalone\\configuration";
			//(System.getProperty("jboss.server.home.dir") == null ? System.getProperty("jboss.server.base.dir") : System.getProperty("jboss.server.home.dir")) + "/properties";
	
	public String MAHESH_VALUE_PROPERTIES = SERVER_PROPERTY_DIR + File.separator + "maheshValue.properties";
	
	public String API_HOST_URL = Utilities.getProperty(MAHESH_VALUE_PROPERTIES,"apiHostURL");
	
	public String  API_GET_CUSTOMER_DETAILS = API_HOST_URL + "/camelServices/getCustomerDetails";
	
	public String  API_GET_KEY_BALANCE_DETAILS = API_HOST_URL + "/camelServices/getKeyBalanceDetails";
	
}
