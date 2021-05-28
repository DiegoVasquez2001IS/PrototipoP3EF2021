/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.io.File;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.HabitacionesDAO;
import Controlador.Habitaciones;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/*import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;*/
/**
 *
 * @author Jeff
 */
public class Mantenimiento_habitaciones extends javax.swing.JInternalFrame {

    HabitacionesDAO cargarCombobox = new HabitacionesDAO();
    DefaultTableModel modelo1;
    DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
    String codigoAplicacion = "2300";

    /**
     * Creates new form MantenimientoAplicacion
     */
    public Mantenimiento_habitaciones() {
        initComponents();
        tabla();
        cargarCombobox.query2(cbxPiso);
    }

    public void tabla() {

        modelo1 = new DefaultTableModel();
        modelo1.addColumn("ID");
        modelo1.addColumn("Descripcion");
        modelo1.addColumn("Precio Diario");
        modelo1.addColumn("Piso");
        modelo1.addColumn("Estado");
        modelo1.addColumn("Tipo");
        modelo1.addColumn("cantidad_maxima_pers");

        jTable.setModel(modelo1);

        String datos[] = new String[7];
        HabitacionesDAO habitacionesDAO = new HabitacionesDAO();
        List<Habitaciones> habitaciones = habitacionesDAO.select();
        for (Habitaciones habitacion : habitaciones) {
            datos[0] = String.valueOf(habitacion.getId_Habitaciones());
            datos[1] = habitacion.getDescripcion();
            datos[2] = String.valueOf(habitacion.getPrecio());
            datos[3] = String.valueOf(habitacion.getPiso());
            datos[4] = String.valueOf(habitacion.getEstado_Habitacion());
            datos[5] = habitacion.getTipo_Habitacion();
            datos[6] = habitacion.getMax_personas();

            modelo1.addRow(datos);
            jTable.setModel(modelo1);

        }
    }

    public void limpiar() {
        txtId.setText("");
        txtDescripcion.setText("");
        txt_max.setText("");
        cbxPiso.setSelectedIndex(0);
        txtPrecio.setText("");
        cbxTipo.setSelectedIndex(0);
        txtBuscar.setText("");

    }

