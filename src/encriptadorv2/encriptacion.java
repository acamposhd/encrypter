package encriptadorv2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class encriptacion extends javax.swing.JFrame {

    public encriptacion() {
        initComponents();
    }

    String mensaje;
    final String ERROR_CARACTER = "CARACTER NO VÁLIDO";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        encriptarJbtn = new javax.swing.JButton();
        volverJbtn = new javax.swing.JButton();
        llaveJlbl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        encriptadoJlbl = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("nKripter");

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel1.setText("Introduza su texto a encriptar ");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel3.setText("Llave de encriptación");

        encriptarJbtn.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        encriptarJbtn.setText("Encriptar");
        encriptarJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarJbtnActionPerformed(evt);
            }
        });

        volverJbtn.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        volverJbtn.setText("Volver");
        volverJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJbtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane2.setViewportView(encriptadoJlbl);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Mensaje encriptado");

        jButton1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton1.setText("Generar txt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(llaveJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encriptarJbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(volverJbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encriptarJbtn)
                    .addComponent(volverJbtn)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llaveJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encriptarJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarJbtnActionPerformed

        byte seleccion = 0, opcion;
        String key1 = "sE4/W?|2&+", key2 = "a7H?/+2aWv", key3 = "9rU71n?-+0", key4 = "3uI/+8#-@a", key5 = "4?z+U--+=?", key6 = "p/g*Un_/*x", key7 = "N+1/?!&pA4", key8 = "F#0+7ipLu!", key9 = "!?4gHy+&!!", key10 = "?p?A!04+73";
        String llave2;
        boolean verificar = false;

        mensaje = jTextPane1.getText();
        char array_caracteres[] = mensaje.toCharArray();

        for (int i = 0; i < array_caracteres.length; i++) {

            Random aleatorio = new Random(System.currentTimeMillis());
            int llaveEncriptacion = aleatorio.nextInt(10);
            aleatorio.setSeed(System.currentTimeMillis());

            switch (llaveEncriptacion) {

                case 0:

                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = 'E';

                                break;
                            case ('a'):
                                array_caracteres[i] = 'W';

                                break;

                            case ('B'):
                                array_caracteres[i] = 's';
                                break;

                            case ('b'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('C'):
                                array_caracteres[i] = '%';
                                break;

                            case ('c'):
                                array_caracteres[i] = '+';

                                break;

                            case ('D'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('d'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('E'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('e'):
                                array_caracteres[i] = '#';
                                break;

                            case ('F'):
                                array_caracteres[i] = '?';
                                break;

                            case ('f'):
                                array_caracteres[i] = ';';
                                break;

                            case ('G'):
                                array_caracteres[i] = '3';
                                break;

                            case ('g'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('H'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('h'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('J'):
                                array_caracteres[i] = ':';
                                break;

                            case ('j'):
                                array_caracteres[i] = 'z';
                                break;

                            case ('K'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('L'):
                                array_caracteres[i] = '7';
                                break;

                            case ('l'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('M'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('m'):
                                array_caracteres[i] = 't';
                                break;

                            case ('N'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('n'):
                                array_caracteres[i] = '-';
                                break;

                            case ('O'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('o'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('P'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('p'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('Q'):
                                array_caracteres[i] = ',';
                                break;

                            case ('q'):
                                array_caracteres[i] = '|';
                                break;

                            case ('R'):
                                array_caracteres[i] = '=';
                                break;

                            case ('r'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('S'):
                                array_caracteres[i] = '9';
                                break;

                            case ('s'):
                                array_caracteres[i] = '5';
                                break;

                            case ('T'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('t'):
                                array_caracteres[i] = '8';
                                break;

                            case ('U'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('u'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('V'):
                                array_caracteres[i] = '$';
                                break;

                            case ('v'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('W'):
                                array_caracteres[i] = '@';
                                break;

                            case ('w'):
                                array_caracteres[i] = '!';
                                break;

                            case ('X'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('x'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('Y'):
                                array_caracteres[i] = '&';
                                break;

                            case ('y'):
                                array_caracteres[i] = '2';
                                break;

                            case ('Z'):
                                array_caracteres[i] = '1';
                                break;

                            case ('z'):
                                array_caracteres[i] = ')';
                                break;

                            case ('0'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('2'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('3'):
                                array_caracteres[i] = '4';
                                break;

                            case ('4'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('7'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('8'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('9'):
                                array_caracteres[i] = '0';
                                break;

                            case ('+'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('-'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('*'):
                                array_caracteres[i] = '.';
                                break;

                            case ('/'):
                                array_caracteres[i] = '(';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'i';
                                break;

                            case (','):
                                array_caracteres[i] = 'e';
                                break;

                            case (':'):
                                array_caracteres[i] = 'H';
                                break;

                            case (';'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('?'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('!'):
                                array_caracteres[i] = '"';
                                break;

                            case ('&'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('('):
                                array_caracteres[i] = 'd';
                                break;

                            case (')'):
                                array_caracteres[i] = '/';
                                break;

                            case ('"'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('@'):
                                array_caracteres[i] = '6';
                                break;

                            case ('#'):
                                array_caracteres[i] = 'w';
                                break;

                            case ('$'):
                                array_caracteres[i] = '*';
                                break;

                            case ('%'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('_'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('='):
                                array_caracteres[i] = ' ';
                                break;

                            case (' '):
                                array_caracteres[i] = '_';
                                break;

                            case ('|'):
                                array_caracteres[i] = 'q';
                                break;

                            default:

                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key1);
                    }
                    break;
                case 1:
                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = 'z';

                                break;
                            case ('a'):
                                array_caracteres[i] = 'Z';

                                break;

                            case ('B'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('b'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('C'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('c'):
                                array_caracteres[i] = 'X';

                                break;

                            case ('D'):
                                array_caracteres[i] = 'W';
                                break;

                            case ('d'):
                                array_caracteres[i] = 'w';
                                break;

                            case ('E'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('e'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('F'):
                                array_caracteres[i] = '0';
                                break;

                            case ('f'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('G'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('g'):
                                array_caracteres[i] = 't';
                                break;

                            case ('H'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('h'):
                                array_caracteres[i] = 's';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('J'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('j'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('K'):
                                array_caracteres[i] = 'q';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('L'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('l'):
                                array_caracteres[i] = '1';
                                break;

                            case ('M'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('m'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('N'):
                                array_caracteres[i] = '2';
                                break;

                            case ('n'):
                                array_caracteres[i] = '3';
                                break;

                            case ('O'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('o'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('P'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('p'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('Q'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('q'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('R'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('r'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('S'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('s'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('T'):
                                array_caracteres[i] = '4';
                                break;

                            case ('t'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('U'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('u'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('V'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('v'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('W'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('w'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('X'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('x'):
                                array_caracteres[i] = '5';
                                break;

                            case ('Y'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('y'):
                                array_caracteres[i] = 'e';
                                break;

                            case ('Z'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('z'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('0'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('2'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('3'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('4'):
                                array_caracteres[i] = '6';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('7'):
                                array_caracteres[i] = '8';
                                break;

                            case ('8'):
                                array_caracteres[i] = '=';
                                break;

                            case ('9'):
                                array_caracteres[i] = '+';
                                break;

                            case ('+'):
                                array_caracteres[i] = '7';
                                break;

                            case ('-'):
                                array_caracteres[i] = '9';
                                break;

                            case ('*'):
                                array_caracteres[i] = '|';
                                break;

                            case ('/'):
                                array_caracteres[i] = '_';
                                break;

                            case ('.'):
                                array_caracteres[i] = '@';
                                break;

                            case (','):
                                array_caracteres[i] = '?';
                                break;

                            case (':'):
                                array_caracteres[i] = ';';
                                break;

                            case (';'):
                                array_caracteres[i] = ':';
                                break;

                            case ('?'):
                                array_caracteres[i] = '/';
                                break;

                            case ('!'):
                                array_caracteres[i] = '.';
                                break;

                            case ('&'):
                                array_caracteres[i] = ',';
                                break;

                            case ('('):
                                array_caracteres[i] = '*';
                                break;

                            case (')'):
                                array_caracteres[i] = ')';
                                break;

                            case ('"'):
                                array_caracteres[i] = '(';
                                break;

                            case ('@'):
                                array_caracteres[i] = '&';
                                break;

                            case ('#'):
                                array_caracteres[i] = '%';
                                break;

                            case ('$'):
                                array_caracteres[i] = '$';
                                break;

                            case ('%'):
                                array_caracteres[i] = '#';
                                break;

                            case ('_'):
                                array_caracteres[i] = '"';
                                break;

                            case ('='):
                                array_caracteres[i] = '!';
                                break;

                            case (' '):
                                array_caracteres[i] = ' ';
                                break;

                            case ('|'):
                                array_caracteres[i] = '-';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key2);
                    }
                    break;
                case 2:
                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = 'X';

                                break;
                            case ('a'):
                                array_caracteres[i] = '|';

                                break;

                            case ('B'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('b'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('C'):
                                array_caracteres[i] = '?';
                                break;

                            case ('c'):
                                array_caracteres[i] = 'J';

                                break;

                            case ('D'):
                                array_caracteres[i] = '*';
                                break;

                            case ('d'):
                                array_caracteres[i] = '/';
                                break;

                            case ('E'):
                                array_caracteres[i] = '5';
                                break;

                            case ('e'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('F'):
                                array_caracteres[i] = '%';
                                break;

                            case ('f'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('G'):
                                array_caracteres[i] = '.';
                                break;

                            case ('g'):
                                array_caracteres[i] = '-';
                                break;

                            case ('H'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('h'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('J'):
                                array_caracteres[i] = 'W';
                                break;

                            case ('j'):
                                array_caracteres[i] = '8';
                                break;

                            case ('K'):
                                array_caracteres[i] = ')';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('L'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('l'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('M'):
                                array_caracteres[i] = '6';
                                break;

                            case ('m'):
                                array_caracteres[i] = '2';
                                break;

                            case ('N'):
                                array_caracteres[i] = 't';
                                break;

                            case ('n'):
                                array_caracteres[i] = '0';
                                break;

                            case ('O'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('o'):
                                array_caracteres[i] = '=';
                                break;

                            case ('P'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('p'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('Q'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('q'):
                                array_caracteres[i] = '#';
                                break;

                            case ('R'):
                                array_caracteres[i] = ';';
                                break;

                            case ('r'):
                                array_caracteres[i] = '?';
                                break;

                            case ('S'):
                                array_caracteres[i] = '"';
                                break;

                            case ('s'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('T'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('t'):
                                array_caracteres[i] = '1';
                                break;

                            case ('U'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('u'):
                                array_caracteres[i] = '+';
                                break;

                            case ('V'):
                                array_caracteres[i] = 'e';
                                break;

                            case ('v'):
                                array_caracteres[i] = '&';
                                break;

                            case ('W'):
                                array_caracteres[i] = 's';
                                break;

                            case ('w'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('X'):
                                array_caracteres[i] = '7';
                                break;

                            case ('x'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('Y'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('y'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('Z'):
                                array_caracteres[i] = 'z';
                                break;

                            case ('z'):
                                array_caracteres[i] = 'q';
                                break;

                            case ('0'):
                                array_caracteres[i] = ',';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('2'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('3'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('4'):
                                array_caracteres[i] = '(';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('7'):
                                array_caracteres[i] = '3';
                                break;

                            case ('8'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('9'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('+'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('-'):
                                array_caracteres[i] = '$';
                                break;

                            case ('*'):
                                array_caracteres[i] = '@';
                                break;

                            case ('/'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'A';
                                break;

                            case (','):
                                array_caracteres[i] = '_';
                                break;

                            case (':'):
                                array_caracteres[i] = ':';
                                break;

                            case (';'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('?'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('!'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('&'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('('):
                                array_caracteres[i] = 'o';
                                break;

                            case (')'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('"'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('@'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('#'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('$'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('%'):
                                array_caracteres[i] = '4';
                                break;

                            case ('_'):
                                array_caracteres[i] = ' ';
                                break;

                            case ('='):
                                array_caracteres[i] = '9';
                                break;

                            case (' '):
                                array_caracteres[i] = 'w';
                                break;

                            case ('|'):
                                array_caracteres[i] = 'f';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key3);
                    }
                    break;
                case 3:
                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = '0';

                                break;
                            case ('a'):
                                array_caracteres[i] = '_';

                                break;

                            case ('B'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('b'):
                                array_caracteres[i] = '%';
                                break;

                            case ('C'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('c'):
                                array_caracteres[i] = 'L';

                                break;

                            case ('D'):
                                array_caracteres[i] = '-';
                                break;

                            case ('d'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('E'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('e'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('F'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('f'):
                                array_caracteres[i] = '3';
                                break;

                            case ('G'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('g'):
                                array_caracteres[i] = '"';
                                break;

                            case ('H'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('h'):
                                array_caracteres[i] = '#';
                                break;

                            case ('I'):
                                array_caracteres[i] = '6';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('J'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('j'):
                                array_caracteres[i] = 'q';
                                break;

                            case ('K'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('L'):
                                array_caracteres[i] = '.';
                                break;

                            case ('l'):
                                array_caracteres[i] = '(';
                                break;

                            case ('M'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('m'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('N'):
                                array_caracteres[i] = '4';
                                break;

                            case ('n'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('O'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('o'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('P'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('p'):
                                array_caracteres[i] = '!';
                                break;

                            case ('Q'):
                                array_caracteres[i] = ')';
                                break;

                            case ('q'):
                                array_caracteres[i] = '|';
                                break;

                            case ('R'):
                                array_caracteres[i] = '@';
                                break;

                            case ('r'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('S'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('s'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('T'):
                                array_caracteres[i] = '+';
                                break;

                            case ('t'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('U'):
                                array_caracteres[i] = '$';
                                break;

                            case ('u'):
                                array_caracteres[i] = 'W';
                                break;

                            case ('V'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('v'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('W'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('w'):
                                array_caracteres[i] = '8';
                                break;

                            case ('X'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('x'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('Y'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('y'):
                                array_caracteres[i] = 'z';
                                break;

                            case ('Z'):
                                array_caracteres[i] = ';';
                                break;

                            case ('z'):
                                array_caracteres[i] = 't';
                                break;

                            case ('0'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('2'):
                                array_caracteres[i] = ',';
                                break;

                            case ('3'):
                                array_caracteres[i] = '=';
                                break;

                            case ('4'):
                                array_caracteres[i] = ':';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('7'):
                                array_caracteres[i] = '7';
                                break;

                            case ('8'):
                                array_caracteres[i] = '1';
                                break;

                            case ('9'):
                                array_caracteres[i] = 'w';
                                break;

                            case ('+'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('-'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('*'):
                                array_caracteres[i] = 's';
                                break;

                            case ('/'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'c';
                                break;

                            case (','):
                                array_caracteres[i] = '9';
                                break;

                            case (':'):
                                array_caracteres[i] = '/';
                                break;

                            case (';'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('?'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('!'):
                                array_caracteres[i] = 'e';
                                break;

                            case ('&'):
                                array_caracteres[i] = '*';
                                break;

                            case ('('):
                                array_caracteres[i] = '2';
                                break;

                            case (')'):
                                array_caracteres[i] = '5';
                                break;

                            case ('"'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('@'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('#'):
                                array_caracteres[i] = '&';
                                break;

                            case ('$'):
                                array_caracteres[i] = '?';
                                break;

                            case ('%'):
                                array_caracteres[i] = ' ';
                                break;

                            case ('_'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('='):
                                array_caracteres[i] = 'I';
                                break;

                            case (' '):
                                array_caracteres[i] = 'm';
                                break;

                            case ('|'):
                                array_caracteres[i] = 'b';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key4);
                    }
                    break;
                case 4:

                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = 'W';

                                break;
                            case ('a'):
                                array_caracteres[i] = '6';

                                break;

                            case ('B'):
                                array_caracteres[i] = ',';
                                break;

                            case ('b'):
                                array_caracteres[i] = 't';
                                break;

                            case ('C'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('c'):
                                array_caracteres[i] = '@';

                                break;

                            case ('D'):
                                array_caracteres[i] = '/';
                                break;

                            case ('d'):
                                array_caracteres[i] = '4';
                                break;

                            case ('E'):
                                array_caracteres[i] = '(';
                                break;

                            case ('e'):
                                array_caracteres[i] = '*';
                                break;

                            case ('F'):
                                array_caracteres[i] = 'w';
                                break;

                            case ('f'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('G'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('g'):
                                array_caracteres[i] = '#';
                                break;

                            case ('H'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('h'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('J'):
                                array_caracteres[i] = '"';
                                break;

                            case ('j'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('K'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('k'):
                                array_caracteres[i] = '9';
                                break;

                            case ('L'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('l'):
                                array_caracteres[i] = '8';
                                break;

                            case ('M'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('m'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('N'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('n'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('O'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('o'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('P'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('p'):
                                array_caracteres[i] = '=';
                                break;

                            case ('Q'):
                                array_caracteres[i] = '5';
                                break;

                            case ('q'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('R'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('r'):
                                array_caracteres[i] = '7';
                                break;

                            case ('S'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('s'):
                                array_caracteres[i] = '!';
                                break;

                            case ('T'):
                                array_caracteres[i] = '0';
                                break;

                            case ('t'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('U'):
                                array_caracteres[i] = '%';
                                break;

                            case ('u'):
                                array_caracteres[i] = 'e';
                                break;

                            case ('V'):
                                array_caracteres[i] = ':';
                                break;

                            case ('v'):
                                array_caracteres[i] = ';';
                                break;

                            case ('W'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('w'):
                                array_caracteres[i] = 's';
                                break;

                            case ('X'):
                                array_caracteres[i] = '3';
                                break;

                            case ('x'):
                                array_caracteres[i] = '2';
                                break;

                            case ('Y'):
                                array_caracteres[i] = '.';
                                break;

                            case ('y'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('Z'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('z'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('0'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('2'):
                                array_caracteres[i] = '1';
                                break;

                            case ('3'):
                                array_caracteres[i] = '+';
                                break;

                            case ('4'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('7'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('8'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('9'):
                                array_caracteres[i] = '$';
                                break;

                            case ('+'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('-'):
                                array_caracteres[i] = '|';
                                break;

                            case ('*'):
                                array_caracteres[i] = '&';
                                break;

                            case ('/'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'U';
                                break;

                            case (','):
                                array_caracteres[i] = 'q';
                                break;

                            case (':'):
                                array_caracteres[i] = 'j';
                                break;

                            case (';'):
                                array_caracteres[i] = 'z';
                                break;

                            case ('?'):
                                array_caracteres[i] = '_';
                                break;

                            case ('!'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('&'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('('):
                                array_caracteres[i] = 'V';
                                break;

                            case (')'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('"'):
                                array_caracteres[i] = '?';
                                break;

                            case ('@'):
                                array_caracteres[i] = ' ';
                                break;

                            case ('#'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('$'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('%'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('_'):
                                array_caracteres[i] = ')';
                                break;

                            case ('='):
                                array_caracteres[i] = 'd';
                                break;

                            case (' '):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('|'):
                                array_caracteres[i] = '-';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key5);
                    }
                    break;
                case 5:

                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = '+';

                                break;
                            case ('a'):
                                array_caracteres[i] = 'e';

                                break;

                            case ('B'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('b'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('C'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('c'):
                                array_caracteres[i] = 'G';

                                break;

                            case ('D'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('d'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('E'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('e'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('F'):
                                array_caracteres[i] = '@';
                                break;

                            case ('f'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('G'):
                                array_caracteres[i] = '.';
                                break;

                            case ('g'):
                                array_caracteres[i] = '#';
                                break;

                            case ('H'):
                                array_caracteres[i] = '4';
                                break;

                            case ('h'):
                                array_caracteres[i] = '!';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('J'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('j'):
                                array_caracteres[i] = '?';
                                break;

                            case ('K'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('L'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('l'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('M'):
                                array_caracteres[i] = '/';
                                break;

                            case ('m'):
                                array_caracteres[i] = '$';
                                break;

                            case ('N'):
                                array_caracteres[i] = 'w';
                                break;

                            case ('n'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('O'):
                                array_caracteres[i] = '3';
                                break;

                            case ('o'):
                                array_caracteres[i] = 't';
                                break;

                            case ('P'):
                                array_caracteres[i] = '=';
                                break;

                            case ('p'):
                                array_caracteres[i] = '1';
                                break;

                            case ('Q'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('q'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('R'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('r'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('S'):
                                array_caracteres[i] = '"';
                                break;

                            case ('s'):
                                array_caracteres[i] = '%';
                                break;

                            case ('T'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('t'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('U'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('u'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('V'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('v'):
                                array_caracteres[i] = '0';
                                break;

                            case ('W'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('w'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('X'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('x'):
                                array_caracteres[i] = '9';
                                break;

                            case ('Y'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('y'):
                                array_caracteres[i] = ';';
                                break;

                            case ('Z'):
                                array_caracteres[i] = '(';
                                break;

                            case ('z'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('0'):
                                array_caracteres[i] = '7';
                                break;

                            case ('1'):
                                array_caracteres[i] = '&';
                                break;

                            case ('2'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('3'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('4'):
                                array_caracteres[i] = ',';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('6'):
                                array_caracteres[i] = '|';
                                break;

                            case ('7'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('8'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('9'):
                                array_caracteres[i] = '6';
                                break;

                            case ('+'):
                                array_caracteres[i] = '5';
                                break;

                            case ('-'):
                                array_caracteres[i] = 's';
                                break;

                            case ('*'):
                                array_caracteres[i] = '_';
                                break;

                            case ('/'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'W';
                                break;

                            case (','):
                                array_caracteres[i] = 'z';
                                break;

                            case (':'):
                                array_caracteres[i] = 'Y';
                                break;

                            case (';'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('?'):
                                array_caracteres[i] = '*';
                                break;

                            case ('!'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('&'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('('):
                                array_caracteres[i] = ')';
                                break;

                            case (')'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('"'):
                                array_caracteres[i] = ' ';
                                break;

                            case ('@'):
                                array_caracteres[i] = '2';
                                break;

                            case ('#'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('$'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('%'):
                                array_caracteres[i] = ':';
                                break;

                            case ('_'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('='):
                                array_caracteres[i] = 'J';
                                break;

                            case (' '):
                                array_caracteres[i] = '-';
                                break;

                            case ('|'):
                                array_caracteres[i] = '8';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key6);
                    }
                    break;
                case 6:

                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = 'c';

                                break;
                            case ('a'):
                                array_caracteres[i] = '5';

                                break;

                            case ('B'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('b'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('C'):
                                array_caracteres[i] = 's';
                                break;

                            case ('c'):
                                array_caracteres[i] = '/';

                                break;

                            case ('D'):
                                array_caracteres[i] = '&';
                                break;

                            case ('d'):
                                array_caracteres[i] = '9';
                                break;

                            case ('E'):
                                array_caracteres[i] = 'z';
                                break;

                            case ('e'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('F'):
                                array_caracteres[i] = 'q';
                                break;

                            case ('f'):
                                array_caracteres[i] = '=';
                                break;

                            case ('G'):
                                array_caracteres[i] = '3';
                                break;

                            case ('g'):
                                array_caracteres[i] = ',';
                                break;

                            case ('H'):
                                array_caracteres[i] = '"';
                                break;

                            case ('h'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'e';
                                break;

                            case ('J'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('j'):
                                array_caracteres[i] = '2';
                                break;

                            case ('K'):
                                array_caracteres[i] = '1';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('L'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('l'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('M'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('m'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('N'):
                                array_caracteres[i] = '?';
                                break;

                            case ('n'):
                                array_caracteres[i] = '0';
                                break;

                            case ('O'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('o'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('P'):
                                array_caracteres[i] = '4';
                                break;

                            case ('p'):
                                array_caracteres[i] = ')';
                                break;

                            case ('Q'):
                                array_caracteres[i] = '|';
                                break;

                            case ('q'):
                                array_caracteres[i] = '8';
                                break;

                            case ('R'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('r'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('S'):
                                array_caracteres[i] = '7';
                                break;

                            case ('s'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('T'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('t'):
                                array_caracteres[i] = '-';
                                break;

                            case ('U'):
                                array_caracteres[i] = '6';
                                break;

                            case ('u'):
                                array_caracteres[i] = ':';
                                break;

                            case ('V'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('v'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('W'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('w'):
                                array_caracteres[i] = '#';
                                break;

                            case ('X'):
                                array_caracteres[i] = '$';
                                break;

                            case ('x'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('Y'):
                                array_caracteres[i] = '(';
                                break;

                            case ('y'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('Z'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('z'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('0'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('2'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('3'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('4'):
                                array_caracteres[i] = '*';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'W';
                                break;

                            case ('7'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('8'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('9'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('+'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('-'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('*'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('/'):
                                array_caracteres[i] = ';';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'E';
                                break;

                            case (','):
                                array_caracteres[i] = 'u';
                                break;

                            case (':'):
                                array_caracteres[i] = 'r';
                                break;

                            case (';'):
                                array_caracteres[i] = 't';
                                break;

                            case ('?'):
                                array_caracteres[i] = '_';
                                break;

                            case ('!'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('&'):
                                array_caracteres[i] = '!';
                                break;

                            case ('('):
                                array_caracteres[i] = 'K';
                                break;

                            case (')'):
                                array_caracteres[i] = '@';
                                break;

                            case ('"'):
                                array_caracteres[i] = '+';
                                break;

                            case ('@'):
                                array_caracteres[i] = '%';
                                break;

                            case ('#'):
                                array_caracteres[i] = '.';
                                break;

                            case ('$'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('%'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('_'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('='):
                                array_caracteres[i] = 'N';
                                break;

                            case (' '):
                                array_caracteres[i] = 'w';
                                break;

                            case ('|'):
                                array_caracteres[i] = ' ';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;
                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key7);
                    }
                    break;

                case 7:

                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = '9';

                                break;
                            case ('a'):
                                array_caracteres[i] = 'R';

                                break;

                            case ('B'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('b'):
                                array_caracteres[i] = '4';
                                break;

                            case ('C'):
                                array_caracteres[i] = '_';
                                break;

                            case ('c'):
                                array_caracteres[i] = 'I';

                                break;

                            case ('D'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('d'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('E'):
                                array_caracteres[i] = '/';
                                break;

                            case ('e'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('F'):
                                array_caracteres[i] = '0';
                                break;

                            case ('f'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('G'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('g'):
                                array_caracteres[i] = ';';
                                break;

                            case ('H'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('h'):
                                array_caracteres[i] = ':';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('J'):
                                array_caracteres[i] = '5';
                                break;

                            case ('j'):
                                array_caracteres[i] = 'z';
                                break;

                            case ('K'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('L'):
                                array_caracteres[i] = 's';
                                break;

                            case ('l'):
                                array_caracteres[i] = '8';
                                break;

                            case ('M'):
                                array_caracteres[i] = '+';
                                break;

                            case ('m'):
                                array_caracteres[i] = '=';
                                break;

                            case ('N'):
                                array_caracteres[i] = 'O';
                                break;

                            case ('n'):
                                array_caracteres[i] = '6';
                                break;

                            case ('O'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('o'):
                                array_caracteres[i] = '.';
                                break;

                            case ('P'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('p'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('Q'):
                                array_caracteres[i] = '?';
                                break;

                            case ('q'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('R'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('r'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('S'):
                                array_caracteres[i] = '#';
                                break;

                            case ('s'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('T'):
                                array_caracteres[i] = ')';
                                break;

                            case ('t'):
                                array_caracteres[i] = '@';
                                break;

                            case ('U'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('u'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('V'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('v'):
                                array_caracteres[i] = '$';
                                break;

                            case ('W'):
                                array_caracteres[i] = 'q';
                                break;

                            case ('w'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('X'):
                                array_caracteres[i] = '|';
                                break;

                            case ('x'):
                                array_caracteres[i] = 'w';
                                break;

                            case ('Y'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('y'):
                                array_caracteres[i] = 't';
                                break;

                            case ('Z'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('z'):
                                array_caracteres[i] = '%';
                                break;

                            case ('0'):
                                array_caracteres[i] = '3';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('2'):
                                array_caracteres[i] = '(';
                                break;

                            case ('3'):
                                array_caracteres[i] = '!';
                                break;

                            case ('4'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('7'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('8'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('9'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('+'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('-'):
                                array_caracteres[i] = '1';
                                break;

                            case ('*'):
                                array_caracteres[i] = ' ';
                                break;

                            case ('/'):
                                array_caracteres[i] = '7';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'f';
                                break;

                            case (','):
                                array_caracteres[i] = 'A';
                                break;

                            case (':'):
                                array_caracteres[i] = '"';
                                break;

                            case (';'):
                                array_caracteres[i] = ',';
                                break;

                            case ('?'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('!'):
                                array_caracteres[i] = '-';
                                break;

                            case ('&'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('('):
                                array_caracteres[i] = '2';
                                break;

                            case (')'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('"'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('@'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('#'):
                                array_caracteres[i] = '&';
                                break;

                            case ('$'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('%'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('_'):
                                array_caracteres[i] = '*';
                                break;

                            case ('='):
                                array_caracteres[i] = 'W';
                                break;

                            case (' '):
                                array_caracteres[i] = 'e';
                                break;

                            case ('|'):
                                array_caracteres[i] = 'X';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key8);
                    }
                    break;
                case 8:

                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = ':';

                                break;
                            case ('a'):
                                array_caracteres[i] = '#';

                                break;

                            case ('B'):
                                array_caracteres[i] = '6';
                                break;

                            case ('b'):
                                array_caracteres[i] = '-';
                                break;

                            case ('C'):
                                array_caracteres[i] = 'r';
                                break;

                            case ('c'):
                                array_caracteres[i] = 'q';

                                break;

                            case ('D'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('d'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('E'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('e'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('F'):
                                array_caracteres[i] = '0';
                                break;

                            case ('f'):
                                array_caracteres[i] = 'v';
                                break;

                            case ('G'):
                                array_caracteres[i] = '5';
                                break;

                            case ('g'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('H'):
                                array_caracteres[i] = '8';
                                break;

                            case ('h'):
                                array_caracteres[i] = 'e';
                                break;

                            case ('I'):
                                array_caracteres[i] = 'l';
                                break;

                            case ('i'):
                                array_caracteres[i] = '&';
                                break;

                            case ('J'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('j'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('K'):
                                array_caracteres[i] = 't';
                                break;

                            case ('k'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('L'):
                                array_caracteres[i] = '7';
                                break;

                            case ('l'):
                                array_caracteres[i] = '_';
                                break;

                            case ('M'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('m'):
                                array_caracteres[i] = 'W';
                                break;

                            case ('N'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('n'):
                                array_caracteres[i] = 'z';
                                break;

                            case ('O'):
                                array_caracteres[i] = '4';
                                break;

                            case ('o'):
                                array_caracteres[i] = '$';
                                break;

                            case ('P'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('p'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('Q'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('q'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('R'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('r'):
                                array_caracteres[i] = '=';
                                break;

                            case ('S'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('s'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('T'):
                                array_caracteres[i] = 'u';
                                break;

                            case ('t'):
                                array_caracteres[i] = ')';
                                break;

                            case ('U'):
                                array_caracteres[i] = '9';
                                break;

                            case ('u'):
                                array_caracteres[i] = '|';
                                break;

                            case ('V'):
                                array_caracteres[i] = '1';
                                break;

                            case ('v'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('W'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('w'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('X'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('x'):
                                array_caracteres[i] = ';';
                                break;

                            case ('Y'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('y'):
                                array_caracteres[i] = '!';
                                break;

                            case ('Z'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('z'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('0'):
                                array_caracteres[i] = ',';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('2'):
                                array_caracteres[i] = '2';
                                break;

                            case ('3'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('4'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('5'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('6'):
                                array_caracteres[i] = '(';
                                break;

                            case ('7'):
                                array_caracteres[i] = '.';
                                break;

                            case ('8'):
                                array_caracteres[i] = '3';
                                break;

                            case ('9'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('+'):
                                array_caracteres[i] = '%';
                                break;

                            case ('-'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('*'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('/'):
                                array_caracteres[i] = '/';
                                break;

                            case ('.'):
                                array_caracteres[i] = 'g';
                                break;

                            case (','):
                                array_caracteres[i] = 's';
                                break;

                            case (':'):
                                array_caracteres[i] = '+';
                                break;

                            case (';'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('?'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('!'):
                                array_caracteres[i] = '@';
                                break;

                            case ('&'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('('):
                                array_caracteres[i] = 'K';
                                break;

                            case (')'):
                                array_caracteres[i] = 'w';
                                break;

                            case ('"'):
                                array_caracteres[i] = '*';
                                break;

                            case ('@'):
                                array_caracteres[i] = '?';
                                break;

                            case ('#'):
                                array_caracteres[i] = ' ';
                                break;

                            case ('$'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('%'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('_'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('='):
                                array_caracteres[i] = '"';
                                break;

                            case (' '):
                                array_caracteres[i] = 'M';
                                break;

                            case ('|'):
                                array_caracteres[i] = 'O';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key9);
                    }
                    break;
                case 9:

                    do {
                        switch (array_caracteres[i]) {
                            case ('A'):
                                array_caracteres[i] = 's';

                                break;
                            case ('a'):
                                array_caracteres[i] = 'w';

                                break;

                            case ('B'):
                                array_caracteres[i] = '5';
                                break;

                            case ('b'):
                                array_caracteres[i] = 'C';
                                break;

                            case ('C'):
                                array_caracteres[i] = 'L';
                                break;

                            case ('c'):
                                array_caracteres[i] = 'O';

                                break;

                            case ('D'):
                                array_caracteres[i] = 'b';
                                break;

                            case ('d'):
                                array_caracteres[i] = '/';
                                break;

                            case ('E'):
                                array_caracteres[i] = 'X';
                                break;

                            case ('e'):
                                array_caracteres[i] = '2';
                                break;

                            case ('F'):
                                array_caracteres[i] = 'Q';
                                break;

                            case ('f'):
                                array_caracteres[i] = 'k';
                                break;

                            case ('G'):
                                array_caracteres[i] = 'B';
                                break;

                            case ('g'):
                                array_caracteres[i] = '"';
                                break;

                            case ('H'):
                                array_caracteres[i] = 'e';
                                break;

                            case ('h'):
                                array_caracteres[i] = 'a';
                                break;

                            case ('I'):
                                array_caracteres[i] = '$';
                                break;

                            case ('i'):
                                array_caracteres[i] = 'D';
                                break;

                            case ('J'):
                                array_caracteres[i] = 'K';
                                break;

                            case ('j'):
                                array_caracteres[i] = '?';
                                break;

                            case ('K'):
                                array_caracteres[i] = '=';
                                break;

                            case ('k'):
                                array_caracteres[i] = '%';
                                break;

                            case ('L'):
                                array_caracteres[i] = 'f';
                                break;

                            case ('l'):
                                array_caracteres[i] = '@';
                                break;

                            case ('M'):
                                array_caracteres[i] = 'c';
                                break;

                            case ('m'):
                                array_caracteres[i] = '4';
                                break;

                            case ('N'):
                                array_caracteres[i] = 'H';
                                break;

                            case ('n'):
                                array_caracteres[i] = 'i';
                                break;

                            case ('O'):
                                array_caracteres[i] = ':';
                                break;

                            case ('o'):
                                array_caracteres[i] = 't';
                                break;

                            case ('P'):
                                array_caracteres[i] = '3';
                                break;

                            case ('p'):
                                array_caracteres[i] = 'n';
                                break;

                            case ('Q'):
                                array_caracteres[i] = '_';
                                break;

                            case ('q'):
                                array_caracteres[i] = 'V';
                                break;

                            case ('R'):
                                array_caracteres[i] = 'm';
                                break;

                            case ('r'):
                                array_caracteres[i] = 'P';
                                break;

                            case ('S'):
                                array_caracteres[i] = '?';
                                break;

                            case ('s'):
                                array_caracteres[i] = '*';
                                break;

                            case ('T'):
                                array_caracteres[i] = '&';
                                break;

                            case ('t'):
                                array_caracteres[i] = 'N';
                                break;

                            case ('U'):
                                array_caracteres[i] = ')';
                                break;

                            case ('u'):
                                array_caracteres[i] = 'W';
                                break;

                            case ('V'):
                                array_caracteres[i] = 'A';
                                break;

                            case ('v'):
                                array_caracteres[i] = 'I';
                                break;

                            case ('W'):
                                array_caracteres[i] = ';';
                                break;

                            case ('w'):
                                array_caracteres[i] = 'U';
                                break;

                            case ('X'):
                                array_caracteres[i] = 'R';
                                break;

                            case ('x'):
                                array_caracteres[i] = 'q';
                                break;

                            case ('Y'):
                                array_caracteres[i] = 'j';
                                break;

                            case ('y'):
                                array_caracteres[i] = ',';
                                break;

                            case ('Z'):
                                array_caracteres[i] = '|';
                                break;

                            case ('z'):
                                array_caracteres[i] = '1';
                                break;

                            case ('0'):
                                array_caracteres[i] = 'T';
                                break;

                            case ('1'):
                                array_caracteres[i] = 'p';
                                break;

                            case ('2'):
                                array_caracteres[i] = 'F';
                                break;

                            case ('3'):
                                array_caracteres[i] = 'o';
                                break;

                            case ('4'):
                                array_caracteres[i] = 'h';
                                break;

                            case ('5'):
                                array_caracteres[i] = '7';
                                break;

                            case ('6'):
                                array_caracteres[i] = 'M';
                                break;

                            case ('7'):
                                array_caracteres[i] = '8';
                                break;

                            case ('8'):
                                array_caracteres[i] = 'x';
                                break;

                            case ('9'):
                                array_caracteres[i] = '1';
                                break;

                            case ('+'):
                                array_caracteres[i] = 'Z';
                                break;

                            case ('-'):
                                array_caracteres[i] = 'Y';
                                break;

                            case ('*'):
                                array_caracteres[i] = '+';
                                break;

                            case ('/'):
                                array_caracteres[i] = 'd';
                                break;

                            case ('.'):
                                array_caracteres[i] = '#';
                                break;

                            case (','):
                                array_caracteres[i] = 'u';
                                break;

                            case (':'):
                                array_caracteres[i] = '-';
                                break;

                            case (';'):
                                array_caracteres[i] = 'E';
                                break;

                            case ('?'):
                                array_caracteres[i] = 'y';
                                break;

                            case ('!'):
                                array_caracteres[i] = '9';
                                break;

                            case ('&'):
                                array_caracteres[i] = 'J';
                                break;

                            case ('('):
                                array_caracteres[i] = 'V';
                                break;

                            case (')'):
                                array_caracteres[i] = '6';
                                break;

                            case ('"'):
                                array_caracteres[i] = '(';
                                break;

                            case ('@'):
                                array_caracteres[i] = '.';
                                break;

                            case ('#'):
                                array_caracteres[i] = 'S';
                                break;

                            case ('$'):
                                array_caracteres[i] = '0';
                                break;

                            case ('%'):
                                array_caracteres[i] = 'g';
                                break;

                            case ('_'):
                                array_caracteres[i] = 'G';
                                break;

                            case ('='):
                                array_caracteres[i] = ' ';
                                break;

                            case (' '):
                                array_caracteres[i] = 'r';
                                break;

                            case ('|'):
                                array_caracteres[i] = 'z';
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                                encriptadoJlbl.setText(ERROR_CARACTER);
                                llaveJlbl.setText(ERROR_CARACTER);
                                verificar = true;

                                break;

                        }
                        i++;
                    } while (i < array_caracteres.length);
                    if (verificar == false) {
                        for (int a = 0; a < array_caracteres.length; a++) {

                            encriptadoJlbl.setText(String.valueOf(array_caracteres));

                        }
                        llaveJlbl.setText(key10);
                    }
                    break;
                default:

                    JOptionPane.showMessageDialog(null, ERROR_CARACTER);
                    encriptadoJlbl.setText(ERROR_CARACTER);
                    llaveJlbl.setText(ERROR_CARACTER);
                    verificar = true;
                    break;

            }

        }

    }//GEN-LAST:event_encriptarJbtnActionPerformed

    private void volverJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJbtnActionPerformed
        dispose();
        ventanaPrincipal x = new ventanaPrincipal();
        x.show();
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_volverJbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                nombre = file.getSelectedFile().getName();
                /*guardamos el archivo y le damos el formato directamente,
		 			 * si queremos que se guarde en formato doc lo definimos como .doc*/
                FileWriter save = new FileWriter(guarda + ".txt");
                save.write("Mensaje encriptado: " + encriptadoJlbl.getText() + "\n");
                save.write("\n"
                        + " Llave de encriptación: " + llaveJlbl.getText());
                save.close();
                JOptionPane.showMessageDialog(null,
                        "El archivo se ha guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(encriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encriptacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane encriptadoJlbl;
    private javax.swing.JButton encriptarJbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane jTextPane1;
    private javax.swing.JTextField llaveJlbl;
    private javax.swing.JButton volverJbtn;
    // End of variables declaration//GEN-END:variables
}
