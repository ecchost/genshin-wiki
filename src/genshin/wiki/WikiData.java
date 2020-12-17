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
            case "aether":
                genshin.getTxt_CharArea().setText("Unknown");
                genshin.getTxt_CharName().setText("AETHER");
                genshin.getTxt_CharElements().setText("Adaptive");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("Knight of Favonius");
                genshin.getTxt_CharConstell().setText("Viator");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "amber":
                genshin.getTxt_CharArea().setText("Mondstat");
                genshin.getTxt_CharName().setText("AMBER");
                genshin.getTxt_CharElements().setText("Pyro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Bow");
                genshin.getTxt_CharAffiliation().setText("Knight of Favonius");
                genshin.getTxt_CharConstell().setText("Lepus");
                genshin.getTxt_CharArtifact1().setText("Troupe's Dawnlight");
                genshin.getTxt_CharArtifact2().setText("Bard's Arrow Feather");
                genshin.getTxt_CharArtifact3().setText("Concert's Final Hour");
                break;
            case "ayaka":
                genshin.getTxt_CharArea().setText("Inazuma");
                genshin.getTxt_CharName().setText("KAMISATO AYAKA");
                genshin.getTxt_CharElements().setText("Cyro/Ice");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("House Kamisato");
                genshin.getTxt_CharConstell().setText("Unknown");
                genshin.getTxt_CharArtifact1().setText("Royal Flora");
                genshin.getTxt_CharArtifact2().setText("Royal Plume");
                genshin.getTxt_CharArtifact3().setText("Royal Pocket Watch");
                break;
            case "barbara":
                genshin.getTxt_CharArea().setText("Mondstat");
                genshin.getTxt_CharName().setText("GUNNHILDR BARBARA");
                genshin.getTxt_CharElements().setText("Hydro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Catalyst");
                genshin.getTxt_CharAffiliation().setText("Church of Favonius");
                genshin.getTxt_CharConstell().setText("Crater");
                genshin.getTxt_CharArtifact1().setText("Maiden's Distant Love");
                genshin.getTxt_CharArtifact2().setText("Maiden's Heart-stricken Infatuation");
                genshin.getTxt_CharArtifact3().setText("Maiden's Passing Youth");
                break;
            case "beidou":
                genshin.getTxt_CharArea().setText("Liyue");
                genshin.getTxt_CharName().setText("BEIDOU");
                genshin.getTxt_CharElements().setText("Electro / Lightning");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Claymore");
                genshin.getTxt_CharAffiliation().setText("Crux Fleet");
                genshin.getTxt_CharConstell().setText("Victor Mare");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "bennet":
                genshin.getTxt_CharArea().setText("Mondstat");
                genshin.getTxt_CharName().setText("BENNETT");
                genshin.getTxt_CharElements().setText("Pyro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("Adventurers' Guild");
                genshin.getTxt_CharConstell().setText("Rota Calamitas");
                genshin.getTxt_CharArtifact1().setText("Witch's Flower of Blaze");
                genshin.getTxt_CharArtifact2().setText("Witch's Ever-Burning Plume");
                genshin.getTxt_CharArtifact3().setText("Witch's End Time");
                break;
            case "chongyun":
                genshin.getTxt_CharArea().setText("Liyue");
                genshin.getTxt_CharName().setText("CHONGYUN");
                genshin.getTxt_CharElements().setText("Cyro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Claymore");
                genshin.getTxt_CharAffiliation().setText("Unknown");
                genshin.getTxt_CharConstell().setText("Nubis Caesor");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "diluc":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("DILUC");
                genshin.getTxt_CharElements().setText("Pyro");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Claymore");
                genshin.getTxt_CharAffiliation().setText("Dawn Winery");
                genshin.getTxt_CharConstell().setText("Noctua");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "diona":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("DIONA");
                genshin.getTxt_CharElements().setText("Cyro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Bow");
                genshin.getTxt_CharAffiliation().setText("Cat's Tail");
                genshin.getTxt_CharConstell().setText("Feles");
                genshin.getTxt_CharArtifact1().setText("Troupe's Dawnlight");
                genshin.getTxt_CharArtifact2().setText("Bard's Arrow Feather");
                genshin.getTxt_CharArtifact3().setText("Concert's Final Hour");
                break;
            case "fischl":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("FISCHL");
                genshin.getTxt_CharElements().setText("Electro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Bow");
                genshin.getTxt_CharAffiliation().setText("Adventurers' Guild");
                genshin.getTxt_CharConstell().setText("Corvus");
                genshin.getTxt_CharArtifact1().setText("Thunderbird's Mercy");
                genshin.getTxt_CharArtifact2().setText("Survivor of Catastrophe");
                genshin.getTxt_CharArtifact3().setText("Hourglass of Thunder");
                break;
            case "jean":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("GUNNHILDR JEAN");
                genshin.getTxt_CharElements().setText("Anemo");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("Knights of Favonius");
                genshin.getTxt_CharConstell().setText("Leo Minor");
                genshin.getTxt_CharArtifact1().setText("Maiden's Distant Lovey");
                genshin.getTxt_CharArtifact2().setText("Maiden's Heart-stricken Infatuation");
                genshin.getTxt_CharArtifact3().setText("Maiden's Passing Youth");
                break;
            case "kaeya":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("KAEYA");
                genshin.getTxt_CharElements().setText("Cyro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("Knights of Favonius");
                genshin.getTxt_CharConstell().setText("Pavo Ocellus");
                genshin.getTxt_CharArtifact1().setText("Royal Flora");
                genshin.getTxt_CharArtifact2().setText("Royal Plume");
                genshin.getTxt_CharArtifact3().setText("Royal Pocket Watch");
                break;
            case "keqing":
                genshin.getTxt_CharArea().setText("Liyue");
                genshin.getTxt_CharName().setText("KEQING");
                genshin.getTxt_CharElements().setText("Electro");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("Liyue Qixing");
                genshin.getTxt_CharConstell().setText("Trulla Cementarii");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "lisa":
                genshin.getTxt_CharArea().setText("Mondstat");
                genshin.getTxt_CharName().setText("LISA");
                genshin.getTxt_CharElements().setText("Electro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Catalyst");
                genshin.getTxt_CharAffiliation().setText("Knight of Favonius");
                genshin.getTxt_CharArtifact1().setText("Royal Flora");
                genshin.getTxt_CharArtifact2().setText("Royal Plume");
                genshin.getTxt_CharArtifact3().setText("Royal Pocket Watch");
                break;
            case "lumine":
                genshin.getTxt_CharArea().setText("Unknown");
                genshin.getTxt_CharName().setText("LUMINE");
                genshin.getTxt_CharElements().setText("Adaptive");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("Unknown");
                genshin.getTxt_CharConstell().setText("Viatrix");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "mona":
                genshin.getTxt_CharArea().setText("Mondstat");
                genshin.getTxt_CharName().setText("MONA");
                genshin.getTxt_CharElements().setText("Hydro");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Catalyst");
                genshin.getTxt_CharAffiliation().setText("Unknown");
                genshin.getTxt_CharConstell().setText("Astrolabos");
                genshin.getTxt_CharArtifact1().setText("Royal Flora");
                genshin.getTxt_CharArtifact2().setText("Royal Plume");
                genshin.getTxt_CharArtifact3().setText("Royal Pocket Watch");
                break;
            case "ningguang":
                genshin.getTxt_CharArea().setText("Liyue Harbor");
                genshin.getTxt_CharName().setText("NINGGUANG");
                genshin.getTxt_CharElements().setText("Geo");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Catalyst");
                genshin.getTxt_CharAffiliation().setText("Liyue Qixing");
                genshin.getTxt_CharConstell().setText("Opus Aequilibrium");
                genshin.getTxt_CharArtifact1().setText("Troupe's Dawnlight");
                genshin.getTxt_CharArtifact2().setText("Bard's Arrow Feather");
                genshin.getTxt_CharArtifact3().setText("Concert's Final Hour");
                break;
            case "noelle":
                genshin.getTxt_CharArea().setText("Mondstat");
                genshin.getTxt_CharName().setText("NOELLE");
                genshin.getTxt_CharElements().setText("Geo");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Claymore");
                genshin.getTxt_CharAffiliation().setText("Knight of Favonius");
                genshin.getTxt_CharConstell().setText("Parma Cordis");
                genshin.getTxt_CharArtifact1().setText("Guardian's Flower");
                genshin.getTxt_CharArtifact2().setText("Guardian's Sigil");
                genshin.getTxt_CharArtifact3().setText("Guardian's Clock");
                break;
            case "qiqi":
                genshin.getTxt_CharArea().setText("Liyue");
                genshin.getTxt_CharName().setText("QIQI");
                genshin.getTxt_CharElements().setText("Cyro");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Sword");
                genshin.getTxt_CharAffiliation().setText("Bubu Pharmacy");
                genshin.getTxt_CharConstell().setText("Pristina Nola");
                genshin.getTxt_CharArtifact1().setText("Maiden's Distant Love");
                genshin.getTxt_CharArtifact2().setText("Maiden's Heart-stricken Infatuation");
                genshin.getTxt_CharArtifact3().setText("Maiden's Passing Youth");
                break;
            case "razor":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("RAZOR");
                genshin.getTxt_CharElements().setText("Electro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Claymore");
                genshin.getTxt_CharAffiliation().setText("Wolvendom");
                genshin.getTxt_CharConstell().setText("Lupus Minor");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "sucrose":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("SUCROSE");
                genshin.getTxt_CharElements().setText("Anemo");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Catalyst");
                genshin.getTxt_CharAffiliation().setText(" Knights of Favonius");
                genshin.getTxt_CharConstell().setText("Ampulla");
                genshin.getTxt_CharArtifact1().setText("In Remembrance of Viridescent Fields");
                genshin.getTxt_CharArtifact2().setText("Viridescent Arrow Feather");
                genshin.getTxt_CharArtifact3().setText("Viridescent Venerer's Determination");
                break;
            case "tartaglia":
                genshin.getTxt_CharArea().setText("Snezhnaya");
                genshin.getTxt_CharName().setText("TARTAGLIA");
                genshin.getTxt_CharElements().setText("Hydro");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Bow");
                genshin.getTxt_CharAffiliation().setText("Fatui");
                genshin.getTxt_CharConstell().setText("Monoceros Caeli");
                genshin.getTxt_CharArtifact1().setText("In Remembrance of Viridescent Fields");
                genshin.getTxt_CharArtifact2().setText("Viridescent Arrow Feather");
                genshin.getTxt_CharArtifact3().setText("Viridescent Venerer's Determination");
                break;
            case "venti":
                genshin.getTxt_CharArea().setText("Mondstadt");
                genshin.getTxt_CharName().setText("VENTI");
                genshin.getTxt_CharElements().setText("Anemo");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Bow");
                genshin.getTxt_CharAffiliation().setText("The Seven");
                genshin.getTxt_CharConstell().setText("Carmen Dei");
                genshin.getTxt_CharArtifact1().setText("Troupe's Dawnlight");
                genshin.getTxt_CharArtifact2().setText("Bard's Arrow Feather");
                genshin.getTxt_CharArtifact3().setText("Concert's Final Hour");
                break;
            case "xiangling":
                genshin.getTxt_CharArea().setText("Liyue Harbor");
                genshin.getTxt_CharName().setText("XIANGLING");
                genshin.getTxt_CharElements().setText("Pyro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Polearm");
                genshin.getTxt_CharAffiliation().setText("Wanmin Restaurant");
                genshin.getTxt_CharConstell().setText("Ladle");
                genshin.getTxt_CharArtifact1().setText("Witch's Flower of Blaze");
                genshin.getTxt_CharArtifact2().setText("Witch's Ever-Burning Plume");
                genshin.getTxt_CharArtifact3().setText("Witch's End Time");
                break;
             case "xiao":
                genshin.getTxt_CharArea().setText("Liyue Harbor");
                genshin.getTxt_CharName().setText("XIAO");
                genshin.getTxt_CharElements().setText("Anemo");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Polearm");
                genshin.getTxt_CharAffiliation().setText("Liyue Adeptus");
                genshin.getTxt_CharConstell().setText("Alatus Nemeseos");
                genshin.getTxt_CharArtifact1().setText("Witch's Flower of Blaze");
                genshin.getTxt_CharArtifact2().setText("Witch's Ever-Burning Plume");
                genshin.getTxt_CharArtifact3().setText("Witch's End Time");
                break;
            case "xinyan":
                genshin.getTxt_CharArea().setText("Liyue");
                genshin.getTxt_CharName().setText("XINYAN");
                genshin.getTxt_CharElements().setText("Pyro");
                genshin.getTxt_CharRarity().setText("****");
                genshin.getTxt_CharWeapon().setText("Claymore");
                genshin.getTxt_CharAffiliation().setText("Unknown");
                genshin.getTxt_CharConstell().setText("Fila Ignium");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
            case "zhongli":
                genshin.getTxt_CharArea().setText("Liyue");
                genshin.getTxt_CharName().setText("ZHONGLI");
                genshin.getTxt_CharElements().setText("Geo");
                genshin.getTxt_CharRarity().setText("*****");
                genshin.getTxt_CharWeapon().setText("Polearm");
                genshin.getTxt_CharAffiliation().setText("Wangsheng Funeral Parlor");
                genshin.getTxt_CharConstell().setText("Unknown");
                genshin.getTxt_CharArtifact1().setText("Gladiator's Nostalgia");
                genshin.getTxt_CharArtifact2().setText("Gladiator's Destiny");
                genshin.getTxt_CharArtifact3().setText("Gladiator's Longing");
                break;
        }
    }
}
