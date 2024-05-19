public class Caixa {
    public static void main(String[] args) throws Exception {
        double saldo = 30.0;
        double valorSolicitado = 35.0;

        if ( valorSolicitado < saldo){

        saldo = saldo - valorSolicitado;
        System.out.println ("Novo Saldo " + saldo);

        }else

        System.out.println("Saldo insufienciente");



    }
}
