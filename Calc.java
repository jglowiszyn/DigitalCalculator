
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ja
 */
public class Calc extends javax.swing.JFrame {
    
    String operators = null;
    double number1 = 0, number2 = 0;
    

    /**
     * Creates new form Calc
     */
    public Calc() {
        initComponents();
        
        buans.setBackground(Color.yellow);
        
        bu1.setBackground(Color.black);
        bu1.setForeground(Color.white);
        bu2.setBackground(Color.black);
        bu2.setForeground(Color.white);
        bu3.setBackground(Color.black);
        bu3.setForeground(Color.white);
        bu4.setBackground(Color.black);
        bu4.setForeground(Color.white);
        bu5.setBackground(Color.black);
        bu5.setForeground(Color.white);
        bu6.setBackground(Color.black);
        bu6.setForeground(Color.white);
        bu7.setBackground(Color.black);
        bu7.setForeground(Color.white);
        bu8.setBackground(Color.black);
        bu8.setForeground(Color.white);
        bu9.setBackground(Color.black);
        bu9.setForeground(Color.white);
        bu0.setBackground(Color.black);
        bu0.setForeground(Color.white);
        
        buadd.setBackground(Color.gray);
        buadd.setForeground(Color.white);
        busub.setBackground(Color.gray);
        busub.setForeground(Color.white);
        bumultiply.setBackground(Color.gray);
        bumultiply.setForeground(Color.white);
        budivision.setBackground(Color.gray);
        budivision.setForeground(Color.white);
        
        budel.setBackground(Color.darkGray);
        budel.setForeground(Color.white);
        buc.setBackground(Color.darkGray);
        buc.setForeground(Color.white);
        
        budot.setBackground(Color.orange);
        budot.setForeground(Color.black);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        buans = new javax.swing.JButton();
        budel = new javax.swing.JButton();
        bu9 = new javax.swing.JButton();
        bu8 = new javax.swing.JButton();
        bu4 = new javax.swing.JButton();
        budot = new javax.swing.JButton();
        bu6 = new javax.swing.JButton();
        bu7 = new javax.swing.JButton();
        bu1 = new javax.swing.JButton();
        bu2 = new javax.swing.JButton();
        bu5 = new javax.swing.JButton();
        bu0 = new javax.swing.JButton();
        bu3 = new javax.swing.JButton();
        buadd = new javax.swing.JButton();
        buc = new javax.swing.JButton();
        budivision = new javax.swing.JButton();
        bumultiply = new javax.swing.JButton();
        busub = new javax.swing.JButton();

        jButton6.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULATOR");

        tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        buans.setText("ANS");
        buans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buansActionPerformed(evt);
            }
        });

        budel.setText("DEL");
        budel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budelActionPerformed(evt);
            }
        });

        bu9.setText("9");
        bu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu9ActionPerformed(evt);
            }
        });

        bu8.setText("8");
        bu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu8ActionPerformed(evt);
            }
        });

        bu4.setText("4");
        bu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu4ActionPerformed(evt);
            }
        });

        budot.setText(".");
        budot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budotActionPerformed(evt);
            }
        });

        bu6.setText("6");
        bu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu6ActionPerformed(evt);
            }
        });

        bu7.setText("7");
        bu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu7ActionPerformed(evt);
            }
        });

        bu1.setText("1");
        bu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu1ActionPerformed(evt);
            }
        });

        bu2.setText("2");
        bu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu2ActionPerformed(evt);
            }
        });

        bu5.setText("5");
        bu5.setToolTipText("");
        bu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu5ActionPerformed(evt);
            }
        });

        bu0.setText("0");
        bu0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu0ActionPerformed(evt);
            }
        });

        bu3.setText("3");
        bu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu3ActionPerformed(evt);
            }
        });

        buadd.setText("+");
        buadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buaddActionPerformed(evt);
            }
        });

        buc.setText("C");

        budivision.setText("/");
        budivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budivisionActionPerformed(evt);
            }
        });

        bumultiply.setText("*");
        bumultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bumultiplyActionPerformed(evt);
            }
        });

        busub.setText("-");
        busub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tf)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(budel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bumultiply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(busub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(budivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bu4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(bu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(bu1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bu2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(bu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bu8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(bu0, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bu6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(bu9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bu3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(budot, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buans, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(buadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(busub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bumultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(budel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buc, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(budivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bu9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bu8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bu7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bu1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bu2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bu3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buadd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buans, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(budot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("CALCULATOR");
        jLabel1.getAccessibleContext().setAccessibleDescription("");
        tf.getAccessibleContext().setAccessibleName("Enter the values and operations");
        tf.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfActionPerformed

    private void budelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budelActionPerformed
        // TODO add your handling code here:
        tf.setText("");
    }//GEN-LAST:event_budelActionPerformed

    private void buaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buaddActionPerformed
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operators = "+";
    }//GEN-LAST:event_buaddActionPerformed

    private void bu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu9ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "9");
    }//GEN-LAST:event_bu9ActionPerformed

    private void bu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu5ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "5");
    }//GEN-LAST:event_bu5ActionPerformed

    private void bu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu3ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "3");
    }//GEN-LAST:event_bu3ActionPerformed

    private void bu0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu0ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "0");
    }//GEN-LAST:event_bu0ActionPerformed

    private void budotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budotActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + ".");
    }//GEN-LAST:event_budotActionPerformed

    private void busubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busubActionPerformed
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operators = "-";
    }//GEN-LAST:event_busubActionPerformed

    private void bu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu2ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "2");
    }//GEN-LAST:event_bu2ActionPerformed

    private void bu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu1ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "1");
    }//GEN-LAST:event_bu1ActionPerformed

    private void bu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu4ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "4");
    }//GEN-LAST:event_bu4ActionPerformed

    private void bu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu6ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "6");
    }//GEN-LAST:event_bu6ActionPerformed

    private void bu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu7ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "7");
    }//GEN-LAST:event_bu7ActionPerformed

    private void bu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu8ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText() + "8");
    }//GEN-LAST:event_bu8ActionPerformed

    private void bumultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bumultiplyActionPerformed
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operators = "*";
    }//GEN-LAST:event_bumultiplyActionPerformed

    private void budivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budivisionActionPerformed
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operators = "/";
    }//GEN-LAST:event_budivisionActionPerformed

    private void buansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buansActionPerformed
        // TODO add your handling code here:
        number2 = Double.parseDouble(tf.getText());
        
        double result = 0;
        
        if(operators == "+")
            result = number1 + number2;
        else if(operators == "-")
            result = number1 - number2;
        else if(operators == "*")
            result = number1 * number2;
        else if(operators == "/")
            result = number1 / number2;
        
        tf.setText(result + "");
        
        operators = null;
        
    }//GEN-LAST:event_buansActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu0;
    private javax.swing.JButton bu1;
    private javax.swing.JButton bu2;
    private javax.swing.JButton bu3;
    private javax.swing.JButton bu4;
    private javax.swing.JButton bu5;
    private javax.swing.JButton bu6;
    private javax.swing.JButton bu7;
    private javax.swing.JButton bu8;
    private javax.swing.JButton bu9;
    private javax.swing.JButton buadd;
    private javax.swing.JButton buans;
    private javax.swing.JButton buc;
    private javax.swing.JButton budel;
    private javax.swing.JButton budivision;
    private javax.swing.JButton budot;
    private javax.swing.JButton bumultiply;
    private javax.swing.JButton busub;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
