/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genshin.wiki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class WikiData {

    private Genshin genshin;
    
    public WikiData(Genshin genshin) {
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
        switch (keyword.toLowerCase()) {
            case "klee":
                genshin.getArea_Chat().setText("Boom Boom Bakudan");
                break;
        }
    }
}
