package vominhthuan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vominhthuan.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
