package com.tsoft.tftappwsapitest.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrabajadorDTO {
    private Long id;
    private String nombreCompleto;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private Integer edad;
    private BigDecimal salario;
    private boolean planilla;
}
