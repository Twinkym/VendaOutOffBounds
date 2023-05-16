package Vendes;

public class Main {
    public static void main(String[] args) {
        /* En aquest exemple, es declara un array arr de longitud 3,
         * però s'intenta accedir a l'element a la posició 5,
         * que no existeix, generant així
         * l'excepció ArrayIndexOutOfBoundsException.
         * Dins del bloc catch,
         * es captura l'excepció i es mostra el missatge de
         * l'excepció utilitzant el mètode getMessage().
         * Això és un exemple senzill de com generar i
         * capturar una excepció ArrayIndexOutOfBoundsException.
         * Pots adaptar aquesta lògica segons les necessitats del teu programa
         *  i les condicions en què es produeix l'error.
         */
        try {
            int[] arr = { 1, 2, 3 };
            int element = arr[5]; // Generar ArrayIndexOutOfBoundsException
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("S'ha produït una excepció: " + e.getMessage());
        }
    }
}