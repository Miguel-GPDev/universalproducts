package com.gago.universalproducts.integration.repositories;

import com.gago.universalproducts.business.model.AmazonProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmazonProductoRepository  extends JpaRepository<AmazonProducto, String> {
}
