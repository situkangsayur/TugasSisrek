/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectsr.model;

import com.projectsr.listener.ProjectListener;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;

/**
 *
 * @author hendri
 */
public class ProjectModel {

    private BufferedImage imageSatu;
    private BufferedImage imageDua;
    private Double result;
    private ProjectListener listener;
    private int stepSame;

    public void setImageSatu(BufferedImage imageSatu) {
        this.imageSatu = imageSatu;
    }

    public void setImageDua(BufferedImage imageDua) {
        this.imageDua = imageDua;
    }

    public void setListener(ProjectListener listener) {
        this.listener = listener;
    }

    protected void resultOnFire() {
        if (listener != null) {
            listener.checkResult(result);
        }
    }

    public void getResultModel() {
        stepSame = 0;

        int x2 = 0, y2 = 0;
        for (int x = 0; x < imageSatu.getWidth(); x++) {

            if (x > imageDua.getWidth()) {
                x2 = imageDua.getWidth();
            } else {
                x2 = x;
            }

            for (int y = 0; y < imageSatu.getHeight(); y++) {
//                 0.299 · R + 0.587 · G + 0.114 · B
//                imageSatu.

                if (y > imageDua.getWidth()) {
                    y2 = imageDua.getHeight();
                } else {
                    y2 = y;
                }

                if (imageSatu.getRGB(x, y) == imageDua.getRGB(x2, y2)) {
                    
                    System.out.println(" val : " + imageSatu.getRGB(x, y));
                    stepSame++;
                }
            }
        }

        System.out.println("step same : " + stepSame);

        if (stepSame == 0) {
            result = new Double(0.0D);
        } else {
            result = new Double(((double) 100 / (imageSatu.getWidth() * imageSatu.getHeight())) * stepSame);
        }

        resultOnFire();
    }
}
