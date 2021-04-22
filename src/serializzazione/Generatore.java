/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pogliani.mattia
 */
public class Generatore implements Runnable {

    @Override
    public void run() {
        while (true) {
            Studente s = new Studente(gen_NumeroRegistro(), gen_Nome(), gen_Cognome());
            System.out.println(s.toString());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Generatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public int gen_NumeroRegistro() {
        return (int) (Math.random() * 31) + 1;
    }

    public String gen_Nome() {
        String[] nomi = new String[]{"Genoveffa", "Alfredo", "Adelaide", "Ermenegildo", "Fidenzia", "Gennarino"};
        return nomi[(int) (Math.random() * 5)];
    }

    public String gen_Cognome() {
        String[] nomi = new String[]{"Rossi", "Bianchi", "Verdi", "Gialli", "Blu", "Lilla"};
        return nomi[(int) (Math.random() * 5)];
    }

}
