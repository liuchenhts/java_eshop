package au.com.chen.eshop.service;

import au.com.chen.eshop.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public interface ProductService extends CrudRepository<Product, Long>{

    List<Product> findByName(String name);
}
