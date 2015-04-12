/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pixecpicker;

import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author daniar heri
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    public static final int FRAME_WIDTH = 1350;
    public static final int FRAME_HEIGHT = 750;
    public static BufferedImage Image = null;
    
    public static JPanel BasePanel = new JPanel();
    public ProcessingPanel ProcessPane = new ProcessingPanel("img/png/BGDepan2.png");
    
    
    public MainFrame() {
        super("ImageProcessingApps");        
        
        BasePanel.setLayout(new CardLayout());
        BasePanel.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        initComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        BasePanel.add(ProcessPane,"Process");
        add(BasePanel);
        setVisible(true);
    }

    public static void SetNewPanel(String PanelName){
        CardLayout cardLayout = (CardLayout)BasePanel.getLayout();
        cardLayout.show(BasePanel, PanelName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1126, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