    /*private void GuardarEnBitacora(String accion, String codigoModulo, String idUsuario) {
        BitacoraDao BitacoraDAO = new BitacoraDao();
        Bitacora AInsertar = new Bitacora();
        boolean estado = false;
        switch (accion) {
            case "Insertar":
                AInsertar.setId_Usuario(idUsuario);
                AInsertar.setAccion("Inserción");
                AInsertar.setCodigoAplicacion(codigoModulo);
                estado = true;
                break;
            case "Modificacion":
                AInsertar.setId_Usuario(idUsuario);
                AInsertar.setAccion("Modificación");
                AInsertar.setCodigoAplicacion(codigoModulo);
                estado = true;
                break;
            case "Eliminacion":
                AInsertar.setId_Usuario(idUsuario);
                AInsertar.setAccion("Eliminar");
                AInsertar.setCodigoAplicacion(codigoModulo);
                estado = true;
        }
        if (estado == true) {
            try {
                BitacoraDAO.insert(AInsertar);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblModulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxPiso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jradioDisponible = new javax.swing.JRadioButton();
        jradioOcupado = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txt_max = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Habitaciones\n");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Habitaciones"));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Buscar:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(304, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("agregar habitaciones"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Precio Diario");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Piso:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tipo:");

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAyuda.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Estado:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Individual", "Matrimonial", "Familiar" }));

        buttonGroup1.add(jradioDisponible);
        jradioDisponible.setText("Disponible");

        buttonGroup1.add(jradioOcupado);
        jradioOcupado.setText("Ocupado");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Max. de Personas:");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Reportes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 103, Short.MAX_VALUE)
                        .addComponent(cbxPiso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificar)
                            .addComponent(jradioDisponible))
                        .addGap(18, 18, 18)
                        .addComponent(jradioOcupado))
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_max, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jradioDisponible)
                    .addComponent(jradioOcupado)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnAyuda))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModulo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(lblModulo)
                .addGap(292, 292, 292))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Mantenimiento habitaciones");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Habitaciones habitaciones = new Habitaciones();
        HabitacionesDAO habitacionesDAO = new HabitacionesDAO();

        String cbx_piso = cbxPiso.getSelectedItem().toString();
        String cbx_tipo = cbxTipo.getSelectedItem().toString();
        String tipo = String.valueOf(cbxTipo.getSelectedItem());

        if (txtId.getText().length() != 0 && txtDescripcion.getText().length() != 0
                && txtPrecio.getText().length() != 0
                && cbx_piso != "Seleccionar..." && cbx_tipo != "Seleccionar..."
                && jradioDisponible.isSelected() || jradioOcupado.isSelected()) {
            int id = Integer.parseInt(txtId.getText());
            String desc = txtDescripcion.getText();
            String max_pers = txt_max.getText();
            int precio = Integer.parseInt(txtPrecio.getText());
            int piso = cbxPiso.getSelectedIndex();
            habitaciones.setId_Habitaciones(id);
            habitaciones.setDescripcion(desc);
            habitaciones.setMax_personas(max_pers);
            habitaciones.setPrecio(precio);
            habitaciones.setPiso(Integer.parseInt(cbx_piso));
            habitaciones.setPiso(piso);
            habitaciones.setTipo_Habitacion(tipo);
//        habitaciones.setEstado_Habitacion(estado);
            if (jradioDisponible.isSelected()) {
                habitaciones.setEstado_Habitacion(1);
            }
            if (jradioOcupado.isSelected()) {
                habitaciones.setEstado_Habitacion(0);
            }
            habitacionesDAO.insert(habitaciones);

            JOptionPane.showMessageDialog(null, "Habitacion ingresada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.");
        }
        tabla();
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Habitaciones habitaciones_Modificar = new Habitaciones();
        HabitacionesDAO habitacionesDAO = new HabitacionesDAO();
        String cbx_piso = cbxPiso.getSelectedItem().toString();
        String cbx_tipo = cbxTipo.getSelectedItem().toString();

        if (txtId.getText().length() != 0 && txtDescripcion.getText().length() != 0
                && txtPrecio.getText().length() != 0
                && cbx_piso != "Seleccionar..." && cbx_tipo != "Seleccionar..."
                && jradioDisponible.isSelected() || jradioOcupado.isSelected()) {

            int id = Integer.parseInt(txtId.getText());
            String desc = txtDescripcion.getText();
            String max_pers = txt_max.getText();
            int precio = Integer.parseInt(txtPrecio.getText());
            int piso = cbxPiso.getSelectedIndex();
            String tipo = String.valueOf(cbxTipo.getSelectedItem());
            String estado = String.valueOf(cbxTipo.getSelectedItem());

            habitaciones_Modificar.setId_Habitaciones(id);
            habitaciones_Modificar.setDescripcion(desc);
            habitaciones_Modificar.setMax_personas(max_pers);
            habitaciones_Modificar.setPrecio(precio);
            habitaciones_Modificar.setPiso(Integer.parseInt(cbx_piso));
            habitaciones_Modificar.setTipo_Habitacion(tipo);
            if (jradioDisponible.isSelected()) {
                habitaciones_Modificar.setEstado_Habitacion(1);
            }
            if (jradioOcupado.isSelected()) {
                habitaciones_Modificar.setEstado_Habitacion(0);
            }
            habitacionesDAO.update(habitaciones_Modificar);

            JOptionPane.showMessageDialog(null, "Habitacion Modificada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.");
        }
        tabla();
        limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Habitaciones habitaciones_Buscar = new Habitaciones();
        HabitacionesDAO habitacionesDAO = new HabitacionesDAO();
        if (txtBuscar.getText().length() != 0) {
            habitaciones_Buscar.setId_Habitaciones(Integer.parseInt(txtBuscar.getText()));
            habitaciones_Buscar = habitacionesDAO.query(habitaciones_Buscar);

            txtId.setText(String.valueOf(habitaciones_Buscar.getId_Habitaciones()));
            txtDescripcion.setText(String.valueOf(habitaciones_Buscar.getDescripcion()));
            txt_max.setText(habitaciones_Buscar.getMax_personas());
            txtPrecio.setText(String.valueOf(habitaciones_Buscar.getPrecio()));
            cbxPiso.setSelectedItem(habitaciones_Buscar.getPiso());
            cbxTipo.setSelectedItem(String.valueOf(habitaciones_Buscar.getTipo_Habitacion()));
            if (habitaciones_Buscar.getEstado_Habitacion() == 1) {
                jradioDisponible.setSelected(true);
            }
            if (habitaciones_Buscar.getEstado_Habitacion() == 0) {
                jradioOcupado.setSelected(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "campo de busqueda esta vacio");
        }

        // habitacionesDAO.query(habitaciones_Buscar); 
        tabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        try {
            if ((new File("src\\main\\java\\Ayudas\\Ayuda Mantenimiento Habitaciones.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Hoteleria\\ayuda\\Ayuda Mantenimiento Habitaciones.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnAyudaActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jPanel2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2AncestorMoved

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Habitaciones habitaciones_Eliminar = new Habitaciones();
        HabitacionesDAO habitacionesDAO = new HabitacionesDAO();

        if (txtBuscar.getText().length() != 0) {

            habitaciones_Eliminar.setId_Habitaciones(Integer.parseInt(txtBuscar.getText()));
            habitacionesDAO.delete(habitaciones_Eliminar);

            JOptionPane.showMessageDialog(null, "Registro Eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "No puede eliminar si el campo esta vacio");
        }

        tabla();
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        //MDIHoteleria.logo.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
        //MDIHoteleria.logo.setVisible(true);
    }//GEN-LAST:event_formInternalFrameDeactivated
    private Connection connection = null;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        /* Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = ConexionHoteleria.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Hoteleria/reportes/mantHabitaciones.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Mantenimiento Habitaciones");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxPiso;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JRadioButton jradioDisponible;
    private javax.swing.JRadioButton jradioOcupado;
    private javax.swing.JLabel lblModulo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txt_max;
    // End of variables declaration//GEN-END:variables
}
