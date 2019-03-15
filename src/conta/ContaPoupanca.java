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
public class ContaPoupanca extends Conta {
    
    double diaRendimento = 0.1;
    double aux;
    public ContaPoupanca(){
    
    }
    public void calcularNovoSaldo(){
        System.out.println("Saldo Atual: " + this.getSaldo());
        aux = super.getSaldo()*diaRendimento+super.getSaldo();
        super.setSaldo(aux); 
        System.out.println("Saldo com redimento: " + this.getSaldo());
    }
    
    
}
