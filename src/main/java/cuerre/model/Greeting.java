package cuerre.model;

import org.joda.time.DateTime;

public class Greeting {

	private String name;
	private String date;

	public Greeting(String name, DateTime date) {
		this.name = name;
		this.date = date.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}