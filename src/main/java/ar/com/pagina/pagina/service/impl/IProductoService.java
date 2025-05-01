package ar.com.pagina.pagina.service.impl;

import ar.com.pagina.pagina.entity.Producto;
import java.util.List;


public interface IProductoService {
    public List<Producto> verProductos();
    public void crearProducto(Producto conocimiento);
    public void editarProducto(Long id,Producto conocimiento);
    public void eliminarProducto(Long id);
    public Producto buscarProducto(Long id);
}
