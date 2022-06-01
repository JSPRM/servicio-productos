package com.jsprm.springboot.app.productos.services;

import com.jsprm.springboot.app.productos.entities.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
}