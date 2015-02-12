package tutorials;

import java.util.Iterator;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.*;

public class Parseowl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ="/Users/haroonr/github-loneharoon/JenaCodes/ontologies/WM30_original.owl";
       Model md = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
      md.read(path,null);
     Iterator<OntClass> it =((OntModel) md).listClasses();
     while(it.hasNext()){
    	 OntClass ontclass =it.next();
    	 System.out.println(ontclass.getLabel(null));
     }
     
	}

}
