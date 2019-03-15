/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author PEAH
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
    private int Numero;
    public int op;
    private String Dono;
    double Saldo;
    private double Limite = 0;

    public Conta() {
        this.Numero = 0;
        this.Dono = " ";
        this.Saldo = 0;

    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public double getLimite() {
      
        return Limite;
    }

    public void setLimite(double Limite) {
        this.Limite = Limite;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    boolean saca(double quantidade) {
        if (this.Saldo < quantidade) {
            return false;
        } else {
            this.Saldo = this.Saldo - quantidade;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.Saldo = this.Saldo + quantidade;
    }

    void inseredados(String a, int b, float c, float l) {
        this.Dono = a;
        this.Numero = b;
        this.Saldo = c;

    }

    void mostrardado() {
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Numero da Conta: " + this.getNumero());
        System.out.println("Saldo atual: " + this.getSaldo());
    }

    void mostrarsal() {
        System.out.println("Saldo Atual: " + this.getSaldo());

    }

}
