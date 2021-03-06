package ch.suva.restdata.extranet.repos;

import ch.suva.restdata.extranet.entities.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(
    collectionResourceRel = "people",
    path = "people" // Hint: custom relation naming
)
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    
    List<Person> findByLastName(@Param("lastName") String lastName);
    
    List<Person> findByFirstName(@Param("firstName") String firstName);
    
}
