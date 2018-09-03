package service.mock;

public class MockStatus {

	//Rules: CPUU high, network out low... agent works out a 'is this good' measure
	//public Status getStatus() {
		// Read in CSV, convert to class
	//}
	
	
}

class Status {
	String value;
	String name;
	
	public Status(String value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
}