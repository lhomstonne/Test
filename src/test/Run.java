package test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Run {

	public static void main(String[] args) {
		


		pairImpair(4);
		
		puissance(2,4);
		
		//argument(1,2);
		
		//puissanceDouble(2.10f, 1);
		
		age(20);
		
		recupValeur(9);
	}
	
	
	/*  Exercice 2   */
	public static int pairImpair(int unNombre)
	{
		System.out.println("Exercice 2");
		if((unNombre%2)==1)
		{
			System.out.println("Le chiffre " + unNombre + " est impair! \n");
		}
		else if((unNombre%2)==0)
		{
			System.out.println("Le chiffre " + unNombre + " pair! \n");
		}
		
		return unNombre;
	}
	
	
	/*  Exercice 3   */
	public static int puissance(int x, int y)
	{
		System.out.println("Exercice 3");
		System.out.println("La puissance des chiffres " + x + " et " + y + " est : " + Math.pow(x, y) + "\n");
		return x;
	}
	
	
	
	/*  Exercice 4  
	public static void argument(int numArgument1, int numArgument2)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Exercice 4");
		do 
		{
			System.out.println("Veuillez entrer un chiffre entre 1 et 5 pour d�couvrir une couleur, Merci ! ");
			int numm = sc.nextInt();
			if(numm==1)
			{
				System.out.println("Vous avez d�couvert la couleur rouge ! \n");

			}
			else if(numm==2)
			{
				System.out.println("Vous avez d�couvert la couleur jaune ! \n");

			}
			else if(numm==3)
			{
				System.out.println("Vous avez d�couvert la couleur vert ! \n");

			}
			else if(numm==4)
			{
				System.out.println("Vous avez d�couvert la couleur bleu ! \n");

			}
			else if(numm==5)
			{
				System.out.println("Vous avez d�couvert la couleur noir ! \n");

			}
		}while(true);
	} */
	
	
	/* Exercice 5 */
	public static double puissanceDouble(float px, int py)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Exercice 5");
		System.out.println("Veuillez entrer un chiffre a virgule!");
		float nummx = sc.nextFloat();
		System.out.println("Veuillez entrer un chiffre !");
		int nummy = sc.nextInt();
		System.out.println("La puissance du premier chiffre " + nummx + " est : " + Math.pow(nummx, nummy) + "\n ");
		return px;
	}
	
	/* Exercice 6 */
	public static int recupValeur(int val)
	{
		
		System.out.println("Exercice 6");
		Scanner sc = new Scanner(System.in);
		int[] tab1 = new int[9];
		for(int val1:tab1)
		{
			do
			{
				System.out.println("Entrez une valeur");
				val=sc.nextInt();	
			}while(val<9);
			val1=val;
			System.out.println(tab1);
		}
		
		return val;
		}
	
	/*  Test case   */
	public static int age(int old)
	{
		
		switch(old)
		{
		case 10:
			System.out.println("Vous avez " + old + " ans ! Vous �tes mineur!");
			break;
			
		case 16: case 17:
			System.out.println("Vous avez " + old + " ans ! Vous �tes ado!");
			break;
			
		case 18: case 19: case 20:
			System.out.println("Vous avez " + old + " ans ! Vous �tes majeur!");		
			break;
	
		default: 
			System.out.println("Vous �tes mineur !");
		}
		return old;
		}

}
