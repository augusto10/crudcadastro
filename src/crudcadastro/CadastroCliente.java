
package crudcadastro;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author augusto
 */
public class CadastroCliente extends javax.swing.JFrame {

    
    
     
    public CadastroCliente() {
        initComponents();
       atualizar();
        DefaultTableModel dtm= (DefaultTableModel) this.Tabela.getModel();
        String consulta= "SELECT * FROM cliente";
        Dao c = new Dao();
        c.consulta(dtm, consulta);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnSalvar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        Btnalterar = new javax.swing.JButton();
        BtnNovo = new javax.swing.JButton();
        TextNome = new javax.swing.JTextField();
        Textcpf = new javax.swing.JTextField();
        TextEnd = new javax.swing.JTextField();
        TextRg = new javax.swing.JTextField();
        TextData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        Textconsulta = new javax.swing.JTextField();
        BtnConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Cadastro de clientes");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("NOME");

        jLabel3.setText("CPF");

        jLabel4.setText("ENDEREÇO");

        jLabel5.setText("DATA DE NASCIMENTO");

        jLabel6.setText("RG");

        BtnSalvar.setText("SALVAR");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("EXCLUIR");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        Btnalterar.setText("ALTERAR");
        Btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnalterarActionPerformed(evt);
            }
        });

        BtnNovo.setText("NOVO");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        jLabel7.setText("EMAIL");

        BtnConsulta.setText("consultar");
        BtnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultaActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "ENDEREÇO", "RG", "DT NASCIMENTO", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLabel8.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSalvar)
                        .addGap(32, 32, 32)
                        .addComponent(Btnalterar)
                        .addGap(29, 29, 29)
                        .addComponent(BtnExcluir)
                        .addGap(37, 37, 37)
                        .addComponent(BtnNovo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(49, 49, 49)
                            .addComponent(TextEmail))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextEnd)
                            .addComponent(TextRg)
                            .addComponent(Textcpf)
                            .addComponent(TextNome)
                            .addComponent(TextId, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(Textconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(BtnConsulta))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsulta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Textcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSalvar)
                            .addComponent(BtnExcluir)
                            .addComponent(BtnNovo)
                            .addComponent(Btnalterar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        
    }//GEN-LAST:event_TextNomeActionPerformed
// tabela
    public void atualizar(){
        DefaultTableModel dtm= (DefaultTableModel) this.Tabela.getModel();
        String consulta= "SELECT * FROM cliente";
        while(this.Tabela.getRowCount()>0){
            dtm.removeRow(0);
        }
        Dao at = new Dao();
        at.consulta(dtm, consulta);
        
    }
    //limpar dados dos campos
    public void limpar(){
        this.TextId.setText("");
        this.TextNome.setText("");
        this.Textcpf.setText("");
        this.TextRg.setText("");
        this.TextData.setText("");
        this.TextEmail.setText("");
        this.TextEnd.setText("");
        
    }
// acionar o botao cadastrar
    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        // receber dados para cadastro
        String id = this.TextId.getText();
        String nome= this.TextNome.getText();
        String cpf= this.Textcpf.getText();
        String end= this.TextEnd.getText();
        String rg= this.TextRg.getText();
        String data_nasc= this.TextData.getText();
        String email= this.TextEmail.getText();
        limpar();
        
//salvar no banco de dados
        String cad="INSERT INTO cliente VALUES(null,'"+nome+"','"+cpf+"','"+end+"','"+rg+"','"+data_nasc+"','"+email+"')";
        Dao i= new Dao();
        i.cadastrar(cad);
    }//GEN-LAST:event_BtnSalvarActionPerformed
// receber conteudo tabela nos campos
    private void TabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseReleased
        int liSelecionada= this.Tabela.getSelectedRow();
        
        String id =this.Tabela.getValueAt(liSelecionada, 0).toString();
        String nome=this.Tabela.getValueAt(liSelecionada, 1).toString();
        String cpf=this.Tabela.getValueAt(liSelecionada, 2).toString();
        String end=this.Tabela.getValueAt(liSelecionada, 3).toString();
        String rg=this.Tabela.getValueAt(liSelecionada, 4).toString();
        String email=this.Tabela.getValueAt(liSelecionada, 6).toString();
        String data =this.Tabela.getValueAt(liSelecionada, 5).toString();
        
        this.TextId.setText(id);
        this.TextNome.setText(nome);
        this.Textcpf.setText(cpf);
        this.TextEnd.setText(end);
        this.TextRg.setText(rg);
            this.TextEmail.setText(email);
                this.TextData.setText(data);
  
    }//GEN-LAST:event_TabelaMouseReleased
// botão alterar
    private void BtnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnalterarActionPerformed
       String id = this.TextId.getText();
       String nome = this.TextNome.getText();
       String cpf = this.Textcpf.getText();
       String end = this.TextEnd.getText();
       String rg= this.TextRg.getText();
       String email = this.TextEmail.getText();
       String data_nascimento= this.TextData.getText();
       
       String alterar="update  cliente set nome='"+nome+"', cpf='"+cpf+"', endereco='"+end+"', rg='"+rg+"',  data_nascimento='"+data_nascimento+"',email='"+email+"'";
       
       Dao a = new Dao();
         a.altera(alterar);
         
    }//GEN-LAST:event_BtnalterarActionPerformed
//botao excluir
    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        int liSelecionada= this.Tabela.getSelectedRow();
        String id =this.Tabela.getValueAt(liSelecionada, 0).toString();
        String nome=this.Tabela.getValueAt(liSelecionada, 0).toString();
        
       int x = JOptionPane.showConfirmDialog(rootPane, "dejesa mesmo excluir o cadastro");
       
       if(x==0){
           String excluir="delete from cliente where id ='"+id+"'";
           Dao e = new Dao();
           e.exclui(excluir);
           
       }
    }//GEN-LAST:event_BtnExcluirActionPerformed

  
    //consulta
    private void BtnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultaActionPerformed
       
        DefaultTableModel dtm= (DefaultTableModel) this.Tabela.getModel();
        String consulta= "SELECT * FROM cliente";
        while(this.Tabela.getRowCount()>0){
            dtm.removeRow(0);
        }
        String pesquisa= this.Textconsulta.getText();
        String consult = "select * from cliente where id like '%"+pesquisa+ "%'|| nome like'%"+pesquisa+ "%' ";
        
                Dao at = new Dao();
                at.consulta(dtm, consulta);
        
    
    
    }//GEN-LAST:event_BtnConsultaActionPerformed
//limpar
    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
      
         
        this.TextId.setText("");
        this.TextNome.setText("");
        this.Textcpf.setText("");
        this.TextRg.setText("");
        this.TextData.setText("");
        this.TextEmail.setText("");
        this.TextEnd.setText("");
        
    
    }//GEN-LAST:event_BtnNovoActionPerformed
         
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsulta;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovo;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton Btnalterar;
    private javax.swing.JTable Tabela;
    private javax.swing.JTextField TextData;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextEnd;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextRg;
    private javax.swing.JTextField Textconsulta;
    private javax.swing.JTextField Textcpf;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
