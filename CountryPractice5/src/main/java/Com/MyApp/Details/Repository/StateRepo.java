package Com.MyApp.Details.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.MyApp.Details.Entity.State;

@Repository
public interface StateRepo extends JpaRepository<State, Integer>{
	
	List<State> findByStateNameLike(String stateName);

}
