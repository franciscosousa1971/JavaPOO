/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

/**
 *
 * @author seduc
 */
public class JavaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
        System.out.println("n/");
        
        Cliente francisco = new Cliente();
        francisco.setNome("Francisco");

        Conta cc1 = new ContaCorrente(francisco);
        Conta poupanca1 = new ContaPoupanca(francisco);

        cc1.depositar(300);
        cc1.transferir(200, poupanca1);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();
        
                       
    }

}
