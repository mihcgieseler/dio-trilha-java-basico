public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //ligar e desligar usando um método
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    //aumentar e diminuir volume
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    //aumentar, diminuir e mudar o canal
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
