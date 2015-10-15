/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg3;

/**
 *
 * @author guise
 */
public class KATA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> histo= new Histogram<String>();
        
        histo.incrementa("gmail.com");
        histo.incrementa("gmail.com");
        histo.incrementa("gmail.com");
        histo.incrementa("gmail.com");
        histo.incrementa("gmail.com");
        histo.incrementa("gmail.com");
        histo.incrementa("gmail.com");
        histo.incrementa("gmail.com");
        
        
        histo.incrementa("ulpgc.es");
        histo.incrementa("ulpgc.es");
        histo.incrementa("ulpgc.es");
        histo.incrementa("ulpgc.es");
        histo.incrementa("ulpgc.es");
        histo.incrementa("ulpgc.es");
        histo.incrementa("ulpgc.es");

        histo.incrementa("hotmail.es");
        histo.incrementa("hotmail.es");
        histo.incrementa("hotmail.es");
        histo.incrementa("hotmail.es");
        histo.incrementa("hotmail.es");

        
        HistogramDisplay histo1 = new HistogramDisplay(histo);
        histo1.execute();
        
    }
    
}
