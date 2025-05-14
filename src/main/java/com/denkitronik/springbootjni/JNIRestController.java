package com.denkitronik.springbootjni;

import libcalculadora.CalculadoraAnalisis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analisis-service")
public class JNIRestController {
    private CalculadoraAnalisis miCalculadora;

    public JNIRestController() {
        this.miCalculadora = new CalculadoraAnalisis();
    }

    @GetMapping("/interpolar/{x}/{puntosX}/{puntosY}")
    public double interpolacion(@PathVariable double x, @PathVariable double[] puntosX, @PathVariable double[] puntosY){
        return miCalculadora.interpolar(puntosX, puntosY, x);
    }
}
