package com.platzi.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//CLase para configurar claves primarias de Entity ComprasProducto.
@Embeddable
public class ComprasProductoPK implements Serializable {

    @Getter @Setter
    @Column(name = "id_compra")
    private Integer idCompra;

    @Getter @Setter
    @Column(name = "id_producto")
    private Integer idProducto;
}
