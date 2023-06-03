/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmediaproject1;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;



/**
 *
 * @author macbookpro
 */
public class Functions {

    
    public static String readTxt() {
        String line;
        String data = "";
        
        
        JFileChooser fc= new JFileChooser();
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();

        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((line = br.readLine()) != null) {
                    if (!(line.isEmpty())) {
                        data += line + "\n";
                    }
                }
                br.close();
            }
            return data;
        } catch (Exception e) {
        }
        return data;
    }
    
    
    
    
    
  
}
