package src;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtracto() {
        System.out.println("- Extracto Cuenta Corriente -");
        imprimirInfoComun();
    }
}

