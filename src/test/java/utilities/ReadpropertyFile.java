package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fReader= new FileReader("C:\\Users\\ganesh.rayavarapu\\eclipse-workspace\\TestAutomationProject\\src\\test\\resources\\configfiles\\config.properties");
		Properties properties = new Properties();
		properties.load(fReader);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("testurl"));
		
	}

}
