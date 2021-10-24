package controller;

/**
 *
 * @author jony_
 */
import java.util.Optional;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;
    
    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }
    
    @RequestMapping (method = RequestMethod.GET)
    public Iterable<Product> List(){
        return productRepository.findAll();
    }
    
    @RequestMapping (value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id){
        return productRepository.findById(id);
    }
    
    @RequestMapping (value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name){
        return productRepository.findByName(name);
    }
}
