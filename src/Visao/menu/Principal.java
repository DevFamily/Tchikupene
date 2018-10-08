/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.menu;

/**
 *
 * @author TM
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jPanel1 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        btnFornecedor = new rojeru_san.RSButton();
        btnInicio = new rojeru_san.RSButton();
        btnVenda = new rojeru_san.RSButton();
        btnCliente = new rojeru_san.RSButton();
        btnEstoque = new rojeru_san.RSButton();
        btnUsuario = new rojeru_san.RSButton();
        btnSobre = new rojeru_san.RSButton();
        btnConfigurar = new rojeru_san.RSButton();
        pnSlider = new rojerusan.RSPanelsSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(102, 102, 102));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/User Account_100px.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Flávio      Richard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnFornecedor.setBackground(new java.awt.Color(102, 102, 102));
        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/Delivery_50px.png"))); // NOI18N
        btnFornecedor.setText("FORNECEDOR");
        btnFornecedor.setColorHover(new java.awt.Color(204, 204, 204));
        btnFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFornecedor.setIconTextGap(25);

        btnInicio.setBackground(new java.awt.Color(102, 102, 102));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/Home_50px.png"))); // NOI18N
        btnInicio.setText("INÍCIO");
        btnInicio.setColorHover(new java.awt.Color(204, 204, 204));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicio.setIconTextGap(25);
        btnInicio.setSelected(true);

        btnVenda.setBackground(new java.awt.Color(102, 102, 102));
        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/Sell Stock_50px.png"))); // NOI18N
        btnVenda.setText("VENDA");
        btnVenda.setColorHover(new java.awt.Color(204, 204, 204));
        btnVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVenda.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVenda.setIconTextGap(25);

        btnCliente.setBackground(new java.awt.Color(102, 102, 102));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/User Groups_50px.png"))); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.setColorHover(new java.awt.Color(204, 204, 204));
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCliente.setIconTextGap(25);

        btnEstoque.setBackground(new java.awt.Color(102, 102, 102));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/Trolley_50px.png"))); // NOI18N
        btnEstoque.setText("ESTOQUE");
        btnEstoque.setColorHover(new java.awt.Color(204, 204, 204));
        btnEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEstoque.setIconTextGap(25);

        btnUsuario.setBackground(new java.awt.Color(102, 102, 102));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/Queue_50px.png"))); // NOI18N
        btnUsuario.setText("USUÁRIO");
        btnUsuario.setColorHover(new java.awt.Color(204, 204, 204));
        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuario.setIconTextGap(25);

        btnSobre.setBackground(new java.awt.Color(102, 102, 102));
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/About_50px.png"))); // NOI18N
        btnSobre.setText("SOBRE NÓS");
        btnSobre.setColorHover(new java.awt.Color(204, 204, 204));
        btnSobre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSobre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSobre.setIconTextGap(25);

        btnConfigurar.setBackground(new java.awt.Color(102, 102, 102));
        btnConfigurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/menu/Settings_50px.png"))); // NOI18N
        btnConfigurar.setText("CONFIGURAR");
        btnConfigurar.setColorHover(new java.awt.Color(204, 204, 204));
        btnConfigurar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfigurar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfigurar.setIconTextGap(25);

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnSlider.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnCliente;
    private rojeru_san.RSButton btnConfigurar;
    private rojeru_san.RSButton btnEstoque;
    private rojeru_san.RSButton btnFornecedor;
    private rojeru_san.RSButton btnInicio;
    private rojeru_san.RSButton btnSobre;
    private rojeru_san.RSButton btnUsuario;
    private rojeru_san.RSButton btnVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSPanelsSlider pnSlider;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables
}
