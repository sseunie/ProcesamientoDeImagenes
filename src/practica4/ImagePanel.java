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
public class ImagePanel extends JPanel {
    
    private static BufferedImage img, imgCopy, icon;
    private static int xCoordinate, yCoordinate;
    
    public ImagePanel() {
        xCoordinate = 0;
        yCoordinate = 0;
        
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
        g.drawImage(icon,xCoordinate,yCoordinate,64,64,this);
    }
    
    public static void changeChannel(boolean redChannel, boolean greenChannel, boolean blueChannel) {
        int mask = 0x000000;
        if (redChannel) mask = mask | 0xFF0000;
        if (greenChannel) mask = mask | 0x00FF00;
        if (blueChannel) mask = mask | 0x0000FF;
        
        imgCopy = deepCopy(img);
        for (int j=0; j<img.getHeight(); j++){
            for (int i=0; i<img.getWidth(); i++){
                imgCopy.setRGB(i, j, mask & img.getRGB(i, j));
            }
        }
    }
    
    public static void changeCoordinate (int newX, int newY) {
        xCoordinate = newX;
        yCoordinate = newY;
    }
}
