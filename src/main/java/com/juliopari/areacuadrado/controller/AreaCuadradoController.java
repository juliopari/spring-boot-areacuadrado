package com.juliopari.areacuadrado.controller;

import com.juliopari.areacuadrado.dto.CuadradoRequest;
import com.juliopari.areacuadrado.dto.CuadradoResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/areacuadrado")
public class AreaCuadradoController {
    
    @PostMapping("/calcular")
    public CuadradoResponse calcular(@RequestBody CuadradoRequest rq) {
        CuadradoResponse rs = new CuadradoResponse();
        rs.setArea( rq.getLado()*rq.getLado() );       
        return rs;
    }
    
}
