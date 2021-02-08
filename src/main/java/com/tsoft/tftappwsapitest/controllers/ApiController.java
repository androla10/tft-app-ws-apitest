package com.tsoft.tftappwsapitest.controllers;

import com.tsoft.tftappwsapitest.dto.TrabajadorDTO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/workers")
@Slf4j(topic = "kibanaLogs")
public class ApiController {

    public ApiController() {
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrabajadorDTO> getWorker(@PathVariable("id") Long id) {
        MDC.put("METHOD", "getWorker");
        if (id.intValue() == 1) {
            MDC.put("COD_HTTP", "400");
            log.info("GetWorker -> Init");
            return ResponseEntity.status(400).body(null);
        }
        MDC.put("COD_HTTP", "200");
        log.info("GetWorker -> Init");
        return ResponseEntity.ok(TrabajadorDTO.builder()
                .id(id)
                .apellidoMaterno("Denegri")
                .apellidoPaterno("Aurelio")
                .edad(80)
                .nombreCompleto("Marco")
                .planilla(Boolean.TRUE)
                .salario(BigDecimal.valueOf(8000))
                .sexo("Masculino")
                .build());
    }

    @GetMapping
    @ResponseBody
    List<TrabajadorDTO> getWorkers() {
        MDC.put("COD_HTTP", "200");
        MDC.put("METHOD", "getWorkers");
        log.info("GetWorkers -> Init");
        return Arrays.asList(TrabajadorDTO.builder()
                .id(100L)
                .apellidoMaterno("Denegri")
                .apellidoPaterno("Aurelio")
                .edad(80)
                .nombreCompleto("Marco")
                .planilla(Boolean.TRUE)
                .salario(BigDecimal.valueOf(8000))
                .sexo("Masculino")
                .build());
    }
}
