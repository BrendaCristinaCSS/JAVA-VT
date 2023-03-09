package AtividadesJavaVenturus;

public class carro {
    String marca;
    String modelo;
    String cor;
    int anoFabricacao;
    int velocidadeAtual;

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void frear() {
        velocidadeAtual -= 10;
    }

    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public static void main(String[] args) {
        carro bestCar = new carro();
        bestCar.marca = ("Toyota");
        bestCar.modelo = ("Camry");
        bestCar.cor = ("Perola");
        bestCar.anoFabricacao = 2023;

    
        bestCar.acelerar();
        bestCar.acelerar();
        bestCar.frear();

        bestCar.imprimirInformacoes();

    }
}


