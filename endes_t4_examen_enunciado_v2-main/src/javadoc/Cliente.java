package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Programa sobre clientes de una cuenta bancaria
 * @author David Fraga Dominguez
 * @version 1.0
 * @since 2024/03/12
 */
public class Cliente {
    /**
     * Declaracion de tres variables Strings nombre, apellido e id del cliente
     */
    private String nombre,apellido, id;

    /**
     * Listado cuenta bancaria
     */
    private List<CuentaBancaria> cuentas;

    /**
     * Metodo cliente el cual esta compuesto por el nombre, apellido y el id
     * @param nombre
     * @param apellido
     * @param id
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Obtencion de el nombre del cliente
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecemos el nombre del cliente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtencion del apellido del cliente
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establecemos el apellido del cliente
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtenemos el id del cliente
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Establecemos el id del cliente
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Listar cuentas bancarias
     * @return
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Añadir cuentas bancarias
     * @param cuenta
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Cerrar cuentas bancarias con condicion
     * @param numeroCuenta
     * @return
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Devolucion de los datos de clientes
     * @return
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
