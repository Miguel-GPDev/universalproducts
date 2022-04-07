package com.gago.universalproducts.business.services;

import com.gago.universalproducts.business.model.AmazonProducto;

public interface AmazonProductoService {

    boolean created( AmazonProducto amazonProducto ) ;
    AmazonProducto getByAsin( String asin ) ;

}
