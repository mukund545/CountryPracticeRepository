package Com.MyApp.Details.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import Com.MyApp.Details.Entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {
	
	Country findCountryByCountryName(String countryName);
	
	List<Country> findCountryByCountryNameAndCountryCurrrency(String countryName,String countryCurrrency);
	
	List<Country> findCountryByCountryStatus(@RequestParam (required = false)String countryStatus);
	
	List<Country> findCountryByCountryCurrrency(String countryCurrrency);
	

}


