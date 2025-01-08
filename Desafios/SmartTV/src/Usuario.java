public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligarTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.avancarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.escolherCanal(40);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
