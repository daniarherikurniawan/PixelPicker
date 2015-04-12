/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pixecpicker;

import static pixecpicker.ProcessingPanel.CaseMemanjang;
import static pixecpicker.ProcessingPanel.heightImage;
import static pixecpicker.ProcessingPanel.pathImage;
import static pixecpicker.ProcessingPanel.widthImage;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author daniar heri
 */
public class ImageRepresentation {
    ImagePixel Pixel[][] = new ImagePixel[ProcessingPanel.widthImage][ProcessingPanel.heightImage];
    
    public BufferedImage CurrentImage = null;
    public Vector<UndoClass> UndoImage = new Vector<UndoClass>();
    
    int CurrentPackInt = -1;
    int CurrentArea = 0;
    
    public ImageRepresentation(){
//        try {
//            float h, w;
//            if (!CaseMemanjang){
//                h = OriginalImageLabel.getHeight();
//                w =(float) OriginalImageLabel.getHeight()/MainFrame.Image.getHeight()*MainFrame.Image.getWidth();
//            }else{
//                h = (float) OriginalImageLabel.getWidth()/MainFrame.Image.getWidth()*MainFrame.Image.getHeight();
//                w =OriginalImageLabel.getWidth();
//            }   
//            CurrentImage =ImageIO.read(new File(ProcessingPanel.pathImage));
//            CurrentImage = ProcessingPanel.resize(CurrentImage,(int)w,(int) h);
//        } catch (IOException ex) {
//            Logger.getLogger(ImageRepresentation.class.getName()).log(Level.SEVERE, null, ex);
//            //JOptionPane.showMessageDialog(ProcessingPanel, "Soory! Image can not be loaded.", "Input error", JOptionPane.ERROR_MESSAGE);
//        }
        
        for(int i = 0 ; i < heightImage ; i ++){
            for(int j = 0 ; j < widthImage ; j++){
                //System.out.println(i+" f "+j);
                Pixel[j][i] = new ImagePixel(j,i);
            }
        }
       // System.out.println(widthImage+"  ini lebar");
    }
    
    
}
