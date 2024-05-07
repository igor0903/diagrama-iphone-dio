public class AparelhoTelefonico {
    public void telefone(){
        ligar();
        atender();
        iniciarCorreioVoz();
    }

    private void ligar(){
        System.out.println("Ligando");
    }

    private void atender(){
        System.out.println("Chamada Atendida");
    }

    private void iniciarCorreioVoz(){
        System.out.println("Inciando Correio de Voz");
    }
}
