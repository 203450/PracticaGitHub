import java.util.Scanner;
public class PrincipalDados{
static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {

        jugadaDados(); //llamada al void para el proceso del programa

    }

    public static void jugadaDados() {
        int a = 1, b = 1, suma = 0, acumuladorPuntos = 0, opcion = 1, puntaje = 0; //definición de variables, a = Dado 1 y b = Dado 2
        
        Dados dados = new Dados(a, b);

        do{
            //Juego.SumaDados(a, b);

            a = dados.getA();
            b = dados.getB();

            dados = new Dados(a, b);

            Juego juego = new Juego(suma, puntaje, dados);

            suma = juego.getSuma();
            
            puntaje = puntaje + juego.getSuma();

            juego = new Juego(suma, puntaje, dados);

            if(juego.getSuma() == 7 || juego.getSuma() == 11){

                System.out.println("Gano el PREMIO MAYOR!");
                System.out.println("FIN DEL JUEGO");
                opcion = 2;
            }
            if(juego.getSuma() == 2 || juego.getSuma() == 3 || juego.getSuma() == 12){

                System.out.println("Perdio, NINGUN PREMIO");
                System.out.println("FIN DEL JUEGO");
                opcion = 2;
            }
            if(juego.getSuma() == 4 || juego.getSuma() == 5 || juego.getSuma() == 6 || juego.getSuma() == 8  || juego.getSuma() == 9 || juego.getSuma() == 10){
                
                acumuladorPuntos = acumuladorPuntos + juego.getSuma();
                System.out.println("Puntos acumulados: " + acumuladorPuntos + ", desea seguir jugando?");
                System.out.println("1)SI              2)NO");
                opcion = lector.nextInt();
            }

        }while(opcion!=2);
        System.out.println("Gracias por jugar");
    }

}