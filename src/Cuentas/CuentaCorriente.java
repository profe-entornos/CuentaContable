/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author Sandra
 */
public class CuentaCorriente {

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    private String usuario;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String usuario, String numeroCuenta, double saldo, double tipoInteres) {
        this.usuario = usuario;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }
    
    public double estado(){
        return getSaldo();
    }
    
    public void retirar(double cantidad) throws Exception {
        if((cantidad)<0){
            throw new Exception ("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad){
            throw new Exception ("No hay suficiente saldo");
        }
    }
    
    public void ingresar(double cantidad) throws Exception {
        if((cantidad)<0){
            throw new Exception ("No se puede ingresar una cantidad negativa");
        }
        
        setSaldo(getSaldo() + cantidad);
    }
}
