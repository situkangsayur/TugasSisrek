/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectsr.draw;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author hendri
 */
public class DrawPanel extends JPanel {

    private BufferedImage image;
    private int height;
    private int width;

    public DrawPanel() {
//  this.image = image;
//  this.height = height;
//  this.width = width;
        //this.setBounds(width, width, width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, height, width, null);
    }

//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawImage(image, height, width, null);
//    }
    public void setImage(BufferedImage image, int height, int width) {
        this.image = image;
        this.height = height;
        this.width = width;
    }
}
