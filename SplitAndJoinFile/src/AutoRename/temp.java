package AutoRename;

import java.io.File;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class temp extends javax.swing.JFrame {

    /**
     * Creates new form AutoRename
     */
    public temp() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AutoRename.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfSourceDirectory = new javax.swing.JTextField();
        btGetListFile = new javax.swing.JButton();
        btChooserDirectory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btRename = new javax.swing.JButton();
        tfOldString = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNewString = new javax.swing.JTextField();
        cbOption = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Rename");
        setLocation(new java.awt.Point(300, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Source Directory");

        tfSourceDirectory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSourceDirectoryKeyReleased(evt);
            }
        });

        btGetListFile.setText("Get List File");
        btGetListFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetListFileActionPerformed(evt);
            }
        });

        btChooserDirectory.setText("...");
        btChooserDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChooserDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSourceDirectory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btChooserDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGetListFile)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSourceDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetListFile)
                    .addComponent(jLabel1)
                    .addComponent(btChooserDirectory))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taInfo.setColumns(20);
        taInfo.setRows(5);
        jScrollPane1.setViewportView(taInfo);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btRename.setText("Rename");
        btRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRenameActionPerformed(evt);
            }
        });

        tfOldString.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOldStringKeyReleased(evt);
            }
        });

        jLabel2.setText("Old string");

        jLabel3.setText("New string");

        tfNewString.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNewStringKeyReleased(evt);
            }
        });

        cbOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Regex" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfOldString, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNewString, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRename)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfOldString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfNewString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRename)
                    .addComponent(cbOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private String strSourceDirectory;
    private File fileObj;
    private File[] listFiles;
    private String oldString = "", newString = "";
    private void tfSourceDirectoryKeyReleased(java.awt.event.KeyEvent evt) {                                              
        // TODO add your handling code here:
        strSourceDirectory = tfSourceDirectory.getText();
    }                                             

    private void btGetListFileActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if(strSourceDirectory == null){
            JOptionPane.showMessageDialog(null, "Please choose a directory", "Error", JOptionPane.ERROR_MESSAGE);
            btChooserDirectory.requestFocus();
            return;
        } else{
            fileObj = new File(strSourceDirectory);
            if(!fileObj.exists() || fileObj.isFile()){
                strSourceDirectory = null;
                JOptionPane.showMessageDialog(null, "Wrong directory", "Error", JOptionPane.ERROR_MESSAGE);
                btChooserDirectory.requestFocus();
                return;
            } else {
                taInfo.setText("");
                listFiles = fileObj.listFiles();
                for(int i = 0; i < listFiles.length; i++){
                    taInfo.append(listFiles[i].getAbsolutePath() + "\n");
                }
                //taInfo.setText(Arrays.toString(fileObj.list()));
            }
        }
    }                                             

    private void btChooserDirectoryActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Open a directoty");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.showOpenDialog(null);
        strSourceDirectory =  chooser.getSelectedFile().getAbsolutePath();
        tfSourceDirectory.setText(strSourceDirectory);
    }                                                  

    private void btRenameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(listFiles == null){
            JOptionPane.showMessageDialog(null, "Please choose a directory", "Error", JOptionPane.ERROR_MESSAGE);
            btChooserDirectory.requestFocus();
            return;
        } else {
            //String[] arrListFiles = new String[listFiles.length];
            String newName;
            taInfo.setText("");
            File temp;
            for(int i = 0; i < listFiles.length; i++){
//                arrListFiles[i] = listFiles[i].getAbsolutePath();
                newName = listFiles[i].getName();
                newName = newName.replace(oldString, newString);
                temp = new File(listFiles[i].getParent() + "\\" + newName);
                listFiles[i].renameTo(temp);
                taInfo.append(newName + "\n");
            }
            
        }
    }                                        

    private void tfOldStringKeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        oldString = tfOldString.getText();
    }                                       

    private void tfNewStringKeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        newString = tfNewString.getText();
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
            java.util.logging.Logger.getLogger(AutoRename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoRename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoRename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoRename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoRename().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btChooserDirectory;
    private javax.swing.JButton btGetListFile;
    private javax.swing.JButton btRename;
    private javax.swing.JComboBox<String> cbOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTextField tfNewString;
    private javax.swing.JTextField tfOldString;
    private javax.swing.JTextField tfSourceDirectory;
    // End of variables declaration                   
}
