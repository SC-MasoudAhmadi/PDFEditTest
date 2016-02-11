/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfedittest;
import java.io.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.util.*;

/**
 *
 * @author Administrator
 */
public class PDFEditTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PDDocument pd;
        BufferedWriter wr;
        try {
                File input = new File("C:\\Users\\Administrator\\Desktop\\FA Feb 16.pdf");  // The PDF file from where you would like to extract
                File output = new File("C:\\Users\\Administrator\\Desktop\\rayani.txt"); // The text file where you are going to store the extracted data
                pd = PDDocument.load(input);
                System.out.println(pd.getNumberOfPages());
                System.out.println(pd.isEncrypted());
                //pd.save("CopyOfInvoice.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
                PDFTextStripper stripper = new PDFTextStripper();
                //stripper.setStartPage(3); //Start extracting from page 3
                //stripper.setEndPage(5); //Extract till page 5
                
                //stripper.set
                wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
                stripper.writeText(pd, wr);
                if (pd != null) {
                    pd.close();
                }
               // I use close() to flush the stream.
               wr.close();
        } catch (Exception e){
                e.printStackTrace();
               } 
     
    }
    
}
