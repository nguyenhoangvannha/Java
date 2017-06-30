/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.nhvn.dragdrop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FileChooserDemo extends javax.swing.JFrame {

    private static final int FILE_OPEN = 1;
    private static final int FILE_SAVE = 2;
    boolean change = false;
    /**
     * Creates new form FileChooserDemo
     */
    public FileChooserDemo() {
        this.setTitle("Text editor");
        setLocation(300,100);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        taFile = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miWrapWord = new javax.swing.JCheckBoxMenuItem();
        miWrapLine = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taFile.setColumns(20);
        taFile.setLineWrap(true);
        taFile.setRows(5);
        taFile.setTabSize(4);
        taFile.setToolTipText("");
        taFile.setWrapStyleWord(true);
        taFile.setDragEnabled(true);
        taFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taFileKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taFile);

        jMenu1.setText("File");

        miNew.setText("New");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        jMenu1.add(miNew);

        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        jMenu1.add(miOpen);

        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        miWrapWord.setSelected(true);
        miWrapWord.setLabel("Wrap word");
        miWrapWord.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                miWrapWordItemStateChanged(evt);
            }
        });
        jMenu2.add(miWrapWord);

        miWrapLine.setSelected(true);
        miWrapLine.setText("Wrap line");
        miWrapLine.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                miWrapLineItemStateChanged(evt);
            }
        });
        jMenu2.add(miWrapLine);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Updating");
        if(change == true){
            int result = JOptionPane.showConfirmDialog(null, "Do you want to save this file changed.");
            if(result == JOptionPane.YES_OPTION){
                operateFile("Save a file", FILE_SAVE);
            }
        }
        this.setTitle("Text editor");
        taFile.setText("");
        taFile.requestFocus();
        change = false;
    }//GEN-LAST:event_miNewActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Updating");
        operateFile("Open a file", FILE_OPEN);
    }//GEN-LAST:event_miOpenActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Updating");
        operateFile("Save file", FILE_SAVE);
    }//GEN-LAST:event_miSaveActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void taFileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taFileKeyTyped
        // TODO add your handling code here:
        change = true;
    }//GEN-LAST:event_taFileKeyTyped

    private void miWrapWordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_miWrapWordItemStateChanged
        // TODO add your handling code here:
        taFile.setWrapStyleWord(miWrapWord.isSelected());
        taFile.setText(taFile.getText());
    }//GEN-LAST:event_miWrapWordItemStateChanged

    private void miWrapLineItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_miWrapLineItemStateChanged
        // TODO add your handling code here:
        taFile.setLineWrap(miWrapLine.isSelected());
        taFile.setText(taFile.getText());
    }//GEN-LAST:event_miWrapLineItemStateChanged

    private void operateFile(String title, int type){
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle(title);
        int chose = -1;
        switch(type)
        {
            case FILE_OPEN:
                chose = chooser.showOpenDialog(null);
                break;
            case FILE_SAVE:
                chose = chooser.showSaveDialog(null);   
                break;
        }
        if(chose == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            switch(type)
            {
                case FILE_OPEN:
                    readFile(file);
                    this.setTitle("Text editor - " + file.getName());
                    break;
                case FILE_SAVE:
                    int result = JOptionPane.showConfirmDialog(null, "Do you want to save file.");
                    if(result == JOptionPane.YES_OPTION){
                        writeFile(file);
                        this.setTitle("Text editor - " + file.getName());
                    }
                    break;
            }
        }
    }
    private void readFile(File file){
        try {
            taFile.setText("");
            taFile.requestFocus();
            FileReader  fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            try {
                while((line = br.readLine())!= null){
                    taFile.append(line + '\n');
                }
            } catch (IOException ex) {
                Logger.getLogger(FileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(FileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error to open file: " + ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    private void writeFile(File file){
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            String data = taFile.getText();
            bw.write(data);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error save file: " + ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChooserDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JCheckBoxMenuItem miWrapLine;
    private javax.swing.JCheckBoxMenuItem miWrapWord;
    private javax.swing.JTextArea taFile;
    // End of variables declaration//GEN-END:variables
}