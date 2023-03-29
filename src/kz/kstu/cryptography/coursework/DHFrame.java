/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kz.kstu.cryptography.coursework;

/**
 *
 * @author 1234
 */
public class DHFrame extends javax.swing.JFrame {
 
    /**
     * Creates new form DHFrame
     */
    public DHFrame() {
        initComponents();
        setLocation(550,250);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ErrLabel = new javax.swing.JPanel();
        XaTF = new javax.swing.JFormattedTextField();
        YbTF = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        XbTF = new javax.swing.JFormattedTextField();
        YaTF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ZTF = new javax.swing.JFormattedTextField();
        GTF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PTF = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ELabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        XaTF.setMinimumSize(new java.awt.Dimension(142, 22));
        XaTF.setPreferredSize(new java.awt.Dimension(142, 22));

        YbTF.setEnabled(false);
        YbTF.setMinimumSize(new java.awt.Dimension(142, 22));
        YbTF.setPreferredSize(new java.awt.Dimension(142, 22));

        jLabel1.setText("ВВедите Xa");

        jLabel2.setText("Введите Xb");

        XbTF.setMinimumSize(new java.awt.Dimension(142, 22));
        XbTF.setPreferredSize(new java.awt.Dimension(142, 22));

        YaTF.setEnabled(false);
        YaTF.setMinimumSize(new java.awt.Dimension(142, 22));
        YaTF.setPreferredSize(new java.awt.Dimension(142, 22));

        jLabel3.setText("Ya =");

        jLabel4.setText("Yb =");

        jButton1.setText("Найти P и g");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Найти Ya");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Найти Yb");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Найти ключ Z");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ZTF.setEnabled(false);
        ZTF.setMinimumSize(new java.awt.Dimension(142, 22));
        ZTF.setPreferredSize(new java.awt.Dimension(142, 22));

        GTF.setEnabled(false);
        GTF.setMinimumSize(new java.awt.Dimension(142, 22));
        GTF.setPreferredSize(new java.awt.Dimension(142, 22));

        jLabel5.setText("P =");

        jLabel6.setText("g =");

        PTF.setEnabled(false);
        PTF.setMinimumSize(new java.awt.Dimension(142, 22));
        PTF.setPreferredSize(new java.awt.Dimension(142, 22));

        jLabel7.setText("Z =");

        ELabel.setForeground(new java.awt.Color(255, 51, 51));
        ELabel.setText(" ");

        javax.swing.GroupLayout ErrLabelLayout = new javax.swing.GroupLayout(ErrLabel);
        ErrLabel.setLayout(ErrLabelLayout);
        ErrLabelLayout.setHorizontalGroup(
            ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrLabelLayout.createSequentialGroup()
                .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ErrLabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ErrLabelLayout.createSequentialGroup()
                                .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(XbTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(XaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ErrLabelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ZTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YbTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ErrLabelLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))))
                    .addGroup(ErrLabelLayout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(ELabel))
                    .addGroup(ErrLabelLayout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jLabel8)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        ErrLabelLayout.setVerticalGroup(
            ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrLabelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ErrLabelLayout.createSequentialGroup()
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(XaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(XbTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ErrLabelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5))
                            .addGroup(ErrLabelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(PTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YbTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ZTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(ErrLabelLayout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel8))
                    .addGroup(ErrLabelLayout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(ELabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(ErrLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ErrLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ErrLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int P=0,g=0,Ya=0,Yb=0,Z=0,Xa,Xb;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   P=DH.P();
   g = DH.getG(P);
   PTF.setText(Integer.toString(P));
   GTF.setText(Integer.toString(g));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
         Xa = Integer.parseInt(XaTF.getText()) ;
        }catch(NumberFormatException e){
        ELabel.setText("Error");
        }
        try{
             Ya = OTT.kkk(g, Xa, P);
        YaTF.setText(Integer.toString(Ya));}
        catch(Exception e){
        ELabel.setText("Не ввели Xa или не нашли P и G");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
         Xb = Integer.parseInt(XbTF.getText()) ;
        }catch(NumberFormatException e){
        ELabel.setText("Error");
        }
        try{
             Yb = OTT.kkk(g, Xb, P);
        YbTF.setText(Integer.toString(Yb));}
        catch(Exception e){
        ELabel.setText("Не ввели Xb или не нашли P и G");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
           Xa = Integer.parseInt(XaTF.getText()) ;
           Yb = Integer.parseInt(YbTF.getText()) ;
       Z=OTT.kkk(Yb,Xa,P);
       ZTF.setText(Integer.toString(Z));
       }catch(NumberFormatException e){
       ELabel.setText("Вычислите Xa, Yb и P перед тем как находить ключ Z");
       }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(DHFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DHFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DHFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DHFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DHFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ELabel;
    private javax.swing.JPanel ErrLabel;
    private javax.swing.JFormattedTextField GTF;
    private javax.swing.JFormattedTextField PTF;
    private javax.swing.JFormattedTextField XaTF;
    private javax.swing.JFormattedTextField XbTF;
    private javax.swing.JFormattedTextField YaTF;
    private javax.swing.JFormattedTextField YbTF;
    private javax.swing.JFormattedTextField ZTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
