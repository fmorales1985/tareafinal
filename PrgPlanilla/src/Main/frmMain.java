/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    DefaultTableModel modelTblPlanilla; 
    public frmMain() {
        initComponents();
        modelTblPlanilla = (DefaultTableModel) tblPlanilla.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlanilla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtSalHora = new javax.swing.JTextField();
        txtHoratrab = new javax.swing.JTextField();
        txtDeduc = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNueva = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuPrestaciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Salario Hora", "Horas Trabajadas", "Salario Bruto", "IHSS", "Deducciones", "Salario Neto"
            }
        ));
        tblPlanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPlanilla.setName("tblPlanilla"); // NOI18N
        tblPlanilla.getTableHeader().setReorderingAllowed(false);
        tblPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlanillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlanilla);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Codigo");

        jLabel4.setText("Salario Hora");

        jLabel5.setText("Horas Trabajadas");

        jLabel6.setText("Deducciones");

        txtApellido.setName(""); // NOI18N

        txtNombre.setName("txtNombre"); // NOI18N

        txtCodigo.setName("txtCodigo"); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtSalHora.setToolTipText("");
        txtSalHora.setName("txtSalHora"); // NOI18N

        txtHoratrab.setName("txtHoratrab"); // NOI18N

        txtDeduc.setName("txtDeduc"); // NOI18N

        btnAgregar.setText("Agregar");
        btnAgregar.setName("btnAgregar"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Seleccionado");
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSalHora)
                    .addComponent(txtHoratrab)
                    .addComponent(txtDeduc, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSalHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtHoratrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDeduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        menuNueva.setText("Nueva Planilla");
        menuNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevaActionPerformed(evt);
            }
        });
        jMenu1.add(menuNueva);

        menuGuardar.setText("Guardar Planilla");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuAbrir.setText("Abrir Planilla");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        menuPrestaciones.setText("Prestaciones");
        menuPrestaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrestacionesActionPerformed(evt);
            }
        });
        jMenu2.add(menuPrestaciones);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        RegistroPlanilla infoEmpleado = new RegistroPlanilla();
        infoEmpleado.setCodigo(txtCodigo.getText());
        infoEmpleado.setNombre(txtNombre.getText());
        infoEmpleado.setApellido(txtApellido.getText());
        infoEmpleado.setDeduccion(Double.parseDouble(txtDeduc.getText()));
        infoEmpleado.setSalHora(Double.parseDouble(txtSalHora.getText()));
        infoEmpleado.setHoraTrab(Integer.parseInt(txtHoratrab.getText()));
       
        agregarEditarFila(infoEmpleado, 1);
        
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tblPlanillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlanillaMouseClicked
        // TODO add your handling code here:
        txtCodigo.setText(String.valueOf(modelTblPlanilla.getValueAt(tblPlanilla.getSelectedRow(), 0)));
        txtNombre.setText(String.valueOf(modelTblPlanilla.getValueAt(tblPlanilla.getSelectedRow(), 1)));
        txtApellido.setText(String.valueOf(modelTblPlanilla.getValueAt(tblPlanilla.getSelectedRow(), 2)));
        txtSalHora.setText(String.valueOf(modelTblPlanilla.getValueAt(tblPlanilla.getSelectedRow(), 3)));
        txtHoratrab.setText(String.valueOf(modelTblPlanilla.getValueAt(tblPlanilla.getSelectedRow(), 4)));
        txtDeduc.setText(String.valueOf(modelTblPlanilla.getValueAt(tblPlanilla.getSelectedRow(), 7)));
    }//GEN-LAST:event_tblPlanillaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        RegistroPlanilla infoEmpleado = new RegistroPlanilla();
        infoEmpleado.setCodigo(txtCodigo.getText());
        infoEmpleado.setNombre(txtNombre.getText());
        infoEmpleado.setApellido(txtApellido.getText());
        infoEmpleado.setDeduccion(Double.parseDouble(txtDeduc.getText()));
        infoEmpleado.setSalHora(Double.parseDouble(txtSalHora.getText()));
        infoEmpleado.setHoraTrab(Integer.parseInt(txtHoratrab.getText()));
        
        agregarEditarFila(infoEmpleado, 2);
        
        limpiar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        modelTblPlanilla.removeRow(tblPlanilla.getSelectedRow());
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        // TODO add your handling code here:
        String fileName = "";
        JFileChooser dlgGuardar = new JFileChooser();
        
        int resp = dlgGuardar.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
          fileName=dlgGuardar.getSelectedFile().getPath();
          try {
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for(int i=0;i<modelTblPlanilla.getRowCount();i++){
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 0)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 1)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 2)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 3)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 4)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 5)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 6)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 7)));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(modelTblPlanilla.getValueAt(i, 8)));
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
            catch(IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al Guardar!", "Planilla", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed

        String fileName = "";
        JFileChooser dlgGuardar = new JFileChooser();
        int resp = dlgGuardar.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            fileName=dlgGuardar.getSelectedFile().getPath();
            String line = null;
            String[] fila = new String[0];
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while((line = bufferedReader.readLine()) != null) {
                    fila = line.split(";");
                    RegistroPlanilla infoEmpleado = new RegistroPlanilla();
                    infoEmpleado.setCodigo(fila[0]);
                    infoEmpleado.setNombre(fila[1]);
                    infoEmpleado.setApellido(fila[2]);
                    infoEmpleado.setSalHora(Double.parseDouble(fila[3]));
                    infoEmpleado.setHoraTrab(Integer.parseInt(fila[4]));
                    infoEmpleado.setDeduccion(Double.parseDouble(fila[7]));
                    agregarEditarFila(infoEmpleado,1);
                    fila = new String[0];
                }   
                // Always close files.
                bufferedReader.close();         
            }
            catch(FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al Abrir "+ fileName, "Planilla", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(IOException ex) {
                 JOptionPane.showMessageDialog(null, "Error al Leer "+ fileName, "Planilla", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaActionPerformed
        // TODO add your handling code here:
        limpiar();
        int rowCount = modelTblPlanilla.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modelTblPlanilla.removeRow(i);
        }
    }//GEN-LAST:event_menuNuevaActionPerformed
    
    private void limpiar(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDeduc.setText("0");
        txtSalHora.setText("0");
        txtHoratrab.setText("0");
    }
    
    private void menuPrestacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrestacionesActionPerformed
        // TODO add your handling code here:
        frmPrestaciones frmprestaciones = new frmPrestaciones();
        frmprestaciones.setVisible(true);
    }//GEN-LAST:event_menuPrestacionesActionPerformed
    
    private void agregarEditarFila(RegistroPlanilla infoEmpleado,int accion){
        infoEmpleado.calcularPago();
        if(accion==1)
        {
            modelTblPlanilla.insertRow(modelTblPlanilla.getRowCount(),new Object[]{infoEmpleado.getCodigo(),infoEmpleado.getNombre(),infoEmpleado.getApellido(),infoEmpleado.getSalHora(),infoEmpleado.getHoraTrab(),infoEmpleado.getSalBruto(),infoEmpleado.getIhss(),infoEmpleado.getDeduccion(), infoEmpleado.getSalNeto()});
        }
        else
        {
            modelTblPlanilla.setValueAt(infoEmpleado.getCodigo(), tblPlanilla.getSelectedRow(), 0);
            modelTblPlanilla.setValueAt(infoEmpleado.getNombre(), tblPlanilla.getSelectedRow(), 1);
            modelTblPlanilla.setValueAt(infoEmpleado.getApellido(), tblPlanilla.getSelectedRow(), 2);
            modelTblPlanilla.setValueAt(infoEmpleado.getSalHora(), tblPlanilla.getSelectedRow(), 3);
            modelTblPlanilla.setValueAt(infoEmpleado.getHoraTrab(), tblPlanilla.getSelectedRow(), 4);
            modelTblPlanilla.setValueAt(infoEmpleado.getSalBruto(), tblPlanilla.getSelectedRow(), 5);
            modelTblPlanilla.setValueAt(infoEmpleado.getIhss(), tblPlanilla.getSelectedRow(), 6);
            modelTblPlanilla.setValueAt(infoEmpleado.getDeduccion(), tblPlanilla.getSelectedRow(), 7);
            modelTblPlanilla.setValueAt(infoEmpleado.getSalNeto(), tblPlanilla.getSelectedRow(), 8);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuNueva;
    private javax.swing.JMenuItem menuPrestaciones;
    private javax.swing.JTable tblPlanilla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDeduc;
    private javax.swing.JTextField txtHoratrab;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalHora;
    // End of variables declaration//GEN-END:variables
}