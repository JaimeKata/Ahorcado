package ahorcado;

import java.util.Scanner;

/**
 *
 * @author jaime-kata
 */
public class Ahorcado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabras[] = {"casa", "perro", "luis", "boli", "vida","Fiora","Jax"};
        String letrasJugadas = "";
        String oculto[];
        int contaIntentos = 0;
        String letra = "", palabraAdivinar = "", palabraOculta = "";
        boolean correcto = false;

        System.out.println("--- Inicio del juego ---");
        palabraAdivinar = palabras[(int) (Math.random() * 5)];
        oculto = new String[palabraAdivinar.length()];

        for (int k = 0; k < palabraAdivinar.length(); k++) {
            oculto[k] = "X";
        }

        do {
            System.out.println();

            for (int k = 0; k < palabraAdivinar.length(); k++) {
                System.out.print(oculto[k]);
            }
            System.out.print(" <- Esta es la palabra que tienes que adivinar");

            do {
                System.out.println();
                System.out.println("--- Introduce una letra ---");
                letra = teclado.nextLine();
            } while (letra.length() != 1);

            letra = letra.toLowerCase();
            letra = "" + letra.charAt(0);

            for (int k = 0; k < palabraAdivinar.length(); k++) {
                if (palabraAdivinar.charAt(k) == letra.charAt(0)) {
                    oculto[k] = letra;
                }
            }

            palabraOculta = "";
            for (int k = 0; k < palabraAdivinar.length(); k++) {
                palabraOculta = palabraOculta + oculto[k];
            }

            if (palabraOculta.equals(palabraAdivinar)) {
                correcto = true;
            }

            letrasJugadas = letrasJugadas + letra;
            contaIntentos++;

            System.out.println(letrasJugadas + " Estas son las letras que has introducido");
            System.out.println(contaIntentos + " Estos son los intentos que llevas");

            switch (contaIntentos) {
                case 1:
                    System.out.println("----------");
                    break;
                case 2:
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 3:
                    System.out.println("----------");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 4:
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 5:
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        0");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 6:
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        0");
                    System.out.println("|        |");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 7:
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        0");
                    System.out.println("|       >|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 8:
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        0");
                    System.out.println("|       >|<");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 9:
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        0");
                    System.out.println("|       >|<");
                    System.out.println("|       /");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
                case 10:
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        0");
                    System.out.println("|       >|<");
                    System.out.println("|       / \\");
                    System.out.println("|");
                    System.out.println("----------");
                    break;
            }

        } while (contaIntentos != 10 && correcto == false);

        if (contaIntentos == 10) {
            System.out.println("Has agotado el numero de intentos, la palabra era: " + palabraAdivinar);
        } else {
            System.out.println("Enhorabuena! Has acertado la palabra");
        }

    }

}
