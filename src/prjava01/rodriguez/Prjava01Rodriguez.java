/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjava01.rodriguez;

import java.awt.Desktop;
import java.io.*;
/**
 *
 * @author ubu64
 */
public class Prjava01Rodriguez {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {

        File f = new File("prj01-Rodriguez.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write(" <head>");bw.newLine();
            bw.write(" <title>");bw.newLine();
            bw.write(" Nova p&agrave;gina web de Daniel Rodriguez");bw.newLine();
            bw.write(" </title>");bw.newLine();
            bw.write(" </head>");bw.newLine();
            bw.write(" <body>");bw.newLine();
            bw.write(" Nova p&agrave;gina web de Daniel Rodriguez");bw.newLine();
            bw.write(" DAW2 UF4 pr&agrave;ctica 2");bw.newLine();
            bw.write(" </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();

        }  
    }
}
