import java.awt.Color;
public class Point {
    private int x,y;
    private int l,h;
    private Color color;
    private boolean carre;
    public Point(int x,int y,int l,int h,Color color,boolean carre)
    {
        this.x=x;
        this.y=y;
        this.l=l;
        this.color= color;
        this.carre = carre;
    }
    public Point()
    {
     x=y=l=h=25;
     carre=true;
     color = Color.RED;
    }    
    public Color getColor()
    {
        return this.color;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return y;
    }
    public int getL()
    {
        return l;
    }
    public int getH()
    {
        return h;
    }
    public boolean getCarre()
    {
        return carre;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public void setL(int l)
    {
        this.l= l;
    }
    public void setH(int h)
    {
        this.h =h;

    }
    public void setColor(Color color)
    {
        this.color =color;
    }
    public void setCarre(boolean carre)
    {
        this.carre = carre;
    }
}
