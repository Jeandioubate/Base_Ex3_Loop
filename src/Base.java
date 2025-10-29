import java.util.Scanner;			//Import de la classe Scanner qui permet de lire les saisies clavier de l'user

public class Base {						// Déclaration de la classe publique nommée (Base)

    public static void main(String[] args) {				// C'est la méthode principale du programme

        if (args.length > 0) {							// Si le nombre d'éléments dans le tableau args
            for (String argument : args) {						// Boucle foreach : je parcours chaque argument un par un
                if (argument.matches("-?\\d+")) {				// Je vérifie que l'argument est un nombre entier valide (positif ou négatif)
                    int nomber = Integer.parseInt(argument);		// Je convertis la chaîne en entier
                    System.out.println(analyzeNomber(nomber));		// J'appelle la méthode (analyzeNomber) pour analyser le nombre et afficher son résultat dans la console.
                } else {
                    System.out.println("Erreur : \"" + argument + "\" n'est pas un nombre entier !");
                    return;																				// Si un argument n'est pas un entier, on affiche un message d'érreur 
                }
            }

        } else {											// Si aucun argument dans la ligne de commande, je demande une saisie clavier à l'user.
            Scanner scan = new Scanner(System.in);			// Créer un objet (Scanner) pour lire ce que saisie l'user
            System.out.print("Entrez un nombre entier : ");
            String myNum = scan.nextLine();						// Je lis et stocke la saisie de l'user dans myNum

            while (!myNum.matches("-?\\d+")) {					// Tant que la saisie n'est pas un nombre entier, je demande une nouvelle valeur.
                System.out.print("Valeur invalide. Veuillez entrer un nombre entier : ");
                myNum = scan.nextLine();
            }

            int number = Integer.parseInt(myNum);     			// Je convertis la saisie en entier
            System.out.println(analyzeNomber(number));			// J'appelle la méthode et affiche le résultat
            scan.close();										// Je ferme le flux Scanner
        }
    }

    public static String analyzeNomber(int nomb) {				// Je déclare un méthode (analyzeNomber) accessible depui main, renvoie une phrase et reçoit un nombre entier en paramètre
        String result = "Valeur ";								// J'initialise une variable qui contiendra la phrase finale

        if (nomb > 0) {										// Je détermine si un nombre est :
            result += "positive";							// positif, j'ajoute "positive"
        } else if (nomb < 0) {
            result += "négative";							// négatif, j'ajoute "négative"
        } else {
            result += "nulle";								// nul, j'ajoute "null"
        }

        if (nomb != 0) {												// Si le nombre n'est pas nul, j'ajoute sa parité
            result += (nomb % 2 == 0) ? " et paire." : " et impaire.";
        } else {
            result += ".";
        }

        return result;							// Je renvoie la phrase complète à la méthode main()
    }
}
