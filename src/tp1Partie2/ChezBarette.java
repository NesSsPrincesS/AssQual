package tp1Partie2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ChezBarette {
	
	private final static String MESSAGE_ENTRER_NOM_FICHIER = "Entrez le nom du fichier à lire: ";
	private final static String MESSAGE_ERREUR_NOM_FICHIER = "Erreur le fichier n'existe pas";
	private final static String MESSAGE_ERREUR_ENTREE_SORTI = "\nUne erreur d'entrée-sortie" + " est survenue.";
	private final static String MESSAGE_ERREUR_FORMAT_FICHIER = "Le fichier ne respecte pas le format demandé ! ";
	private final static String MESSAGE_BIENVENUE = "Bienvenue chez Barette!\nFactures:\n";

	public static void main(String[] args) {
		ArrayList<Commande> commandes = new ArrayList<Commande>();
		ArrayList<Plats> listePlats = new ArrayList<Plats>();
		boolean fichierOk = true;

		BufferedReader fic = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( MESSAGE_ENTRER_NOM_FICHIER);

		String nomFichier = "";
		try {
			nomFichier = fic.readLine();
		} catch ( IOException errIO ) {
			System.out.println(MESSAGE_ERREUR_ENTREE_SORTI);
			errIO.printStackTrace();
		}
		Path cheminFichier = new File( nomFichier ).toPath();

		
	}

}
