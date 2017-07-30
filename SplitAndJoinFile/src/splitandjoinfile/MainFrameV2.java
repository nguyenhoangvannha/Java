/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitandjoinfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MainFrameV2 extends javax.swing.JFrame {

    /**
     * Creates new form MainFrameV2
     */
    public MainFrameV2() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfChooseFile = new javax.swing.JTextField();
        btChooserOpen = new javax.swing.JButton();
        btOpen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfSaveTo = new javax.swing.JTextField();
        btChooserSave = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfCutBySize = new javax.swing.JTextField();
        cbSizeOption = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfCutByAmount = new javax.swing.JTextField();
        btCut = new javax.swing.JButton();
        btJoin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miNew = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        mAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Split And Join File V2");
        setLocation(new java.awt.Point(400, 70));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Choose File");

        tfChooseFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfChooseFileKeyReleased(evt);
            }
        });

        btChooserOpen.setText("...");
        btChooserOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChooserOpenActionPerformed(evt);
            }
        });

        btOpen.setText("Open");
        btOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenActionPerformed(evt);
            }
        });

        jLabel2.setText("Save To");

        tfSaveTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSaveToKeyReleased(evt);
            }
        });

        btChooserSave.setText("...");
        btChooserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChooserSaveActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfSaveTo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfChooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btChooserOpen)
                    .addComponent(btChooserSave))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChooserOpen)
                    .addComponent(btOpen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSaveTo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChooserSave)
                    .addComponent(btSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Cut by size");

        cbSizeOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "KB", "MB", "GB" }));

        jLabel4.setText("Cut by amount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfCutByAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(tfCutBySize, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSizeOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCutBySize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSizeOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCutByAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btCut.setText("Cut");
        btCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCutActionPerformed(evt);
            }
        });

        btJoin.setText("Join");

        taInfo.setColumns(20);
        taInfo.setRows(5);
        jScrollPane2.setViewportView(taInfo);

        mFile.setText("File");

        miOpen.setText("Open");
        mFile.add(miOpen);

        miSave.setText("Save");
        mFile.add(miSave);

        miNew.setText("New");
        mFile.add(miNew);
        mFile.add(jSeparator1);

        miExit.setText("Exit");
        mFile.add(miExit);

        jMenuBar2.add(mFile);

        mAbout.setText("About");
        jMenuBar2.add(mAbout);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btJoin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCut)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCut)
                    .addComponent(btJoin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String pathInput;
    private String pathOutput;
    private String fileInputExt;
    private File fileInput = null;
    private File fileOutput = null;
    private int amountFile;
    private final String outputExt = "Part"; 
    private void btChooserOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChooserOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Choose a file to open");
        int choose = chooser.showOpenDialog(null);
        if(choose == JFileChooser.APPROVE_OPTION){
            fileInput = chooser.getSelectedFile();
            tfChooseFile.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btChooserOpenActionPerformed

    private String getFileInfo(File fileObj){
        StringBuilder strB = new StringBuilder();
        if(!fileObj.exists()){
            strB.append("File does not exist.");
        }else{
            strB.append("Name: " + fileObj.getName() + "\nSize: " + (fileObj.length()/1024) + " (KB)");
            Date day = new Date(fileObj.lastModified());
            strB.append("\nPath: " + fileObj.getAbsolutePath() + "\nLast Modified: " + day);
        }
        return strB.toString();
    }
    
    private void btOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenActionPerformed
        // TODO add your handling code here:
        if(fileInput == null){
            fileInput = new File(pathInput);
            if(!fileInput.isFile() || !fileInput.exists()){
                JOptionPane.showMessageDialog(null, "File does not exist");
                btChooserOpen.requestFocus();
                fileInput = null;
                return;
            }
        } else {
            pathInput = fileInput.getAbsolutePath();
        }
        String arrStr[] = pathInput.split("\\.");
        fileInputExt = arrStr[arrStr.length - 1];
        
        tfChooseFile.setText(fileInput.getAbsolutePath());
        taInfo.setText(getFileInfo(fileInput) + "\nExtention: " + fileInputExt);
    }//GEN-LAST:event_btOpenActionPerformed

    private void cutFile(File fileIn, File fileOut, int amount){
        long sizeFileIn = fileIn.length();
        int sizeFileOut = (int)sizeFileIn / (amount - 1);
        int sizeFileOutLast = (int) sizeFileIn % (amount - 1);
        String subName = "";
        if(fileOut.isFile()){
            subName = fileOut.getName() + "." + fileInputExt;
        } else{
            subName = fileIn.getName();
        }
        
        
        try {
            RandomAccessFile accessFile = new RandomAccessFile(fileIn, "r");
            RandomAccessFile writeFile;
            byte b[] = new byte[sizeFileOut];
            for(int i = 0; i < (amount - 1); i++) {
                accessFile.read(b);
                writeFile = new RandomAccessFile(pathOutput + "\\" + subName + "." +   outputExt + (i + 1), "rw");
                writeFile.write(b);
            }
            accessFile.read(b);
            writeFile = new RandomAccessFile(pathOutput + "\\" + subName + "." +   outputExt + amount, "rw");
            writeFile.write(b, 0, sizeFileOutLast);
            
            accessFile.close();
            writeFile.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrameV2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrameV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    private void btCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCutActionPerformed
        // TODO add your handling code here:
        amountFile = 0;
        try{
            amountFile = Integer.parseInt(tfCutByAmount.getText());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please type a right amount subtract file");
            tfCutByAmount.requestFocus();
            return;
        }
        if(amountFile < 2){
            JOptionPane.showMessageDialog(null, "Amount have to >= 2");
        } else{
            cutFile(fileInput, fileOutput, amountFile);
        }
    }//GEN-LAST:event_btCutActionPerformed

    private void tfChooseFileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfChooseFileKeyReleased
        // TODO add your handling code here:
        pathInput =  tfChooseFile.getText();
    }//GEN-LAST:event_tfChooseFileKeyReleased

    private void tfSaveToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSaveToKeyReleased
        // TODO add your handling code here:
        pathOutput = tfSaveTo.getText();
    }//GEN-LAST:event_tfSaveToKeyReleased

    private void btChooserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChooserSaveActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save to");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int choose = chooser.showSaveDialog(null);
        if(choose == JFileChooser.APPROVE_OPTION){
            fileOutput = chooser.getSelectedFile();
            tfSaveTo.setText(fileOutput.getAbsolutePath());
        }
    }//GEN-LAST:event_btChooserSaveActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        if(fileOutput == null){
            fileOutput = new File(pathOutput);
            if(!fileOutput.exists()){
                JOptionPane.showMessageDialog(null, "Wrong directory to save");
                btChooserSave.requestFocus();
                return;
            }
        } 
        if(fileOutput.isFile()){
            pathOutput = fileOutput.getParent();
        } else{
            pathOutput = fileOutput.getAbsolutePath();
        }
        tfSaveTo.setText(fileOutput.getAbsolutePath());
        taInfo.setText(getFileInfo(fileOutput));
    }//GEN-LAST:event_btSaveActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChooserOpen;
    private javax.swing.JButton btChooserSave;
    private javax.swing.JButton btCut;
    private javax.swing.JButton btJoin;
    private javax.swing.JButton btOpen;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbSizeOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mAbout;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTextField tfChooseFile;
    private javax.swing.JTextField tfCutByAmount;
    private javax.swing.JTextField tfCutBySize;
    private javax.swing.JTextField tfSaveTo;
    // End of variables declaration//GEN-END:variables
}
