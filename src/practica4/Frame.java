/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author stefany
 */
public class Frame extends javax.swing.JFrame {
    

    /**
     * Creates new form myFrame
     */
    public Frame() {
        initComponents();
        ImagePanel myPanel = new ImagePanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        positionGroup = new javax.swing.ButtonGroup();
        radioButtonPanel = new javax.swing.JPanel();
        upperLeftRadioButton = new javax.swing.JRadioButton();
        upperRightRadioButton = new javax.swing.JRadioButton();
        lowerLeftRadioButton = new javax.swing.JRadioButton();
        lowerRightRadioButton = new javax.swing.JRadioButton();
        imagePanel = new practica4.ImagePanel();
        checkBoxPanel = new javax.swing.JPanel();
        greenChannel = new javax.swing.JCheckBox();
        blueChannel = new javax.swing.JCheckBox();
        allChannels = new javax.swing.JCheckBox();
        redChannel = new javax.swing.JCheckBox();
        titleLabel = new javax.swing.JLabel();
        santiagoLabel = new javax.swing.JLabel();
        stefanyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioButtonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selección de posición"));

        positionGroup.add(upperLeftRadioButton);
        upperLeftRadioButton.setText("Esquina superior izquierda");
        upperLeftRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperLeftRadioButtonActionPerformed(evt);
            }
        });

        positionGroup.add(upperRightRadioButton);
        upperRightRadioButton.setText("Esquina superior derecha");
        upperRightRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperRightRadioButtonActionPerformed(evt);
            }
        });

        positionGroup.add(lowerLeftRadioButton);
        lowerLeftRadioButton.setText("Esquina inferior izquierda");
        lowerLeftRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerLeftRadioButtonActionPerformed(evt);
            }
        });

        positionGroup.add(lowerRightRadioButton);
        lowerRightRadioButton.setText("Esquina inferior derecha");
        lowerRightRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerRightRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout radioButtonPanelLayout = new javax.swing.GroupLayout(radioButtonPanel);
        radioButtonPanel.setLayout(radioButtonPanelLayout);
        radioButtonPanelLayout.setHorizontalGroup(
            radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upperLeftRadioButton)
                    .addComponent(lowerLeftRadioButton))
                .addGap(18, 18, 18)
                .addGroup(radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerRightRadioButton)
                    .addComponent(upperRightRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        radioButtonPanelLayout.setVerticalGroup(
            radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonPanelLayout.createSequentialGroup()
                .addGroup(radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(radioButtonPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(upperRightRadioButton))
                    .addGroup(radioButtonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(upperLeftRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lowerLeftRadioButton)
                            .addComponent(lowerRightRadioButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        checkBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selección del canal"));

        greenChannel.setSelected(true);
        greenChannel.setText("Canal verde");
        greenChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenChannelActionPerformed(evt);
            }
        });

        blueChannel.setSelected(true);
        blueChannel.setText("Canal azul");
        blueChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueChannelActionPerformed(evt);
            }
        });

        allChannels.setSelected(true);
        allChannels.setText("Todos los canales");
        allChannels.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                allChannelsStateChanged(evt);
            }
        });
        allChannels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allChannelsActionPerformed(evt);
            }
        });

        redChannel.setSelected(true);
        redChannel.setText("Canal rojo");
        redChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redChannelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkBoxPanelLayout = new javax.swing.GroupLayout(checkBoxPanel);
        checkBoxPanel.setLayout(checkBoxPanelLayout);
        checkBoxPanelLayout.setHorizontalGroup(
            checkBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allChannels)
                    .addComponent(redChannel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(checkBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkBoxPanelLayout.createSequentialGroup()
                        .addComponent(greenChannel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(checkBoxPanelLayout.createSequentialGroup()
                        .addComponent(blueChannel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        checkBoxPanelLayout.setVerticalGroup(
            checkBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkBoxPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(checkBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allChannels)
                    .addComponent(greenChannel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(checkBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueChannel)
                    .addComponent(redChannel))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLabel.setText("PROCESAMIENTO DE IMÁGENES");

        santiagoLabel.setText("Santiago Martínez Willi");

        stefanyLabel.setText("Stefany Martín Socas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(titleLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(santiagoLabel)
                                .addGap(104, 104, 104)
                                .addComponent(stefanyLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(santiagoLabel)
                    .addComponent(stefanyLabel))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upperRightRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperRightRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperRightRadioButtonActionPerformed

    private void lowerLeftRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerLeftRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowerLeftRadioButtonActionPerformed

    private void lowerRightRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerRightRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowerRightRadioButtonActionPerformed

    private void upperLeftRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperLeftRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperLeftRadioButtonActionPerformed

    private void allChannelsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_allChannelsStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_allChannelsStateChanged

    private void allChannelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allChannelsActionPerformed
        // TODO add your handling code here:
        if (allChannels.isSelected()) {
            redChannel.setSelected(true);
            greenChannel.setSelected(true);
            blueChannel.setSelected(true);
            ImagePanel.changeChannel(true,true,true,true);
            repaint();
        }
    }//GEN-LAST:event_allChannelsActionPerformed

    private void redChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redChannelActionPerformed
        // TODO add your handling code here:
        if (redChannel.isSelected()){
            allChannels.setSelected(greenChannel.isSelected() && blueChannel.isSelected());
        } else {
            allChannels.setSelected(false);
        }
        ImagePanel.changeChannel(allChannels.isSelected(),redChannel.isSelected(),greenChannel.isSelected(),blueChannel.isSelected());
        repaint();
    }//GEN-LAST:event_redChannelActionPerformed

    private void greenChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenChannelActionPerformed
        // TODO add your handling code here:
        if (greenChannel.isSelected()){
            allChannels.setSelected(redChannel.isSelected() && blueChannel.isSelected());
        } else {
            allChannels.setSelected(false);
        }
        ImagePanel.changeChannel(allChannels.isSelected(),redChannel.isSelected(),greenChannel.isSelected(),blueChannel.isSelected());
        repaint();
    }//GEN-LAST:event_greenChannelActionPerformed

    private void blueChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueChannelActionPerformed
        // TODO add your handling code here:
        if (blueChannel.isSelected()){
            allChannels.setSelected(greenChannel.isSelected() && redChannel.isSelected());
        } else {
            allChannels.setSelected(false);
        }
        ImagePanel.changeChannel(allChannels.isSelected(),redChannel.isSelected(),greenChannel.isSelected(),blueChannel.isSelected());
        repaint();
    }//GEN-LAST:event_blueChannelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allChannels;
    private javax.swing.JCheckBox blueChannel;
    private javax.swing.JPanel checkBoxPanel;
    private javax.swing.JCheckBox greenChannel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JRadioButton lowerLeftRadioButton;
    private javax.swing.JRadioButton lowerRightRadioButton;
    private javax.swing.ButtonGroup positionGroup;
    private javax.swing.JPanel radioButtonPanel;
    private javax.swing.JCheckBox redChannel;
    private javax.swing.JLabel santiagoLabel;
    private javax.swing.JLabel stefanyLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton upperLeftRadioButton;
    private javax.swing.JRadioButton upperRightRadioButton;
    // End of variables declaration//GEN-END:variables
}