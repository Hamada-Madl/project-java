import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.*;
import javax.swing.*;
public class Panel extends JPanel{
    public Point point;
    private ArrayList<Point> list;
    public Panel()
    {
        point = new Point();
        list = new ArrayList<Point>();
        action();
    }
    public void action()
    {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
             if(!e.isPopupTrigger())
             {
                 list.add(new Point(e.getX(),e.getY(),point.getL(),point.getH(),point.getColor(),point.getCarre()));
                 repaint();
             }
            }

        });
        this.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                list.add(new Point(e.getX(),e.getY(),point.getL(),point.getH(),point.getColor(),point.getCarre()));
                 repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               
            }
        });
    }
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for(Point p:list)
        {
            if(p.getCarre())
            {
                g.setColor(p.getColor());
                g.fillRect(p.getX()-(int)(p.getL()/2), p.getY()-(int)(p.getH()/2), 25, 25);
            }
            else
            {
                g.setColor(p.getColor());
                g.fillOval(p.getX()-(int)(p.getL()/2), p.getY()-(int)(p.getH()/2), 25, 25);
            }
        }
        
    }
    public void supp()
    {
        list = new ArrayList<Point>();
        repaint();
    }
}
