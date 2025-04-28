
package ar.com.pagina.pagina.repository;

import ar.com.pagina.pagina.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
