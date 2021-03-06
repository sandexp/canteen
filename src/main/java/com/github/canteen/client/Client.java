package com.github.canteen.client;

import com.github.canteen.controller.JDBCController;
import com.github.canteen.internal.ConfigReader;
import com.github.canteen.internal.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

	private static final Logger logger= LoggerFactory.getLogger(JDBCController.class);

	private String hostname;

	private Integer port;

	public Client(){
		ConfigReader reader = ConfigReader.getReader();
		this.hostname="localhost";
		try {
			this.port= Integer.parseInt(
					reader.get(
						Configuration.EXECUTE_PORT,
						Configuration.DEFAULT_EXECUTE_PORT
					)
			);
		} catch (NumberFormatException e) {
			logger.error("Parse port information incorrectly.");
		}
	}

	public Client(String hostname,Integer port){
		this.hostname=hostname;
		this.port=port;
	}
}
