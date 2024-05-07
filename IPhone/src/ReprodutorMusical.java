public class ReprodutorMusical{

    public void reproduzirMusica(){
        tocar();
        pausar();
        selecionarMusica();
    }
    
    private void tocar(){
        System.out.println("Tocando Musica");
    }
    
    private void pausar(){
        System.out.println("Musica Pausada");
    }

    private void selecionarMusica(){
        System.out.println("A musica foi selecionada");
    }
}
