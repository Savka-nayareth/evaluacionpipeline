package cl.duoc.evaluacionpipeline.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.evaluacionpipeline.model.Producto;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final List<Producto> productos = List.of(
            new Producto(1L, "Bebida 1.5L", 20),
            new Producto(2L, "Pan de molde", 15),
            new Producto(3L, "Galletas", 30)
    );

    @GetMapping
    public List<Producto> listarProductos() {
        return productos;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarProducto(@PathVariable Long id) {
        return productos.stream()
                .filter(producto -> producto.id().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/estado")
    public Map<String, String> estadoServicio() {
        return Map.of(
                "servicio", "evaluacionpipeline",
                "estado", "operativo",
                "version", "1.0.0"
        );
    }
}