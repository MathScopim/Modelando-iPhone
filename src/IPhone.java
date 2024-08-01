
public class IPhone {


    public static void main(String[] args) {


        ReprodutorMusical rm = new ReprodutorMusical();
        AparelhoEletronico ae = new AparelhoEletronico();
        NavegadorNaInternet ni = new NavegadorNaInternet();


        ReprodutorMusical.SelecionarMusica();
        ReprodutorMusical.reproduzirMusica();
        ReprodutorMusical.Pausar();
        ReprodutorMusical.Tocar();
        System.out.println();

        AparelhoEletronico.Ligar();
        AparelhoEletronico.Atender();
        AparelhoEletronico.IniciarCorreioVoz();
        System.out.println();

        NavegadorNaInternet.Navegador();
        NavegadorNaInternet.AdicionarNovaAba();
        NavegadorNaInternet.AtualizarPagina();
        NavegadorNaInternet.ExibirPagina();
    }
}
