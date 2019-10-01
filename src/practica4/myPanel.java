/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import javax.swing.JPanel;
import java.lang.Exception;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author stefany
 */
public class myPanel extends JPanel {
    
    private BufferedImage img, imgCopy, icon;
    
    public myPanel() {
        try {
            img = ImageIO.read(new URL("https://www.dictando.com/wp-content/uploads/2018/07/dictado-mi-casa-A1.jpg"));
            icon = ImageIO.read(new URL("https://png.pngtree.com/element_our/sm/20180626/sm_5b321ca7a1ca4.png"));            
            imgCopy = deepCopy(img);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    
    static BufferedImage deepCopy(BufferedImage bi) {
        ColorModel cm = bi.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = bi.copyData(null);
        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imgCopy, 0, 0, this);
    }
}
