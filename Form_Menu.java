package Clases;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Form_Menu extends javax.swing.JFrame {

    private Form_Agregar formAgregar;
    private Form_Eliminar formEliminar;
    private Form_Buscar formBuscar;
    private Form_Modificar formModificar;

    /**
     * Creates new form Form_Menu
     */
    
    public Form_Menu() {
        initComponents();
        UtilidadesVentana.centrarVentana(this);
        btnMenuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAgregarActionPerformed(evt);
            }
        });
        btnMenuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuEliminarActionPerformed(evt);
            }
        });
        btnBuscarCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBuscarActionPerformed(evt);
            }
        });
        btnMenuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuModificarActionPerformed(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscarCamion = new javax.swing.JButton();
        btnMenuAgregar = new javax.swing.JButton();
        btnMenuEliminar = new javax.swing.JButton();
        btnMenuModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscarCamion.setText("Buscar un Camion");
        btnBuscarCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCamionActionPerformed(evt);
            }
        });

        btnMenuAgregar.setText("Registrar un nuevo camion");

        btnMenuEliminar.setText("Retirar un Camion del sistema");

        btnMenuModificar.setText("Modificar datos de un camion");

        jLabel1.setText("Menu");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBuscarCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCamion)
                .addGap(11, 11, 11)
                .addComponent(btnMenuAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuModificar)
                .addGap(34, 34, 34)
                .addComponent(btnSalir)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCamionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCamionActionPerformed
    // TODO add your handling code here:


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMenuAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        formAgregar = new Form_Agregar();
        formAgregar.setVisible(true);
    }

    private void btnMenuEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        formEliminar = new Form_Eliminar();
        formEliminar.setVisible(true);
    }

    private void btnMenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        formBuscar = new Form_Buscar();
        formBuscar.setVisible(true);
    }

    private void btnMenuModificarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        formModificar = new Form_Modificar();
        formModificar.setVisible(true);
    }

public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(() -> {
        Form_Menu formMenu = new Form_Menu();
        formMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Consulta si esta seguro de cerrar el programa.
        formMenu.setVisible(true);
    });
    
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCamion;
    private javax.swing.JButton btnMenuAgregar;
    private javax.swing.JButton btnMenuEliminar;
    private javax.swing.JButton btnMenuModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
