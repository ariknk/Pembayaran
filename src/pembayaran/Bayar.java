/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaran;

/**
 *
 * @author ACER E5-471
 */
public class Bayar extends javax.swing.JFrame {

    /**
     * Creates new form Bayar
     */
    public Bayar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hb1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hb2 = new javax.swing.JTextField();
        hb3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ds = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnProses = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 180, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Harga Barang 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 70, 110, 30);
        getContentPane().add(hb1);
        hb1.setBounds(240, 70, 150, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Harga Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 120, 110, 30);
        getContentPane().add(hb2);
        hb2.setBounds(240, 120, 150, 40);
        getContentPane().add(hb3);
        hb3.setBounds(240, 170, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total Bayar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 360, 110, 30);
        getContentPane().add(ds);
        ds.setBounds(240, 230, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Diskon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 230, 110, 30);

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProses);
        btnProses.setBounds(270, 290, 100, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Harga Barang 3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 170, 110, 30);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 360, 230, 150);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 540);

        setBounds(0, 0, 653, 574);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
         int harga1 = Integer.parseInt(hb1.getText());
         int harga2 = Integer.parseInt(hb2.getText());
         int harga3 = Integer.parseInt(hb3.getText());
         int diskon = Integer.parseInt(ds.getText());
         int Totalharga;
         int HargaAkhir;
         
         Totalharga = (harga1 + harga2 + harga3);
         HargaAkhir = (Totalharga - (Totalharga*diskon/100));
         ta.setText("Harga Barang 1 : " +harga1+"\n"  +"Harga Barang 2:" +harga2+"\n" +"Harga Barang 3 :" +harga3+"\n" + "Total Harga :"+Totalharga+"\n" + "Diskon :" +diskon+ "%" +"\n"+ "Jumlah Bayar : "+HargaAkhir+ "\n" );
        
      
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JTextField ds;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
