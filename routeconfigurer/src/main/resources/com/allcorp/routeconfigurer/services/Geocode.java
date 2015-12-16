/**
 * 
 */
package com.allcorp.routeconfigurer.services;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.DirectionsRoute;
import com.google.maps.model.GeocodingResult;

/**
 * @author Aashi
 *
 */
public class Geocode  {
	

	public static void main(String args[]) throws Exception{
		GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyC9iHSFr7JCJdryoFTCq4ukMuiV56BiGvo");
		GeocodingResult[] results =  GeocodingApi.geocode(context,
		    "house no. 72,mico layout, 1st main,bangalore,india").await();
		
		GeocodingResult[] results_1 =  GeocodingApi.geocode(context,
			    "117,shantiniketan layout,sgr dental college road,bangalore").await();
		System.out.println(results[0].formattedAddress);
		System.out.println(results[0].geometry.location.lat);
		System.out.println(results[0].geometry.location.lng);
		
		DirectionsApirequest
		
		DirectionsRoute[] result = DirectionsApi.getDirections(context, results[0].formattedAddress,
				results_1[0].formattedAddress).await();
		System.out.println(result.length +" "+result[0].waypointOrder.toString());
		
		
		
		
		
		
	}

}
