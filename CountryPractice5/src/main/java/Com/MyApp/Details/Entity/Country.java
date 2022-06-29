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
public class Country {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	private String countryName;
	private String countryCurrrency;
	
	private String countryStatus;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryId",referencedColumnName="countryId")
	private List<State> states;

	
	public Country() {
		
	}


	public Country(int countryId, String countryName, String countryCurrrency, String countryStatus,
			List<State> states) {
		
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryCurrrency = countryCurrrency;
		this.countryStatus = countryStatus;
		this.states = states;
		
	}


	public int getCountryId() {
		return countryId;
	}


	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getCountryCurrrency() {
		return countryCurrrency;
	}


	public void setCountryCurrrency(String countryCurrrency) {
		this.countryCurrrency = countryCurrrency;
	}


	public String getCountryStatus() {
		return countryStatus;
	}


	public void setCountryStatus(String countryStatus) {
		this.countryStatus = countryStatus;
	}


	public List<State> getStates() {
		return states;
	}


	public void setStates(List<State> states) {
		this.states = states;
	}

}
