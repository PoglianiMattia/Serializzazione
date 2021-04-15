/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

/**
 *
 * @author pogliani.mattia
 */
public class Studente {
    private int numeroRegistro;
    private String nome;
    private String cognome;

    public Studente(int numeroRegistro, String nome, String cognome) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.cognome = cognome;
    }
    
}
