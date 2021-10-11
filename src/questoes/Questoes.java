/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes;
import java.util.Random;
import jogo.SistemaDoGame;
/**
 *
 * @author Gabriel Alves
 */
public class Questoes
{
    
 public static String questoes[];
 public static String altenativas1[];
 public static String altenativas2[];
 public static String altenativas3[];
 public static String altenativas4[];
 public static int[] ordemPerguntas;
 public static String pergunta;
 public static String alternativa1;
 public static String alternativa2;
 public static String alternativa3;
 public static String alternativa4;
 public static boolean a=false;
 public static boolean b=false;
 public static boolean c=false;
 public static boolean d=false;
 public int numQuestao=0;
 int aleatorio;
 int i=0;
 int j=0;
 public static int k =0;
   
   
   
   
public void executar()
{

 questoes =new String[7];
 altenativas1 =new String[7];
 altenativas2 =new String[7];
 altenativas3 =new String[7];
 altenativas4 =new String[7];
 ordemPerguntas =new int[7];
 
 questoes[0]="Lixo deve ser descartado no?";
 questoes[1]="Qual meio de transporte que não agride o meio ambiente com poluição?";
 questoes[2]="Eletrônicos como pilhas , celulares quebrados devem ser descartados em ?";
 questoes[3]="O que é Reciclagem?";
 questoes[4]="Como separar corretamente seu lixo?";
 questoes[5]="Como consumir de forma consciente";
 questoes[6]="Como preservar árvores e florestas?";
 
 altenativas1[0]="No lixo";
 altenativas1[1]="Bicicletas";
 altenativas1[2]="Em lixo adequado disponível em pontos de coleta de reciclagem";
 altenativas1[3]="Processo de transformação de materiais usados em novos produtos para consumo";
 altenativas1[4]="Separar o lixo orgânico (restos de alimentos, papel sujo e lixo sanitário) dos resíduos sólidos (como plástico, vidro, papel, metal e embalagens longa vida)";
 altenativas1[5]="Utilizando os recursos naturais para satisfazer nossas necessidades e das gerações futuras";
 altenativas1[6]="Reciclando papéis, jornais e revistas";
 
 altenativas2[0]="Em rios ";
 altenativas2[1]="Motocicletas";
 altenativas2[2]="Na Natureza";
 altenativas2[3]="Coletar todo tipo de material existente em lixos recicláveis.";
 altenativas2[4]="Juntar tudo na lixeira, pois os prédios já fazem o trabalho de separação";
 altenativas2[5]="Usar a mangueira para lavar o quintal e o carro";
 altenativas2[6]="Construindo uma casa na árvore";
 
 altenativas3[0]="Queimado ";
 altenativas3[1]="Carros";
 altenativas3[2]="No fogo";
 altenativas3[3]="Nome dado para todo o processo do lixo após seu descarte.";
 altenativas3[4]="Deixar plásticos sujos junto com lixo orgânico";
 altenativas3[5]="Trocando todos os nossos objetos sempre que um novo do mesmo tipo for lançado";
 altenativas3[6]="Reutilizando metais e vidros";
 
 altenativas4[0]="Em terrenos ";
 altenativas4[1]="Ônibus";
 altenativas4[2]="Lixo comum";
 altenativas4[3]="“Jogar fora” o lixo produzido";
 altenativas4[4]="Juntar todo tipo de lixo e descartar em ponto de coleta";
 altenativas4[5]="Adquirindo qualquer tipo de produto se for barato";
 altenativas4[6]="Indo em parques";
 
 for (int i = 0; i < 7; i++)
    {
        ordemPerguntas[i]=10;
    }
 
   

Random gerador = new Random();
aleatorio = gerador.nextInt(7);
 for (int j = 0; j < 7; j++)
    {
      if (aleatorio!= ordemPerguntas[0]&&aleatorio != ordemPerguntas[1]&&aleatorio != ordemPerguntas[2]&&aleatorio != ordemPerguntas[3]&&aleatorio != ordemPerguntas[4]&& 
          aleatorio!= ordemPerguntas[5] &&aleatorio!= ordemPerguntas[6])
        {
            ordemPerguntas[j]=aleatorio;
            aleatorio = gerador.nextInt(7);  
        }  
      else
        {
            aleatorio = gerador.nextInt(7);
            j=j-1;
        }
              
    }
 
  SistemaDoGame sdg = new SistemaDoGame();
        Thread tsdg = new Thread(sdg);
        tsdg.start();
        




   
 

}
    
}
