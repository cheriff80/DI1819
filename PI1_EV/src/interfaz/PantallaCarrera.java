/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import logicaNegocio.LogicaAplicacion;

/**
 *
 * @author esauj
 */
public class PantallaCarrera extends javax.swing.JDialog {

    /**
     * Creates new form PantallaCarrera
     */
    public PantallaCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    PantallaCarrera(PantallaPrincipal aThis, boolean b, LogicaAplicacion logicaAplicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelCarrerasAcabadas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jLabelCarreras = new javax.swing.JLabel();
        jButtonAltaCarrera = new javax.swing.JButton();
        jButtonBajaCarrera = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabelCarrerasAcabadas.setText(org.openide.util.NbBundle.getMessage(PantallaCarrera.class, "PantallaCarrera.jLabelCarrerasAcabadas.text")); // NOI18N

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCarreras);

        jLabelCarreras.setText(org.openide.util.NbBundle.getMessage(PantallaCarrera.class, "PantallaCarrera.jLabelCarreras.text")); // NOI18N

        jButtonAltaCarrera.setText(org.openide.util.NbBundle.getMessage(PantallaCarrera.class, "PantallaCarrera.jButtonAltaCarrera.text")); // NOI18N

        jButtonBajaCarrera.setText(org.openide.util.NbBundle.getMessage(PantallaCarrera.class, "PantallaCarrera.jButtonBajaCarrera.text")); // NOI18N

        jButtonModificar.setText(org.openide.util.NbBundle.getMessage(PantallaCarrera.class, "PantallaCarrera.jButtonModificar.text")); // NOI18N

        jButtonConsultar.setText(org.openide.util.NbBundle.getMessage(PantallaCarrera.class, "PantallaCarrera.jButtonConsultar.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabelCarrerasAcabadas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelCarreras)
                        .addGap(135, 135, 135))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButtonAltaCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBajaCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCarreras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCarrerasAcabadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAltaCarrera)
                    .addComponent(jButtonBajaCarrera)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonConsultar))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaCarrera;
    private javax.swing.JButton jButtonBajaCarrera;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelCarreras;
    private javax.swing.JLabel jLabelCarrerasAcabadas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCarreras;
    // End of variables declaration//GEN-END:variables
}
