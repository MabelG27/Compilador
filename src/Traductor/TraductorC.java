package Traductor;

import java.io.*;

public class TraductorC {

    public TraductorC() {

    }//CTranslator constructor

    public static String ruta_c = "";
    public static String ruta_j = "";
    public static boolean dat_ent = false;

    public void CTranslate(String line, File outfile) {

        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(outfile, true));//, "UTF-8"); // Permite escribir un nuevo archivo
            writer.println(line);// Imprime la nueva linea en el nuevo archivo

            writer.close();// cierra el nuevo archivo
        } catch (Exception IOException) {
            System.out.println("Some sort of IO error here");
        }//try-catch

    }//CTranslate

    //Agrega un encabezado Java al nuevo archivo
    public void addJavaHeader(String name, File outfile) {
        File fichero = new File(ruta_j);

        String fileNameWithoutExtension = fichero.getName().substring(0, fichero.getName().lastIndexOf('.'));

        try {
            //Declara al escritor como un nuevo PrintWriter, nos permite escribir en un nuevo archivo
            PrintWriter writer = new PrintWriter(new FileOutputStream(outfile, true));             // deDeclara un nuevo PrintWriter, también permite escribir un archivo nuevo

            /*
	      Agregar encabezados java 
             */
            /*#############Libreria Scanner##############*/
       
            writer.println("import java.util.Scanner;");
            writer.println("\n");
            writer.println("public class " + fileNameWithoutExtension + " {");
            writer.println("    public static void main(String[] args) {");
            writer.println();

            writer.close();
        } catch (Exception IOException) {
            System.out.println("Error");
        }

    }

    //Método que traduce sentencias de impresión de C++ a Java
    public void CstringTrans(String line, File outfile) {

        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(outfile, true));
            String[] printStatement = line.split("<<");//Divide el printStatement después de (
            int lastentry = printStatement.length - 1;

            if (printStatement[lastentry].equals(" endl;")) {
                writer.print("System.out.println(");
                lastentry--;
            } else {
                writer.print("System.out.print(");
            }//if         

            for (int i = 1; i < lastentry - 1; i++) {
                writer.print(printStatement[i] + " + ");
            }//for
            if (lastentry > 0) { //retirar ; de la última entrada
                String newline = printStatement[lastentry].replaceAll("\\;", "");
                writer.println(newline + ");");
            } else {
                writer.println(");");
            }//if-else

            writer.close();//termina con la escritura en un nuevo archivo
        } catch (Exception IOException) {
            System.out.println("Error");
        }

    }//CTranslator

}
