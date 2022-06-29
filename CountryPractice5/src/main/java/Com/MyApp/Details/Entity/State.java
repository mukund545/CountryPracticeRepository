package Com.MyApp.Details.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	private String stateName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "stateId",referencedColumnName="stateId")
	private List<City> cities;

	public State() {
		
	}

	public State(int stateId, String stateName, List<City> cities) {
		this.stateId = stateId;
		this.stateName = stateName;
		this.cities = cities;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	

}
