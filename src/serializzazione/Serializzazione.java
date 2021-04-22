/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pogliani.mattia
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Thread t = new Thread(new Generatore());
        t.start();
        Studente[] arr = {new Studente(12, "Andrea", "Del Conte"),
            new Studente(13, "Veronica", "Spina"),
            new Studente(14, "suor", "Maricel")};

        try {
            FileOutputStream FO = new FileOutputStream("test.ser");
            ObjectOutputStream OS = new ObjectOutputStream(FO);
            OS.writeObject(arr);
            OS.flush();
            OS.close();
            FO.close();

            FileInputStream FI = new FileInputStream("test.ser");
            ObjectInputStream IS = new ObjectInputStream(FI);
            Studente[] arrayStudenti = (Studente[]) IS.readObject();
            for (Studente s : arrayStudenti) {
                System.out.println(s.toString());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Impossibile trovare il filr");
        } catch (IOException ex) {
            System.out.println("Hai rotto Java");
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
