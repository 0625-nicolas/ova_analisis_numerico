package com.denkitronik.springbootjni;

import libcalculadora.CalculadoraAnalisis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analisis-numerico-service")
public class JNIRestController {
    private CalculadoraAnalisis miCalculadora;

    public JNIRestController() {
        this.miCalculadora = new CalculadoraAnalisis();
    }

    @GetMapping("/interpolacion/{puntosX}/{puntosY}/{x}")
    public double interpolacion(@PathVariable double[] puntosX, @PathVariable double[] puntosY, @PathVariable double x){
        double[][] puntos = new double[puntosX.length][2];
        for (int i = 0; i < puntosX.length; i++) {
            puntos[i][0] = puntosX[i];
            puntos[i][1] = puntosY[i];
        }
        return miCalculadora.interpolacion(puntos , x);
    }
}
