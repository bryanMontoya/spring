package com.platzi.platzimarket.persistence.mapper;

import com.platzi.platzimarket.domain.Category;
import com.platzi.platzimarket.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMaper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration //Inversa a la anterior. Mapeo inverso al que se tiene.
    @Mapping(target = "productos", ignore = true) //Los productos no van a ir.
    Categoria toCategoria(Category category);
}
