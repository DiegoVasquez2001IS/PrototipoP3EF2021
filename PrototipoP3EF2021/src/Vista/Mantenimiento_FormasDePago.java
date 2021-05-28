/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.FormasDePagoDAO;
import Controlador.FormasDePago;
import java.io.File;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;*/

/**
 *
 * @author leone
 */
public class Mantenimiento_FormasDePago extends javax.swing.JInternalFrame {

    DefaultTableModel modelo1;
    DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
    String codigoAplicacion = "2002";

    /**
     * Creates new form Mantenimiento_FomasDePago
     */

    public Mantenimiento_FormasDePago() {
        initComponents();
        limpio.setVisible(false);
        actualizartabla();
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void limpiar() {
        limpio.setSelected(true);
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_descripcion.setText("");
    }

    private void actualizartabla() {
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("CODIGO");
        modelo1.addColumn("NOMBRE");
        modelo1.addColumn("DESCRIPCION");
        modelo1.addColumn("ESTADO");
        tabla.setModel(modelo1);
        centro.setHorizontalAlignment(JLabel.CENTER);
        tabla.getColumnModel().getColumn(2).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(0).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(1).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(3).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(25);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(350);
        FormasDePagoDAO formasdepagodao = new FormasDePagoDAO();
        List<FormasDePago> listarmetodos = formasdepagodao.select();
        String datos[] = new String[4];
        for (FormasDePago listar : listarmetodos) {
            datos[0] = listar.getId();
            datos[1] = listar.getNombre();
            datos[2] = listar.getDescripcion();
            datos[3] = listar.getEstado();
            modelo1.addRow(datos);
            tabla.setModel(modelo1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        activo = new javax.swing.JRadioButton();
        inactivo = new javax.swing.JRadioButton();
        BtnIng = new javax.swing.JButton();
        BtnMod = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        BtnBus = new javax.swing.JButton();
        limpio = new javax.swing.JRadioButton();
        BtnElim = new javax.swing.JButton();
        btn_ayuda = new javax.swing.JButton();
        BtnReporte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento de Formas de Pago");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeactivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("FORMAS DE PAGO:"));

        jLabel1.setText("CODIGO:");

        jLabel2.setText("NOMBRE:");

        jLabel4.setText("DESCRIPCIÓN:");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane2.setViewportView(txt_descripcion);

        jLabel5.setText("ESTADO:");

        buttonGroup1.add(activo);
        activo.setText("ACTIVO");

        buttonGroup1.add(inactivo);
        inactivo.setText("INACTIVO");

        BtnIng.setText("AGREGAR");
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        BtnMod.setText("EDITAR");
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        BtnBus.setText("BUSCAR");
        BtnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusActionPerformed(evt);
            }
        });

        buttonGroup1.add(limpio);

        BtnElim.setText("ELIMINAR");
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        btn_ayuda.setText("AYUDA");
        btn_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayudaActionPerformed(evt);
            }
        });

        BtnReporte.setText("REPORTE");
        BtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnBus, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(activo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inactivo)
                                .addGap(129, 129, 129)
                                .addComponent(limpio)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnIng)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMod)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_ayuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(activo)
                            .addComponent(inactivo)))
                    .addComponent(limpio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ayuda)
                    .addComponent(BtnReporte))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIng)
                    .addComponent(BtnMod)
                    .addComponent(btn_cancelar)
                    .addComponent(BtnElim))
                .addContainerGap())
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed
        if (Mantenimiento_FormasDePago.isNumeric(txt_codigo.getText())) {
            if (txt_codigo.getText().length() != 0 && txt_nombre.getText().length() != 0 && txt_descripcion.getText().length() != 0 && (activo.isSelected()
                    || inactivo.isSelected())) {
                FormasDePagoDAO formasdepagodao = new FormasDePagoDAO();
                FormasDePago guardarmetodo = new FormasDePago();
                guardarmetodo.setId(txt_codigo.getText());
                guardarmetodo.setNombre(txt_nombre.getText());
                guardarmetodo.setDescripcion(txt_descripcion.getText());
                if (activo.isSelected()) {
                    guardarmetodo.setEstado("1");
                } else if (inactivo.isSelected()) {
                    guardarmetodo.setEstado("0");
                }
                formasdepagodao.insert(guardarmetodo);
                actualizartabla();
                
                JOptionPane.showMessageDialog(null, "Metodo de pago guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revise y llene los campos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El codigo del metodo de pago, unicamente pueden ser números");
        }
        limpiar();
    }//GEN-LAST:event_BtnIngActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
        if (Mantenimiento_FormasDePago.isNumeric(txt_codigo.getText())) {
            if (txt_codigo.getText().length() != 0 && txt_nombre.getText().length() != 0 && txt_descripcion.getText().length() != 0 && (activo.isSelected()
                    || inactivo.isSelected())) {
                FormasDePagoDAO formasdepagodao = new FormasDePagoDAO();
                FormasDePago modificarmetodo = new FormasDePago();
                modificarmetodo.setId(txt_codigo.getText());
                modificarmetodo.setNombre(txt_nombre.getText());
                modificarmetodo.setDescripcion(txt_descripcion.getText());
                if (activo.isSelected()) {
                    modificarmetodo.setEstado("1");
                } else if (inactivo.isSelected()) {
                    modificarmetodo.setEstado("0");
                }
                formasdepagodao.update(modificarmetodo);
                actualizartabla();
                
                JOptionPane.showMessageDialog(null, "Metodo de pago actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revise y llene los campos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El codigo del metodo de pago, unicamente pueden ser números");
        }
        limpiar();
    }//GEN-LAST:event_BtnModActionPerformed

    private void BtnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusActionPerformed
        if (Mantenimiento_FormasDePago.isNumeric(txt_codigo.getText())) {

            FormasDePagoDAO formasdepagodao = new FormasDePagoDAO();
            FormasDePago buscarmetodo = new FormasDePago();

            buscarmetodo.setId(txt_codigo.getText());
            buscarmetodo = formasdepagodao.query(buscarmetodo);

            txt_nombre.setText(buscarmetodo.getNombre());
            txt_descripcion.setText(buscarmetodo.getDescripcion());
            if ("0".equals(buscarmetodo.getEstado())) {
                inactivo.setSelected(true);
            } else if ("1".equals(buscarmetodo.getEstado())) {
                activo.setSelected(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El codigo esta vacio y/o el codigo debe de ser solo números");
        }
    }//GEN-LAST:event_BtnBusActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed
        if (Mantenimiento_FormasDePago.isNumeric(txt_codigo.getText())) {
            FormasDePagoDAO formasdepagodao = new FormasDePagoDAO();
            FormasDePago eliminarmetodo = new FormasDePago();
            eliminarmetodo.setId(txt_codigo.getText());
            formasdepagodao.delete(eliminarmetodo);
            JOptionPane.showMessageDialog(null, "Forma de pago eliminado exitosamente");
            actualizartabla();
            limpiar();
            
        } else {
            JOptionPane.showMessageDialog(null, "El codigo de metodo son solamente números");
        }
    }//GEN-LAST:event_BtnElimActionPerformed

    private void btn_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayudaActionPerformed
        try {
            if ((new File("src\\main\\java\\Ayudas\\AyudaFormasDePago.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Hoteleria\\ayuda\\AyudaFormasDePago.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ayudaActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
       // MDIHoteleria.logo.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
       // MDIHoteleria.logo.setVisible(true);
    }//GEN-LAST:event_formInternalFrameDeactivated
    private Connection connection = null;
    private void BtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReporteActionPerformed
        /*Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = ConexionHoteleria.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Hoteleria/reportes/ReportesFormasDePago.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Servicios");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_BtnReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBus;
    private javax.swing.JButton BtnElim;
    private javax.swing.JButton BtnIng;
    private javax.swing.JButton BtnMod;
    private javax.swing.JButton BtnReporte;
    private javax.swing.JRadioButton activo;
    private javax.swing.JButton btn_ayuda;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton inactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton limpio;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
