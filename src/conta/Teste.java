/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import java.util.Scanner;

/**
 *
 * @author PEAH
 */
public class Teste {

    private static float valor;

    public static void main(String[] args) {
        ContaPoupanca minhaConta = new ContaPoupanca();
        Scanner leitura = new Scanner(System.in);
        String nome;
        int num, op;
        float saldo, valor, lim;
        do {
            System.out.println("----- * Menu * > Conta Bancaria-----");
            System.out.println("1- Inserir dados:");
            System.out.println("2- Mostrar dados");
            System.out.println("3- Depositar valor");
            System.out.println("4- Sacar valor");
            System.out.println("5- Mostrar saldo");
            System.out.println("6- Mostrar redimento: ");
            System.out.println("0 - Sair ---------------------------");
           //leitura.nextLine();
            op = leitura.nextInt();
            switch (op) {

                case 1:
                    System.out.println("Entre com o nome:");
                    leitura = new Scanner(System.in);
                    nome = leitura.nextLine();

                    System.out.println("Entre com o Numero: ");
                    num = leitura.nextInt();

                    System.out.println("Entre com o saldo: ");
                    saldo = leitura.nextFloat();

                    System.out.println("Entre com o limite");
                    lim = leitura.nextFloat();

                    minhaConta.inseredados(nome, num, saldo, lim);

                    break;
                case 2:
                    minhaConta.mostrardado();
                    break;
                case 3:
                    System.out.println("Entre com o valor a ser depositado: ");
                    valor = leitura.nextFloat();
                    minhaConta.deposita(valor);
                    break;
                case 4:
                    minhaConta.mostrarsal();
                    System.out.println("Entre com o valor a ser sacado: ");
                    valor = leitura.nextFloat();
                    minhaConta.saca(valor);
                    break;
                case 5:
                    minhaConta.mostrarsal();
                    break;
                case 6:
                    System.out.println("Mostrar redimento: ");
                    minhaConta.calcularNovoSaldo();
                    minhaConta.mostrarsal();
                    break;
            }
        } while (op != 0);
    }

}
