package BaseFunctionalities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GetFromPf {

	//comment
	public static Properties createDataObject() throws Exception {
		
		String Pf_loc = "/Users/KA20463902/eclipse-workspace/Irctc/utilities/Obj_repo.properties";
		
		// file container
		File file = new File(Pf_loc);
		
		// file input stream
		FileInputStream fin = new FileInputStream(file);
		
		// properties instance
		Properties prop = new Properties();
		
		// read data from .properties file
		prop.load(fin);
		
		return prop;
		
	}
	
	
	

}
