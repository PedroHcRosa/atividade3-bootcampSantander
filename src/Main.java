public class Main {
    public static void main(String[] args) throws Exception {
        
        Iphone iphoneDoMatheus = new Iphone("Matheus" , 996819486);
        Contato contato1 = new Contato("JOAO", 1234);
        Contato contato2 = new Contato("MARIA", 4321);
        Musica musica1 = new Musica("BAD ROMANCE", "LADY GAGA");
        Musica musica2 = new Musica("BAD ", "LADY ");
        
        iphoneDoMatheus.adcionarContato(contato1);
        iphoneDoMatheus.adcionarMusica(musica1);
        iphoneDoMatheus.ligar(contato1);
        iphoneDoMatheus.ligar(contato2);
        iphoneDoMatheus.correioDeVoz("TESTANDO SOM");
        iphoneDoMatheus.atender();
        iphoneDoMatheus.selecionarMusica(musica1);
        iphoneDoMatheus.selecionarMusica(musica2);
        iphoneDoMatheus.tocar();
        iphoneDoMatheus.pausar();
        iphoneDoMatheus.exibirPagina("www.google.com.br");
        iphoneDoMatheus.adcionarAba();
        iphoneDoMatheus.atualizarPagina();



    }
}
