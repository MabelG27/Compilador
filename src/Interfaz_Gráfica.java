
import Traductor.CTranslator;
import Traductor.JTranslator;
import com.formdev.flatlaf.FlatIntelliJLaf;
import compilerTools.CodeBlock;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.Timer;

/**
 *
 * @author Mabel
 */
import java.util.*;
import java.io.*;
import java.text.*;
import java.lang.Object;
import java.nio.file.*;
import static jflex.option.Options.directory;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Grammar;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Interfaz_Gráfica extends javax.swing.JFrame {

    private String title;
    public Directory directorio;
    private ArrayList<Token> tokens;//Guarda los tokens generados
    private ArrayList<ErrorLSSL> errors;//Guarda los errores sintácticos, semánticos o lógicos
    private ArrayList<TextColor> textsColor;//Colores de palabras reservadas
    private Timer timerKeyReleased;//Colorea la palabra del editor de código
    private ArrayList<Production> identProd;//Extrae los identificadores del análisis sintáctico
    private HashMap<String, String> identificadores;//Guarda los identificadores
    private boolean CodigoCompilado = false; //Indica si el compilador ha sido compilado

    public Interfaz_Gráfica() {
        initComponents();
        init();
    }

    private void init() {
        title = "Compilador";
        setLocationRelativeTo(null);//Centrar ventana
        setTitle(title);

        directorio = new Directory(this, txtCode, title, ".cpp");

        //Sobreescribir el método WindowClosing
        addWindowListener(new WindowAdapter() {// Se activa cuando presiona la "X" de la esquina superior derecha
            @Override
            public void windowClosing(WindowEvent e) {
                directorio.Exit(); //Pregunta si queremos guardar
                System.exit(0);//Sale del programa indicando queno hubo ningun error
            }
        });
        Functions.setLineNumberOnJTextComponent(txtCode);//Muestra los números de línea
        timerKeyReleased = new Timer((int) (1000 * 0.3), (ActionEvent e) -> {
            timerKeyReleased.stop();

            colorAnalysis();
        });

        Functions.insertAsteriskInName(this, txtCode, () -> {//Pone el asterisco en la ventana cada vez que se edta el código
            timerKeyReleased.restart();
        });
        //Inicializando todos los elementos a vacío
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();

        //Entra un autocompletador  en el editor de código ctrl + espacio
        Functions.setAutocompleterJTextComponent(new String[]{"using namespace std;", "int main(){}", "for(int i = 0; i<10;i++){  }"}, txtCode, () -> {
            timerKeyReleased.restart();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOutputConsole = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCode = new javax.swing.JTextPane();
        BtnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnTraducir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtJava = new javax.swing.JTextPane();
        BtnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 153));
        btnNuevo.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(255, 255, 153));
        btnAbrir.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 153));
        btnGuardar.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarC.setBackground(new java.awt.Color(255, 255, 153));
        btnGuardarC.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        btnGuardarC.setText("Guardar como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        btnCompilar.setBackground(new java.awt.Color(255, 255, 153));
        btnCompilar.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        btnCompilar.setText("Analizadores");
        btnCompilar.setActionCommand("Analizador");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexema", "Token", "[Línea, Columna]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTokens.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblTokens);

        jtaOutputConsole.setEditable(false);
        jtaOutputConsole.setBackground(new java.awt.Color(153, 153, 153));
        jtaOutputConsole.setColumns(20);
        jtaOutputConsole.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jtaOutputConsole.setForeground(new java.awt.Color(153, 0, 0));
        jtaOutputConsole.setRows(5);
        jScrollPane2.setViewportView(jtaOutputConsole);

        jScrollPane1.setViewportView(txtCode);

        BtnLimpiar.setBackground(new java.awt.Color(255, 255, 153));
        BtnLimpiar.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tabla de Símbolos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Código Traducido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Errores Detectados");

        BtnTraducir.setBackground(new java.awt.Color(255, 255, 153));
        BtnTraducir.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        BtnTraducir.setText("Traducir a  Java");
        BtnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTraducirActionPerformed(evt);
            }
        });

        txtJava.setEditable(false);
        jScrollPane4.setViewportView(txtJava);

        BtnSalir.setBackground(new java.awt.Color(255, 255, 153));
        BtnSalir.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Código Fuente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnTraducir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(BtnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSalir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(132, 132, 132)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnAbrir)
                    .addComponent(btnGuardar)
                    .addComponent(btnGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        directorio.New();
        LimpiarCampos();
        txtCode.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        if (directorio.Open()) {
            colorAnalysis();
            LimpiarCampos();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (directorio.Save()) {
            LimpiarCampos();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        if (directorio.SaveAs()) {
            LimpiarCampos();
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        if (getTitle().contains("*") || getTitle().equals(title)) {
            if (directorio.Save()) {
                compile();
            }
        } else {
            compile();
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        Functions.clearDataInTable(tblTokens);
        jtaOutputConsole.setText("");
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        CodigoCompilado = false;
        txtCode.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTraducirActionPerformed

//        Scanner scan = new Scanner(System.in);  // ddeclarando Scanner
//        System.out.print("Ingresar programa a traducir: ");
        String infile = txtCode.getText();  // toma lo ingrsado por el usuario y lo guarda en la variable infile

        String[] name = infile.split("\\.");  // divide el archivo en dos partes en el"."

        String infilename = name[0];   // la primera parte de la división del archivo
        String infileext = name[1];   // la segunda  parte de la división del archivo

        String outfilename;  // declarando variable  outfilename

        /*Declaración if else que verifica si la segunda parte de la división 
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
		    System.out.println(line);
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

    }//GEN-LAST:event_BtnTraducirActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void compile() {
        LimpiarCampos();//Limpia los campos
        Analisis_Lexico();//Ejecuta el análisis léxico
        LlenarTablaTokens();//Llena la tabla de tokens
        Analisis_Sintactico();//Ejecuta análisis sintáctico
        Analisis_Semantico();//Ejecuta análisis semántico
        ImprimirConsola();
        CodigoCompilado = true;
    }
//Análisis Léxico

    private void Analisis_Lexico() {
        // Extraer tokens
        Lexer lexer;
        try {
            File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = txtCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexer = new Lexer(entrada);

            while (true) {
                Token token = lexer.yylex();
                if (token == null) {
                    break;
                }
                tokens.add(token);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }

    }

    //Análisis Sintáctico
    private void Analisis_Sintactico() {
        Grammar gramatica = new Grammar(tokens, errors);//Pasando tokens y errores como párametros

        /*Eliminación de errores*/
        gramatica.delete(new String[]{"Error1"}, 1);

        /*Agrupando valores*/
        gramatica.group("VALOR", "(NUMERO|CADENA|NUM_DEC)", true);
        gramatica.group("CLASE_PRINCIPAL", "TIPO_DATO CLASS_PRINC PARENTESIS_A PARENTESIS_C LLAVE_A", true);
        gramatica.group("NAMESPACE", "PAL_RES_USING ESP_NOM PAL_RES_STD", true);
        gramatica.group("FUNCIONES", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C", true);


        /*Declaración de variables numeros enteros*/
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR PUNTO_COMA", true, identProd);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL VARIABLE OPE_ASIG VALOR", true, 1,
                "Error sintáctico {}, falta el tipo de dato de la variable[#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO OPE_ASIG VALOR", true, 2,
                "Error sintáctico {}, falta definir variable[#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE VALOR", true, 3,
                "Error sintáctico {}, falta operador de asignacion[#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG", true, 4,
                "Error sintáctico {}, fvalor de asignacion incorrecto [#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO", true, 5,
                "Error sintáctico {}, no se ha definido ninguna variable[#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL VARIABLE", true, 6,
                "Error sintáctico {}, [#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL OPE_ASIG", true, 7,
                "Error sintáctico {}, [#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL VALOR", true, 8,
                "Error sintáctico {}, [#/%]");

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "TIPO_DATO VARIABLE OPE_ASIG VALOR", true, 9,
                "Error sintáctico no se ha  definido clase principal {}, [#/%]");
        gramatica.initialLineColumn();

        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true);
        gramatica.group("VARIABLES", "CLASE_PRINCIPAL TIPO_DATO VARIABLE OPE_ASIG VALOR", true, 9,
                "Error semántico, falta punto y coma {}, [#/%]");
        gramatica.initialLineColumn();

        /*Librerías*/
        gramatica.group("LIBRERIA", "PAL_RES_INCL LIBRERIA_C", true, identProd);
        gramatica.group("LIBRERIA", "LIBRERIA_C", true, 10,
                "Error sintáctico {}[#/%]");

        gramatica.group("LIBRERIA", "PAL_RES_INCL LIBRERIA_C", true);
        gramatica.group("LIBRERIA", "PAL_RES_INCL", true, 11,
                "Error sintáctico {}[#/%]");
        gramatica.initialLineColumn();

        /*Agrupación de funciones*/
        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true, identProd);
        gramatica.group("FUNCION", "TIPO_DATO VARIABLE TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C", true, 12,
                "Error sintáctico, falta  parentesis de apertura[#/%]");

        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true);
        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE LLAVE_A LLAVE_C", true, 13,
                "Error sintáctico, falta  parentesis de cierre[#/%]");

        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true);
        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_C", true, 14,
                "Error sintáctico, falta  llave de apertura de cierre[#/%]");

        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true);
        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A", true, 15,
                "Error sintáctico, falta  llave de cierre de cierre[#/%]");

        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true);
        gramatica.group("FUNCION", " VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true, 16,
                "Error sintáctico, falta  tipo de dato de la función[#/%]");

        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true);
        gramatica.group("FUNCION", " TIPO_DATO VARIABLE PARENTESIS_A  VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true, 17,
                "Error sintáctico, falta  tipo de dato de párametro[#/%]");

        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true);
        gramatica.group("FUNCION", " TIPO_DATO PARENTESIS_A  TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true, 18,
                "Error sintáctico, falta definir la función[#/%]");

        gramatica.group("FUNCION", "TIPO_DATO VARIABLE PARENTESIS_A TIPO_DATO VARIABLE PARENTESIS_C LLAVE_A LLAVE_C ", true);
        gramatica.group("FUNCION", " TIPO_DATO VARIABLE PARENTESIS_A  TIPO_DATO PARENTESIS_C LLAVE_A LLAVE_C ", true, 19,
                "Error sintáctico, falta definir parametro[#/%]");

        gramatica.show();

    }

    private void Analisis_Semantico() {

        for (Production id : identProd) {
            System.out.println(id.lexemeRank(0, -1));
            System.out.println(id.lexicalCompRank(0, -1));
        }
        HashMap<String, String> idenDataType = new HashMap<>();
        /*Enteros*/
        idenDataType.put("int", "NUMERO");
        idenDataType.put("long", "NUMERO");
        idenDataType.put("short", "NUMERO");

        /*Decimales*/
        idenDataType.put("double", "NUM_DEC");
        idenDataType.put("float", "NUM_DEC");

        /*Cadenas*/
        idenDataType.put("string", "CADENA");
        idenDataType.put("char", "CADENA");
        idenDataType.put("String", "CADENA");

        for (Production id : identProd) {

            //Numeros Enteros
            if (!idenDataType.get(id.lexemeRank(0)).equals(id.lexicalCompRank(-1))) {
                errors.add(new ErrorLSSL(1, "Error Semántico {}:  valor no compatible con el tipo de dato [#/%]", id, true));

            } else if (id.lexicalCompRank(-1).equals("NUMERO") && !id.lexemeRank(-1).matches("0|[1-9][0-9]*")) {
                errors.add(new ErrorLSSL(2, "Error Semántico {}: el valor asignado no es un entero [#/%]", id, false));
            } else {
                identificadores.put(id.lexemeRank(1), id.lexemeRank(-1));
            }

            //Numeros Decimales
            if (!idenDataType.get(id.lexemeRank(0)).equals(id.lexicalCompRank(-1))) {
                errors.add(new ErrorLSSL(3, "Error Semántico {}:  valor no compatible con el tipo de dato [#/%]", id, true));

            } else if (id.lexicalCompRank(-1).equals("NUM_DEC") && !id.lexemeRank(-1).matches("[1-9][0-9]*.[1-9][0-9]*")) {

                errors.add(new ErrorLSSL(4, "Error Semántico {}: el valor asignado no es compatible [#/%]", id, false));

            } else {
                identificadores.put(id.lexemeRank(1), id.lexemeRank(-1));
            }

            //Cadenas de Texto
            if (!idenDataType.get(id.lexemeRank(0)).equals(id.lexicalCompRank(-1))) {
                errors.add(new ErrorLSSL(5, "Error Semántico {}:  valor no compatible con el tipo de dato [#/%]", id, true));

            } else if (id.lexicalCompRank(-1).equals("CADENA") && !id.lexemeRank(-1).matches("\"[A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]+\"")) {

                errors.add(new ErrorLSSL(6, "Error Semántico {}: el valor asignado no es una cadena de texto [#/%]", id, false));

            } else {
                identificadores.put(id.lexemeRank(1), id.lexemeRank(-1));
            }

            //PUNTO_COMA
//            //Booleano
//            if (!idenDataType.get(id.lexemeRank(0)).equals(id.lexicalCompRank(-1))) {
//                errors.add(new ErrorLSSL(7, "Error Semántico {}:  valor no compatible con el tipo de dato [#/%]", id, true));
//
//            } else if (id.lexicalCompRank(-1).equals("DAT_BOL") && !id.lexemeRank(-1).matches("\true|\flase")) {
//
//                errors.add(new ErrorLSSL(8, "Error Semántico {}: el valor asignado no es booleano", id, false));
//
//            } else {
//                identificadores.put(id.lexemeRank(1), id.lexemeRank(-1));
//            }
        }//for
    }

    private void colorAnalysis() {
        /* Limpiar el arreglo de colores */
        textsColor.clear();
        /* Extraer rangos de colores */
        LexerColor lexerColor;
        try {
            File codigo = new File("c.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = txtCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexerColor = new LexerColor(entrada);
            while (true) {
                TextColor textColor = lexerColor.yylex();
                if (textColor == null) {
                    break;
                }
                textsColor.add(textColor);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
        Functions.colorTextPane(textsColor, txtCode, new Color(40, 40, 40));
    }

    private void LlenarTablaTokens() {
        tokens.forEach(token -> {
            //Cada posición será igual a una columna
            Object[] data = new Object[]{token.getLexicalComp(), token.getLexeme(), "[" + token.getLine() + ", " + token.getColumn() + "]"};
            Functions.addRowDataInTable(tblTokens, data);
        });
    }

    private void ImprimirConsola() {
        int sizeErrors = errors.size();//Guarda cantidad de errores

        //Si encunetra un error
        if (sizeErrors > 0) {

            Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            for (ErrorLSSL error : errors) {//Va recorriendo cada error detectado
                String strError = String.valueOf(error);//Guarda cadena con el error
                strErrors += strError + "\n";
            }
            jtaOutputConsole.setText("Compilación terminada...\n" + strErrors + "\nLa compilación terminó con errores...");

        } else {//Si no encuentra un error
            jtaOutputConsole.setText("Compilación terminada.");
        }
        jtaOutputConsole.setCaretPosition(0);
    }

    private void LimpiarCampos() {
        Functions.clearDataInTable(tblTokens);
        jtaOutputConsole.setText("");
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        CodigoCompilado = false;
    }

    public static void main(String args[]) {

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Gráfica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Gráfica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Gráfica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Gráfica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("LookAndFeel no soportado: " + ex);
            }
            new Interfaz_Gráfica().setVisible(true);
        });

    }

    public String infile = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTraducir;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jtaOutputConsole;
    private javax.swing.JTable tblTokens;
    private javax.swing.JTextPane txtCode;
    private javax.swing.JTextPane txtJava;
    // End of variables declaration//GEN-END:variables
}
