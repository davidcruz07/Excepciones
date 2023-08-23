public class CaracterEn {

    public static char caracterEn(String cadena, int entero) throws Exception {

        if (entero >= 0 && entero < cadena.length()){

            return cadena.charAt(entero);
        }
        else{

            throw new Exception("Esta posición en la cadena no existe");

        }

    }
}
