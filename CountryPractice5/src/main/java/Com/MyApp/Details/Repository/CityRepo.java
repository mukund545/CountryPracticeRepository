package Com.MyApp.Details.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.MyApp.Details.Entity.City;

@Repository
public interface CityRepo extends JpaRepository<City, Integer> {
      
	List<City> findByCityNameLike(String cityName);
}
