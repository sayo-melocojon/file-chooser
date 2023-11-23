package filechooser;

import java.awt.Color;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 ** @author sayo-melocoton
 * 
 * 
 */
public class JFrame_fileChooser extends javax.swing.JFrame {
    File archivo;
    int xMouse, yMouse;
    public JFrame_fileChooser() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaTexto = new javax.swing.JTextArea();
        pnlSeparador = new javax.swing.JPanel();
        menbBarras = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        meniAbrir = new javax.swing.JMenuItem();
        meniGuardar = new javax.swing.JMenuItem();
        meniCerrar = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        menuColores = new javax.swing.JMenu();
        meniRojo = new javax.swing.JMenuItem();
        meniVerde = new javax.swing.JMenuItem();
        meniAzul = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenu();
        meniCreador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(43, 43, 55));

        txtaTexto.setBackground(new java.awt.Color(90, 90, 133));
        txtaTexto.setColumns(20);
        txtaTexto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtaTexto.setForeground(new java.awt.Color(255, 255, 255));
        txtaTexto.setRows(5);
        txtaTexto.setBorder(null);
        jScrollPane1.setViewportView(txtaTexto);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pnlSeparador.setBackground(new java.awt.Color(90, 90, 133));

        javax.swing.GroupLayout pnlSeparadorLayout = new javax.swing.GroupLayout(pnlSeparador);
        pnlSeparador.setLayout(pnlSeparadorLayout);
        pnlSeparadorLayout.setHorizontalGroup(
            pnlSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        pnlSeparadorLayout.setVerticalGroup(
            pnlSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(pnlSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 10));

        menbBarras.setBackground(new java.awt.Color(90, 90, 133));
        menbBarras.setBorder(null);
        menbBarras.setForeground(new java.awt.Color(255, 255, 255));
        menbBarras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menbBarrasMouseDragged(evt);
            }
        });
        menbBarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menbBarrasMousePressed(evt);
            }
        });

        menuArchivo.setBorder(null);
        menuArchivo.setText("Archivo");
        menuArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuArchivo.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        menuArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        meniAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        meniAbrir.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        meniAbrir.setForeground(new java.awt.Color(39, 40, 43));
        meniAbrir.setText("Abrir");
        meniAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(meniAbrir);

        meniGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        meniGuardar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        meniGuardar.setForeground(new java.awt.Color(39, 40, 43));
        meniGuardar.setText("Guardar");
        meniGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(meniGuardar);

        meniCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        meniCerrar.setBackground(new java.awt.Color(255, 0, 51));
        meniCerrar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        meniCerrar.setForeground(new java.awt.Color(39, 40, 43));
        meniCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/20_Badge.png"))); // NOI18N
        meniCerrar.setText("Cerrar");
        meniCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(meniCerrar);

        menbBarras.add(menuArchivo);

        menuEdicion.setBorder(null);
        menuEdicion.setText("Edición");
        menuEdicion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuEdicion.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        menuEdicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        menuColores.setText("Colores");

        meniRojo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        meniRojo.setForeground(new java.awt.Color(255, 51, 51));
        meniRojo.setText("●");
        meniRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniRojoActionPerformed(evt);
            }
        });
        menuColores.add(meniRojo);

        meniVerde.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        meniVerde.setForeground(new java.awt.Color(51, 255, 51));
        meniVerde.setText("●");
        meniVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniVerdeActionPerformed(evt);
            }
        });
        menuColores.add(meniVerde);

        meniAzul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        meniAzul.setForeground(new java.awt.Color(51, 153, 255));
        meniAzul.setText("●");
        meniAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniAzulActionPerformed(evt);
            }
        });
        menuColores.add(meniAzul);

        menuEdicion.add(menuColores);

        menbBarras.add(menuEdicion);

        menuAcercaDe.setBorder(null);
        menuAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/25_exclamacion.png"))); // NOI18N
        menuAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        meniCreador.setBackground(new java.awt.Color(39, 40, 43));
        meniCreador.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        meniCreador.setForeground(new java.awt.Color(255, 255, 255));
        meniCreador.setText("Creador");
        meniCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniCreadorActionPerformed(evt);
            }
        });
        menuAcercaDe.add(meniCreador);

        menbBarras.add(menuAcercaDe);

        setJMenuBar(menbBarras);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meniAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniAbrirActionPerformed
            //Abrir archivo...
        JFileChooser escoje = new JFileChooser();
        int seleccion = escoje.showOpenDialog(null);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            archivo = escoje.getSelectedFile();
            try{
                FileReader lector = new FileReader(archivo);
                BufferedReader buffer = new BufferedReader(lector);
                String linea;
                    //Leer las lineas del documento de texto.
                while((linea = buffer.readLine()) != null){
                    txtaTexto.append(linea+"\n");
                }
            }catch(IOException excepcion){ //En caso de error...
                excepcion.printStackTrace();
            }
        }
    }//GEN-LAST:event_meniAbrirActionPerformed

    private void meniGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniGuardarActionPerformed
            //Guardar archivo.
        try{
            BufferedWriter bufferEscritor= new BufferedWriter(new FileWriter(archivo));
            bufferEscritor.write(txtaTexto.getText());
            bufferEscritor.close();
            txtaTexto.setText(null);
        }catch(IOException excepcion){
            excepcion.printStackTrace();
        }
    }//GEN-LAST:event_meniGuardarActionPerformed

    private void meniCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniCerrarActionPerformed
            //Cerrar programa
        System.exit(0);
    }//GEN-LAST:event_meniCerrarActionPerformed
    //Menu colores.
    private void meniRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniRojoActionPerformed
            //Cambiar color a rojo
        mainPanel.setBackground(Color.decode("#62162f"));
        pnlSeparador.setBackground(Color.decode("#ff3936"));
        txtaTexto.setBackground(Color.decode("#ff3936"));
        menbBarras.setBackground(Color.decode("#ff3936"));
    }//GEN-LAST:event_meniRojoActionPerformed

    private void meniVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniVerdeActionPerformed
        mainPanel.setBackground(Color.decode("#1d3d33"));
        pnlSeparador.setBackground(Color.decode("#2a8c4a"));
        txtaTexto.setBackground(Color.decode("#2a8c4a"));
        menbBarras.setBackground(Color.decode("#2a8c4a"));
    }//GEN-LAST:event_meniVerdeActionPerformed

    private void meniAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniAzulActionPerformed
        mainPanel.setBackground(Color.decode("#2d2166"));
        pnlSeparador.setBackground(Color.decode("#6347ee"));
        txtaTexto.setBackground(Color.decode("#6347ee"));
        menbBarras.setBackground(Color.decode("#6347ee"));
    }//GEN-LAST:event_meniAzulActionPerformed

    private void meniCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniCreadorActionPerformed
        JOptionPane.showMessageDialog(null,"Ricardo Daniel Hernández Sosa (PlansVsAngry999).");
    }//GEN-LAST:event_meniCreadorActionPerformed

    private void menbBarrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menbBarrasMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_menbBarrasMousePressed

    private void menbBarrasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menbBarrasMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_menbBarrasMouseDragged

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
            java.util.logging.Logger.getLogger(JFrame_fileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_fileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_fileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_fileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_fileChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menbBarras;
    private javax.swing.JMenuItem meniAbrir;
    private javax.swing.JMenuItem meniAzul;
    private javax.swing.JMenuItem meniCerrar;
    private javax.swing.JMenuItem meniCreador;
    private javax.swing.JMenuItem meniGuardar;
    private javax.swing.JMenuItem meniRojo;
    private javax.swing.JMenuItem meniVerde;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuColores;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JPanel pnlSeparador;
    private javax.swing.JTextArea txtaTexto;
    // End of variables declaration//GEN-END:variables
}
