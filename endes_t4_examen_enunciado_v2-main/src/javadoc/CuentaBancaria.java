package javadoc;

/**
 * Programa sobre cuenta bancaria
 * @author David Fraga Dominguez
 * @version 1.0
 * @since 2024/03/12
 */
public class CuentaBancaria {
    /**
     * Declaracion variable String sobre el numero de cuenta
     */
    private String numeroCuenta;
    /**
     * Declaracion variable double saldo de la cuenta
     */
    private double saldo;
    /**
     * Declaracion de Cliente como propietario de la cuenta
     */
    private Cliente propietario;

    /**
     * Metodo cuenta bancaria compuesto por String numeroCuenta, double Saldo y el cliente propietario
     * @param numeroCuenta
     * @param saldo
     * @param propietario
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * Obtencion del numero de cuenta del cliente
     * @return
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Establecemos el numero de cuenta del cliente
     * @param numeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Obtencion del saldo del cliente
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establecemos el saldo del cliente
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtencion del propietario de la cuenta
     * @return
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Establecemos el propietario de la cuenta
     * @param propietario
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Metodo depositar con cantidad variable de tipo double
     * @param cantidad
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Metodo retirar con condicion boolean
     * @param cantidad
     * @return
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Devolucion de datos sobre la cuenta bancaria del cliente
     * @return
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}
