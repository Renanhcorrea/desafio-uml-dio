public class IPhone implements AparelhoTelefonico, reprodutorMusical, NavegadorInternet {

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " +numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo " +numero + "...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void paraMusica() {
        System.out.println("Parar musica.");
    }

    @Override
    public void navegadorWeb(String url) {
        System.out.println("Navegando para: "+ url);
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo pagina: "+ url);
    }
    
}
