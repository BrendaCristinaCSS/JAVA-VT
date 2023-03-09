package AtividadesJavaVenturus;

public class candidato {
    String nomeCandidato;
    String vaga;
    int presentasaoSalarial;
    boolean selecionado;

    void status(){
        System.out.println("Nome do candidato: "+this.nomeCandidato);
        System.out.println("A vaga e: "+this.vaga);
        System.out.println("A presentasao salarial e: R$"+this.presentasaoSalarial+",00 e mais os beneficios.");
        System.out.println("Selecionado: "+this.selecionado);
    }
    void selecionado() {
        if ( selecionado == true) {
            System.out.println("Parabens, voce foi selecionado, que alegria!!");
        } else {
            System.out.println("Nao fique desanimado, tera nova oportunidade para proxima, por isso nao foi selecionado, muito obrigado pela sua dedicacao.");
        }
    }
    public static void main(String[] args) {
        candidato c1 = new candidato();
        c1.nomeCandidato = "Brenda Cristina";
        c1.vaga = "Developer JAVA Junior";
        c1.presentasaoSalarial = 4200;
        c1.selecionado = true;
        c1.selecionado ();
        c1.status ();

        candidato c2 = new candidato();
        c2.nomeCandidato = "Guido";
        c2.vaga = "Developer Front-end";
        c2.presentasaoSalarial = 4100;
        c2.selecionado = false;
        c2.selecionado ();
        c2.status ();

        System.out.println(" ");
        
    }
}
