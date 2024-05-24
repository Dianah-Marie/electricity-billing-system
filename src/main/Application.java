package main;

import main.auth.Login;
import javax.swing.SwingUtilities;

// entry point
public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        }) ;
    }    
}
