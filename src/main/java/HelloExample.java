import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import io.netty.handler.ssl.OpenSslEngine;
import org.apache.catalina.filters.CorsFilter;

import java.io.File;


public class HelloExample {

    //Example david comment
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(HelloExample.class.getName());

    public static void main(String[] args) throws IOException, SQLException {
		/*String log4jConfigFile = System.getProperty("user.dir")
                + File.separator + "log4j.properties";
		log.info("Hello this is a debug message");
		log.info("Hello this is an info message");
*/
        //OpenSslEngine openSslEngine = new OpenSslEngine(2, null, null);
        //Elad2
        CorsFilter c = new CorsFilter();
        c.getPreflightMaxAge();
    }
}