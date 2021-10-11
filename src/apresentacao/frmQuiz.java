/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import questoes.Questoes;
import audio.Sound;

/**
 *
 * @author Gabriel Alves
 */
public class frmQuiz extends javax.swing.JDialog
{
  
    int i =0;
    /**
     * Creates new form frmQuiz
     */
    public frmQuiz(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

   Sound questao0 = new Sound("src\\sounds\\questao0.wav");
   Sound questao2 = new Sound("src\\sounds\\questao2.wav");
   Sound questao3 = new Sound("src\\sounds\\questao3.wav");
   Sound questao4 = new Sound("src\\sounds\\questao4.wav");
   Sound questao5 = new Sound("src\\sounds\\questao5.wav");
   Sound questao6 = new Sound("src\\sounds\\questao6.wav");
   Sound questao7 = new Sound("src\\sounds\\questao7.wav");
   
   Sound questao0alternativaA = new Sound("src\\sounds\\questao0alternativaA.wav");
   Sound questao0alternativaB = new Sound("src\\sounds\\questao0alternativaB.wav");
   Sound questao0alternativaC = new Sound("src\\sounds\\questao0alternativaC.wav");
   Sound questao0alternativaD = new Sound("src\\sounds\\questao0alternativaD.wav");
   
   Sound questao2alternativaA = new Sound("src\\sounds\\questao2alternativaA.wav");
   Sound questao2alternativaB = new Sound("src\\sounds\\questao2alternativaB.wav");
   Sound questao2alternativaC = new Sound("src\\sounds\\questao2alternativaC.wav");
   Sound questao2alternativaD = new Sound("src\\sounds\\questao2alternativaD.wav");
   
   Sound questao3alternativaA = new Sound("src\\sounds\\questao3alternativaA.wav");
   Sound questao3alternativaB = new Sound("src\\sounds\\questao3alternativaB.wav");
   Sound questao3alternativaC = new Sound("src\\sounds\\questao3alternativaC.wav");
   Sound questao3alternativaD = new Sound("src\\sounds\\questao3alternativaD.wav");
   
   Sound questao4alternativaA = new Sound("src\\sounds\\questao4alternativaA.wav");
   Sound questao4alternativaB = new Sound("src\\sounds\\questao4alternativaB.wav");
   Sound questao4alternativaC = new Sound("src\\sounds\\questao4alternativaC.wav");
   Sound questao4alternativaD = new Sound("src\\sounds\\questao4alternativaD.wav");
   
   Sound questao5alternativaA = new Sound("src\\sounds\\questao5alternativaA.wav");
   Sound questao5alternativaB = new Sound("src\\sounds\\questao5alternativaB.wav");
   Sound questao5alternativaC = new Sound("src\\sounds\\questao5alternativaC.wav");
   Sound questao5alternativaD = new Sound("src\\sounds\\questao5alternativaD.wav");
   
   Sound questao6alternativaA = new Sound("src\\sounds\\questao6alternativaA.wav");
   Sound questao6alternativaB = new Sound("src\\sounds\\questao6alternativaB.wav");
   Sound questao6alternativaC = new Sound("src\\sounds\\questao6alternativaC.wav");
   Sound questao6alternativaD = new Sound("src\\sounds\\questao6alternativaD.wav");
   
   Sound questao7alternativaA = new Sound("src\\sounds\\questao7alternativaA.wav");
   Sound questao7alternativaB = new Sound("src\\sounds\\questao7alternativaB.wav");
   Sound questao7alternativaC = new Sound("src\\sounds\\questao7alternativaC.wav");
   Sound questao7alternativaD = new Sound("src\\sounds\\questao7alternativaD.wav");
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPergunta = new javax.swing.JLabel();
        BtnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        lblAlternativaA = new javax.swing.JLabel();
        lblAlternativaB = new javax.swing.JLabel();
        lblAlternativaC = new javax.swing.JLabel();
        lblAlternativaD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        lblPergunta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPergunta.setText("...");
        lblPergunta.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblPerguntaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblPerguntaMouseExited(evt);
            }
        });

        BtnA.setText("A");
        BtnA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BtnAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                BtnAMouseExited(evt);
            }
        });
        BtnA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BtnAActionPerformed(evt);
            }
        });

        btnB.setText("B");
        btnB.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnBMouseExited(evt);
            }
        });
        btnB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnCMouseExited(evt);
            }
        });
        btnC.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCActionPerformed(evt);
            }
        });

        btnD.setText("D");
        btnD.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnDMouseExited(evt);
            }
        });
        btnD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDActionPerformed(evt);
            }
        });

        lblAlternativaA.setText("________");
        lblAlternativaA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblAlternativaAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblAlternativaAMouseExited(evt);
            }
        });

        lblAlternativaB.setText("________");
        lblAlternativaB.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblAlternativaBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblAlternativaBMouseExited(evt);
            }
        });

        lblAlternativaC.setText("________");
        lblAlternativaC.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblAlternativaCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblAlternativaCMouseExited(evt);
            }
        });

        lblAlternativaD.setText("________");
        lblAlternativaD.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblAlternativaDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblAlternativaDMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAlternativaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAlternativaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAlternativaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAlternativaA, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnA)
                    .addComponent(lblAlternativaA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB)
                    .addComponent(lblAlternativaB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC)
                    .addComponent(lblAlternativaC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD)
                    .addComponent(lblAlternativaD))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnAActionPerformed
    {//GEN-HEADEREND:event_BtnAActionPerformed
       Questoes.a=true;          System.out.println("A= True");
        
    }//GEN-LAST:event_BtnAActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
      Questoes questoes = new Questoes();
      questoes.executar();
        System.out.println("Iniciou frm quiz");
    
    }//GEN-LAST:event_formWindowOpened

    private void btnBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBActionPerformed
    {//GEN-HEADEREND:event_btnBActionPerformed
     Questoes. b=true;            
       lblPergunta.setText(Questoes.pergunta);
       lblAlternativaA.setText(Questoes.alternativa1);
       lblAlternativaB.setText(Questoes.alternativa2);
       lblAlternativaC.setText(Questoes.alternativa3);
       lblAlternativaD.setText(Questoes.alternativa4);
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCActionPerformed
    {//GEN-HEADEREND:event_btnCActionPerformed
     Questoes.c=true;       
     
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDActionPerformed
    {//GEN-HEADEREND:event_btnDActionPerformed
     Questoes.d=true;   
    }//GEN-LAST:event_btnDActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseDragged
    {//GEN-HEADEREND:event_formMouseDragged
       lblPergunta.setText(Questoes.pergunta);
       
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseMoved
    {//GEN-HEADEREND:event_formMouseMoved
       lblPergunta.setText(Questoes.pergunta);
       lblAlternativaA.setText(Questoes.alternativa1);
       lblAlternativaB.setText(Questoes.alternativa2);
       lblAlternativaC.setText(Questoes.alternativa3);
       lblAlternativaD.setText(Questoes.alternativa4);
       System.out.println("frm quiz Atualizou");// TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void BtnAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BtnAMouseExited
    {//GEN-HEADEREND:event_BtnAMouseExited
       Questoes. a=false;     
    }//GEN-LAST:event_BtnAMouseExited

    private void btnBMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnBMouseExited
    {//GEN-HEADEREND:event_btnBMouseExited
      Questoes.  b=false;          // TODO add your handling code here:
    }//GEN-LAST:event_btnBMouseExited

    private void btnCMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnCMouseExited
    {//GEN-HEADEREND:event_btnCMouseExited
       Questoes. c=false;          // TODO add your handling code here:
    }//GEN-LAST:event_btnCMouseExited

    private void btnDMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnDMouseExited
    {//GEN-HEADEREND:event_btnDMouseExited
      Questoes. d=false;          // TODO add your handling code here:
    }//GEN-LAST:event_btnDMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMousePressed
    {//GEN-HEADEREND:event_formMousePressed
       lblPergunta.setText(Questoes.pergunta);
       lblAlternativaA.setText(Questoes.alternativa1);
       lblAlternativaB.setText(Questoes.alternativa2);
       lblAlternativaC.setText(Questoes.alternativa3);
       lblAlternativaD.setText(Questoes.alternativa4);  // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void BtnAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BtnAMouseClicked
    {//GEN-HEADEREND:event_BtnAMouseClicked
       lblPergunta.setText(Questoes.pergunta);
       lblAlternativaA.setText(Questoes.alternativa1);
       lblAlternativaB.setText(Questoes.alternativa2);
       lblAlternativaC.setText(Questoes.alternativa3);
       lblAlternativaD.setText(Questoes.alternativa4);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAMouseClicked

    private void lblPerguntaMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblPerguntaMouseEntered
    {//GEN-HEADEREND:event_lblPerguntaMouseEntered
       
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7.play();}
        
        
        
        
        
        
        
    }//GEN-LAST:event_lblPerguntaMouseEntered

    private void lblPerguntaMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblPerguntaMouseExited
    {//GEN-HEADEREND:event_lblPerguntaMouseExited
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7.stop();}
        
        
        
    }//GEN-LAST:event_lblPerguntaMouseExited

    private void lblAlternativaAMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaAMouseEntered
    {//GEN-HEADEREND:event_lblAlternativaAMouseEntered

        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaA.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaA.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaA.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaA.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaA.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaA.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaA.play();}
       

           

    }//GEN-LAST:event_lblAlternativaAMouseEntered

    private void lblAlternativaBMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaBMouseEntered
    {//GEN-HEADEREND:event_lblAlternativaBMouseEntered
       
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaB.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaB.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaB.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaB.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaB.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaB.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaB.play();}
    }//GEN-LAST:event_lblAlternativaBMouseEntered

    private void lblAlternativaCMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaCMouseEntered
    {//GEN-HEADEREND:event_lblAlternativaCMouseEntered
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaC.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaC.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaC.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaC.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaC.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaC.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaC.play();}
    }//GEN-LAST:event_lblAlternativaCMouseEntered

    private void lblAlternativaDMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaDMouseEntered
    {//GEN-HEADEREND:event_lblAlternativaDMouseEntered
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaD.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaD.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaD.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaD.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaD.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaD.play();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaD.play();}
    }//GEN-LAST:event_lblAlternativaDMouseEntered

    private void lblAlternativaAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaAMouseExited
    {//GEN-HEADEREND:event_lblAlternativaAMouseExited
      
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaA.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaA.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaA.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaA.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaA.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaA.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaA.stop();}
    }//GEN-LAST:event_lblAlternativaAMouseExited

    private void lblAlternativaBMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaBMouseExited
    {//GEN-HEADEREND:event_lblAlternativaBMouseExited
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaB.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaB.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaB.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaB.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaB.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaB.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaB.stop();}
    }//GEN-LAST:event_lblAlternativaBMouseExited

    private void lblAlternativaCMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaCMouseExited
    {//GEN-HEADEREND:event_lblAlternativaCMouseExited
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaC.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaC.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaC.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaC.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaC.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaC.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaC.stop();}
    }//GEN-LAST:event_lblAlternativaCMouseExited

    private void lblAlternativaDMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlternativaDMouseExited
    {//GEN-HEADEREND:event_lblAlternativaDMouseExited
        if (Questoes.ordemPerguntas[Questoes.k]==0){questao0alternativaD.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==1){questao2alternativaD.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==2){questao3alternativaD.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==3){questao4alternativaD.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==4){questao5alternativaD.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==5){questao6alternativaD.stop();}
        if (Questoes.ordemPerguntas[Questoes.k]==6){questao7alternativaD.stop();}
    }//GEN-LAST:event_lblAlternativaDMouseExited

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
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmQuiz dialog = new frmQuiz(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JLabel lblAlternativaA;
    private javax.swing.JLabel lblAlternativaB;
    private javax.swing.JLabel lblAlternativaC;
    private javax.swing.JLabel lblAlternativaD;
    private javax.swing.JLabel lblPergunta;
    // End of variables declaration//GEN-END:variables
}
