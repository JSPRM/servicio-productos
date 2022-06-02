package com.jsprm.springboot.app.productos.services;

import com.jsprm.springboot.app.productos.entities.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> buscarTodos();
    Producto buscarPorId(Long id);
}