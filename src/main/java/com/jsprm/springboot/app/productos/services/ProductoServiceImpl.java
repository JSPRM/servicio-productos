package com.jsprm.springboot.app.productos.services;

import com.jsprm.springboot.app.productos.entities.Producto;
import com.jsprm.springboot.app.productos.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Producto> buscarTodos() {
        return productoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}
