public class Juego{
int suma, puntaje;
Dados dados;
    public Juego(int suma, int puntaje, Dados dados){
        //recibir a y b, despues sumar
        this.suma = suma;
        this.puntaje = puntaje;
        this.dados = dados;
    }

    public int getPuntaje(){
       return puntaje;

    }

    public int getSuma(){
        //regreso de la suma de ambos dados (acumulador)
        return (dados.getA() + dados.getB());
    }

}