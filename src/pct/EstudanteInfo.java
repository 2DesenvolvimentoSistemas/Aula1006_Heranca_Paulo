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
public class EstudanteInfo extends Estudante {
    //atributos
    private double infoBasico;
    private char logica; //('B','R','I')
    
    //metodos
    public void atribuirNota() {
        System.out.println("Info Básico: " + this.getInfoBasico());
        System.out.println("Logica: " + this.getLogica());
    }

    /**
     * @return the infoBasico
     */
    public double getInfoBasico() {
        return infoBasico;
    }

    /**
     * @param infoBasico the infoBasico to set
     */
    public void setInfoBasico(double infoBasico) {
        this.infoBasico = infoBasico;
    }

    /**
     * @return the logica
     */
    public char getLogica() {
        return logica;
    }

    /**
     * @param logica the logica to set
     */
    public void setLogica(char logica) {
        this.logica = logica;
    }

    public EstudanteInfo(double infoBasico, char logica) {
        this.infoBasico = infoBasico;
        this.logica = logica;
    }

    public EstudanteInfo() {
    }

    @Override
    public void apresentarEstudante(){
        super.apresentarEstudante();
        this.atribuirNota();
    }
    
}
