/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import apresentacao.frmFim;
import javax.swing.JOptionPane;
import questoes.Questoes;

/**
 *
 * @author Gabriel Alves
 */

public class SistemaDoGame implements Runnable
{

    @Override
    public void run()
    {
         executar();
    }
public void executar()
    {
        while(true)
        {
            Questoes questoes = new Questoes();
             
            Questoes.pergunta=Questoes.questoes[Questoes.ordemPerguntas[Questoes.k]];
            Questoes.alternativa1=Questoes.altenativas1[Questoes.ordemPerguntas[Questoes.k]];
            Questoes.alternativa2=Questoes.altenativas2[Questoes.ordemPerguntas[Questoes.k]];
            Questoes.alternativa3=Questoes.altenativas3[Questoes.ordemPerguntas[Questoes.k]];
            Questoes.alternativa4=Questoes.altenativas4[Questoes.ordemPerguntas[Questoes.k]];
             
            if(Questoes.k==0)
            {
                if(Questoes.a==true){Questoes.a=false;System.out.println("Acertou");Questoes.k=1;}
                else if (Questoes.b==true){Questoes.b=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.c==true){Questoes.c=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.d==true){Questoes.d=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
            }
            else if(Questoes.k==1)
            {
                if(Questoes.a==true){Questoes.a=false;System.out.println("Acertou");Questoes.k=2;}
                else if (Questoes.b==true){Questoes.b=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.c==true){Questoes.c=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.d==true){Questoes.d=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
            }
            else if(Questoes.k==2)
            {
                if(Questoes.a==true){Questoes.a=false;System.out.println("Acertou");Questoes.k=3;}
                else if (Questoes.b==true){Questoes.b=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.c==true){Questoes.c=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.d==true){Questoes.d=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
            }
            else if(Questoes.k==3)
            {
                if(Questoes.a==true){Questoes.a=false;System.out.println("Acertou");Questoes.k=4;}
                else if (Questoes.b==true){Questoes.b=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.c==true){Questoes.c=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.d==true){Questoes.d=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
            }
            else if(Questoes.k==4)
            {
                if(Questoes.a==true){Questoes.a=false;System.out.println("Acertou");Questoes.k=5;}
                else if (Questoes.b==true){Questoes.b=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.c==true){Questoes.c=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.d==true){Questoes.d=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
            }
            else if(Questoes.k==5)
            {
                if(Questoes.a==true){Questoes.a=false;System.out.println("Acertou");Questoes.k=6;}
                else if (Questoes.b==true){Questoes.b=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.c==true){Questoes.c=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.d==true){Questoes.d=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
            }
            else if(Questoes.k==6)
            {
                if(Questoes.a==true)
                {
                     Questoes.a=false;
                     frmFim frmF = new frmFim(null,true);
                     frmF.setVisible(true);
                     Questoes.k=7;
                
                
                }
                else if (Questoes.b==true){Questoes.b=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.c==true){Questoes.c=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
                else if (Questoes.d==true){Questoes.d=false;System.out.println("Errou");JOptionPane.showMessageDialog(null,"Errado, Tente denovo");}
            }
            System.out.println("K="+Questoes.k);
            
        }
        
    }    
}
