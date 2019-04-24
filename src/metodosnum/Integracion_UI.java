/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnum;

import funcion.Funcion;
import java.awt.Component;
import javax.swing.JTextField;
import metodos.Simpson;
import metodos.Trapecio;
import shane.Dialogs;
import shane.Utils;
/**
 *
 * @author Uli Gibson
 */
public class Integracion_UI extends javax.swing.JFrame {

    
    
    
    /**
     * Creates new form Simpson_UI
     */
    public Integracion_UI(int metodo) {
        initComponents();
        openAcerca();
        txt_a.requestFocus();
        this.getRootPane().setDefaultButton(btn_ObtenerRes);
        buttonGroup_Metodos.add(radioBtn_Simpson);
        buttonGroup_Metodos.add(radioBtn_Trapecio);
        if(metodo == 5)         radioBtn_Simpson.setSelected(true);
        else if(metodo == 6)    radioBtn_Trapecio.setSelected(true);
    }
    
    private void openAcerca() {
        AcercaDe vA = new AcercaDe();
        vA.setVisible(true);
        vA.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Metodos = new javax.swing.ButtonGroup();
        panel_Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Resultado = new javax.swing.JLabel();
        btn_ObtenerRes = new javax.swing.JButton();
        panel_parametros = new javax.swing.JPanel();
        img_Integral = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        txt_n = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_funcion = new javax.swing.JTextField();
        txt_b = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioBtn_Simpson = new javax.swing.JRadioButton();
        radioBtn_Trapecio = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESUELVE INTEGRALES DEFINIDAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("RESULTADO:");

        lbl_Resultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_Resultado.setText("0.0");

        btn_ObtenerRes.setBackground(new java.awt.Color(140, 193, 235));
        btn_ObtenerRes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ObtenerRes.setText("Obtener resultado");
        btn_ObtenerRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ObtenerResActionPerformed(evt);
            }
        });

        panel_parametros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parámetros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        img_Integral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/integral.png"))); // NOI18N

        txt_a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aActionPerformed(evt);
            }
        });

        txt_n.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_n.setText("20");
        txt_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("n:");

        txt_funcion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_funcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_funcionActionPerformed(evt);
            }
        });

        txt_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("dx");

        javax.swing.GroupLayout panel_parametrosLayout = new javax.swing.GroupLayout(panel_parametros);
        panel_parametros.setLayout(panel_parametrosLayout);
        panel_parametrosLayout.setHorizontalGroup(
            panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_parametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_parametrosLayout.createSequentialGroup()
                        .addGroup(panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img_Integral, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_parametrosLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_n, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_parametrosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))))
                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_parametrosLayout.setVerticalGroup(
            panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_parametrosLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_parametrosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img_Integral, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_parametrosLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Método", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        radioBtn_Simpson.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioBtn_Simpson.setSelected(true);
        radioBtn_Simpson.setText(" Simpson");

        radioBtn_Trapecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioBtn_Trapecio.setText(" Trapecio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(radioBtn_Simpson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioBtn_Trapecio)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtn_Simpson)
                    .addComponent(radioBtn_Trapecio))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_parametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btn_ObtenerRes))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Resultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_parametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_ObtenerRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_Resultado))
                .addGap(32, 32, 32))
        );

        jMenu2.setText("Acerca de");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ObtenerResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ObtenerResActionPerformed
        // TODO add your handling code here:
        if (checkParametros()) {

            if(Integer.valueOf(txt_n.getText()) % 2 != 0 && radioBtn_Simpson.isSelected()) {
                Dialogs.ErrorMsg("El parametro 'n' tiene que ser par !!");
                return;
            }
            
            funcion.Funcion f = new Funcion(txt_funcion.getText(), false);
            Double res = null;

            if (radioBtn_Simpson.isSelected())          res = new Simpson().evaluar(f, Double.valueOf(txt_a.getText()), Double.valueOf(txt_b.getText()), Integer.valueOf(txt_n.getText()));
            else if (radioBtn_Trapecio.isSelected())    res = new Trapecio().evaluar(f, Double.valueOf(txt_a.getText()), Double.valueOf(txt_b.getText()), Integer.valueOf(txt_n.getText()));

            if (res != null) {
                lbl_Resultado.setText(String.valueOf(Utils.truncateDouble(res, 6)));
            } else {
                Dialogs.ErrorMsg(String.format("La funcion introducida \"%s\" no es válida", txt_funcion.getText()));
                txt_funcion.requestFocus();
                txt_funcion.selectAll();
            }

        } else {
            Dialogs.InfoMsg("Debes llenar todos los parametros...");
        }
    }//GEN-LAST:event_btn_ObtenerResActionPerformed

    private void txt_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aActionPerformed
        // TODO add your handling code here:
        txt_b.requestFocus();
    }//GEN-LAST:event_txt_aActionPerformed

    private void txt_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bActionPerformed
        // TODO add your handling code here:
        txt_funcion.requestFocus();
    }//GEN-LAST:event_txt_bActionPerformed

    private void txt_funcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_funcionActionPerformed
        // TODO add your handling code here:
        txt_n.requestFocus();
    }//GEN-LAST:event_txt_funcionActionPerformed

    private void txt_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nActionPerformed
        // TODO add your handling code here:
        btn_ObtenerRes.requestFocus();
    }//GEN-LAST:event_txt_nActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        openAcerca();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private boolean checkParametros() 
    {
        for(Component c : panel_parametros.getComponents()) {
            if(c instanceof JTextField) {
                JTextField txt = (JTextField)c;
                if(txt.getText().trim().length() == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ObtenerRes;
    private javax.swing.ButtonGroup buttonGroup_Metodos;
    private javax.swing.JLabel img_Integral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Resultado;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JPanel panel_parametros;
    private javax.swing.JRadioButton radioBtn_Simpson;
    private javax.swing.JRadioButton radioBtn_Trapecio;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_b;
    private javax.swing.JTextField txt_funcion;
    private javax.swing.JTextField txt_n;
    // End of variables declaration//GEN-END:variables
}
