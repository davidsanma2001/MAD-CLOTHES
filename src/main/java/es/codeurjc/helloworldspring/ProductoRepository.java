package es.codeurjc.helloworldspring;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	List<Producto> findByCodigo(String codigo);
}
