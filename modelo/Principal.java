/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int op, opc;
        double valor, calc;
        
        ContaCorrente objContaC = new ContaCorrente();
        objContaC.setnConta(1);
        objContaC.setSaldo(1500);
        objContaC.setTaxaDeOperacao(5);
        
        ContaPoupanca objContaP = new ContaPoupanca();
        objContaP.setnConta(2);
        objContaP.setSaldo(2000);
        objContaP.setLimite(500);
        
        
        do{
            System.out.println("Digite qual conta deseja realizar as operações: Corrente(1) - Poupança(2) - Sair(3)");
            System.out.println("Digite sua opção: ");
            opc = entrada.nextInt();

            if(opc == objContaC.getnConta()){
                System.out.println("\nEntrou como Conta Corrente!");
                System.out.println("\nConta: "+objContaC.getnConta()+"\nSaldo: R$"+objContaC.getSaldo()+"\nTaxa : R$"+objContaC.getTaxaDeOperacao());

                System.out.println("\n\nQual operação deseja fazer: Sacar(1) - Depositar(2)");
                System.out.println("Digite sua opção: ");
                op = entrada.nextInt();
                switch (op) {
                case 1:
                    System.out.println("Infº o valor de saque: ");
                    valor = entrada.nextDouble();
                    if (valor <= objContaC.getSaldo()) {
                        objContaC.Sacar(valor);
                        System.out.println("Foi cobrado uma taxa de operação de: R$"+objContaC.getTaxaDeOperacao());
                        System.out.println("Saldo restante: " + objContaC.getSaldo());
                    }else {
                        System.out.println("Saldo indisponivel!");
                    }
                    break;

                case 2:
                    System.out.println("Infº o valor de depositar: ");
                    valor = entrada.nextDouble();
                    objContaC.Depositar(valor);
                    System.out.println("Foi cobrado uma taxa de operação de: R$"+objContaC.getTaxaDeOperacao());
                    System.out.println("Novo saldo: " + objContaC.getSaldo());
                    break;
                }
            }else if(opc == 2){
                System.out.println("\nEntrou como Conta Poupança!");
                System.out.println("\nConta : "+objContaP.getnConta()+"\nSaldo : R$"+objContaP.getSaldo()+"\nLimite: R$"+objContaP.getLimite());

                System.out.println("\n\nQual operação deseja fazer: Sacar(1) - Depositar(2)");
                System.out.println("Digite sua opção: ");
                op = entrada.nextInt();
                switch (op) {
                case 1:
                    System.out.println("Infº o valor de saque: ");
                    valor = entrada.nextDouble();
                    if(valor <= objContaP.getSaldo() + objContaP.getLimite()){

                        System.out.println("Saldo: "+ objContaP.Sacar(valor));
                        System.out.println("Limite: "+objContaP.getLimite());
                    }else{
                        System.out.println("Ultrapassou o limite!");
                    }
                    break;

                case 2:
                    System.out.println("Infº o valor de depositar: ");
                    valor = entrada.nextDouble();
                    objContaP.Depositar(valor);
                    System.out.println("Novo saldo: " + objContaP.getSaldo());
                    break;
                }
            }else{
                System.out.println("Volte sempre!");
                System.out.println("Banking Rodler's Agradece!");
            }
            System.out.println("\n\n ----------------------------------------------------------------------------------\n\n");
        }while(opc != 3);
        
        
        
        
    }
    
}
