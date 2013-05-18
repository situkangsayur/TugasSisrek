/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectsr.controller;

import com.projectsr.model.ProjectModel;
import com.projectsr.view.MainPanel;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

/**
 *
 * @author hendri
 */
public class ProjectController {

    private MainPanel view;
    private ProjectModel model;
    private boolean runStat;

    public void setModel(ProjectModel model) {
        this.model = model;
    }

    public void setView(MainPanel view) {
        this.view = view;
    }

    public void runChecker() {
        runStat = true;


        model.setImageSatu(view.getCitraSatu());
        model.setImageDua(view.getCitraDua());

        model.getResultModel();

    }
}
