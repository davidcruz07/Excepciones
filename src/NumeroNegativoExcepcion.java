public class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion() {

        super("No existe raíz cuadrada de un número negativo");
    }

    public NumeroNegativoExcepcion(String mensaje){

        super(mensaje);
    }


}

