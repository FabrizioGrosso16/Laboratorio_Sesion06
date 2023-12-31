/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio_semana6;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
/**
 *
 * @author User001
 */
public class FrameEstudiantes extends javax.swing.JFrame {

    private FrameGestordeCursos padre;
    private String cursoSelec;
    DefaultListModel modele = new DefaultListModel();
    List<Alumno> estudiante = new ArrayList<>();

    public FrameEstudiantes(FrameGestordeCursos padre, String cursoSelec) {
        initComponents();
        this.padre = padre;
        lblCursoSelec.setText(cursoSelec); 
    }
    

    public FrameEstudiantes(){
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bttEliminarEst = new javax.swing.JButton();
        bttBuscarEst = new javax.swing.JButton();
        bttAgregarEst = new javax.swing.JButton();
        bttSalirEst = new javax.swing.JButton();
        txtBuscarEst = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiante = new javax.swing.JList<>();
        lblCursoSelec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Lista de Estudiantes");

        bttEliminarEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 12.png"))); // NOI18N
        bttEliminarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarEstActionPerformed(evt);
            }
        });

        bttBuscarEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 18.png"))); // NOI18N
        bttBuscarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarEstActionPerformed(evt);
            }
        });

        bttAgregarEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 11.png"))); // NOI18N
        bttAgregarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarEstActionPerformed(evt);
            }
        });

        bttSalirEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 3.png"))); // NOI18N
        bttSalirEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirEstActionPerformed(evt);
            }
        });

        txtBuscarEst.setText("jTextField1");
        txtBuscarEst.setMaximumSize(new java.awt.Dimension(149, 30));
        txtBuscarEst.setMinimumSize(new java.awt.Dimension(149, 30));

        lstEstudiante.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstEstudiante);

        lblCursoSelec.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCursoSelec.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCursoSelec))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bttBuscarEst))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttEliminarEst)
                            .addComponent(bttAgregarEst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttSalirEst)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCursoSelec))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttBuscarEst)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttAgregarEst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttEliminarEst)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttSalirEst)
                        .addGap(61, 61, 61))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttAgregarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarEstActionPerformed
        
        FrameAgregarEstudiante ventanacurso = new FrameAgregarEstudiante(this);
         ventanacurso.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_bttAgregarEstActionPerformed

    private void bttSalirEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirEstActionPerformed
         this.padre.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bttSalirEstActionPerformed

    private void bttBuscarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarEstActionPerformed
         String textoEstudianteBusqueda = txtBuscarEst.getText();
        for (int i = 0; i < modele.size(); i++) {
        String elemento = (String) modele.getElementAt(i);
        if (elemento.equalsIgnoreCase(textoEstudianteBusqueda)) {
            lstEstudiante.setSelectedIndex(i);
            break;
        }
        }
    }//GEN-LAST:event_bttBuscarEstActionPerformed

    private void bttEliminarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarEstActionPerformed
           int Idx = lstEstudiante.getSelectedIndex();    
     if (Idx != -1) { 
        modele.remove(Idx);
    }
    }//GEN-LAST:event_bttEliminarEstActionPerformed
public void agregarEstudiante(String nombre, String Codigo) {
    Alumno nuevoEstudiante = new Alumno(nombre, Codigo);
    estudiante.add(nuevoEstudiante);
    modele.addElement(nombre);
    lstEstudiante.setModel(modele);
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
            java.util.logging.Logger.getLogger(FrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarEst;
    private javax.swing.JButton bttBuscarEst;
    private javax.swing.JButton bttEliminarEst;
    private javax.swing.JButton bttSalirEst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCursoSelec;
    private javax.swing.JList<String> lstEstudiante;
    private javax.swing.JTextField txtBuscarEst;
    // End of variables declaration//GEN-END:variables
}
