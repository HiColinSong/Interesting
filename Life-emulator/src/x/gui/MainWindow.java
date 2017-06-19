package x.gui;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainWindow extends JFrame{
    
    public MainWindow() throws Exception{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setBounds(20,20,550,550);
        
        this.add(new Map());
        
        setVisible(true);
    }
}