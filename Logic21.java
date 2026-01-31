import java.util.Scanner;

public class Logic21 {
    public static void main(String[] args) {
        Scanner sc21Logic = new Scanner(System.in);

        // 07/10/25

        // PREGUNTAR SI LA MANO DEL JUGADOR INCORPORA HARD TOTALS, SPLITS O SOFT TOTALS
        System.out.println("TUS CARTAS SON HARD, SPLIT O SOFT?");
        String cualidadMano = sc21Logic.nextLine().toUpperCase();

        int cartas1Jugador;
        int cartas2Jugador;
        int cartasJugadorSoft;
        int cartaDealer;

        if (cualidadMano.equals("HARD")) {
            // NUMEROS SIN LA INCORORACION DE UN AS = HARD TOTALS
            // PROCESO DE HARD TOTALS
            System.out.println("INDICA EL VALOR DE TUS 2 CARTAS: ");

            cartas1Jugador = sc21Logic.nextInt();
            cartas2Jugador = sc21Logic.nextInt();

            // SOLICITAR LA CARTA BOCA ARRIBA DEL DEALER
            System.out.println("INDICA EL VALOR DE LA CARTA BOCA ARRIBA DEL DEALER: ");
            cartaDealer = sc21Logic.nextInt();

            // SUMA DE LAS 2 CARTAS DEL JUGADOR
            int sumaCartasJugador = (cartas1Jugador + cartas2Jugador);

            if ((sumaCartasJugador == 9) && (cartaDealer >= 3 && cartaDealer <= 6)) {
                System.out.println("DOUBLE (DOBLAR)");

            } else if ((sumaCartasJugador == 10) && (cartaDealer >= 2 && cartaDealer <= 8)) {
                System.out.println("DOUBLE (DOBLAR)");
            } else if ((sumaCartasJugador == 11) && (cartaDealer >= 2 && cartaDealer <= 11)) {
                System.out.println("DOUBLE (DOBLAR)");
            } else if ((sumaCartasJugador == 12) && (cartaDealer >= 4 && cartaDealer <= 6)) {
                System.out.println("STAND (PLANTARSE)");
            } else if ((sumaCartasJugador >= 13 && sumaCartasJugador <= 16) && (cartaDealer >= 2 && cartaDealer <= 6)) {
                System.out.println("STAND (PLANTARSE)");
            } else if ((sumaCartasJugador == 17) && (cartaDealer >= 2 && cartaDealer <= 11)) {
                System.out.println("STAND (PLANTARSE)");
            } else {
                System.out.println("HIT (PEDIR)");
            }

        } else if (cualidadMano.equals("SPLIT")) {
            // NUMEROS SIN LA INCORORACION DE UN AS = HARD TOTALS

            System.out.println("CUAL ES EL NUMERO DE LA CARTA QUE TIENES REPETIDA?: ");

            cartasJugadorSoft = sc21Logic.nextInt();

            // SOLICITAR LA CARTA BOCA ARRIBA DEL DEALER
            System.out.println("INDICA EL VALOR DE LA CARTA BOCA ARRIBA DEL DEALER: ");

            cartaDealer = sc21Logic.nextInt();

            if ((cartasJugadorSoft >= 2 && cartasJugadorSoft <= 3) && (cartaDealer >= 2 && cartaDealer <= 7)) {
                System.out.println("SPLIT (DIVIDIR)");
            } else if ((cartasJugadorSoft == 4) && (cartaDealer >= 5 && cartaDealer <= 6)) {
                System.out.println("SPLIT (DIVIDIR)");
            } else if ((cartasJugadorSoft == 6) && (cartaDealer >= 2 && cartaDealer <= 6)) {
                System.out.println("SPLIT (DIVIDIR)");
            } else if ((cartasJugadorSoft == 7) && (cartaDealer >= 2 && cartaDealer <= 7)) {
                System.out.println("SPLIT (DIVIDIR)");
            } else if ((cartasJugadorSoft == 8) && (cartaDealer >= 2 && cartaDealer <= 11)) {
                System.out.println("SPLIT (DIVIDIR)");
            } else if ((cartasJugadorSoft == 9) && (cartaDealer >= 2 && cartaDealer <= 6)
                    && (cartaDealer >= 8 && cartaDealer <= 9)) {
                System.out.println("SPLIT (DIVIDIR)");
            } else if ((cartasJugadorSoft == 12) && (cartaDealer >= 2 && cartaDealer <= 11)) {
                System.out.println("SPLIT (DIVIDIR)");
            } else {
                System.out.println("NO DIVIDAS");
            }

        } else if (cualidadMano.equals("SOFT")) {
            System.out.println("INDICA EL VALOR DE TUS 2 CARTAS: ");

            cartas1Jugador = sc21Logic.nextInt();
            cartas2Jugador = sc21Logic.nextInt();

            // SOLICITAR LA CARTA BOCA ARRIBA DEL DEALER
            System.out.println("INDICA EL VALOR DE LA CARTA BOCA ARRIBA DEL DEALER: ");
            cartaDealer = sc21Logic.nextInt();

            // SUMA DE LAS 2 CARTAS DEL JUGADOR
            int sumaCartasJugador = (cartas1Jugador + cartas2Jugador);

            if (sumaCartasJugador >= 13 && sumaCartasJugador <= 14 && (cartaDealer >= 5 && cartaDealer <= 6)) {
                System.out.println("DOUBLE (DOBLAR)");
            } else if ((sumaCartasJugador >= 15 && sumaCartasJugador <= 16) && (cartaDealer >= 4 && cartaDealer <= 6)) {
                System.out.println("DOUBLE (DOBLAR)");
            } else if ((sumaCartasJugador == 17) && (cartaDealer >= 3 && cartaDealer <= 6)) {
                System.out.println("DOUBLE (DOBLAR)");
            } else if ((sumaCartasJugador == 18) && (cartaDealer >= 2 && cartaDealer <= 6)) {
                System.out.println("DOUBLE (DOBLAR)");
            } else if ((sumaCartasJugador == 18) && (cartaDealer >= 7 && cartaDealer <= 8)) {
                System.out.println("STAND (PLANTARSE)");
            } else if ((sumaCartasJugador == 19) && (cartaDealer >= 2 && cartaDealer <= 5)
                    || (cartaDealer >= 7 && cartaDealer <= 11)) {
                System.out.println("STAND (PLANTARSE)");
            } else if ((sumaCartasJugador == 19) && (cartaDealer == 6)) {
                System.out.println("DOUBLE (DOBLAR)");
            } else if ((sumaCartasJugador == 20) && (cartaDealer >= 2 && cartaDealer <= 11)) {
                System.out.println("STAND (PLANTARSE)");
            } else {
                System.out.println("HIT (PEDIR)");
            }

        } else {
            System.out.println("OPCION NO ENCONTRADA");
        }

        sc21Logic.close();

    }

}