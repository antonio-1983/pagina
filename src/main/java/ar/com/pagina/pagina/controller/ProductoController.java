
package ar.com.pagina.pagina.controller;

import ar.com.pagina.pagina.service.impl.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/producto")
public class ProductoController {
    @Autowired
    private IProductoService productoService;
    //@PostMapping("/crear")
    
    
    
}
