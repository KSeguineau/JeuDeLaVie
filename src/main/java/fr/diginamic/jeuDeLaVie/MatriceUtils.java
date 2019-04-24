package fr.diginamic.jeuDeLaVie;

public class MatriceUtils {

	public static int enVie(int[][] m, int i, int j) {
		int tmp = 0;
		tmp += getVoisin(m, i - 1, j - 1);
		tmp += getVoisin(m, i - 1, j);
		tmp += getVoisin(m, i - 1, j + 1);
		tmp += getVoisin(m, i, j - 1);
		tmp += getVoisin(m, i, j + 1);
		tmp += getVoisin(m, i + 1, j - 1);
		tmp += getVoisin(m, i + 1, j);
		tmp += getVoisin(m, i + 1, j + 1);

		if (m[i][j] == 1 && (tmp == 2 || tmp == 3)) {
			return 1;
		} else if (m[i][j] == 0 && tmp == 3) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int getVoisin(int[][] m, int i, int j) {
		if (i >= 0 && j >= 0 && i < m.length && j < m.length) {
			return m[i][j];
		} else {
			return 0;
		}
	}
	
	public static int[][] copy(int[][] tab){
		int[][] tmp = new int[tab.length][tab.length];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				tmp[i][j] = tab[i][j];
			}
		}
		return tmp;
		
	}
}
