package model;

/**
 *
 * @author jony_
 */
import  org.springframework.data.annotation.Id ;
import  org.springframework.data.elasticsearch.annotations.Document ;

@Document (indexName = "product", type = "catalog")
public class Product {
    
    @Id
    private long id;
    private String name;
    private Integer amout;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmout() {
        return amout;
    }

    public void setAmout(Integer amout) {
        this.amout = amout;
    }
    
    
    
}
