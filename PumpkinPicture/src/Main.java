import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame("Romir\'s Fun Picture");
        window.setSize(700, 700);
        window.add(new PicturePanel());
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
