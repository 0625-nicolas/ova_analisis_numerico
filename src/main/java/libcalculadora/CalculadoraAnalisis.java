package libcalculadora;

/**
 *  Clase que representa las funciones de la biblioteca dinamica JNI
 */
public class CalculadoraAnalisis {

    public native double interpolacion(double[][] puntos, double x);

    public CalculadoraAnalisis() {
        try {
            System.loadLibrary("calcanalisis");
            System.out.println("Biblioteca cargada exitosamente!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Carga de la biblioteca fallida: " + e.getMessage());
        }
    }
}