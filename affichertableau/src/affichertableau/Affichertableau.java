 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affichertableau;

import javax.swing.JOptionPane;

/**
 *
 * @author bougi
 */
public class Affichertableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab[] = new int[10];
        int n=0, i=0;
        
        String s =" ";
        for (i=0; i<10; i++){
          n= Integer.parseInt(JOptionPane.showInputDialog("veuillez saisir la valeur"));
          
          tab[i]= n; 
          s = s +" | "+n;  
    }
        System.out.print(s+"|");
        JOptionPane.showMessageDialog(null,s,"tab",JOptionPane.INFORMATION_MESSAGE);
        Annatableau(tab);
        
        //String d = analysetableau(tab);
        //JOptionPane.showMessageDialog(null,d,"positifs",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void Annatableau( int tab[]){
        double somme=0,somme1=0; int i=0,x=0,z=0,j=0; double moyenne,moyenne1;
        String y =" ";
     
        for (i=0; i<tab.length; i++){
        if (tab[i]<0){
            somme=somme+tab[i];
            x++;}
        else  {
            somme1=somme1+tab[i];
            z++;
        }
        }
        moyenne=somme/x;
        JOptionPane.showMessageDialog(null,"la moyenne de"+x+" entiers negatifs est"+moyenne,"négatifs",JOptionPane.INFORMATION_MESSAGE);
        moyenne1=somme1/z;
        JOptionPane.showMessageDialog(null,"la moyenne de"+z+" entiers positifs est"+moyenne1,"négatifs",JOptionPane.INFORMATION_MESSAGE);
         System.exit(0);
        
        
    
    }
    /*public  static  String analysetableau1(int tab[]){
        int somme=0,i=0,z=1,f=0; double moyenne1=0;
        String y2 =" ";
        for (i=0; i<tab.length; i++){
            f=tab[i];
         if (f>=0){
        somme=somme+f;
        z++;
        moyenne1=somme/1+i;
        y2 = "la moyenne de"+z+" entiers positifs est"+moyenne1;
        }
        }
        return y2;
        
    
    }*/
}
