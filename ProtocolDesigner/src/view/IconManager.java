package view;

import javax.swing.*;
import java.awt.*;

public class IconManager {
    public static int DATA_OBJECT_ICON = 0;
    public static int PROTOCOL_OBJECT_ICON = 1;
    public static ImageIcon[] icons;
    public static void loadIcons(){
        icons = new ImageIcon[2];
        icons[0] = new ImageIcon(new ImageIcon("src/icons/DataObjectIcon.png").getImage().getScaledInstance(16, 16, Image.SCALE_FAST));
        icons[1] = new ImageIcon(new ImageIcon("src/icons/ProtocolIcon.png").getImage().getScaledInstance(16, 16, Image.SCALE_FAST));
    }
}
