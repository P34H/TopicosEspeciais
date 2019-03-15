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
public class ContaEspecial extends Conta {
    
    double limite = super.getLimite();
    
    public void ContaEspecial(){
    
    }
    
    boolean saca(double quantidade) {
        
        if (this.Saldo < limite) {
            
            return false;
        } else {
            this.Saldo = this.Saldo - quantidade;
            return true;
        }
    }
    
}
