public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligarTv(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void avancarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }
    public void escolherCanal(int numeroCanal){
        canal = numeroCanal;
    }
}
