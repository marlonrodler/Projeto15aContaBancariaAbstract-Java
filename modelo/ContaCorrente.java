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
public class ContaCorrente extends ContaBancaria{
    private double taxaDeOperacao;

    public ContaCorrente() {
    }
    
    public ContaCorrente(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public double Sacar(double valor){
        this.saldo = (this.saldo - valor) - this.taxaDeOperacao;
        return this.saldo;
    }
    
    public double Depositar(double valor){
        this.saldo += valor - (this.taxaDeOperacao);
        return this.saldo;
    }
}
