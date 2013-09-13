import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class Fenetre extends JFrame{
    private JMenuBar menubar = new JMenuBar();
    private JMenu fichier = new JMenu("Fichier");
    private JMenu edition = new JMenu("Edition");
    private JMenu forme = new JMenu("Forme du Pointeur");
    private JMenu color = new JMenu("Coleur du Pointeur");
    private JMenuItem rond = new JMenuItem("Rond");
    private JMenuItem carre = new JMenuItem("Carré");
    private JMenuItem effacer = new JMenuItem("Effacer");
    private JMenuItem quitter = new JMenuItem("Quitter");
    private JMenuItem rouge = new JMenuItem("Rouge");
    private JMenuItem vert = new JMenuItem("Vert");
    private JMenuItem bleu = new JMenuItem("Bleu");
    private JButton btnrond = new JButton(new ImageIcon("rond.jpg"));
    private JButton btncarre = new JButton(new ImageIcon("carre.jpg"));
    private JButton btnrouge = new JButton(new ImageIcon("rouge.jpg"));
    private JButton btnvert = new JButton(new ImageIcon("vert.jpg"));
    private JButton btnbleu = new JButton(new ImageIcon("bleu.jpg"));
    private JToolBar toolbar = new JToolBar();
    Panel panel = new Panel();
public Fenetre()
{
    this.setSize(new Dimension(700,700));
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    initMenu();
    initToolbar();
    this.add(panel,BorderLayout.CENTER);
    btnrond.doClick();
}
public void initMenu()
{
    forme.add(rond);
    forme.add(carre);
    color.add(rouge);
    color.add(vert);
    color.add(bleu);
    edition.add(forme);
    edition.add(color);
    rond.addActionListener(new RListener());
    carre.addActionListener(new CListener());
    rouge.addActionListener(new RoListener());
    bleu.addActionListener(new BListener());
    vert.addActionListener(new VListener());
    quitter.addActionListener(new QListener());
    effacer.addActionListener(new EListener());
    quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_MASK));
    effacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,KeyEvent.CTRL_MASK));
    fichier.add(effacer);
    fichier.add(quitter);
    menubar.add(fichier);
    menubar.add(edition);
    this.setJMenuBar(menubar);
}
public void initToolbar()
{
    toolbar.add(btnrond);
    toolbar.add(btncarre);
    toolbar.addSeparator();
    toolbar.add(btnrouge);
    toolbar.add(btnbleu);
    toolbar.add(btnvert);
    btnrond.addActionListener(new RListener());
    btncarre.addActionListener(new CListener());
    btnrouge.addActionListener(new RoListener());
    btnbleu.addActionListener(new BListener());
    btnvert.addActionListener(new VListener());
    this.add(toolbar,BorderLayout.NORTH);
}
public static void main(String args[])
{
    new Fenetre();
}
class QListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    
}
class EListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           panel.supp(); 
        }
    
}
class RListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.point.setCarre(false);
            rond.setEnabled(false);
            btnrond.setEnabled(false);
            carre.setEnabled(true);
           btncarre.setEnabled(true);
        }
    
}
class CListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           panel.point.setCarre(true);
           rond.setEnabled(true);
           btnrond.setEnabled(true);
           carre.setEnabled(false);
           btncarre.setEnabled(false);
        }
    
}
class RoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.point.setColor(Color.red);
        }
    
}
class VListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.point.setColor(Color.GREEN);
        }
    
}
class BListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.point.setColor(Color.blue);
        }
    
}
}
