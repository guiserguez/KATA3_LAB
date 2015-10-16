/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg3;

import java.io.BufferedReader;
import java.io.FileReader;

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
        String name ="/home/guise/Escritorio/emailsfilev1.txt";
        try{
            BufferedReader fileIn = new BufferedReader(new FileReader(name));
            String mail;
            
            while((mail= fileIn.readLine())!= null){
                if(mail.contains("@")){
                    histo.incrementa(mail.split("@")[1]);
                }
            }
        }catch(Exception e){
            
        }
                
                
        HistogramDisplay histo1 = new HistogramDisplay(histo);
        histo1.execute();
        
    }
    
}
