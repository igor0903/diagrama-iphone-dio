public class IPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical spotify = new ReprodutorMusical();
        spotify.reproduzirMusica();

        AparelhoTelefonico phone = new AparelhoTelefonico();
        phone.telefone();

        Navegador safari = new Navegador();
        safari.navegar();
        
    }
}
