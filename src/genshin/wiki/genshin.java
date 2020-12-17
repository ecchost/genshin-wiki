/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genshin.wiki;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 *
 * @author Ecchost
 */
public class genshin extends javax.swing.JFrame {

    private Server server;
    private ServerModel serverModel;
    private WikiData wikiData;
    /**
     * Creates new form
     */
    public genshin() {
        initComponents();
        server = new Server();
        wikiData = new WikiData(this);
    }
    
    

    public JLabel getTxt_CharAffiliation() {
        return txt_CharAffiliation;
    }

    public void setTxt_CharAffiliation(JLabel txt_CharAffiliation) {
        this.txt_CharAffiliation = txt_CharAffiliation;
    }

    public JLabel getTxt_CharArtifact1() {
        return txt_CharArtifact1;
    }

    public void setTxt_CharArtifact1(JLabel txt_CharArtifact1) {
        this.txt_CharArtifact1 = txt_CharArtifact1;
    }

    public JLabel getTxt_CharArtifact2() {
        return txt_CharArtifact2;
    }

    public void setTxt_CharArtifact2(JLabel txt_CharArtifact2) {
        this.txt_CharArtifact2 = txt_CharArtifact2;
    }

    public JLabel getTxt_CharArtifact3() {
        return txt_CharArtifact3;
    }

    public void setTxt_CharArtifact3(JLabel txt_CharArtifact3) {
        this.txt_CharArtifact3 = txt_CharArtifact3;
    }

    public JLabel getTxt_CharArtifact4() {
        return txt_CharArtifact4;
    }

    public void setTxt_CharArtifact4(JLabel txt_CharArtifact4) {
        this.txt_CharArtifact4 = txt_CharArtifact4;
    }

    public JLabel getTxt_CharConstell() {
        return txt_CharConstell;
    }

    public void setTxt_CharConstell(JLabel txt_CharConstell) {
        this.txt_CharConstell = txt_CharConstell;
    }

    public JLabel getTxt_CharArea() {
        return txt_CharArea;
    }

    public void setTxt_CharArea(JLabel txt_CharArea) {
        this.txt_CharArea = txt_CharArea;
    }

    public JLabel getTxt_CharElements() {
        return txt_CharElements;
    }

    public void setTxt_CharElements(JLabel txt_CharElements) {
        this.txt_CharElements = txt_CharElements;
    }

    public JLabel getTxt_CharName() {
        return txt_CharName;
    }

    public void setTxt_CharName(JLabel txt_CharName) {
        this.txt_CharName = txt_CharName;
    }

    public JLabel getTxt_CharRarity() {
        return txt_CharRarity;
    }

    public void setTxt_CharRarity(JLabel txt_CharRarity) {
        this.txt_CharRarity = txt_CharRarity;
    }

    public JLabel getTxt_CharWeapon() {
        return txt_CharWeapon;
    }

    public void setTxt_CharWeapon(JLabel txt_CharWeapon) {
        this.txt_CharWeapon = txt_CharWeapon;
    }


    public JButton getBtnSendChat() {
        return btnSendChat;
    }

    public void setBtnSendChat(JButton btnSendChat) {
        this.btnSendChat = btnSendChat;
    }

    public JLabel getPicture_label() {
        return picture_label;
    }

    public void setPicture_label(JLabel picture_label) {
        this.picture_label = picture_label;
    }

    

    public JToggleButton getBtn_StartClient() {
        return btn_StartClient;
    }

    public void setBtn_StartClient(JToggleButton btn_StartClient) {
        this.btn_StartClient = btn_StartClient;
    }

    public JTextPane getTxt_ClientChat() {
        return txt_ClientChat;
    }

    public void setTxt_ClientChat(JTextPane txt_ClientChat) {
        this.txt_ClientChat = txt_ClientChat;
    }

    public JTextField getTxt_ServerAddress() {
        return txt_ServerAddress;
    }

    public void setTxt_ServerAddress(JTextField txt_ServerAddress) {
        this.txt_ServerAddress = txt_ServerAddress;
    }

    public JTextField getTxt_ServerPort() {
        return txt_ServerPort;
    }

