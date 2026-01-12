package src;

public interface ICuenta {

    void sacar(double monto);

    void depositar(double monto);

    void transferir(double monto, Cuenta cuentaDestino);

    void imprimirExtracto();
}

