package AtividadesJavaVenturus;

public class caneta {
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;
    int valor;

    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tamanho da ponta: "+this.ponta);
        System.out.println("% da carga: "+this.carga);
        System.out.println("Esta tampada: "+this.tampada);
        System.out.println("O valor de uma caneta e: R$ "+this.valor+",00");

    }
    void rabiscar() {
        if ( tampada == true) {
            System.out.println("Sinto muito!!! Nao posso rabiscar. ");
        } else {
            System.out.println("Estou rabiscando!!");
        }
    }
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "Azul";
        c1.modelo = "Montblanc";
        c1.carga = 90;
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.valor = 3240;
        c1.rabiscar ();
        c1.status ();

        System.out.println(" ");
        
    }
}