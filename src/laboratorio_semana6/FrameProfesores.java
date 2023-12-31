/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio_semana6;

/**
 *
 * @author User001
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
public class FrameProfesores extends javax.swing.JFrame {

    private FrameGestordeCursos padre; 
    private String cursoSelec;
    private static FrameProfesores instancia;
    DefaultListModel modele = new DefaultListModel<>();
    List<Profesor> profesor = new ArrayList<>();
  
    
    public FrameProfesores(FrameGestordeCursos padre,String cursoSelec) {
        initComponents();
        this.padre = padre; 
        lblCursoSelec.setText(cursoSelec);   
        
    }
    public FrameProfesores() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttEliminarProf = new javax.swing.JButton();
        bttSalirProf = new javax.swing.JButton();
        bttAgregarProf = new javax.swing.JButton();
        bttBuscarProf = new javax.swing.JButton();
        lblListadeProfesoresde = new javax.swing.JLabel();
        lblCursoSelec = new javax.swing.JLabel();
        txtProfesorBus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProfesores = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttEliminarProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 12.png"))); // NOI18N
        bttEliminarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarProfActionPerformed(evt);
            }
        });

        bttSalirProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 3.png"))); // NOI18N
        bttSalirProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirProfActionPerformed(evt);
            }
        });

        bttAgregarProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 11.png"))); // NOI18N
        bttAgregarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarProfActionPerformed(evt);
            }
        });

        bttBuscarProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_semana6/Img/Group 18.png"))); // NOI18N
        bttBuscarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarProfActionPerformed(evt);
            }
        });

        lblListadeProfesoresde.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblListadeProfesoresde.setText("Lista de Profesores de");

        lblCursoSelec.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblCursoSelec.setText("[CursoSelec]");

        txtProfesorBus.setMaximumSize(new java.awt.Dimension(149, 30));
        txtProfesorBus.setMinimumSize(new java.awt.Dimension(149, 30));
        txtProfesorBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfesorBusActionPerformed(evt);
            }
        });

        lstProfesores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstProfesores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblListadeProfesoresde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCursoSelec)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttAgregarProf)
                            .addComponent(bttEliminarProf))
                        .addGap(18, 18, 18)
                        .addComponent(bttSalirProf)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProfesorBus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttBuscarProf)))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListadeProfesoresde)
                    .addComponent(lblCursoSelec))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bttBuscarProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtProfesorBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttAgregarProf)
                        .addGap(18, 18, 18)
                        .addComponent(bttEliminarProf))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bttSalirProf)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttBuscarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarProfActionPerformed
       String textoProfesorBusqueda = txtProfesorBus.getText();
        for (int i = 0; i < modele.size(); i++) {
        String elemento = (String) modele.getElementAt(i);
        if (elemento.equalsIgnoreCase(textoProfesorBusqueda)) {
            lstProfesores.setSelectedIndex(i);
            break;
        }
        }
    }//GEN-LAST:event_bttBuscarProfActionPerformed

    private void bttAgregarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarProfActionPerformed
        
         FrameAgregarProfesor ventanacurso = new FrameAgregarProfesor(this);
         ventanacurso.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_bttAgregarProfActionPerformed

    private void bttSalirProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirProfActionPerformed
         this.padre.setVisible(true);
         this.dispose();
         
    }//GEN-LAST:event_bttSalirProfActionPerformed

    private void bttEliminarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarProfActionPerformed
        int Idx = lstProfesores.getSelectedIndex();    
     if (Idx != -1) { 
        modele.remove(Idx);
    }
    }//GEN-LAST:event_bttEliminarProfActionPerformed

    private void txtProfesorBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfesorBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfesorBusActionPerformed

   public void AgregarProfesor(String nuevoNombre) {
        Profesor profesores = new Profesor(nuevoNombre);
        profesor.add(profesores);
        modele.addElement(nuevoNombre);
        lstProfesores.setModel(modele);
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
            java.util.logging.Logger.getLogger(FrameProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarProf;
    private javax.swing.JButton bttBuscarProf;
    private javax.swing.JButton bttEliminarProf;
    private javax.swing.JButton bttSalirProf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCursoSelec;
    private javax.swing.JLabel lblListadeProfesoresde;
    private javax.swing.JList<String> lstProfesores;
    private javax.swing.JTextField txtProfesorBus;
    // End of variables declaration//GEN-END:variables
}
