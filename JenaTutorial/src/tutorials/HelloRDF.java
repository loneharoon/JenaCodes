package tutorials;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.*;

public class HelloRDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Model md = ModelFactory.createDefaultModel();
	String NS = "http://example.com/test/" ;
	Resource r= md.createResource(NS+"r");
	Property p =md.createProperty(NS+"p");
	r.addProperty(p,"helloworld", XSDDatatype.XSDstring);
	md.write(System.out,"Turtle");
			
	 }

}
