package src;

public class Main {

    public static void main(String[] args) {

        Cliente brian = new Cliente("Brian");

        Cuenta cc = new CuentaCorriente(brian);
        Cuenta ca = new CuentaAhorro(brian);

        cc.depositar(1000);
        cc.transferir(300, ca);

        cc.imprimirExtracto();
        ca.imprimirExtracto();
    }
}
