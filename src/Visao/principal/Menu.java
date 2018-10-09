/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.principal;

import rojerusan.RSPanelsSlider;

/**
 *
 * @author Tomas Mufume
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        rsutilities.RSUtilities.setCentrarVentana(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btVendas = new rojerusan.RSButtonIconI();
        btInicio = new rojerusan.RSButtonIconI();
        btClientes = new rojerusan.RSButtonIconI();
        btFornecedores = new rojerusan.RSButtonIconI();
        btEstoque = new rojerusan.RSButtonIconI();
        btUsuarios = new rojerusan.RSButtonIconI();
        btConfiguraoes = new rojerusan.RSButtonIconI();
        btSobre = new rojerusan.RSButtonIconI();
        pnlSlider = new rojeru_san.RSPanelsSlider();
        pnlInicio1 = new Visao.paineis.pnlInicio();
        pnlClientes1 = new Visao.paineis.pnlClientes();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 153, 153));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 102, 102));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.HORIZONTAL);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/go.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        btVendas.setBackground(new java.awt.Color(0, 102, 102));
        btVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Sell Stock_50px.png"))); // NOI18N
        btVendas.setText("VENDAS");
        btVendas.setColorHover(new java.awt.Color(102, 102, 102));

        btInicio.setBackground(new java.awt.Color(0, 102, 102));
        btInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Home_50px.png"))); // NOI18N
        btInicio.setText("INÍCIO");
        btInicio.setColorHover(new java.awt.Color(102, 102, 102));
        btInicio.setSelected(true);
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });

        btClientes.setBackground(new java.awt.Color(0, 102, 102));
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/User Groups_100px.png"))); // NOI18N
        btClientes.setText("CLIENTES");
        btClientes.setToolTipText("");
        btClientes.setColorHover(new java.awt.Color(102, 102, 102));
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btFornecedores.setBackground(new java.awt.Color(0, 102, 102));
        btFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Delivery_50px.png"))); // NOI18N
        btFornecedores.setText("FORNECEDORES");
        btFornecedores.setColorHover(new java.awt.Color(102, 102, 102));

        btEstoque.setBackground(new java.awt.Color(0, 102, 102));
        btEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Trolley_50px.png"))); // NOI18N
        btEstoque.setText("ESTOQUE");
        btEstoque.setColorHover(new java.awt.Color(102, 102, 102));

        btUsuarios.setBackground(new java.awt.Color(0, 102, 102));
        btUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/User Account_100px.png"))); // NOI18N
        btUsuarios.setText("USUÁRIOS");
        btUsuarios.setColorHover(new java.awt.Color(102, 102, 102));

        btConfiguraoes.setBackground(new java.awt.Color(0, 102, 102));
        btConfiguraoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Settings_50px.png"))); // NOI18N
        btConfiguraoes.setText("CONFIGURAÇÕES");
        btConfiguraoes.setColorHover(new java.awt.Color(102, 102, 102));

        btSobre.setBackground(new java.awt.Color(0, 102, 102));
        btSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/About_50px.png"))); // NOI18N
        btSobre.setText("SOBRE NÓS");
        btSobre.setColorHover(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btConfiguraoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btConfiguraoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSlider.setBackground(new java.awt.Color(102, 102, 102));

        pnlInicio1.setName("pnlInicio1"); // NOI18N
        pnlSlider.add(pnlInicio1, "card2");

        pnlClientes1.setName("pnlClientes1"); // NOI18N
        pnlSlider.add(pnlClientes1, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        if(!btInicio.isSelected()){
            btInicio.setSelected(true);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected(false);
            btClientes.setSelected(false);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlInicio1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btInicioActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
       if(!btClientes.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected(false);
            btClientes.setSelected(true);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlClientes1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btClientesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btClientes;
    private rojerusan.RSButtonIconI btConfiguraoes;
    private rojerusan.RSButtonIconI btEstoque;
    private rojerusan.RSButtonIconI btFornecedores;
    private rojerusan.RSButtonIconI btInicio;
    private rojerusan.RSButtonIconI btSobre;
    private rojerusan.RSButtonIconI btUsuarios;
    private rojerusan.RSButtonIconI btVendas;
    private Visao.paineis.pnlClientes pnlClientes1;
    private Visao.paineis.pnlInicio pnlInicio1;
    private rojeru_san.RSPanelsSlider pnlSlider;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables
}