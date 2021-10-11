/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gabriel Alves
 */
public class Controle
{
   
   public static int narracao=0; 
   public static int som=0; 
    
   

  
    
    
    public void AtivarNarracao()
    { 
        narracao=1;
    }
    public void DesativarNarracao()
    {   
        narracao=0;
    }
   
    
    public void AtivarSom()
    { 
        som=1;
    }
    public void DesativarSom()
    {   
        som=0;
    }

  
}
