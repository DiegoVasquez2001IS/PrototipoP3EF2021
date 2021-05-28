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
 * @author Diego Vásquez
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
        JMenuItemFacultades = new javax.swing.JMenuItem();
        JMenuProcesos = new javax.swing.JMenu();
        JMenuAsignaciones = new javax.swing.JMenu();
        JMenuItemAsigCA = new javax.swing.JMenuItem();
        JMenuItemAsigCC = new javax.swing.JMenuItem();
        JMenuItemIN = new javax.swing.JMenuItem();
        JMenuItemRegAct = new javax.swing.JMenuItem();
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

        JMICS.setText("Cerrar Sesión");
        JMICS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICSActionPerformed(evt);
            }
        });
        JMenuItenCS.add(JMICS);

        JMenuBarMDI.add(JMenuItenCS);

        JMenuCatalogos.setText("Catálogos");

        JMenuItemFacultades.setText("Facultades");
        JMenuItemFacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemFacultadesActionPerformed(evt);
            }
        });
        JMenuCatalogos.add(JMenuItemFacultades);

        JMenuBarMDI.add(JMenuCatalogos);

        JMenuProcesos.setText("Procesos");

        JMenuAsignaciones.setText("Asignaciones");

        JMenuItemAsigCA.setText("Cursos a Alumnos");
        JMenuAsignaciones.add(JMenuItemAsigCA);

        JMenuItemAsigCC.setText("Cursos a Catedráticos");
        JMenuAsignaciones.add(JMenuItemAsigCC);

        JMenuProcesos.add(JMenuAsignaciones);

        JMenuItemIN.setText("Ingreso Notas");
        JMenuProcesos.add(JMenuItemIN);

        JMenuItemRegAct.setText("Registo Actas");
        JMenuProcesos.add(JMenuItemRegAct);

        JMenuBarMDI.add(JMenuProcesos);

        JMenuInformes.setText("Informes");
        JMenuBarMDI.add(JMenuInformes);

        JMenuHerramientas.setText("Herramientas");
        JMenuBarMDI.add(JMenuHerramientas);

        JMenuAyuda.setText("Ayuda");
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

    private void JMenuItemFacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemFacultadesActionPerformed
        /*JIntFrmMantFacultades jintfrm_mantfacultades = null;
        try {
            jintfrm_mantfacultades = new JIntFrmMantFacultades();
        } catch (SQLException ex) {
            Logger.getLogger(JFrmMDI.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dimension main_window_size =  JDPMDIContainer.getSize();
        Dimension second_window_size = jintfrm_mantfacultades.getSize();
        jintfrm_mantfacultades.setLocation((main_window_size.width - second_window_size.width) / 2, (main_window_size.height - second_window_size.height) / 2);
        jintfrm_mantfacultades.setVisible(true);
        JDPMDIContainer.add(jintfrm_mantfacultades);*/
    }//GEN-LAST:event_JMenuItemFacultadesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //CAMBIANDO LA INTERFAZ POR DEFECTO DE NETBEANS
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }
        catch(Exception ex){
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
    private javax.swing.JDesktopPane JDPMDIContainer;
    private javax.swing.JMenuItem JMICS;
    private javax.swing.JMenu JMenuAsignaciones;
    private javax.swing.JMenu JMenuAyuda;
    private javax.swing.JMenuBar JMenuBarMDI;
    private javax.swing.JMenu JMenuCatalogos;
    private javax.swing.JMenu JMenuHerramientas;
    private javax.swing.JMenu JMenuInformes;
    private javax.swing.JMenuItem JMenuItemAsigCA;
    private javax.swing.JMenuItem JMenuItemAsigCC;
    private javax.swing.JMenuItem JMenuItemFacultades;
    private javax.swing.JMenuItem JMenuItemIN;
    private javax.swing.JMenuItem JMenuItemRegAct;
    private javax.swing.JMenu JMenuItenCS;
    private javax.swing.JMenu JMenuProcesos;
    // End of variables declaration//GEN-END:variables
}
