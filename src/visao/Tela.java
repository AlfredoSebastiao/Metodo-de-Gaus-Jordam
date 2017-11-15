/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controlo.Controle;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.ModeloDaTabela;
import org.jdesktop.swingx.JXTextField;

/**
 *
 * @author User
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
       // this.pnMatriz.setSize(pnMatriz.getWidth(), pnMatriz.getHeight());
        //this.pnMatriz.removeAll();
        //this.pnMatriz.setSize(pnMatriz.getWidth(), pnMatriz.getHeight());
      //  this.aumentarNrDeVariaveis();
//        this.pnMatriz.removeAll();
//        this.gerarCamposNoInicio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnEquacao = new javax.swing.JPanel();
        pnMatriz = new javax.swing.JPanel();
        tfX11 = new org.jdesktop.swingx.JXTextField();
        tfX12 = new org.jdesktop.swingx.JXTextField();
        tfX13 = new org.jdesktop.swingx.JXTextField();
        jLabel2 = new javax.swing.JLabel();
        tfB1 = new org.jdesktop.swingx.JXTextField();
        tfX21 = new org.jdesktop.swingx.JXTextField();
        tfX22 = new org.jdesktop.swingx.JXTextField();
        tfX23 = new org.jdesktop.swingx.JXTextField();
        jLabel3 = new javax.swing.JLabel();
        tfXB2 = new org.jdesktop.swingx.JXTextField();
        tfX31 = new org.jdesktop.swingx.JXTextField();
        tfX32 = new org.jdesktop.swingx.JXTextField();
        tfX33 = new org.jdesktop.swingx.JXTextField();
        jLabel4 = new javax.swing.JLabel();
        tfB3 = new org.jdesktop.swingx.JXTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnRemover = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Resolucao de Sistemas de equacao pelo Metodo de Gaus Com pivot");

        pnEquacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Equacao"));

        pnMatriz.setLayout(new java.awt.GridLayout(3, 4, 10, 10));

        tfX11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX11.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX11.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX11.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX11.setPrompt("x11");
        tfX11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfX11ActionPerformed(evt);
            }
        });
        pnMatriz.add(tfX11);

        tfX12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX12.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX12.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX12.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX12.setPrompt("x12");
        pnMatriz.add(tfX12);

        tfX13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX13.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX13.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX13.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX13.setPrompt("x13");
        tfX13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfX13ActionPerformed(evt);
            }
        });
        pnMatriz.add(tfX13);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=");
        pnMatriz.add(jLabel2);

        tfB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfB1.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfB1.setMinimumSize(new java.awt.Dimension(50, 50));
        tfB1.setPreferredSize(new java.awt.Dimension(50, 50));
        tfB1.setPrompt("b1");
        pnMatriz.add(tfB1);

        tfX21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX21.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX21.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX21.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX21.setPrompt("x21");
        pnMatriz.add(tfX21);

        tfX22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX22.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX22.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX22.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX22.setPrompt("x22");
        pnMatriz.add(tfX22);

        tfX23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX23.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX23.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX23.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX23.setPrompt("x23");
        pnMatriz.add(tfX23);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=");
        pnMatriz.add(jLabel3);

        tfXB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfXB2.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfXB2.setMinimumSize(new java.awt.Dimension(50, 50));
        tfXB2.setPreferredSize(new java.awt.Dimension(50, 50));
        tfXB2.setPrompt("b2");
        pnMatriz.add(tfXB2);

        tfX31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX31.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX31.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX31.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX31.setPrompt("x31");
        pnMatriz.add(tfX31);

        tfX32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX32.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX32.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX32.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX32.setPrompt("x32");
        pnMatriz.add(tfX32);

        tfX33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfX33.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfX33.setMinimumSize(new java.awt.Dimension(50, 50));
        tfX33.setPreferredSize(new java.awt.Dimension(50, 50));
        tfX33.setPrompt("x33");
        pnMatriz.add(tfX33);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("=");
        pnMatriz.add(jLabel4);

        tfB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfB3.setFocusBehavior(org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior.SHOW_PROMPT);
        tfB3.setMinimumSize(new java.awt.Dimension(50, 50));
        tfB3.setPreferredSize(new java.awt.Dimension(50, 50));
        tfB3.setPrompt("b3");
        pnMatriz.add(tfB3);

        jButton1.setText("Adicionar variavel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover variavel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnRemover.setText("Limpar");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnEquacaoLayout = new javax.swing.GroupLayout(pnEquacao);
        pnEquacao.setLayout(pnEquacaoLayout);
        pnEquacaoLayout.setHorizontalGroup(
            pnEquacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEquacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEquacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEquacaoLayout.createSequentialGroup()
                        .addComponent(pnMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(pnEquacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEquacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnEquacaoLayout.setVerticalGroup(
            pnEquacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEquacaoLayout.createSequentialGroup()
                .addGroup(pnEquacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnEquacaoLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnEquacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Solucao:");

        lbResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbResultado.setText("result");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbResultado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbResultado))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnEquacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(316, 316, 316))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnEquacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfX11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfX11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfX11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mexido = true;
        this.aumentarNrDeVariaveis();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(!mexido)
            this.preencherArrayDeValores();
        else
            this.pegarValuesDoArray();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void tfX13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfX13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfX13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mexido = true;
        this.diminuirNrDeVariaveis();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JPanel pnEquacao;
    private javax.swing.JPanel pnMatriz;
    private javax.swing.JPanel pnPrincipal;
    private org.jdesktop.swingx.JXTextField tfB1;
    private org.jdesktop.swingx.JXTextField tfB3;
    private org.jdesktop.swingx.JXTextField tfX11;
    private org.jdesktop.swingx.JXTextField tfX12;
    private org.jdesktop.swingx.JXTextField tfX13;
    private org.jdesktop.swingx.JXTextField tfX21;
    private org.jdesktop.swingx.JXTextField tfX22;
    private org.jdesktop.swingx.JXTextField tfX23;
    private org.jdesktop.swingx.JXTextField tfX31;
    private org.jdesktop.swingx.JXTextField tfX32;
    private org.jdesktop.swingx.JXTextField tfX33;
    private org.jdesktop.swingx.JXTextField tfXB2;
    // End of variables declaration//GEN-END:variables

    private ArrayList<ArrayList<Double>> matriz = new ArrayList();
    private ArrayList<Double> cadaLinha = new ArrayList();
    private Controle controle = new Controle();
    private int numeroDeVar = 3;
    private Map<String, Double> mapaDeResultados = new HashMap();
    /**
     * Variavel usada para verificar se o nr de variaveis foi ou nao mexido
     */
    private boolean mexido = false;
    /**
     * Metodo usado para buscar os valor introduzidos
     */
    private void preencherArrayDeValores() {
        cadaLinha = new ArrayList<>();
        cadaLinha.add(Double.parseDouble(tfX11.getText()));
        cadaLinha.add(Double.parseDouble(tfX12.getText()));
        cadaLinha.add(Double.parseDouble(tfX13.getText()));
        cadaLinha.add(Double.parseDouble(tfB1.getText()));
        cadaLinha.add(0.0);
        cadaLinha.add(0.0);
        cadaLinha.add(0.0);
        matriz.add(cadaLinha);

        cadaLinha = new ArrayList<>();
        cadaLinha.add(Double.parseDouble(tfX21.getText()));
        cadaLinha.add(Double.parseDouble(tfX22.getText()));
        cadaLinha.add(Double.parseDouble(tfX23.getText()));
        cadaLinha.add(Double.parseDouble(tfXB2.getText()));
        cadaLinha.add(0.0);
        cadaLinha.add(0.0);
        cadaLinha.add(0.0);
        matriz.add(cadaLinha);

        cadaLinha = new ArrayList<>();
        cadaLinha.add(Double.parseDouble(tfX31.getText()));
        cadaLinha.add(Double.parseDouble(tfX32.getText()));
        cadaLinha.add(Double.parseDouble(tfX33.getText()));
        cadaLinha.add(Double.parseDouble(tfB3.getText()));
        cadaLinha.add(0.0);
        cadaLinha.add(0.0);
        cadaLinha.add(0.0);
        matriz.add(cadaLinha);
        
        this.mapaDeResultados = this.controle.receberMatriz(matriz);
        lbResultado.setText(this.mapaDeResultados.toString());
        this.controle.imprimirNaTA(jTextArea1);

    }
    
    /**
     * Metodo usado para pegar os valores do arrayPreenchidoo apos adicionar ou remover variavel
     */
    private void pegarValuesDoArray() {
        cadaLinha = new ArrayList<>();
        matriz = new ArrayList<>();
        mapaDeResultados = new HashMap();
        int cont = 0;
        
        for(int i = 0; i < this.numeroDeVar; i++){
            for(int j = 0; j <= this.numeroDeVar;j++){
                JXTextField t = (JXTextField) componentes.get(cont);
                cadaLinha.add(Double.parseDouble(t.getText()));
                cont++;
            }
            cadaLinha.add(0.0);
            cadaLinha.add(0.0);
            cadaLinha.add(0.0);
            this.matriz.add(cadaLinha);
            cadaLinha = new ArrayList<>();
           
        }
        this.mapaDeResultados = this.controle.receberMatriz(matriz);
        lbResultado.setText(this.mapaDeResultados.toString());
        this.controle.imprimirNaTA(jTextArea1);

        
    }

    /**
     * Metoodo usado para acrescentar o nr de variaveis, aumentando assim o
     * numero de campos para addicao de values
     */
    private void aumentarNrDeVariaveis() {
        this.numeroDeVar++;
        if (this.numeroDeVar <= 7) {
            this.aumentarNrDeCampos(true);
        } else {
            JOptionPane.showMessageDialog(this, "Antigiu o numero maximo de variaveis");
        }
    }
    
    
    /**
     * Metoodo usado para diminuir nr de variaveis, aumentando assim o
     * numero de campos para addicao de values
     */
    private void diminuirNrDeVariaveis() {
        this.numeroDeVar--;
        if (this.numeroDeVar >= 2) {
            this.aumentarNrDeCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Antigiu o numero minimo de variaveis");
        }
    }

    /**
     * Metodo usado para aumentar nr de campos para adiccao de values
     */
    private void aumentarNrDeCampos(boolean aumentar) {

        GridLayout layout = (GridLayout) pnMatriz.getLayout();
        layout.setColumns(this.numeroDeVar + 1);
        layout.setRows(this.numeroDeVar);

        this.gerarCampos(aumentar);

    
        pnMatriz.setLayout(layout);
        pnMatriz.validate();

    }

    /**
     * Var usada para armazenar cada componente gerado
     */
    private ArrayList componentes;
    /**
     * Metodo usado para gerar campos, de acordo com o numero de variaveis
     * @param aumentar  - var q indica se eh para aumentar ou diminuir, permitindo assim aumentar ou diminuir tamanho da matriz
     */
    private void gerarCampos(boolean aumentar) {
        /**
         * Removendo todos componentes do painel da matriz
         */
        pnMatriz.removeAll();
       componentes = new ArrayList();
       
        /**
         * verifica se eh para aumentar variaveis or not
         */
        if(aumentar)
            pnMatriz.setSize(pnMatriz.getWidth() + 25, pnMatriz.getHeight() + 25);
        else{
            pnMatriz.setSize(pnMatriz.getWidth() - 25, pnMatriz.getHeight() - 25);
        }
        
        
        for (int i = 0; i < this.numeroDeVar; i++) {
            for (int j = 0; j <= this.numeroDeVar + 1; j++) {
                if (j == this.numeroDeVar) {
                    JLabel lb = new JLabel("=");
                    lb.setHorizontalAlignment(JLabel.CENTER);
                    pnMatriz.add(lb);
                } else {
                    JXTextField tf = new JXTextField();
                    tf.setHorizontalAlignment(JXTextField.CENTER);
                    if (j == this.numeroDeVar + 1) {

                        tf.setPrompt("b" + (i + 1));

                    } else {

                        tf.setPrompt("X" + (i + 1) + (j + 1));

                    }
                    componentes.add(tf);
                    pnMatriz.add(tf);
                }
            }
        }
    }
    
    
    private void gerarCamposNoInicio() {
        /**
         * Removendo todos componentes do painel da matriz
         */
        pnMatriz.removeAll();
       componentes = new ArrayList();
       
        
        
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2 + 1; j++) {
                if (j == 2) {
                    JLabel lb = new JLabel("=");
                    lb.setHorizontalAlignment(JLabel.CENTER);
                    pnMatriz.add(lb);
                } else {
                    JXTextField tf = new JXTextField();
                    tf.setHorizontalAlignment(JXTextField.CENTER);
                    tf.setSize(50, 50);
                    if (j == 3) {

                        tf.setPrompt("b" + (i + 1));

                    } else {

                        tf.setPrompt("X" + (i + 1) + (j + 1));

                    }
                    componentes.add(tf);
                    pnMatriz.add(tf);
                }
            }
        }
    }

    
}
