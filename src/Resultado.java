public class Resultado{

    //Atributos

     int rdo;

    //Metodos

    public void calcularResultado(int golesEL,int golesEV){
        if(golesEL==golesEV){
            this.rdo=2;
        }else{
            if (golesEL>golesEV){
                this.rdo=1;
            }else{
                this.rdo=3;
            }
        }
    }
    public int getRdo() {
        return rdo;
    }
}
