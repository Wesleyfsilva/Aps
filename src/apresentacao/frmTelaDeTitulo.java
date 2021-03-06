/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import audio.Sound;
import modelo.Controle;


/**
 *
 * @author Gabriel Alves
 */
public class frmTelaDeTitulo extends javax.swing.JDialog
{

    /**
     * Creates new form frmTelaDeTitulo
     */
    
    
     public frmTelaDeTitulo() {
        initComponents();
    }
     Sound efsIniciar = new Sound("src\\sounds\\efsIniciar.wav");
     Sound efsOpcoes = new Sound("src\\sounds\\efsOpcoes.wav");
     Sound efsAcessibilidade = new Sound("src\\sounds\\efsAcessibilidade.wav");
     Controle controle = new Controle();
     

  
     
    
    public frmTelaDeTitulo(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnIniciar = new javax.swing.JButton();
        btnOpcoes = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnAcessibilidade = new javax.swing.JButton();
        imgQuiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quiz Sustentável ");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnIniciar.setText("Iniciar");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                PassarPorIniciar(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                SairDeIniciar(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar);
        btnIniciar.setBounds(30, 430, 200, 40);

        btnOpcoes.setText("Opções");
        btnOpcoes.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                PassarPorOpcoes(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                SairDeOpcoes(evt);
            }
        });
        btnOpcoes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpcoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpcoes);
        btnOpcoes.setBounds(30, 480, 200, 40);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Quiz Sustentável");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(260, 400, 400, 62);

        btnAcessibilidade.setText("Acessibilidade");
        btnAcessibilidade.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                PassarPorAcessibilidade(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                SairDeAcessibilidade(evt);
            }
        });
        btnAcessibilidade.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAcessibilidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessibilidade);
        btnAcessibilidade.setBounds(30, 530, 200, 40);

        imgQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WhatsApp Image 2021-05-23 at 7.36.49 PM.jpeg"))); // NOI18N
        getContentPane().add(imgQuiz);
        imgQuiz.setBounds(-160, -20, 840, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcoesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOpcoesActionPerformed
    {//GEN-HEADEREND:event_btnOpcoesActionPerformed
           frmOpcoes frmOP = new frmOpcoes(null,true);
           frmOP.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpcoesActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIniciarActionPerformed
    {//GEN-HEADEREND:event_btnIniciarActionPerformed
                 
         frmIntro frmI = new frmIntro(null,true);
         frmI.setVisible(true);
           
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnAcessibilidadeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAcessibilidadeActionPerformed
    {//GEN-HEADEREND:event_btnAcessibilidadeActionPerformed
           frmAcessibilidade frmAC = new frmAcessibilidade(null,true);
           frmAC.setVisible(true);   

    }//GEN-LAST:event_btnAcessibilidadeActionPerformed

    
    
    private void PassarPorIniciar(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PassarPorIniciar
    {//GEN-HEADEREND:event_PassarPorIniciar
        Controle controle = new Controle();
        System.out.println(controle.narracao);    
      if(Controle.narracao==1)
        {
        
         efsIniciar.play();
        }
           
            
        
        
        
        
        
    }//GEN-LAST:event_PassarPorIniciar

    private void SairDeIniciar(java.awt.event.MouseEvent evt)//GEN-FIRST:event_SairDeIniciar
    {//GEN-HEADEREND:event_SairDeIniciar
         efsIniciar.stop();
    }//GEN-LAST:event_SairDeIniciar

    private void SairDeOpcoes(java.awt.event.MouseEvent evt)//GEN-FIRST:event_SairDeOpcoes
    {//GEN-HEADEREND:event_SairDeOpcoes
        efsOpcoes.stop();           // TODO add your handling code here:
    }//GEN-LAST:event_SairDeOpcoes

    private void PassarPorOpcoes(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PassarPorOpcoes
    {//GEN-HEADEREND:event_PassarPorOpcoes
             
         if(Controle.narracao==1)
        {
          System.out.println(controle.narracao);
          efsOpcoes.play();
        }
           
    }//GEN-LAST:event_PassarPorOpcoes

    private void PassarPorAcessibilidade(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PassarPorAcessibilidade
    {//GEN-HEADEREND:event_PassarPorAcessibilidade
           
        if(Controle.narracao==1)
        {
          efsAcessibilidade.play();
        }
    }//GEN-LAST:event_PassarPorAcessibilidade

    private void SairDeAcessibilidade(java.awt.event.MouseEvent evt)//GEN-FIRST:event_SairDeAcessibilidade
    {//GEN-HEADEREND:event_SairDeAcessibilidade
        efsAcessibilidade.stop();   
    }//GEN-LAST:event_SairDeAcessibilidade

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setSize(695, 639);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaDeTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaDeTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaDeTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaDeTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmTelaDeTitulo dialog = new frmTelaDeTitulo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessibilidade;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnOpcoes;
    private javax.swing.JLabel imgQuiz;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
