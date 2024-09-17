package view;

import com.github.weisj.darklaf.LafManager;
import com.github.weisj.darklaf.theme.DarculaTheme;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.function.Consumer;

public class Window {
    JFrame frame;
    public static void main(String[] args){
        LafManager.setTheme(new DarculaTheme()/*IntelliJTheme()*/);
        LafManager.install();
        IconManager.loadIcons();
        Window window = new Window();
        window.init();
    }

    void init(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JSplitPane topLevelPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, buildObjectExplorer(), buildObjectEditor());
        buildToolbar();

        frame.add(topLevelPanel);
        frame.setSize(800, 400);
        frame.setVisible(true);

    }

    void buildToolbar(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
    }

    JPanel buildObjectExplorer(){
        JPanel panel = new JPanel();

        JLabel labs[] = {new JLabel("test"),
        new JLabel("test2"),
        new JLabel("test3")};
        //labs[0].setIcon(IconManager.icons[0]);
        //labs[1].setIcon(IconManager.icons[0]);
        //labs[2].setIcon(IconManager.icons[0]);

        Random r = new Random();

        JList<JLabel> explorer = new JList<JLabel>(labs);
        explorer.setCellRenderer(new ListCellRenderer<JLabel>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends JLabel> list, JLabel value, int index, boolean isSelected, boolean cellHasFocus) {
                JPanel panel = new JPanel(new BorderLayout());
                JLabel label = new JLabel(value.getText());
                label.setIcon(IconManager.icons[r.nextInt(2)]);


                if(isSelected){
                    panel.setBackground(list.getSelectionBackground());
                    label.setForeground(list.getSelectionForeground());
                }else{
                    panel.setBackground(list.getBackground());
                    label.setForeground(list.getForeground());
                }

                panel.add(label, BorderLayout.WEST);
                return panel;
            }
        });

        explorer.setFixedCellHeight(16);

        explorer.setSelectedIndex(2);

        panel.add(explorer);

        return panel;
    }

    JPanel buildObjectEditor(){
        JPanel objectEditorPanel = new JPanel();
        objectEditorPanel.add(new JLabel(IconManager.icons[0]));
        return objectEditorPanel;
    }
}
