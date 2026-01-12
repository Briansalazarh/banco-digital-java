package src;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtracto() {
        System.out.println("- Extracto Cuenta Ahorro -");
        imprimirInfoComun();
    }
}
