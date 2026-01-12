package src;

public abstract class Cuenta implements ICuenta {

    protected static int secuencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected static final int AGENCIA_DEFAULT = 1;

    public Cuenta(Cliente cliente) {
        this.agencia = AGENCIA_DEFAULT;
        this.numero = secuencial++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double monto) {
        saldo -= monto;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void transferir(double monto, Cuenta cuentaDestino) {
        this.sacar(monto);
        cuentaDestino.depositar(monto);
    }

    protected void imprimirInfoComun() {
        System.out.println("Titular: " + cliente.getNombre());
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