    public void setTxt_ServerPort(JTextField txt_ServerPort) {
        this.txt_ServerPort = txt_ServerPort;
    }
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_ServerPort = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ServerAddress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_ClientChat = new javax.swing.JTextPane();
        btnSendChat = new javax.swing.JButton();
        btn_StartClient = new javax.swing.JToggleButton();
        txt_CharName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_CharArea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_CharElements = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_CharRarity = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_CharWeapon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_CharAffiliation = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_CharConstell = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_CharArtifact1 = new javax.swing.JLabel();
        txt_CharArtifact2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_CharArtifact3 = new javax.swing.JLabel();
        txt_CharArtifact4 = new javax.swing.JLabel();
        picture_label = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Genshin Impact Wikia");

        txt_ServerPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ServerPortActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Server");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Port");

        txt_ServerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ServerAddressActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txt_ClientChat);

        btnSendChat.setText("Send");
        btnSendChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendChatActionPerformed(evt);
            }
        });

        btn_StartClient.setText("Connect");
        btn_StartClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartClientActionPerformed(evt);
            }
        });

        txt_CharName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt_CharName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_CharName.setText(" ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Home City: ");

        txt_CharArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharArea.setText(" ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Element: ");

        txt_CharElements.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharElements.setText(" ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Rarity: ");

        txt_CharRarity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharRarity.setText(" ");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Weapon: ");

        txt_CharWeapon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharWeapon.setText(" ");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Affiliation: ");

        txt_CharAffiliation.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharAffiliation.setText(" ");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Constellation: ");

        txt_CharConstell.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharConstell.setText(" ");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Recommended Artifact:");

        txt_CharArtifact1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharArtifact1.setText(" ");

        txt_CharArtifact2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharArtifact2.setText(" ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("OR");

        txt_CharArtifact3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharArtifact3.setText(" ");

        txt_CharArtifact4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_CharArtifact4.setText(" ");

        picture_label.setText("picture here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_ServerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_ServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(btn_StartClient))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSendChat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_CharElements, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_CharWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_CharArea, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_CharRarity, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_CharName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_CharAffiliation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_CharConstell, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_CharArtifact1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_CharArtifact2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_CharArtifact3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_CharArtifact4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(picture_label, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(6, 6, 6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_ServerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_StartClient))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CharName)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_CharArea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_CharElements))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_CharRarity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_CharWeapon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_CharAffiliation))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_CharConstell))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_CharArtifact1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_CharArtifact2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_CharArtifact3))
                            .addComponent(picture_label, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_CharArtifact4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendChat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ServerPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ServerPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ServerPortActionPerformed

    private void txt_ServerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ServerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ServerAddressActionPerformed

    private void btn_StartClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartClientActionPerformed
         if (btn_StartClient.getText().equals("Connect")) {
             if (!txt_ServerAddress.getText().isEmpty() && !txt_ServerPort.getText().isEmpty()) {
                 btn_StartClient.setText("Stop Connection");
                 serverModel = new ServerModel(Integer.valueOf(txt_ServerPort.getText()));
                 serverModel.start();
                 JOptionPane.showMessageDialog(this, "Connection Successfull!");
             }else{
                 JOptionPane.showMessageDialog(this, "server name and port should not empty", "Error", JOptionPane.ERROR_MESSAGE);
             }
        }else{
             serverModel.stopServer();
             btn_StartClient.setText("Connect");
             JOptionPane.showMessageDialog(this, "Connection Stopped!");
         }
    }//GEN-LAST:event_btn_StartClientActionPerformed

    private void btnSendChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendChatActionPerformed
        
    }//GEN-LAST:event_btnSendChatActionPerformed

  

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
            java.util.logging.Logger.getLogger(genshin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(genshin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(genshin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(genshin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new genshin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendChat;
    private javax.swing.JToggleButton btn_StartClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel picture_label;
    private javax.swing.JLabel txt_CharAffiliation;
    private javax.swing.JLabel txt_CharArea;
    private javax.swing.JLabel txt_CharArtifact1;
    private javax.swing.JLabel txt_CharArtifact2;
    private javax.swing.JLabel txt_CharArtifact3;
    private javax.swing.JLabel txt_CharArtifact4;
    private javax.swing.JLabel txt_CharConstell;
    private javax.swing.JLabel txt_CharElements;
    private javax.swing.JLabel txt_CharName;
    private javax.swing.JLabel txt_CharRarity;
    private javax.swing.JLabel txt_CharWeapon;
    private javax.swing.JTextPane txt_ClientChat;
    private javax.swing.JTextField txt_ServerAddress;
    private javax.swing.JTextField txt_ServerPort;
    // End of variables declaration//GEN-END:variables
}
