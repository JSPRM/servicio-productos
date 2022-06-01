package com.jsprm.springboot.app.productos.repositories;

import com.jsprm.springboot.app.productos.models.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
