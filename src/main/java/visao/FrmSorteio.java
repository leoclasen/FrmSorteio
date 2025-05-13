package visao;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class FrmSorteio extends javax.swing.JFrame {
    ArrayList<Integer> listaNumeros = new ArrayList();
    Random geradorNumero;
    int quantidadeFaltante = 0;
    int ordem = 0;
    
    public FrmSorteio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNumerosorteado = new javax.swing.JLabel();
        aaa = new javax.swing.JLabel();
        JTFQuantidadeNumerosSorteados = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JASaida = new javax.swing.JTextArea();
        JBNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBFechar = new javax.swing.JButton();
        JBSortear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio");

        JLNumerosorteado.setFont(new java.awt.Font("Segoe UI", 1, 144)); // NOI18N
        JLNumerosorteado.setText("0");

        aaa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aaa.setText("Quantidade de números a serem sorteados:");

        JTFQuantidadeNumerosSorteados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeNumerosSorteadosActionPerformed(evt);
            }
        });

        JASaida.setColumns(20);
        JASaida.setRows(5);
        jScrollPane1.setViewportView(JASaida);

        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Lista dos números sorteados:");

        JBCancelar.setText("Cancelar");
        JBCancelar.setEnabled(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JBSortear.setText("Sortear");
        JBSortear.setEnabled(false);
        JBSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSortearActionPerformed(evt);
            }
        });

        jLabel1.setText("Número sorteado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(aaa)
                .addGap(18, 18, 18)
                .addComponent(JTFQuantidadeNumerosSorteados, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBNovo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(JLNumerosorteado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(JBSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aaa)
                    .addComponent(JTFQuantidadeNumerosSorteados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBNovo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JLNumerosorteado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBCancelar)
                            .addComponent(JBSortear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBFechar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFQuantidadeNumerosSorteadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeNumerosSorteadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeNumerosSorteadosActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        int quantidadeNumeroSorteados = Integer.parseInt(this.JTFQuantidadeNumerosSorteados.getText());
        JASaida.setText(""); 
        listaNumeros.clear();
        JLNumerosorteado.setText("0");
        
        quantidadeFaltante = 0;
        ordem = 0;
        if (quantidadeNumeroSorteados > 0) { 
            for (int i = 1; i <= quantidadeNumeroSorteados; i++) {
            listaNumeros.add(i);
            }
            
        quantidadeFaltante = quantidadeNumeroSorteados;
        this.JBNovo.setEnabled(false); // Desabilita o botão novo
        this.JBSortear.setEnabled(true); // Habilita o botão sortear
        this.JBCancelar.setEnabled(true); // Habilita o botão cancelar
        } else {
        JOptionPane.showMessageDialog(null, "Valor deve ser maior que 0!");
        }
    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSortearActionPerformed
        if (!listaNumeros.isEmpty()) { 
            geradorNumero = new Random();
            int indice = geradorNumero.nextInt(quantidadeFaltante);
            quantidadeFaltante--;
            ordem++;
            JASaida.append(ordem + "º sorteado: " + listaNumeros.get(indice).toString() + "\n");
            JLNumerosorteado.setText(listaNumeros.get(indice).toString());
            listaNumeros.remove(indice);
            } else { 
            JOptionPane.showMessageDialog(null, "Não Há números a serem sorteados "
                    + "\n inicie um novo Sorteio");
            this.JBNovo.setEnabled(true);
            this.JBSortear.setEnabled(false); 
            this.JBCancelar.setEnabled(false); 
        }
    }//GEN-LAST:event_JBSortearActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.JBNovo.setEnabled(true);
        this.JBSortear.setEnabled(false);
        this.JBCancelar.setEnabled(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
       System.exit(0);
    }//GEN-LAST:event_JBFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/looJBNovo/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JASaida;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBSortear;
    private javax.swing.JLabel JLNumerosorteado;
    private javax.swing.JTextField JTFQuantidadeNumerosSorteados;
    private javax.swing.JLabel aaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
