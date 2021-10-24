package repository;

import model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jony_
 */


public interface ProductRepository extends CrudRepository<Product, Integer>{

    public Iterable<Product> findByName(String name);
    
}
