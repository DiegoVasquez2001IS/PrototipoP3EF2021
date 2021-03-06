/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Diego
 */
public class JFrmMDI extends javax.swing.JFrame {

    /**
     * Creates new form JFrmMDI
     */
    public JFrmMDI() {
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

        JDPMDIContainer = new javax.swing.JDesktopPane();
        JMenuBarMDI = new javax.swing.JMenuBar();
        JMenuItenCS = new javax.swing.JMenu();
        JMICS = new javax.swing.JMenuItem();
        JMenuCatalogos = new javax.swing.JMenu();
        Amadellaves = new javax.swing.JMenuItem();
        Habitaciones = new javax.swing.JMenuItem();
        Servicios = new javax.swing.JMenuItem();
        Formasdepago = new javax.swing.JMenuItem();
        Huespedes = new javax.swing.JMenuItem();
        Pisos = new javax.swing.JMenuItem();
        JMenuProcesos = new javax.swing.JMenu();
        Facturarhabitacion = new javax.swing.JMenuItem();
        JMenuInformes = new javax.swing.JMenu();
        JMenuHerramientas = new javax.swing.JMenu();
        JMenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotelería [Diego Vásquez - 9959 - 19 - 19543]");
        setResizable(false);

        JDPMDIContainer.setBackground(new java.awt.Color(10, 40, 50));

        javax.swing.GroupLayout JDPMDIContainerLayout = new javax.swing.GroupLayout(JDPMDIContainer);
        JDPMDIContainer.setLayout(JDPMDIContainerLayout);
        JDPMDIContainerLayout.setHorizontalGroup(
            JDPMDIContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        JDPMDIContainerLayout.setVerticalGroup(
            JDPMDIContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );

        JMenuItenCS.setText("Archivo");
        JMenuItenCS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JMICS.setText("Cerrar Sesión");
        JMICS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICSActionPerformed(evt);
            }
        });
        JMenuItenCS.add(JMICS);

        JMenuBarMDI.add(JMenuItenCS);

        JMenuCatalogos.setText("Catálogos");
        JMenuCatalogos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Amadellaves.setText("Ama de Llaves");
        Amadellaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmadellavesActionPerformed(evt);
            }
        });
        JMenuCatalogos.add(Amadellaves);

        Habitaciones.setText("Habitaciones");
        Habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitacionesActionPerformed(evt);
            }
        });
        JMenuCatalogos.add(Habitaciones);

        Servicios.setText("Servicios");
        Servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiciosActionPerformed(evt);
            }
        });
        JMenuCatalogos.add(Servicios);

        Formasdepago.setText("Formas de Pago");
        Formasdepago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormasdepagoActionPerformed(evt);
            }
        });
        JMenuCatalogos.add(Formasdepago);

        Huespedes.setText("Huespedes");
        Huespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuespedesActionPerformed(evt);
            }
        });
        JMenuCatalogos.add(Huespedes);

        Pisos.setText("Pisos");
        Pisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PisosActionPerformed(evt);
            }
        });
        JMenuCatalogos.add(Pisos);

        JMenuBarMDI.add(JMenuCatalogos);

        JMenuProcesos.setText("Procesos");
        JMenuProcesos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Facturarhabitacion.setText("Facturar Habitación");
        Facturarhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarhabitacionActionPerformed(evt);
            }
        });
        JMenuProcesos.add(Facturarhabitacion);

        JMenuBarMDI.add(JMenuProcesos);

        JMenuInformes.setText("Informes");
        JMenuInformes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JMenuBarMDI.add(JMenuInformes);

        JMenuHerramientas.setText("Herramientas");
        JMenuHerramientas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JMenuBarMDI.add(JMenuHerramientas);

        JMenuAyuda.setText("Ayuda");
        JMenuAyuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JMenuBarMDI.add(JMenuAyuda);

        setJMenuBar(JMenuBarMDI);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPMDIContainer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPMDIContainer)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMICSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICSActionPerformed
        /*===== OPERACIÓN CERRAR SESIÓN ====
        Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
            JFrmLogin frmLogin = new JFrmLogin();
            frmLogin.setVisible(true);
        }
    }//GEN-LAST:event_JMICSActionPerformed

    private void AmadellavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmadellavesActionPerformed
        Mantenimiento_AmaDeLlaves frmAmadellaves = new Mantenimiento_AmaDeLlaves();
        frmAmadellaves.setVisible(true);
        JDPMDIContainer.add(frmAmadellaves);
    }//GEN-LAST:event_AmadellavesActionPerformed

    private void HabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitacionesActionPerformed
        Mantenimiento_habitaciones frmMantHab = new Mantenimiento_habitaciones();
        frmMantHab.setVisible(true);
        JDPMDIContainer.add(frmMantHab);
    }//GEN-LAST:event_HabitacionesActionPerformed

    private void ServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiciosActionPerformed
        Mantenimiento_Servicios frmMantServ = new Mantenimiento_Servicios();
        frmMantServ.setVisible(true);
        JDPMDIContainer.add(frmMantServ);
    }//GEN-LAST:event_ServiciosActionPerformed

    private void FormasdepagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormasdepagoActionPerformed
        Mantenimiento_FormasDePago frmMantFP = new Mantenimiento_FormasDePago();
        frmMantFP.setVisible(true);
        JDPMDIContainer.add(frmMantFP);
    }//GEN-LAST:event_FormasdepagoActionPerformed

    private void HuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuespedesActionPerformed
        Mantenimiento_Huespedes frmMantHP = new Mantenimiento_Huespedes();
        frmMantHP.setVisible(true);
        JDPMDIContainer.add(frmMantHP);
    }//GEN-LAST:event_HuespedesActionPerformed

    private void PisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PisosActionPerformed
        Mantenimiento_Pisos frmMantPisos = new Mantenimiento_Pisos();
        frmMantPisos.setVisible(true);
        JDPMDIContainer.add(frmMantPisos);
    }//GEN-LAST:event_PisosActionPerformed

    private void FacturarhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarhabitacionActionPerformed
        FacturacionDeHabitacion frmProceso = new FacturacionDeHabitacion();
        frmProceso.setVisible(true);
        JDPMDIContainer.add(frmProceso);
    }//GEN-LAST:event_FacturarhabitacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //CAMBIANDO LA INTERFAZ POR DEFECTO DE NETBEANS
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Amadellaves;
    private javax.swing.JMenuItem Facturarhabitacion;
    private javax.swing.JMenuItem Formasdepago;
    private javax.swing.JMenuItem Habitaciones;
    private javax.swing.JMenuItem Huespedes;
    private javax.swing.JDesktopPane JDPMDIContainer;
    private javax.swing.JMenuItem JMICS;
    private javax.swing.JMenu JMenuAyuda;
    private javax.swing.JMenuBar JMenuBarMDI;
    private javax.swing.JMenu JMenuCatalogos;
    private javax.swing.JMenu JMenuHerramientas;
    private javax.swing.JMenu JMenuInformes;
    private javax.swing.JMenu JMenuItenCS;
    private javax.swing.JMenu JMenuProcesos;
    private javax.swing.JMenuItem Pisos;
    private javax.swing.JMenuItem Servicios;
    // End of variables declaration//GEN-END:variables
}
