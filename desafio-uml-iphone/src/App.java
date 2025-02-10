public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        iPhone.tocarMusica();
        iPhone.pausarMusica();
        iPhone.paraMusica();

        iPhone.fazerChamada("11112222");
        iPhone.receberChamada("22221111");

        iPhone.navegadorWeb("www.google.com");
        iPhone.abrirPagina("www.google.com");
    }
}
