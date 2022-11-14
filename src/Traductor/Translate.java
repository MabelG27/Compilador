package Traductor;

import java.util.*;
import java.io.*;
import java.text.*;
import java.lang.Object;
import java.nio.file.*;

public class Translate {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);  // ddeclarando Scanner
	System.out.print("Ingresar programa a traducir: ");
	String infile = scan.next();  // toma lo ingrsado por el usuario y lo guarda en la variable infile

	String[] name = infile.split("\\.");  // divide el archivo en dos partes en el"."

	String infilename = name[0];   // la primera parte de la división del archivo
	String infileext = name[1];   // la segunda  parte de la división del archivo


	String outfilename;  // declarando variable  outfilename

/*
Declaración if else que verifica si la segunda parte de la división 
es java o si es cpp y agrega al final en consecuencia
*/
	if (infileext.equals("java")) {
	    outfilename = infilename + ".cpp";
	} else if (infileext.equals("cpp")) {
	    outfilename = infilename + ".java";
	} else {
	    System.out.println("No se puede traducir este lenguaje");
	    return;
	}//if-else


     //Crea un nuevo archivo llamado outfile al que se le da el nombre del archivo
	File outfile = new File(outfilename);   

  /*
Si hay un archivo que tiene el mismo nombre y no un directorio, esto
elimine el archivo para permitir que se escriba uno nuevo sobre él.
  */
	if (outfile.exists() && !outfile.isDirectory()) {
	    outfile.delete();
	}

  /*
  Declarando variables
  */

	String line = "";
	String prevLine = "";
	String tempLine = "";
	String temp = "";


	try {
	    FileInputStream fs = new FileInputStream(infile);  //Permite entrar en la entrada del archivo.
	    BufferedReader br = new BufferedReader(new InputStreamReader(fs)); //Nos pewrmite leer las lineas
	    JTranslator jtrans = new JTranslator(); // Declara que se usará un método en otra clase
	    CTranslator ctrans = new CTranslator();

	    if (infileext.equals("java")) {
		//System.out.println("Adding header to .cpp file");                       // debugging code
		jtrans.addCPPHeader(outfile);
		//System.out.println("Header added to .cpp file");                        // debugging code

		line = br.readLine(); // inicia el programa para comenzar a leer líneas de código y lo declara en línea
		/*
		  Hasta que el código llegue al inicio del método principal, este leerá el código
		*/
		do {
		    line = br.readLine();
		    line = line.replaceAll("\\s","");
		} while (!line.equals("publicstaticvoidmain(String[]args){"));

		line = br.readLine();


		do {
		    prevLine = line; // establece preLine igual a la línea antes de que la línea lea la siguiente línea de código
		    line = br.readLine(); // lee la siguiente línea de código
                    
		    System.out.println(line);/***************/
                    
        if(prevLine.equals("}")){
          System.out.println("HELLO?");
        }
        if(line == null){
          System.out.println("ARCHIVO CREADO");
          
        }
		   
         // if prevLine termina con un } y la última línea en nulo, salga de esta operación
        if (prevLine.equals("}") && line == null) {                        
            prevLine="";
            break;
		    }

		    //Entrando en la sección que causa problemas
		    String[] tempStArr = prevLine.split("\\(");// divide la prevLine


		    tempLine = tempStArr[0];  // primera parte almacenada como tempLine
	
		    tempLine = tempLine.replaceAll("\\s",""); // código para eliminar espacios en blanco del código
	
		    if (tempLine.equals("System.out.println") || tempLine.equals("System.out.print")) {

			jtrans.JstringTrans(prevLine, outfile);
		    } else {

			jtrans.JTranslate(prevLine, outfile);
		    }


		} while (line != null); // siempre que haya código para leer, se ejecutará la instrucción do anterior.

	    } else {   // no presente todavía.
		System.out.println("Traduciendo cpp -> java");
		ctrans.addJavaHeader(infilename, outfile);

		line = br.readLine();  // inicia el programa para comenzar a leer líneas de código y lo declara en línea
		/*
		  Hasta que el código llegue al inicio del método principal, este leerá el código		*/
		do {
		    line = br.readLine();
		    line = line.replaceAll("\\s","");
		} while (!line.equals("intmain(){"));

		line = br.readLine();


		do {
		    prevLine = line;// establece preLine igual a la línea antes de que la línea lea la siguiente línea de código
		    line = br.readLine(); // lee la siguiente línea de código
		    System.out.println(line);
                    
                   // si prevLine termina con } y la última línea es nula, sal de esta operación
		    if (prevLine.equals("}") && line == null) { 
			break;
		    }

		    String[] tempStArr = prevLine.split("\\<<");
		    tempLine = tempStArr[0];
		    tempLine = tempLine.replaceAll("\\s","");

		    if (tempLine.equals("cout")) {

			ctrans.CstringTrans(prevLine, outfile);
		    } else {
			
			ctrans.CTranslate(prevLine, outfile);
		    }//if-else

		} while (line != null);// siempre que haya código para leer, se ejecutará la instrucción do anterior.
	    }//if-else

	    ctrans.CTranslate("}",outfile);

	    /*
	      catches exception of a file inputed by user is not found.
	    */
	} catch (Exception FileNotFoundException) {
	    System.out.println("Este archivo no existe !");
	    return;
	}

    }//main

}

//finalProject
