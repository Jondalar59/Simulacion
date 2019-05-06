package numpseudoaleatorio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.*;
import java.util.ArrayList;
import javafx.stage.FileChooser;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import numpseudoaleatorio.Acerca;

public class NumPseudoaleatorio_Frame extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    
    public NumPseudoaleatorio_Frame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static ArrayList<Double> ArrayResultados = new ArrayList<Double>();
    
    public String AbrirArchivo (File archivo){
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read()) !=-1){
                char caracter = (char)ascci;
                documento += caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }
    
    public String GuardarArchivo(File archivo, String documento){
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo); 
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo guardado correctamente";
        } catch (Exception e) {
        }
        return mensaje;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generador_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_semilla = new javax.swing.JTextField();
        btn_Calcular = new javax.swing.JButton();
        text_cmultiplicativa = new javax.swing.JTextField();
        text_caditiva = new javax.swing.JTextField();
        text_modulo = new javax.swing.JTextField();
        botones_panel = new javax.swing.JPanel();
        btn_generador = new javax.swing.JButton();
        btn_pruebas = new javax.swing.JButton();
        btn_creditos = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        encabezado_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Números Pseudoaleatorios");
        setBackground(java.awt.SystemColor.textText);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("Números Pseudoaleatorios"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generador_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        generador_panel.setMaximumSize(new java.awt.Dimension(787, 580));
        generador_panel.setMinimumSize(new java.awt.Dimension(787, 580));
        generador_panel.setPreferredSize(new java.awt.Dimension(787, 580));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Semilla:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Constante multiplicativa:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Constante aditiva:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Módulo:");

        btn_Calcular.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout generador_panelLayout = new javax.swing.GroupLayout(generador_panel);
        generador_panel.setLayout(generador_panelLayout);
        generador_panelLayout.setHorizontalGroup(
            generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generador_panelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(generador_panelLayout.createSequentialGroup()
                        .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58))
                    .addGroup(generador_panelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generador_panelLayout.createSequentialGroup()
                        .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_cmultiplicativa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_caditiva, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text_semilla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generador_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        generador_panelLayout.setVerticalGroup(
            generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generador_panelLayout.createSequentialGroup()
                .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generador_panelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(generador_panelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_semilla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_cmultiplicativa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_caditiva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(generador_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(generador_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 101, 920, 600));

        botones_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botones_panel.setMaximumSize(new java.awt.Dimension(300, 450));
        botones_panel.setMinimumSize(new java.awt.Dimension(300, 450));
        botones_panel.setPreferredSize(new java.awt.Dimension(300, 450));

        btn_generador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_generador.setText("Generador Método Lineal");
        btn_generador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generadorActionPerformed(evt);
            }
        });

        btn_pruebas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_pruebas.setText("Prueba de aleatoriedad");
        btn_pruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pruebasActionPerformed(evt);
            }
        });

        btn_creditos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_creditos.setText("Créditos");
        btn_creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditosActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.setMaximumSize(new java.awt.Dimension(130, 50));
        btnCargar.setPreferredSize(new java.awt.Dimension(130, 50));
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(130, 50));
        btnGuardar.setMinimumSize(new java.awt.Dimension(130, 50));
        btnGuardar.setPreferredSize(new java.awt.Dimension(130, 50));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botones_panelLayout = new javax.swing.GroupLayout(botones_panel);
        botones_panel.setLayout(botones_panelLayout);
        botones_panelLayout.setHorizontalGroup(
            botones_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botones_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botones_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pruebas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_generador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(botones_panelLayout.createSequentialGroup()
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_creditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        botones_panelLayout.setVerticalGroup(
            botones_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botones_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(botones_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_generador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(botones_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 101, -1, -1));

        encabezado_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Números Pseudoaleatorios - Algoritmo Lineal");

        javax.swing.GroupLayout encabezado_panelLayout = new javax.swing.GroupLayout(encabezado_panel);
        encabezado_panel.setLayout(encabezado_panelLayout);
        encabezado_panelLayout.setHorizontalGroup(
            encabezado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado_panelLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel2)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        encabezado_panelLayout.setVerticalGroup(
            encabezado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(encabezado_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1230, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numpseudoaleatorio/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generadorActionPerformed
        generador_panel.setVisible(true);
    }//GEN-LAST:event_btn_generadorActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditosActionPerformed
        Acerca Acerca = new Acerca();
        Acerca.setVisible(true);
        
        
    }//GEN-LAST:event_btn_creditosActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if(seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionar.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String documento = AbrirArchivo(archivo);
                    txtArea.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "El archivo no es compatible");
                }
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String documento = txtArea.getText();
                String mensaje = GuardarArchivo(archivo, documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    JOptionPane.showMessageDialog(null, "El archivo no es compatible");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Extensión de archivo inválida");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        if (text_semilla.getText().length() == 0 || text_cmultiplicativa.getText().length() == 0 || text_caditiva.getText().length() == 0 || text_modulo.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Datos faltantes");
            return; 
   }
        
        int semilla, cmultiplicativa, caditiva, modulo; 
        int i, numero;  
        double numero2 = 0;
        String cadenaResultado = "Los resultados son: ";
        
        semilla = Integer.parseInt(text_semilla.getText());
        cmultiplicativa = Integer.parseInt(text_cmultiplicativa.getText());
        caditiva = Integer.parseInt(text_caditiva.getText());
        modulo = Integer.parseInt(text_modulo.getText());
        
        
        
        for (i=1; i<=4096; i++){
            numero = (cmultiplicativa*semilla + caditiva) % modulo;   
            numero2 = (double)numero / (double)(modulo-1);
            //System.out.printf("%d. %d (%.4f)\n", i ,numero ,numero2 );
            cadenaResultado +=("\n" + " r" +i + ": " + numero2 + "\n");
            ArrayResultados.add(numero2);
            semilla = numero;  
        }
        txtArea.setText(cadenaResultado);
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void btn_pruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pruebasActionPerformed
        Pruebas pruebas = new Pruebas();
        pruebas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_pruebasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NumPseudoaleatorio_Frame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones_panel;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_creditos;
    private javax.swing.JButton btn_generador;
    private javax.swing.JButton btn_pruebas;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel encabezado_panel;
    private javax.swing.JPanel generador_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text_caditiva;
    private javax.swing.JTextField text_cmultiplicativa;
    private javax.swing.JTextField text_modulo;
    private javax.swing.JTextField text_semilla;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
