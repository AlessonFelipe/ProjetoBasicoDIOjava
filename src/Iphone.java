public class Iphone extends NavegadorInternet implements ReprodutorMusical, AparelhoTelefonico {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.exibirPagina("Pagina1");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("Reprodutor Musical");
        iphone.selecionarMusica(" Frank Sinatra That's life");
        iphone.tocar();
        iphone.pausar();

        System.out.println("Telefone");
        iphone.ligar("81998567123");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }

    // Implement methods from ReprodutorMusical interface
    @Override
    public void tocar() {
        System.out.println("Tocando música" );
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica" + musica);

    }

    // Implement methods from AparelhoTelefonico interface
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Recebendo ligação " );
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}

