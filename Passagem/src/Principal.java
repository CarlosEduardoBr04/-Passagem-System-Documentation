/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author convidado_
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Passagem passagem = new Passagem();
         
         passagem.CadastrarPassageiro();
         passagem.MostrarDadosPassageiro();
         
         passagem.CadastrarPassagem();
         passagem.MostrarPassagem();
    }
    
}
