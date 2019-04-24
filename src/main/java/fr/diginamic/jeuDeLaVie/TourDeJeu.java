package fr.diginamic.jeuDeLaVie;

public class TourDeJeu {

	public static MatriceDeJeu newTour(MatriceDeJeu m){
		MatriceDeJeu newM = new MatriceDeJeu(MatriceUtils.copy(m.getMatrice()));
		
		for (int i = 0; i < m.getMatrice().length; i++) {
			for (int j = 0; j < m.getMatrice().length; j++) {
				newM.modifierVal(i, j, MatriceUtils.enVie(m.getMatrice(), i, j));
			}
		}
		
		return newM;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int[][] tmp ={
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
				{0,0,0,0,0,1,0,0,1,0,0,0,0,0,0},
				{0,0,0,0,0,0,1,1,1,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},			
		};
		MatriceDeJeu matrice = new MatriceDeJeu(tmp);
		
		while(true){
		matrice.afficher();
		matrice = TourDeJeu.newTour(matrice);
		Thread.sleep(500l);
		}
		
	}

	
}
