import java.util.ArrayList;
import java.util.List;

public class Iphone implements AparelhoTelefone,NavegadorNaInternet,ReprodutorMusical {

    private String owner;
    private long phoneNumber;
    private List<Musica> listMusica;
    private List<Contato> listContato;

    public Iphone(String owner, long phoneNumber) {
        this.owner = owner;
        this.phoneNumber = phoneNumber;
        this.listContato = new ArrayList<>();
        this.listMusica = new ArrayList<>();
    }

    public void adcionarContato(Contato contato) {
        listContato.add(contato);
       
    }

    public void adcionarMusica(Musica musica) {
        listMusica.add(musica);
        
    }


    @Override
    public void ligar(Contato contato) {
        if(listContato.contains(contato)) {
            System.out.println("LIGANDO PARA: " + contato.getName());
        }
        else {
            System.out.println("CONTATO NÃO ENCONTRADO FAVOR ADCIONAR PRIMEIRO");
        }
    }

    @Override
    public void correioDeVoz(String mensagem) {
        System.out.print("Sua mensagem será gravada: " + mensagem);
    }

    @Override
    public void atender() {
       System.out.println("ATENDENDO CHAMADA...");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        if(listMusica.contains(musica)) {
            System.out.println("Musica: " + musica.getNome() + " \nAutor/Banda: " + musica.getAutor());
        }
        else {
            System.out.println("Musica nao encontrada favor adcionar primeiro");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música");
    }

    @Override
    public void tocar() {
       System.out.println("TOCANDO ÚLTIMA MÚSICA SELECIONADA!");
    }

    @Override
    public void exibirPagina(String url) {
       System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adcionarAba() {
       System.out.println("ABA EXTRA ADCIONADA!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("CARREGANDO...");
        System.out.println("PAGINÁ ATUALIZADA!");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Musica> getListMusica() {
        return listMusica;
    }

    public void setListMusica(List<Musica> listMusica) {
        this.listMusica = listMusica;
    }

    public List<Contato> getListContato() {
        return listContato;
    }

    public void setListContato(List<Contato> listContato) {
        this.listContato = listContato;
    }

    
    
    
}