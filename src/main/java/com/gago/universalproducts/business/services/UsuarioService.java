package com.gago.universalproducts.business.services;

import com.gago.universalproducts.business.model.Usuario;

public interface UsuarioService {

    void create (Usuario usuario);
    void actulizarUsuario ( Usuario usuario);
    Usuario getUsuario ( String id );

}
