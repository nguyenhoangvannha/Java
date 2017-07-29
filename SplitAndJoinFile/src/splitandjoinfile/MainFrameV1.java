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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MainFrameV1 extends javax.swing.JFrame {

    private String strOpenPath;
    private String strSavePath;
    private String strOpenFileName;
    private String strOpenFileExt = "";
    private File file;
    private JFileChooser chooser = new JFileChooser();
    private int numberOfFile;
    
    
    /**
     * Creates new form MainFrame
     */
    public MainFrameV1() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrameV1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        tfOpen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btOpen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfSave = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btChooserSave = new javax.swing.JButton();
        btChooserOpen = new javax.swing.JButton();
        btCut = new javax.swing.JButton();
        btJoin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();
        btSize = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miNew = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Split And Join File V1");
        setLocation(new java.awt.Point(300, 90));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfOpen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOpenKeyReleased(evt);
            }
        });

        jLabel1.setText("Open File");

        btOpen.setText("Open");
        btOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenActionPerformed(evt);
            }
        });

        jLabel2.setText("Save to");

        tfSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSaveKeyReleased(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btChooserSave.setText("...");
        btChooserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChooserSaveActionPerformed(evt);
            }
        });

        btChooserOpen.setText("...");
        btChooserOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChooserOpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSave, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btChooserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChooserOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btOpen)
                    .addComponent(btChooserOpen))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave)
                    .addComponent(btChooserSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCut.setText("Cut");
        btCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCutActionPerformed(evt);
            }
        });

        btJoin.setText("Join");
        btJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJoinActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Elements by Size");

        btSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "KB", "MB", "GB" }));

        jLabel4.setText("Number elements");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(tfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        taInfo.setColumns(20);
        taInfo.setRows(5);
        jScrollPane1.setViewportView(taInfo);

        menuFile.setText("File");

        miOpen.setText("Open");
        menuFile.add(miOpen);

        miSave.setText("Save");
        menuFile.add(miSave);

        miNew.setText("New");
        menuFile.add(miNew);
        menuFile.add(jSeparator1);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        menuFile.add(miExit);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");
        jMenuBar1.add(menuEdit);

        menuAbout.setText("About");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btJoin))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCut)
                    .addComponent(btJoin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String getFileInfo(File file){
        if(!file.exists()){
                return "File does not exist";
        } else{
            Date day = new Date(file.lastModified());
            return "Name: " + file.getName() +"\nPath: " + file.getPath() + "\nLast Modified: " + day + "\nFree space: " + (file.getFreeSpace()/(1024*1024) + " MB");
        }
    }
    
    private String getExtFile(String sourcePath){
        String arrStr[] = sourcePath.split("\\.");
        
        return arrStr[arrStr.length - 1];
    }
    
    private void btOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenActionPerformed
        // TODO add your handling code here:
        if(strOpenPath == null){
            JOptionPane.showMessageDialog(null, "Please select a file first.", "Error", JOptionPane.ERROR_MESSAGE);
            btChooserOpen.requestFocus();
        } else{
            file = new File(strOpenPath);
            if(!file.exists() || file.isDirectory()){
                JOptionPane.showMessageDialog(null, "File does not exist");
                strOpenPath = null;
                btChooserOpen.requestFocus();
                return;
            } else{
                strSavePath = file.getParent();
                strOpenFileName = file.getName();
                
                strOpenFileExt = getExtFile(strOpenFileName);
                
                tfSave.setText(strSavePath);
                taInfo.setText(getFileInfo(file) + "\nOpen file name: " + strOpenFileName + "\nExtention: " + strOpenFileExt);
            }
        }
    }//GEN-LAST:event_btOpenActionPerformed

    private void btChooserOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChooserOpenActionPerformed
        // TODO add your handling code here:
        chooser = new JFileChooser();
        chooser.setDialogTitle("Choose a file to open");
        int result = chooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            tfOpen.setText("");
            strOpenPath = chooser.getSelectedFile().getAbsolutePath();
            tfOpen.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btChooserOpenActionPerformed

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Composer: Nguyen Hoang Van Nha\nHCMUS - 1512363\n(^.^)", "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuAboutMouseClicked

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void tfOpenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOpenKeyReleased
        // TODO add your handling code here:
        strOpenPath = tfOpen.getText();
    }//GEN-LAST:event_tfOpenKeyReleased

    private void tfSaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSaveKeyReleased
        // TODO add your handling code here:
        strSavePath = tfSave.getText();
    }//GEN-LAST:event_tfSaveKeyReleased

    private void btChooserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChooserSaveActionPerformed
        // TODO add your handling code here:
        chooser = new JFileChooser();
        chooser.setDialogTitle("Save to");
        int result = chooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            strOpenFileName = chooser.getSelectedFile().getName() +  "." + strOpenFileExt;
            strSavePath = chooser.getSelectedFile().getParent();
            tfSave.setText(strSavePath);
        }
    }//GEN-LAST:event_btChooserSaveActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        if(strSavePath == null){
            JOptionPane.showMessageDialog(null, "Please select a path to save file.", "Error", JOptionPane.ERROR_MESSAGE);
            btChooserSave.requestFocus();
        } else {
            file = new File(strSavePath);
            if(!file.exists() || file.isFile()){
                JOptionPane.showMessageDialog(null, "Folder does not exist");
                strSavePath = null;
                btChooserSave.requestFocus();
                return;
            } else{
               taInfo.setText(getFileInfo(file) + "\n" + strOpenFileName);
            }
        }
    }//GEN-LAST:event_btSaveActionPerformed
    
    private void cutFile(String strSourceFilePath, String strSourceFileName, String strSavePath, int numberOfFile){
        try {
            RandomAccessFile srcFile = new RandomAccessFile(strSourceFilePath, "r");
            long sizeSrcFile = srcFile.length(); // byte
            int sizeOneFile = (int)sizeSrcFile / (numberOfFile - 1);
            int sizeLastFile = (int)sizeSrcFile % (numberOfFile - 1);
            
            byte b[] = new byte[sizeOneFile];
            for(int i =0; i < numberOfFile - 1; i++){
                srcFile.read(b, 0, sizeOneFile);
                RandomAccessFile outFile = new RandomAccessFile(strSavePath + "\\" + strSourceFileName + ".part" + (i + 1), "rw");
                System.out.println(strSavePath + strSourceFileName + ".part" + (i + 1));
                outFile.write(b);
                outFile.close();
            }
            srcFile.read(b, 0, sizeLastFile);
            RandomAccessFile outFile = new RandomAccessFile(strSavePath + "\\" + strSourceFileName + ".part" + numberOfFile, "rw");
            System.out.println(strSavePath + "\\" + strSourceFileName + ".part" + numberOfFile);
            outFile.write(b, 0, sizeLastFile);
            outFile.close();
            srcFile.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrameV1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrameV1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void btCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCutActionPerformed
        // TODO add your handling code here:
        if(strOpenFileName == null){
            JOptionPane.showMessageDialog(null, "Please choose a file to cut");
            btOpen.requestFocus();
            return;
        } else {
            if(strSavePath == null) {
                JOptionPane.showMessageDialog(null, "Please choose a folder to save");
            } else {
                numberOfFile = 0;
                if(!tfNumber.getText().equals("")){
                    try{
                        numberOfFile = Integer.parseInt(tfNumber.getText());
                    } catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Wrong number of file");
                        tfNumber.requestFocus();
                        return;
                    }
                    if(numberOfFile < 2){
                        JOptionPane.showMessageDialog(null, "Number of file have to >= 2");
                        tfNumber.requestFocus();
                        return;
                    } else {
                        cutFile(strOpenPath, strOpenFileName, strSavePath, numberOfFile);
                        JOptionPane.showMessageDialog(null, "Success");
                        
                    }
                } else {
                    //xu ly voi size cut
                    JOptionPane.showMessageDialog(null, "Input number of file");
                }
            }
        }
    }//GEN-LAST:event_btCutActionPerformed

    private void btJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJoinActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btJoinActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainFrameV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameV1().setVisible(true);
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
    private javax.swing.JComboBox<String> btSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTextField tfNumber;
    private javax.swing.JTextField tfOpen;
    private javax.swing.JTextField tfSave;
    private javax.swing.JTextField tfSize;
    // End of variables declaration//GEN-END:variables
}
