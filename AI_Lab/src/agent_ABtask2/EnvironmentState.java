package agent_ABtask2; 

import java.util.HashMap;
import java.util.Map;

import agent_ABtask2.Environment.LocationState;

public class EnvironmentState {
	private Map<String, LocationState> state = new HashMap<String, LocationState>();
	private String agentLocation = null;//

	public EnvironmentState(LocationState locAState, LocationState locBState) {
		this.state.put(Environment.LOCATION_A, locAState);
		this.state.put(Environment.LOCATION_B, locBState);
	}

	public void setAgentLocation(String location) {
		this.agentLocation = location;
	}

	public String getAgentLocation() {
		return this.agentLocation;
	}

	public LocationState getLocationState(String location) {
		return this.state.get(location);
	}

	public void setLocationState(String location, LocationState locationState) {
		this.state.put(location, locationState);
	}

	public void display() {
		System.out.println("Environment state: \n\t" + this.state);
	}
}