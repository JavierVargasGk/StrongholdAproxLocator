/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package net.javiervargas.strongholdaproxlocator;

import javax.swing.*;
import java.util.ArrayList;

import static java.lang.Math.*;

/**
 *
 * @author melissavargas
 */
public class Panel extends javax.swing.JPanel {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        XCoord = new javax.swing.JTextField();
        YCoord = new javax.swing.JTextField();
        CircleNumber = new javax.swing.JComboBox<>();
        ApproxBTN = new javax.swing.JButton();

        LabelTitle.setText("Stronghold Locator v1");

        jLabel2.setText("Coordenada X");

        jLabel3.setText("Coordenada Z");

        jLabel4.setText("Numero de circulo");

        XCoord.setText("Coordenadas X");
        XCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XCoordActionPerformed(evt);
            }
        });

        YCoord.setText("Coordenadas Z");
        YCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YCoordActionPerformed(evt);
            }
        });

        CircleNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8" }));

        ApproxBTN.setText("Approx");
        ApproxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproxBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(ApproxBTN))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(XCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(YCoord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CircleNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(XCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(YCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CircleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ApproxBTN)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void YCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YCoordActionPerformed

    }//GEN-LAST:event_YCoordActionPerformed

    private void XCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XCoordActionPerformed

    }//GEN-LAST:event_XCoordActionPerformed

    private void ApproxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproxBTNActionPerformed
        ArrayList<String> Strongholds = AproxCoords();
        for (int looper = 0;looper<Circle(Integer.parseInt(CircleNumber.getSelectedItem().toString()));looper++){
            JOptionPane.showMessageDialog(null, Strongholds.get(looper),"Strongholds",1);
        }

    }//GEN-LAST:event_ApproxBTNActionPerformed
    private double calcHypotenusa(double b,double a){
        return sqrt(pow(b,2)+pow(a,2));
    }
    private double calcAngles(double b, double a){
        double angle= 0;
        if(b>0) {
            angle = atan(a / b);
        }
        if(b<0) {
            angle = atan(a / b)+PI;
        }
        return angle;
    }
    private ArrayList<String> AproxCoords() {
        int positionPlayerXValue = Integer.parseInt(XCoord.getText());
        int positionPlayerYValue = Integer.parseInt(YCoord.getText());
        double Magnitude = calcHypotenusa(positionPlayerXValue, positionPlayerYValue);
        double Angle = calcAngles(positionPlayerXValue, positionPlayerYValue);
        int CurrentCircle = Integer.parseInt(CircleNumber.getSelectedItem().toString());
        ArrayList<String> Strongholds = new ArrayList<>();
        double AngleHowManyAdd = 2*PI / Circle(CurrentCircle);
        double ValueToAddToAngle = 0;
        double AngleValue = 0;
        ArrayList<String> SingularStronghold = new ArrayList<>();
        String FoundStronghold = positionPlayerXValue + " " + positionPlayerYValue + "i";


        for (int looper = 0; looper < Circle(CurrentCircle); looper++) {
            double XValue = positionPlayerXValue + 1;
            AngleValue = Angle + ValueToAddToAngle;
            ValueToAddToAngle = ValueToAddToAngle + AngleHowManyAdd;
            double NormalFormXValue = Magnitude*(cos(abs(AngleValue)));
            double NormalFormYValue = Magnitude*(sin(abs(AngleValue)));
            String Complex = NormalFormXValue + " " + NormalFormYValue + "i";

            Strongholds.add(Complex);

        }
        System.out.println("yeet");
        return  Strongholds;
    }
    private int Circle(int a) {
        if (a == 1) {
            return 3;
        } else if (a == 2) {
            return 6;
        } else if (a == 3) {
            return 10;
        } else if (a == 4) {
            return 15;
        } else if (a == 5) {
            return 21;
        } else if (a == 6) {
            return 28;
        } else if (a == 7) {
            return 36;
        } else if (a == 8) {
            return 9;
        }
        return 0;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproxBTN;
    private javax.swing.JComboBox<String> CircleNumber;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JTextField XCoord;
    private javax.swing.JTextField YCoord;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
