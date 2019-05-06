package numpseudoaleatorio;

import java.util.ArrayList;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import static numpseudoaleatorio.NumPseudoaleatorio_Frame.ArrayResultados;

public class Pruebas extends javax.swing.JFrame {

    public static String mediaString = "";
    public static double media;

    public Pruebas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelButtons = new javax.swing.JPanel();
        ButtonMedia = new javax.swing.JButton();
        ButtonVarianza = new javax.swing.JButton();
        ButtonChi = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPaneEvaluado = new javax.swing.JScrollPane();
        TextAreaResultado = new javax.swing.JTextArea();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 409));
        setResizable(false);

        ButtonMedia.setText("Media");
        ButtonMedia.setMinimumSize(new java.awt.Dimension(100, 23));
        ButtonMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMediaActionPerformed(evt);
            }
        });

        ButtonVarianza.setText("Varianza");
        ButtonVarianza.setMaximumSize(new java.awt.Dimension(100, 23));
        ButtonVarianza.setMinimumSize(new java.awt.Dimension(100, 23));
        ButtonVarianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVarianzaActionPerformed(evt);
            }
        });

        ButtonChi.setText("Chi-cuadrada");
        ButtonChi.setMaximumSize(new java.awt.Dimension(100, 23));
        ButtonChi.setMinimumSize(new java.awt.Dimension(100, 23));
        ButtonChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChiActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        TextAreaResultado.setColumns(20);
        TextAreaResultado.setRows(5);
        jScrollPaneEvaluado.setViewportView(TextAreaResultado);

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonsLayout = new javax.swing.GroupLayout(PanelButtons);
        PanelButtons.setLayout(PanelButtonsLayout);
        PanelButtonsLayout.setHorizontalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonsLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelButtonsLayout.createSequentialGroup()
                        .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonVarianza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(192, Short.MAX_VALUE))
                    .addGroup(PanelButtonsLayout.createSequentialGroup()
                        .addComponent(jScrollPaneEvaluado, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonRegresar)
                        .addGap(22, 22, 22))))
        );
        PanelButtonsLayout.setVerticalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(40, 40, 40)
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(60, 60, 60)
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtonsLayout.createSequentialGroup()
                        .addComponent(jScrollPaneEvaluado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtonsLayout.createSequentialGroup()
                        .addComponent(jButtonRegresar)
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMediaActionPerformed

        double suma = 0, LimiteInferior, LimiteSuperior;

        for (int i = 0; i < ArrayResultados.size(); i++) {
            suma += ArrayResultados.get(i);

            media = suma / 4096;

        }
        LimiteInferior = (.5 - (2.576 * (1 / (221.7025033688163))));
        LimiteSuperior = (.5 + (2.576 * (1 / (Math.sqrt(12 * 4096)))));

        System.out.println("Limite inferior " + LimiteInferior + " \nLimite Superior " + LimiteSuperior);

        mediaString = Double.toString(media);

        if (media > LimiteInferior && media < LimiteSuperior) {
            TextAreaResultado.setText("El Valor promedio: " + mediaString + " Se encuentra entre \nlos Límites de aceptacion"
                    + " se concluye que no se puede rechazar el conjunto");
        } else {
            TextAreaResultado.setText("El Valor promedio: " + mediaString + " No se encuentra entre \nlos Límites de aceptacion"
                    + " se concluye que no se puede aceptar el conjunto");
        }
    }//GEN-LAST:event_ButtonMediaActionPerformed

    private void ButtonVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVarianzaActionPerformed
        ChiSquaredDistribution chi = new ChiSquaredDistribution(4095);
        ArrayList<Double> ArrayDesviaciones = new ArrayList<Double>();

        double suma = 0, LimiteInferiorVarianza, LimiteSuperiorVarianza;

        for (int i = 0; i < ArrayResultados.size(); i++) {
            suma += ArrayResultados.get(i);

            media = suma / 4096;

        }

        String VariaString;
        double parcial = 0, varianza;
        for (int i = 0; i < ArrayResultados.size(); i++) {
            parcial = Math.pow((ArrayResultados.get(i) - media), 2);
            ArrayDesviaciones.add(parcial);

        }
        suma = 0;
        for (int i = 0; i < ArrayDesviaciones.size(); i++) {
            suma += ArrayDesviaciones.get(i);
        }

        varianza = suma / (4095);

        LimiteInferiorVarianza = chi.inverseCumulativeProbability(0.05 / 2) / (12 * 4095);
        LimiteSuperiorVarianza = chi.inverseCumulativeProbability(1 - 0.05 / 2) / (12 * 4095);
        VariaString = Double.toString(varianza);

        System.out.println("Limite inferior " + LimiteInferiorVarianza + "\nLimite superior " + LimiteSuperiorVarianza);

        if (varianza > LimiteInferiorVarianza && varianza < LimiteSuperiorVarianza) {
            TextAreaResultado.setText("La varianza: " + VariaString + " esta entre los límites aceptados \n"
                    + "por lo que no se puede rechazar el conjunto");
        } else {
            TextAreaResultado.setText("La varianza: " + VariaString + " no esta entre los límites aceptados \n"
                    + "por lo que no se puede aceptar el conjunto");
        }

    }//GEN-LAST:event_ButtonVarianzaActionPerformed

    private void ButtonChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChiActionPerformed

        ChiSquaredDistribution chi = new ChiSquaredDistribution(63);

        double numero = 0, frecuenciaEsperada = 64, IntervaloInicial = 0, IntervaloFinal = 0.015625,
                crecimiento = 0.015625, chicuadrado = 0, ValorEstadistico;

        int[] FrecuenciaObservada = new int[64];
        for (int i = 0; i < 64; i++) {

            for (int j = 0; j < ArrayResultados.size(); j++) {
                numero = ArrayResultados.get(j);
                if (numero > IntervaloInicial && numero < IntervaloFinal) {
                    FrecuenciaObservada[i]++;
                }
            }
            IntervaloFinal += crecimiento;
            IntervaloInicial += crecimiento;
        }
        for (int i = 0; i < 64; i++) {
            chicuadrado += ((Math.pow((frecuenciaEsperada - FrecuenciaObservada[i]), 2)) / frecuenciaEsperada);
        }

        ValorEstadistico = chi.inverseCumulativeProbability(0.1);
        int suma = 0;
        for (int i = 0; i < 64; i++) {

            System.out.println(FrecuenciaObservada[i]);
            suma += FrecuenciaObservada[i];

        }
        System.out.println(suma);
        String ChiCuadradaString = Double.toString(chicuadrado);
        if (chicuadrado < ValorEstadistico) {
            TextAreaResultado.setText("La ChiCuadrada: " + ChiCuadradaString + " es menor al estadistico correspondiente \n"
                    + "por lo que no se puede rechazar el conjunto");
        } else {
            TextAreaResultado.setText("La ChiCuadrada: " + ChiCuadradaString + " es mayor al estadistico correspondiente \n"
                    + "por lo que no se puede aceptar el conjunto");
        }

        System.out.println(ValorEstadistico);  //49.1105386750026

    }//GEN-LAST:event_ButtonChiActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        NumPseudoaleatorio_Frame nm = new NumPseudoaleatorio_Frame();
        nm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pruebas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonChi;
    private javax.swing.JButton ButtonMedia;
    private javax.swing.JButton ButtonVarianza;
    private javax.swing.JPanel PanelButtons;
    public static javax.swing.JTextArea TextAreaResultado;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JScrollPane jScrollPaneEvaluado;
    // End of variables declaration//GEN-END:variables
}
