
package ar.com.pagina.pagina.service;

import ar.com.pagina.pagina.entity.Producto;
import ar.com.pagina.pagina.repository.ProductoRepository;
import ar.com.pagina.pagina.service.impl.IProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    public ProductoRepository productoRepository;
    
    @Override
    public List<Producto> verProductos(){
        return productoRepository.findAll();
    }
    @Override
    public void crearProducto(Producto producto){
        productoRepository.save(producto);
    }
    @Override
    public void editarProducto(Long id, Producto producto){
         Optional<Producto> optionalProducto = productoRepository.findById(id);
        
    if (optionalProducto.isPresent()) {
        Producto productoExistente = optionalProducto.get();
        if(producto.getNombre() !=null){
            productoExistente.setNombre(producto.getNombre());
        }
        if (producto.getCategoria() != null) {
            productoExistente.setCategoria(producto.getCategoria());
        }          
        if(producto.getDescripcion() !=null){
            productoExistente.setDescripcion(producto.getDescripcion());
        }
        if(producto.getMaterial() !=null){
            productoExistente.setMaterial(producto.getMaterial());
        }
        if(producto.getTapizado() !=null){
            productoExistente.setTapizado(producto.getTapizado());
        }
        if(producto.getPrecio() !=null){
            productoExistente.setPrecio(producto.getPrecio());
        }   
            productoRepository.save(productoExistente);
    } else {
        throw new RuntimeException("Conocimiento no encontrado");
    }       
  } 
    @Override
    public Producto buscarProducto(Long id){
       return productoRepository.findById(id).orElse(null);
    }
    @Override
    public void eliminarProducto(Long id){
        productoRepository.deleteById(id);
    }
}

