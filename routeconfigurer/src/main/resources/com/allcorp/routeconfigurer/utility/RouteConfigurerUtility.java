/**
 * 
 */
package com.allcorp.routeconfigurer.utility;

import com.allcorp.routeconfigurer.Interface.Constants;

/**
 * @author Aashi
 *
 */
public class RouteConfigurerUtility {
    
	public static String constructURI(String origin,String Destination){
		String URI=null;
		URI=Constants.INITIAL_URI+origin+Constants.MIDDLE_URI+Destination+Constants.END_URI;
		return URI;
		
	}

	public static String constructURI(String[] args) {
		String URI=null;
		URI=Constants.INITIAL_URI+origin+Constants.MIDDLE_URI+Destination+Constants.END_URI;
		return URI
	}
}
