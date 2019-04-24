package fr.diginamic.jeuDeLaVie;

public class MatriceDeJeu {

	private int[][] matrice;

	public MatriceDeJeu() {
		matrice = new int[15][15];
	}

	public MatriceDeJeu(int[][] nm) {
		matrice = nm;
	}

	

	public void afficher() {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice.length; j++) {
				if(matrice[i][j]==1){
					System.out.print(matrice[i][j] + "|");
				}
				else{
					System.out.print(" "+"|");
				}
			}
			System.out.println();
		}
	}

	public void modifierVal(int i, int j,int val){
		this.matrice[i][j] = val;
	}
	
	public int[][] getMatrice() {
		return matrice;
	}

	public void setMatrice(int[][] matrice) {
		this.matrice = matrice;
	}
	
	
	
}
