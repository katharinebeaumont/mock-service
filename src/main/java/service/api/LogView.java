package service.api;

import java.util.List;

public class LogView {

	private List<String> logLines;
	
	public LogView(List<String> logs) {
		this.logLines = logs;
	}
	
	public List<String> getLogLines() {
		return logLines;
	}
}
