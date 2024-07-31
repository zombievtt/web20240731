import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import model.*;

@Path("/offices")
public class OfficeController {
	 @GET
	   @Path("/sample")
	   public Response saveExample() {
		   OfficeDAO dao=new OfficeDAO();
		   boolean f=dao.saveOffice();
		   if(f)
			 return  Response.ok().build();
		   else
			 return  Response.status(Status.NO_CONTENT).build();
	   }
}
