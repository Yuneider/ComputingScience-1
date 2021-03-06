/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author 
 */
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author daniel
 */
public class Lienzo extends JPanel {
    private Nodo objArbol;
    public static final int DIAMETRO = 30;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    Lienzo(){
        
    }
    public void setObjArbol(Nodo objArbol) {
        this.objArbol = objArbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        pintar(g, getWidth() / 2, 20, objArbol);
    }
    
    private void pintar(Graphics g, int x, int y, Nodo n) {
        if (n == null)
        {}
        else {
            int EXTRA = n.nodosCompletos(n) * (ANCHO / 2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.drawString(String.valueOf(n.getCod()), x + 12, y + 18);
            if (n.getIzq() != null)
                g.drawLine(x+RADIO, y+RADIO+15, x-ANCHO-EXTRA+RADIO+15, y+ANCHO+RADIO);
            if (n.getDer() != null)
                g.drawLine(x+RADIO, y+RADIO+15, x+ANCHO+EXTRA+RADIO-15, y+ANCHO+RADIO);
            pintar(g,x-ANCHO-EXTRA,y+ANCHO,n.getIzq());
            pintar(g,x+ANCHO+EXTRA,y+ANCHO,n.getDer());
        }
    }
}

