package src;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nombre;
    private List<Cuenta> cuentas = new ArrayList<>();

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
}
