/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vue;


import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mon pc
 * 
 */
public class LoginUsers extends javax.swing.JFrame {

    /**
     * Creates new form LoginUsers
     */
    private int id_user;
    public LoginUsers() {
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

        jPanel2 = new javax.swing.JPanel();
        lblMdpLogin = new javax.swing.JLabel();
        lblPseudoLogin = new javax.swing.JLabel();
        txtPseudoLogin = new javax.swing.JTextField();
        btnConLogin = new javax.swing.JButton();
        txtMdpLogin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        lblPseudoLogin1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        lblerreurspeudo = new javax.swing.JLabel();
        lblerreurMdp = new javax.swing.JLabel();
        lblereur = new javax.swing.JLabel();
        TypeUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMdpLogin.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lblMdpLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMdpLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/ios7-locked-outline.png"))); // NOI18N
        lblMdpLogin.setText("MOT DE PASS");

        lblPseudoLogin.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lblPseudoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPseudoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/person.png"))); // NOI18N
        lblPseudoLogin.setText("PSEUDO");

        txtPseudoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPseudoLoginMousePressed(evt);
            }
        });

        btnConLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("Objects.Red"));
        btnConLogin.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        btnConLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnConLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/ios7-arrow-thin-right.png"))); // NOI18N
        btnConLogin.setText("Se Connecter");
        btnConLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConLoginActionPerformed(evt);
            }
        });

        txtMdpLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMdpLoginMousePressed(evt);
            }
        });
        txtMdpLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpLoginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        lblPseudoLogin1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lblPseudoLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPseudoLogin1.setText("Type User");

        combo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Admin", "User" }));
        combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboMousePressed(evt);
            }
        });

        lblerreurspeudo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblerreurspeudo.setForeground(new java.awt.Color(255, 0, 0));

        lblerreurMdp.setBackground(new java.awt.Color(255, 255, 255));
        lblerreurMdp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblerreurMdp.setForeground(new java.awt.Color(255, 0, 0));

        lblereur.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblereur.setForeground(new java.awt.Color(255, 0, 0));

        TypeUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TypeUser.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPseudoLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblereur, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblerreurspeudo))
                            .addComponent(lblerreurMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPseudoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPseudoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblMdpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMdpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMdpLogin)
                            .addComponent(txtMdpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblerreurMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPseudoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPseudoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblereur, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblerreurspeudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPseudoLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TypeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONNECTION UTILISATUEURS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConLoginActionPerformed
        // Codage du boutton se connecter
        String prenom = "";
        //On fait le text si tous les champs sont bien remplies
        if(txtMdpLogin.getText().trim().isEmpty() &&
            txtPseudoLogin.getText().trim().isEmpty() && combo.getSelectedIndex() == 0 ){
            
            lblerreurMdp.setText(" vide");
           lblereur.setText("vide");
           TypeUser.setText("vide");
            
           //On v??rifie si au moins un des champs n'est pas r??quis
        }else if(txtMdpLogin.getText().trim().isEmpty()){
            
            lblerreurMdp.setText(" obligatoire");
            
        }else if(txtPseudoLogin.getText().trim().isEmpty()){
            
            lblereur.setText("imperatif");
            
        }else if(combo.getSelectedIndex() == 0){
            TypeUser.setText("il faut choisir le type");
        }
        
        /*Si tous les champs sont remplis, 
        sinon si au moins tous les champs sont r??quis. 
        Alors on fait le traitement d'authentification
        */
        else{
            try {
               //La connection ?? la base de donn??es
               Connect con = new Connect();
                //creation de la req??ette sql avec argument
                String sql = "SELECT * from utilisateur where mdp = ? and pseudo = ? and type_user = ?";
                //On pr??pare la r??quete
               PreparedStatement stp = (PreparedStatement) con.con.prepareStatement(sql);
               //On fait la liaison des parametres
               stp.setString(1, txtMdpLogin.getText());
               stp.setString(2, txtPseudoLogin.getText());
               stp.setString(3, (String) combo.getSelectedItem());
               //ex??cution de la requet
               ResultSet rs = stp.executeQuery();
               //Si on arrive ?? lire une ligne dans la bd on affiche la vue home
               if(rs.next()){
                  
                   JOptionPane.showMessageDialog(this, "Bienvenu !! "+txtPseudoLogin.getText());
                   prenom = rs.getString("prenom");
                   super.dispose();
                  Home home = new Home(prenom,combo.getSelectedItem().toString());
                  home.setLocationRelativeTo(null);
                  home.setVisible(true);
                   /*Home home = new Home();
                   home.setLocationRelativeTo(null);
                   home.setVisible(true);
                   this.setVisible(false);*/
                   
               }
               //Si aucune ligne n'a ??t?? lu, On affiche cet message ?? l'??cran
               else{
                   JOptionPane.showMessageDialog(this, "Mot de passe ou Pseudo incorrect");
               }
           
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Connection impossible");
            }
        }
    }//GEN-LAST:event_btnConLoginActionPerformed

    private void txtMdpLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMdpLoginActionPerformed

    private void txtMdpLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMdpLoginMousePressed
        // Effacer le contenu du message d'aleter en cas de pressed
        lblerreurMdp.setText("");
    }//GEN-LAST:event_txtMdpLoginMousePressed

    private void txtPseudoLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPseudoLoginMousePressed
        // Effacer le contenu du message d'aleter en cas de pressed
        lblereur.setText("");
    }//GEN-LAST:event_txtPseudoLoginMousePressed

    private void comboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMousePressed
        // TODO add your handling code here:
        TypeUser.setText("");
    }//GEN-LAST:event_comboMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = JOptionPane.showConfirmDialog(this, "Etes_vous s??r");
        if(i == JOptionPane.YES_OPTION){
            LoginUsers.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing
    
  public void Reconnaissance(String type, JButton btn){
      if(type.equals("User")){
          btn.setEnabled(false);
      }
  }
    /**
     * @param args the command line arguments
     * @return 
     */
    public int getId(){
        return this.id_user;
    }
    public void setId(int id){
        this.id_user = id;
    }
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
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               LoginUsers login =  new LoginUsers();
               login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TypeUser;
    private javax.swing.JButton btnConLogin;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMdpLogin;
    private javax.swing.JLabel lblPseudoLogin;
    private javax.swing.JLabel lblPseudoLogin1;
    private javax.swing.JLabel lblereur;
    private javax.swing.JLabel lblerreurMdp;
    private javax.swing.JLabel lblerreurspeudo;
    private javax.swing.JPasswordField txtMdpLogin;
    private javax.swing.JTextField txtPseudoLogin;
    // End of variables declaration//GEN-END:variables
}
