
package numpseudoaleatorio;

import java.util.ArrayList;
import numpseudoaleatorio.NumPseudoaleatorio_Frame;
import static numpseudoaleatorio.NumPseudoaleatorio_Frame.ArrayResultados;

public class Pruebas extends javax.swing.JFrame {

    double suma = 0, media = 0;
    String mediaString = "";
    

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
        ButtonCorrida = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPaneEvaluado = new javax.swing.JScrollPane();
        TextAreaResultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
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

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ButtonCorrida.setText("jButton5");
        ButtonCorrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCorridaActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        TextAreaResultado.setColumns(20);
        TextAreaResultado.setRows(5);
        jScrollPaneEvaluado.setViewportView(TextAreaResultado);

        javax.swing.GroupLayout PanelButtonsLayout = new javax.swing.GroupLayout(PanelButtons);
        PanelButtons.setLayout(PanelButtonsLayout);
        PanelButtonsLayout.setHorizontalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonsLayout.createSequentialGroup()
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelButtonsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonVarianza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonCorrida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelButtonsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPaneEvaluado, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
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
                    .addComponent(ButtonCorrida)
                    .addComponent(jButton6))
                .addGap(40, 40, 40)
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPaneEvaluado, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonRegresar.setText("Regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegresar)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegresar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMediaActionPerformed
       
    }//GEN-LAST:event_ButtonMediaActionPerformed

    private void ButtonVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVarianzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonVarianzaActionPerformed

    private void ButtonCorridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCorridaActionPerformed

        int secuencia[] = new int[4095];
        
        for (int i=1; i<ArrayResultados.size(); i++){
            if(ArrayResultados.get(i)<= ArrayResultados.get(i-1)){
                secuencia[i-1] = 0;
            }else{
                secuencia[i-1] = 1;
            }
            
        }
        int corridas = 1;
        int dato = secuencia[0];
        
        
        for (int h=1; h<secuencia.length; h++){
            if(secuencia[h] != dato){
                corridas++;
                dato = secuencia[h];
            }else{
                
            }
        }
        
        double valor_esperado, varianza_de_corridas_cuadrada, varianza_de_corridas, estadisticoZ0;
        
        valor_esperado = ((2*4096)-1)/3;
        varianza_de_corridas_cuadrada = ((16*4096)-29)/90;
        varianza_de_corridas = Math.sqrt(varianza_de_corridas_cuadrada);
        estadisticoZ0 = Math.abs((corridas-valor_esperado)/varianza_de_corridas);
        
        String decision;
        if (estadisticoZ0< 2.576){
            decision = "El conjunto de números ri son independientes.";
        }else{
            decision = "Se rechaza que el conjunto de números ri son independientes.";
        }
        TextAreaResultado.setText(" PRUEBA DE CORRIDAS ARRIBA Y ABAJO" + "\n" + "\n" +
            ArrayResultados.size() +" números psudoaleatorios obtenidos" + "\n" +
            "Corridas: "+ corridas + "\n" + 
            "Valor esperado: " + valor_esperado + "\n" + 
            "Varianza del número de corridas: " + varianza_de_corridas_cuadrada + "\n" + 
            "Estadístico Z0: " + estadisticoZ0 + "\n" + "\n" + 
            "Tomando un nivel de aceptación del 99% se tiene que: " + "\n" + 
            decision);
    }//GEN-LAST:event_ButtonCorridaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        ArrayList <Integer> secuencia = new ArrayList<Integer>();
        int n0 = 0, n1 = 0, n = 4096;
        
        for (int i=0; i<ArrayResultados.size(); i++){
            if(ArrayResultados.get(i)>= 0.5){
                secuencia.add(1);
                n0 += 1;
            }else{
                secuencia.add(0);
                n1 += 1;
            }
            
        }
        int corridas = 1;
        int dato = secuencia.get(0);

        for (int h=1; h<secuencia.size(); h++){
            if(secuencia.get(h) != dato){
                corridas++;
                dato = secuencia.get(h);
            }else{
                
            }
        }

        double valor_esperado, varianza_de_corridas, raiz_varianza_de_corridas, estadisticoZ0;
        
        valor_esperado = ((2*n0*n1)/n)+0.5;
        varianza_de_corridas = (((2*n0*n1)*(2*n0*n1-n))/((n*n)*(n-1)));
        raiz_varianza_de_corridas = Math.sqrt(varianza_de_corridas);
        estadisticoZ0 = Math.abs((corridas-valor_esperado)/raiz_varianza_de_corridas);
        
        String decision;
        double distribucion_normal = 2.576;
        double menos_distribucion_normal = -2.576;
        if (estadisticoZ0 >= menos_distribucion_normal && estadisticoZ0 <= distribucion_normal){
            decision = "El conjunto de números ri son independientes.";
        }else{
            decision = "Se rechaza que el conjunto de números ri son independientes.";
        }
        TextAreaResultado.setText(" PRUEBA DE CORRIDAS ARRIBA Y ABAJO DE LA MEDIA" + "\n" + "\n" +
            ArrayResultados.size() +" números psudoaleatorios obtenidos" + "\n" +
            "Corridas: "+ corridas + "\n" + 
            "Valor esperado: " + valor_esperado + "\n" + 
            "Varianza del número de corridas: " + varianza_de_corridas + "\n" + 
            "Estadístico Z0: " + estadisticoZ0 + "\n" + "\n" + 
            "Tomando un nivel de aceptación del 99% se tiene que: " + "\n" + 
            decision);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        int[] a = new int[ArrayResultados.size()];
        
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length-1; j++){
                if (a[j] > a[j+1]){
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pruebas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonChi;
    private javax.swing.JButton ButtonCorrida;
    private javax.swing.JButton ButtonMedia;
    private javax.swing.JButton ButtonVarianza;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JTextArea TextAreaResultado;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneEvaluado;
    // End of variables declaration//GEN-END:variables
}
