public class Usuario {
    
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Volume atual? "+smartTv.volume);
        System.out.println("Canal atual? "+smartTv.canal);

        //Ligando e desligando:
        smartTv.ligar();
        System.out.println("Novo status - TV ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - TV ligada? "+smartTv.ligada);

        //Aumentando e diminuindo o volume:
        smartTv.aumentarVolume();
        System.out.println("Novo volume - Volume atual? "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo volume - Volume atual? "+smartTv.volume);

        //Diminuindo ou aumentando várias vezes seguidas:
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume várias vezes: "+smartTv.volume);

        //Mudando o canal:
        System.out.println("Canal anterior: "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+smartTv.canal);
        
        //Diminuindo e aumentando o canal:
        smartTv.diminuirCanal();
        System.out.println("Diminuindo canal "+smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Aumentando canal "+smartTv.canal);
    }
}
