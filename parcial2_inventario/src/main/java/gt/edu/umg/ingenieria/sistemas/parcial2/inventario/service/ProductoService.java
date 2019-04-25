package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.dao.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public List<ProductoEntity> buscarTodos() {
        return (List<ProductoEntity>) this.productoRepository.findAll();
    }

    public ProductoEntity crearProducto(ProductoEntity e1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ProductoEntity actualizarStock(long id, String accion, Integer Stock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
