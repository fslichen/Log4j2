package evolution;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// If you add spring boot dependencies, don't forget to exclude the logging functionalities of spring boot, otherwise there might be potential problems like unable to read the log4j2.xml
public class Application {
	Logger logger = LogManager.getLogger(Application.class);
	
	public void anyMethod() {
		logger.debug("Hello World");
	}
	
	public static void main(String[] args) {
		Application a = new Application();
		a.anyMethod();
	}
}
