/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class ContaPoupanca extends ContaBancaria{
    private double limite;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public double Sacar(double valor){
        this.saldo -= valor;
        if(this.saldo < 0){
            this.limite += this.saldo;
        }
        return this.saldo;
    }
    
    public double Depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }
}
