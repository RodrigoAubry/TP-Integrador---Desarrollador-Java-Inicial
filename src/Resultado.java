public class Resultado{
int rdo;
    //Metodos
    public void calcularResultado(int golesEL,int golesEV){
        if(golesEL==golesEV){
            this.rdo=0;
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
