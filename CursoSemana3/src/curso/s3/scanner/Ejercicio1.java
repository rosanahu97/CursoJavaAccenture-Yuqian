package curso.s3.scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//coger los datos por consola
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce su nombre: ");
		String nombre = sc.next();
		//sc.nextLine();
		System.out.println("Introduce su apellido: ");
		String apellido = sc.next();
		//sc.nextLine();
		//grabar los datos en un fichero llamado nombreApellido
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			//crear el fichero 
			fichero = new FileWriter("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\nombreApellido.txt");
			pw = new PrintWriter(fichero);
			pw.println("Nombre="+nombre);
			pw.println("Apellido="+apellido);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//cierra el fichero en caso no nulo
			try {
				if (fichero!=null) {
					fichero.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
		
	//leer los datos del fichero y imprimirlo por la consola
		File fich = new File("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\nombreApellido.txt");
		try(Scanner leerFichero = new Scanner(fich)){
			leerFichero.useDelimiter("\n");
			StringJoiner sj = new StringJoiner(" ");
			while(leerFichero.hasNext()) {
				String cadena  = leerFichero.next().trim();
				String[] partes=cadena.split("=");
				sj.add(partes[1].toString());	
				
			}
			System.out.println(sj.toString());
	}catch(IOException e) {
			e.printStackTrace();
		}

}
}
