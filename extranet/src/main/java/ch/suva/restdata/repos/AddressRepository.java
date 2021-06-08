package ch.suva.restdata.repos;

import ch.suva.restdata.entities.Address;
import ch.suva.restdata.entities.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(
    collectionResourceRel = "address",
    path = "address"
)
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
    
}