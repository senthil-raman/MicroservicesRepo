package com.address.val;

//import com.acme.books.models.Book;
//import com.address.val.QueryParam;

import java.util.List;

import javax.enterprise.context.RequestScoped;

//import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/addressval")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class AddressResource {

    
    
    @GET
    @Path("/{name}/{email}/{phone}/{address}/{city}/{zipcode}")

public boolean validateForm(@PathParam("name") String name,@PathParam("email") String email,@PathParam("phone") String phone,@PathParam("address") String address,@PathParam("city") String cityRegion,@PathParam("zipcode") String zipcode) {

boolean errorFlag = false;
boolean nameError;
boolean emailError;
boolean phoneError;
boolean addressError;
boolean cityRegionError;
boolean zipcodeError;

if (name == null
       || name.equals("")
       || name.length() > 45) {
   errorFlag = true;
   nameError = true;
//                request.setAttribute("nameError", nameError);
}
if (email == null
       || email.equals("")
       || !email.contains("@")) {
   errorFlag = true;
   emailError = true;
//                request.setAttribute("emailError", emailError);
}
if (phone == null
       || phone.equals("")
       || phone.length() < 9) {
   errorFlag = true;
   phoneError = true;
//                request.setAttribute("phoneError", phoneError);
}
if (address == null
       || address.equals("")
       || address.length() > 45) {
   errorFlag = true;
   addressError = true;
//                request.setAttribute("addressError", addressError);
}
if (cityRegion == null
       || cityRegion.equals("")
       || cityRegion.length() > 2) {
   errorFlag = true;
   cityRegionError = true;
//                request.setAttribute("cityRegionError", cityRegionError);
}
if (zipcode == null
       || zipcode.equals("")
       || zipcode.length() > 7) {
   errorFlag = true;
   zipcodeError = true;
//                request.setAttribute("ccNumberError", ccNumberError);
}

return errorFlag;
}

	/*   @GET
	    @Path("/{name}")

	public boolean validateForm(@PathParam("name") String name) {

	boolean errorFlag = false;
	boolean nameError;
	boolean emailError;
	boolean phoneError;
	boolean addressError;
	boolean cityRegionError;
	boolean ccNumberError;

	if (name == null
	       || name.equals("")
	       || name.length() > 45) {
	   errorFlag = true;
	   nameError = true;
//	                request.setAttribute("nameError", nameError);
	}
	
	return errorFlag;
	}  */

    
}