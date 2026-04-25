/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modulos;

import Logica.LogicaCompleta;

public class Recompensas extends javax.swing.JFrame {
    
    private LogicaCompleta L;
    private Funcionalidades F;

    public Recompensas(LogicaCompleta L, Funcionalidades F) {
    initComponents();
    this.L = L;
    this.F = F;

    setLocationRelativeTo(null);
    actualizar();
}
    
    
    public void actualizar() {
    lblXP.setText("XP: " + L.xpUsuario);
    lblNivel.setText("Nivel: " + L.obtenerNivel());
    lblRango.setText("Rango: " + L.obtenerRango());

    barraXP.setValue(L.progresoNivel());

    txtLogros.setText(L.mostrarLogros());
    txtLeaderboard.setText(L.mostrarLeaderboard());
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblXP = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblRango = new javax.swing.JLabel();
        barraXP = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLeaderboard = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnVolve5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLogros = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblXP.setText("XP:");

        lblNivel.setText("Nivel: ");

        lblRango.setText("Rango: ");

        txtLeaderboard.setColumns(20);
        txtLeaderboard.setRows(5);
        jScrollPane1.setViewportView(txtLeaderboard);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnVolve5.setText("Volver");
        btnVolve5.addActionListener(this::btnVolve5ActionPerformed);

        txtLogros.setColumns(20);
        txtLogros.setRows(5);
        jScrollPane2.setViewportView(txtLogros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolve5)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNivel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRango, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addComponent(lblXP, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblXP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRango)
                        .addGap(18, 18, 18)
                        .addComponent(barraXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnVolve5))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            barraXP.setMaximum(100);

    lblXP.setText("XP: " + L.xpUsuario);
    lblNivel.setText("Nivel: " + L.obtenerNivel());
    lblRango.setText("Rango: " + L.obtenerRango());

    barraXP.setValue(L.progresoNivel());

    txtLogros.setText(L.mostrarLogros());
    txtLeaderboard.setText(L.mostrarLeaderboard());
    
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolve5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolve5ActionPerformed
        F.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnVolve5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraXP;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVolve5;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblRango;
    private javax.swing.JLabel lblXP;
    private javax.swing.JTextArea txtLeaderboard;
    private javax.swing.JTextArea txtLogros;
    // End of variables declaration//GEN-END:variables
}
