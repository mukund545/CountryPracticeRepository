package Com.MyApp.Details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.MyApp.Details.Entity.City;
import Com.MyApp.Details.Entity.Country;
import Com.MyApp.Details.Entity.State;
import Com.MyApp.Details.Repository.CityRepo;
import Com.MyApp.Details.Repository.CountryRepo;
import Com.MyApp.Details.Repository.StateRepo;

@RestController
@RequestMapping("/detail")
public class MainController {

	@Autowired
	CountryRepo countryRepo;
	@Autowired
	StateRepo stateRepo;
	@Autowired
	CityRepo cityRepo;

	@PostMapping("/add")
	public Country addCountry(@RequestBody Country country) {

		country.getStates();

		return this.countryRepo.save(country);
	}

	@GetMapping("/get")
	public List<Country> getAll(){

		List<Country> ctr = this.countryRepo.findAll();
		return ctr;

	}
	@GetMapping("/get/{cname}")
	public Country getByName(@PathVariable String cname){

		return this.countryRepo.findCountryByCountryName(cname);

	}
	@GetMapping("/getstate/{fname}")
	public List<State> getByFirstName(@PathVariable("fname") String fname){

		return this.stateRepo.findByStateNameLike(fname);

	}
	@GetMapping("/getcity/{cityname}")
	public List<City> getByCityName(@PathVariable("cityname") String cityname){

		List<City> ct = this.cityRepo.findByCityNameLike(cityname);

		return ct;

	}
	@GetMapping("/getcountry/{countryname}/{countrycurrency}")
	public List<Country> getByCountryNameAndCountryCurrency(@PathVariable("countryname") String countryname,@PathVariable String countrycurrency){

		List<Country> lists = this.countryRepo.findCountryByCountryNameAndCountryCurrrency(countryname, countrycurrency);

		return lists;

	}
	
	@GetMapping("/getcountry")
	public List<Country> getByCountryStatus(@RequestParam String countryStatus){

		List<Country> lists = this.countryRepo.findCountryByCountryStatus(countryStatus);

		return lists;

	}
	
	@GetMapping("/getcountries")
	public List<Country> getByCountryCurrrency(@RequestParam String countryCurrrency){

		List<Country> lists = this.countryRepo.findCountryByCountryCurrrency(countryCurrrency);

		return lists;

	}
	
	
}
