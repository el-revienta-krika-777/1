package com.sting.pedidos.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class LibroDTO {
    private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal precio;
    private String categoriaNombre;
}
