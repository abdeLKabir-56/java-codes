package test;

import java.util.Scanner;

public class Test {

	public static int nombrespartiesGagnees(int[] scoreJoueur,int[] scoreAdversaire,int nbrPartie) {
		int  nbrPartieGagnees=0;
		for(int i=0;i<nbrPartie;i++) {
			if(scoreJoueur[i]>scoreAdversaire[i]) {
				 nbrPartieGagnees+=1;
		}
		}
		return nbrPartieGagnees;
	
	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    int[] scoreJoueur=new int[10];
    int[] scoreAdversaire=new int[10];
    scoreJoueur[0]=1;
    scoreAdversaire[0]=1;
    scoreJoueur[1]=7;
    scoreAdversaire[1]=4;
    scoreJoueur[2]=5;
    scoreAdversaire[2]=1;
    scoreJoueur[3]=1;
    scoreAdversaire[3]=7;
    int a=nombrespartiesGagnees(scoreJoueur,scoreAdversaire,10);
  System.out.println("le nombre de partie gagnee par le joueur est:"+a);

	  
     
      }
	
}