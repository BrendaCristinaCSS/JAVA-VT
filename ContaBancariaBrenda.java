package AtividadesJavaVenturus;

class Conta {
    String NumerodaAgencia;
    String NumerodaContaCorrente;
    String Titular;
    double Saldo;    
    double LimitedeSaque;
   
        public void imprimirInformacoes() {
        System.out.println("Numero da Agencia: " + NumerodaAgencia);
        System.out.println("Numero da Conta Corrente: " + NumerodaContaCorrente);
        System.out.println("Titular: " + Titular);
        
    }

        public String getNumerodaAgencia() {
            return NumerodaAgencia;
        }

        public void setNumerodaAgencia(String numerodaAgencia) {
            NumerodaAgencia = numerodaAgencia;
        }

        public String getNumerodaContaCorrente() {
            return NumerodaContaCorrente;
        }

        public void setNumerodaContaCorrente(String numerodaContaCorrente) {
            NumerodaContaCorrente = numerodaContaCorrente;
        }

        public String getTitular() {
            return Titular;
        }

        public void setTitular(String titular) {
            Titular = titular;
        }

        public double getSaldo() {
            return Saldo;
        }

        public void setSaldo(double saldo) {
            Saldo = saldo;
        }

        public double getLimitedeSaque() {
            return LimitedeSaque;
        }

        public void setLimitedeSaque(double limitedeSaque) {
            LimitedeSaque = limitedeSaque;
        }

}

public class ContaBancariaBrenda {

        public static void main(String[] args) {

        Conta meuBancoBancaria = new Conta();
        meuBancoBancaria.Titular = "Brenda C S Silva";
        meuBancoBancaria.NumerodaAgencia = "4839-0";
        meuBancoBancaria.NumerodaContaCorrente = "9876648-4";

        double Saldo = 5983579.99d;

        double LimitedeSaque = 3000.00d;
        

        System.out.println("Valor do Saldo = R$"+Saldo);
        System.out.println("Valor do Limite de Saque = R$"+LimitedeSaque);


        meuBancoBancaria.imprimirInformacoes();
        }
}
