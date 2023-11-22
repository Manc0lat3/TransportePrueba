package Clases;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class UtilidadesVentana {

    public static void centrarVentana(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        frame.setLocation(x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
