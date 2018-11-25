package com.example.webServices;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/getResturentLocation")
public class ResturentController {
	ArrayList<Restaurant> resturant = new ArrayList<Restaurant>();
	
	@RequestMapping(method=RequestMethod.GET)
	@ApiOperation(value="getTourist",
	notes="Restaurant",
	response=ArrayList.class)
	ArrayList<Restaurant> getRestaurant(){
		
		return resturant;
	}
	
	@ApiOperation(value="getRestaurantById",
			notes="return the restaurant by id ",
			response=Restaurant.class)
	
	
//	@RequestMapping(method=RequestMethod.GET, value="/tourist/{id}")
//	Tourist getTouristByID(@PathVariable int id) {
//		
//		for(Tourist i:tourist) {
//			if(i.getId()==id)
//				return i;
//		}
//		return null;
//	}
	
//	@RequestMapping(method=RequestMethod.GET,value="/tourist")
//	
//	String findTouristByName(@RequestParam(value="name",defaultValue="Muayed")String name) {
//		for(Tourist i:tourist) {
//			if(i.getName().equals(name))
//				return name+ " exists";
//		}
//		return name+ " does not exist!!!";
//	}
	
	
//	@RequestMapping(value="addtourist", method=RequestMethod.POST)
//	String addTourist(@RequestBody Tourist u) {
//		for(Tourist i:tourist) {
//			if(u.getId()==i.getId()) {
//				return "user already exsits";
//			}
//			
//			}
//		tourist.add(u);
//		return "Tourist Added";
//		}
	
	@RequestMapping(method=RequestMethod.GET,value="/resturent")
	public ArrayList<Restaurant> getResturent(@RequestParam(value="Location", defaultValue="31.5642958,35.2564358")String Location) throws Exception{
		ArrayList<Restaurant> resturent = new ArrayList<Restaurant>();
		String url = "https://maps.googleapis.com/maps/api/place/nearbysear/json?"
	    + "location=31.9037641,35.2034184&"
	    + "type=Resturant&"
		+ "key=AIzaSyCI0PLIKBhqsRr85nAc2Xt8x79wkTjtgaw";
	   
		
		
		HttpRetunData getRes = CommonHttp.getAPI(url);
		JSONObject resDetails = new JSONObject(getRes.getReturnContent());
		System.out.println(resDetails.toString());

		
		for (int i = 0; i < resDetails.getJSONArray("results").lenght(); i++) {
			Restaurant rest = new Restaurant();
      
			 rest.setAddress(resDetails.getJSONArray("result").getJSONObject(i));
			rest.setLocation(resDetails.getJSONArray("result").getJOSNObject(i).getJSONObject("geometry").getJSONObject("location").getDouble("lat") +","+ 
					resDetails.getJSONArray("result").getJOSNObject(i).getJSONObject("geometry").getJSONObject("location").getDouble("long"));
		      
			resturent.add(rest);
		}
		return resturent;
		
	}
	

}
