/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author paulo
 */
public class TesteEstudante {
    public static void main(String[] args) {
        // criação e instância da classe Estudante
        Estudante estudante = new Estudante();
        
        //construção do objeto
        estudante.setNome("Paulão da Massa");
        estudante.setRa(123456);
        
        //apresentando o estudante
        System.out.println("\n\t\t\t --- Estudante ---\n");
        estudante.apresentarEstudante();

        //outro estudante
        Estudante outroEstudante = new Estudante ("Débora",123458);
        
        //apresentando outro estudante
        System.out.println("\n\t\t\t --- Outro Estudante ---\n");
        outroEstudante.apresentarEstudante();
        
        // Criação e instância do objeto EstudanteInfo
        EstudanteInfo estudanteinfo = new EstudanteInfo();
        
        //construção do objeto EstudanteInfo
        estudanteinfo.setNome("Paulety Fortalece");
        estudanteinfo.setRa(123457);
        estudanteinfo.setInfoBasico(100);
        estudanteinfo.setLogica('B');
        
        //imprimindo o objeto Estudante Info
        System.out.println("\n\t\t\t --- Estudante Info ---\n  ");
        estudanteinfo.apresentarEstudante();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
