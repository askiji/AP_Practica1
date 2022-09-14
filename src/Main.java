import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// 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
		//eje1();

//		contarCaracteres("Docs/acros.txt");
//		existeFichero("Docsasdasdasd");
		leerCadena("Docs/captitan.txt");
//		contarAparicionesCadena("me", "Docs/captitan.txt");

	}
	static void contarAparicionesCadena(String cadena, String path) {
		
		String text;
		String[] separado= null;
		int aux=0;
		Files.
		try {
			text = new String(Files.readAllBytes(Paths.get(path)));
//			System.out.println(text);
			separado= text.split(" ");
			System.out.println(Arrays.toString(separado));
			
			for (String string : separado) {
				
//				System.out.println(string);
				
				if(string.equalsIgnoreCase(cadena)) {
					aux++;
				}
			}
			System.out.println(aux);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Pattern pattern = Pattern.compile(cadena); 
//		Matcher matcher = pattern.matcher(text);
//		int count = 0;
//		while (matcher.find()) count++;
//		try {
//			FileReader fr = new FileReader(path);
//			BufferedReader bf = new BufferedReader(fr);
//			String cad;
//			while ((cad = bf.readLine()) != null) {
//			System.out.println(cad.replace('*', '\n'));
//			}
//			bf.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	private static void eje1() {
		File d3 = new File("Docs");
		d3.mkdir();
		File f1 = new File(d3, "text1.txt");
		File f2 = new File(d3, "text2.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		f1.renameTo(new File(d3, "captitan.txt"));
		f2.delete();
//		System.out.println("End");

		File f4 = new File(d3, "acros.txt");

		try {
			f4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (f4.exists()) {
			System.out.println("Nombre del fichero: " + f4.getName());
			System.out.println("Ruta relativa: " + f4.getPath());
			System.out.println("Ruta absoluta: " + f4.getAbsolutePath());
			System.out.println("¿Se puede leer? " + f4.canRead());
			System.out.println("Se puede escribir? " + f4.canWrite());
			System.out.println("Tamaño: " + f4.length());
			System.out.println("¿Es un directorio? " + f4.isDirectory());
			System.out.println("¿Es un archivo? " + f4.isFile());
		}
	}

	static void existeFichero(String string) {
		File f = new File(string);
		if (f.exists()) {
			System.out.println("Existe el fichero");
		} else {
			System.out.println("No existe el fichero");
		}
	}

	static void contarCaracteres(String string) {
		int aux=0;
		int count=0;
		try {
			FileReader fr = new FileReader(string);
			aux = fr.read();
			while (aux !=-1 ) {
				aux = fr.read();
				count++;
			}
			fr.close();
		
	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
	}
	static void leerCadena (String path) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader bf = new BufferedReader(fr);
			String cad;
			while ((cad = bf.readLine()) != null) {
			System.out.println(cad.replace('*', '\n'));
			}
			bf.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
