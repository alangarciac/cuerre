package cuerre.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cuerre.App;
import cuerre.model.Greeting;

@RestController
public class QRController {

	private static Logger LOGGER = LogManager.getLogger(App.class);
	private static String msg = "This message is generated from Spring boot application! Great!";

	@RequestMapping("/")
	public String getMessage() {
		LOGGER.info("Getting message from static variable ... ");
		return msg;
	}

	@RequestMapping("/greeting")
	public Greeting getDate(@RequestParam(value = "name", defaultValue = "[Name]") String name) {
		LOGGER.info("Getting greeting from Spring Boot with param {} ... ", name);
		return new Greeting(name, new DateTime());
	}

}
