import java.util.Scanner; 
public class Dados {
    static Scanner lector = new Scanner (System.in);
    int a, b;

    public Dados(int a, int b){
        //recibir a y b para crear ambos dados
        while(a <1 || a>6){
        
            System.out.println("Tira el primer dado... ¿Cuanto obtuvo?");
            a = lector.nextInt();
            this.a = a;
        }
        while(b <1 || b>6){
            System.out.println("Tira el segundo dado... ¿Cuanto obtuvo?");
            b = lector.nextInt();
            this.b = b;
        }
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    
}
