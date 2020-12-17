/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genshin.wiki;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class WikiData {

    private genshin genshin;
    
    public WikiData(genshin genshin) {
        this.genshin = genshin;
        
        this.genshin.getBtnSendChat().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (genshin.getBtn_StartClient().getText().equalsIgnoreCase("Stop Connection")) {
                    Client client = new Client();
                    client.startConnection(genshin.getTxt_ServerAddress().getText(), Integer.valueOf(genshin.getTxt_ServerPort().getText()));
                    setWiki(genshin.getTxt_ClientChat().getText());
                } else {
                    JOptionPane.showMessageDialog(genshin, "Please connect to server!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    private void setWiki(String keyword) {
        File image = null;
        ImageIcon imIco;
        Image imFit;
        Image imgFit;
        String path;
        switch (keyword.toLowerCase()) {
            case "klee":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("KLEE");
                genshin.getTxt_CharElements().setText("Pyro");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Catalyst");
                genshin.getTxt_CharAffiliation().setText("Knight of Favonius");
                genshin.getTxt_CharConstell().setText("Trifolium");
                genshin.getTxt_CharArtifact1().setText("Crimson Witch of Flames x2");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Finale x2");
                genshin.getTxt_CharArtifact3().setText("Wanderer's Troupe x2 / x4");
                image = new File("klee.png");
                path = image.getAbsolutePath();
                imIco = new ImageIcon(path);
                imFit = imIco.getImage();
                imgFit = imFit.getScaledInstance(genshin.getPicture_label().getWidth(), genshin.getPicture_label().getHeight(), Image.SCALE_SMOOTH);
                genshin.getPicture_label().setIcon(new ImageIcon(imgFit));
                break;
        }
    }
}
