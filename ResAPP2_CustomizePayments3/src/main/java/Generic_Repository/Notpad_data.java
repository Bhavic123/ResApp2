package Generic_Repository;

import java.io.FileInputStream;
import java.util.Properties;

public class Notpad_data {

	public String getPropertyKeyValue(String key) throws Throwable {
		
	FileInputStream fis = new FileInputStream(ResApp.filepath);
	Properties pObj = new Properties();
	pObj.load(fis);
	String value = pObj.getProperty(key);

	return value;
    }
}
