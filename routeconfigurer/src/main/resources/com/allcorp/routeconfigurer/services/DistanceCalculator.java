/**
 * 
 */
package com.allcorp.routeconfigurer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

import com.allcorp.routeconfigurer.Interface.Constants;
import com.allcorp.routeconfigurer.bean.RouteBean;
import com.allcorp.routeconfigurer.utility.RouteConfigurerUtility;

/**
 * @author Aashi
 *
 */
public class DistanceCalculator {
      
private static final Logger log = LoggerFactory.getLogger(DistanceCalculator.class);

public static void main(String args[]) {
	//String Origin="house no. 72,1st main, btm 2nd stage,bangalore";
	//String Destination="Allstate Solutions Pvt.Ltd, RMZ Ecoworld, Bellandur,bangalore";
	//String URI=RouteConfigurerUtility.constructURI(Origin, Destination);
	//String URI=Constants.INITIAL_URI+Origin+Constants.MIDDLE_URI+Destination+Constants.END_URI;
    Object source=new String("abc");
    SpringApplication.run(DistanceCalculator.class);
}

public void run(String...args) throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    
    RouteBean quote = restTemplate.getForObject("https://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal&key=AIzaSyANmT73tQo4KvLLDtibSnJeOeSxB9zPu8k", RouteBean.class);
    System.out.println(quote.toString());
    log.info(quote.toString());
}

}