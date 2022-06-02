package com.jsprm.springboot.app.productos.controller;

import com.jsprm.springboot.app.productos.entities.Producto;
import com.jsprm.springboot.app.productos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        List<Producto> productos =  productoService.buscarTodos();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id){
        return productoService.buscarPorId(id);
    }
}
