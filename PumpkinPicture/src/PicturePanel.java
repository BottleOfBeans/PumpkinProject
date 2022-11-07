import javax.swing.*;
import java.awt.*;

public class PicturePanel extends JPanel {
    public PicturePanel(){
        setBackground(Color.LIGHT_GRAY);
    }
    public void paint(Graphics g){
        super.paint(g);

        g.setColor((new Color(153,102,0)));
        g.fillRect(300,175,60,150);

        g.setColor(Color.orange);
        g.fillOval(200,200,200,200);

        g.setColor(Color.black);
        g.fillPolygon(new int[]{340, 350, 360}, new int[]{305, 280, 305}, 3);
        g.fillPolygon(new int[]{240, 250, 260}, new int[]{305, 280, 305}, 3);

        g.setColor(Color.black);
        g.fillRect(250,350,100,10);


    }
}
