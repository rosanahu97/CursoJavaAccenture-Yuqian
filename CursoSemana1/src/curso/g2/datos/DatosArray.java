package curso.g2.datos;
import java.util.Arrays;

public class DatosArray {

	
	public static void main(String[] args) {
	
	int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
	int[][] array  = new int[5][7];
	
	int fila= array.length;
	int columna = array[0].length;
	int numero=1;
	//rellenar el array bidimensional con un bucle
	for(int i =0;i<fila;i++) {
		for(int j=0;j<columna;j++) {
			if(numero<32) {
				array[i][j]=numero;
				numero++;
				
			}else {
				break;
			}
		}

	}
	//imprimir el resultado por la pantalla
	  for (int[] ints : array) {
          System.out.println(Arrays.toString(ints));
      }
	}
}
