/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptadorv2;

import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Campos
 */
public class desencriptacion extends javax.swing.JFrame {

    /**
     * Creates new form desencriptacion
     */
    public desencriptacion() {
        initComponents();
    }

    String mensaje, llave2;

    final String ERROR_LLAVE = "LLAVE DE ENCRIPTACIÓN NO VÁLIDA";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        llaveJtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoEncriptadoJtxt = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoDesencriptadoJtxt = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("nKripter");

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese el mensaje a desencriptar");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Inttroduzca su llave de encriptación");

        jButton1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton1.setText("Desencriptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(textoEncriptadoJtxt);

        jScrollPane2.setViewportView(textoDesencriptadoJtxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(llaveJtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jButton1)
                            .addGap(108, 108, 108)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llaveJtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        ventanaPrincipal x = new ventanaPrincipal();
        x.show();
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        mensaje = textoEncriptadoJtxt.getText();
        llave2 = llaveJtxt.getText();
        int i = 0;

        char array_caracteresE[] = mensaje.toCharArray();
        if ("".equals(llave2)) {
            JOptionPane.showMessageDialog(null, "INGRESE LLAVE DE ENCRIPTACIÓN");

        } else {

            do {

                switch (llave2) {
                    case "sE4/W?|2&+":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = '9';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = 'Z';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = '@';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = '/';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case (','):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = 'F';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = '"';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = '4';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '=';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }

                        break;
                    case "a7H?/+2aWv":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'F';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = '1';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = '4';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = '"';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case (','):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = '9';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = ' ';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }

                        break;
                    case "9rU71n?-+0":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'n';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = 't';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = 'M';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = 'F';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = '4';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case (','):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = '9';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = '"';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '_';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }

                        break;
                    case "3uI/+8#-@a":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'A';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = '8';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = 'I';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = '1';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case (','):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = '4';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = '"';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = 'F';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = '9';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '%';
                                    break;

                                default:
                          ;

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));
                        }

                        break;
                    case "4?z+U--+=?":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'T';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = '2';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = 'a';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = '9';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case (','):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = '4';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = 'F';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '@';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }

                        break;
                    case "p/g*Un_/*x":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'v';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = 'p';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = '9';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case (','):
                                    array_caracteresE[i] = '4';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = 'F';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '"';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }

                        break;
                    case "N+1/?!&pA4":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'n';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = 'K';

                                    break;
                                case ('2'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = 'U';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = '4';
                                    break;

                                case (','):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = '"';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = '9';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = 'F';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '|';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));
                        }

                        break;
                    case "F#0+7ipLu!":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'F';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = '-';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = 'n';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = '2';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case (','):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = '"';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = '9';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = '4';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '*';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }

                        break;
                    case "!?4gHy+&!!":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = 'F';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = 'V';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = 'B';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = '=';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = '6';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = '"';
                                    break;

                                case (','):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = '4';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = '$';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'p';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = 'l';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = '9';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = ')';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '#';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }

                        break;
                    case "?p?A!04+73":
                        do {
                            switch (array_caracteresE[i]) {
                                case ('0'):
                                    array_caracteresE[i] = '$';

                                    break;
                                case ('1'):
                                    array_caracteresE[i] = '9';

                                    break;

                                case ('2'):
                                    array_caracteresE[i] = 'e';
                                    break;

                                case ('3'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('4'):
                                    array_caracteresE[i] = 'm';
                                    break;

                                case ('5'):
                                    array_caracteresE[i] = 'B';
                                    break;

                                case ('6'):
                                    array_caracteresE[i] = ')';

                                    break;

                                case ('7'):
                                    array_caracteresE[i] = '5';
                                    break;

                                case ('8'):
                                    array_caracteresE[i] = '7';
                                    break;

                                case ('9'):
                                    array_caracteresE[i] = '!';
                                    break;

                                case ('-'):
                                    array_caracteresE[i] = ':';
                                    break;

                                case ('!'):
                                    array_caracteresE[i] = 'j';
                                    break;

                                case ('"'):
                                    array_caracteresE[i] = 'g';
                                    break;

                                case ('#'):
                                    array_caracteresE[i] = '.';
                                    break;

                                case ('$'):
                                    array_caracteresE[i] = 'I';
                                    break;

                                case ('%'):
                                    array_caracteresE[i] = 'k';
                                    break;

                                case ('&'):
                                    array_caracteresE[i] = 'T';
                                    break;

                                case ('('):
                                    array_caracteresE[i] = '"';
                                    break;

                                case (')'):
                                    array_caracteresE[i] = 'U';
                                    break;

                                case ('*'):
                                    array_caracteresE[i] = 's';
                                    break;

                                case (','):
                                    array_caracteresE[i] = 'y';
                                    break;

                                case ('.'):
                                    array_caracteresE[i] = '@';
                                    break;

                                case ('/'):
                                    array_caracteresE[i] = 'd';
                                    break;

                                case (':'):
                                    array_caracteresE[i] = 'O';
                                    break;

                                case (';'):
                                    array_caracteresE[i] = 'W';
                                    break;

                                case ('?'):
                                    array_caracteresE[i] = 'S';
                                    break;

                                case ('@'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('_'):
                                    array_caracteresE[i] = 'Q';
                                    break;

                                case ('|'):
                                    array_caracteresE[i] = 'Z';
                                    break;

                                case ('+'):
                                    array_caracteresE[i] = '*';
                                    break;

                                case ('='):
                                    array_caracteresE[i] = 'K';
                                    break;

                                case ('a'):
                                    array_caracteresE[i] = 'h';
                                    break;

                                case ('A'):
                                    array_caracteresE[i] = 'V';
                                    break;

                                case ('b'):
                                    array_caracteresE[i] = 'D';
                                    break;

                                case ('B'):
                                    array_caracteresE[i] = 'G';
                                    break;

                                case ('c'):
                                    array_caracteresE[i] = 'M';
                                    break;

                                case ('C'):
                                    array_caracteresE[i] = 'b';
                                    break;

                                case ('D'):
                                    array_caracteresE[i] = 'i';
                                    break;

                                case ('d'):
                                    array_caracteresE[i] = '/';
                                    break;

                                case ('E'):
                                    array_caracteresE[i] = ';';
                                    break;

                                case ('e'):
                                    array_caracteresE[i] = 'H';
                                    break;

                                case ('f'):
                                    array_caracteresE[i] = 'L';
                                    break;

                                case ('F'):
                                    array_caracteresE[i] = '2';
                                    break;

                                case ('G'):
                                    array_caracteresE[i] = '_';
                                    break;

                                case ('g'):
                                    array_caracteresE[i] = '%';
                                    break;

                                case ('h'):
                                    array_caracteresE[i] = '4';
                                    break;

                                case ('H'):
                                    array_caracteresE[i] = 'N';
                                    break;

                                case ('I'):
                                    array_caracteresE[i] = 'v';
                                    break;

                                case ('i'):
                                    array_caracteresE[i] = 'n';
                                    break;

                                case ('J'):
                                    array_caracteresE[i] = '&';
                                    break;

                                case ('j'):
                                    array_caracteresE[i] = 'Y';
                                    break;

                                case ('k'):
                                    array_caracteresE[i] = 'f';
                                    break;

                                case ('K'):
                                    array_caracteresE[i] = 'J';
                                    break;

                                case ('l'):
                                    array_caracteresE[i] = 'z';
                                    break;

                                case ('L'):
                                    array_caracteresE[i] = 'C';
                                    break;

                                case ('M'):
                                    array_caracteresE[i] = '6';
                                    break;

                                case ('m'):
                                    array_caracteresE[i] = 'R';
                                    break;

                                case ('N'):
                                    array_caracteresE[i] = 't';
                                    break;

                                case ('n'):
                                    array_caracteresE[i] = 'P';
                                    break;

                                case ('o'):
                                    array_caracteresE[i] = '3';
                                    break;

                                case ('O'):
                                    array_caracteresE[i] = 'c';
                                    break;

                                case ('P'):
                                    array_caracteresE[i] = 'r';
                                    break;

                                case ('p'):
                                    array_caracteresE[i] = '1';
                                    break;

                                case ('Q'):
                                    array_caracteresE[i] = 'F';
                                    break;

                                case ('q'):
                                    array_caracteresE[i] = 'x';
                                    break;

                                case ('R'):
                                    array_caracteresE[i] = 'X';
                                    break;

                                case ('r'):
                                    array_caracteresE[i] = ' ';
                                    break;

                                case ('s'):
                                    array_caracteresE[i] = 'A';
                                    break;

                                case ('S'):
                                    array_caracteresE[i] = '#';
                                    break;

                                case ('t'):
                                    array_caracteresE[i] = 'o';
                                    break;

                                case ('T'):
                                    array_caracteresE[i] = '0';
                                    break;

                                case ('u'):
                                    array_caracteresE[i] = ',';
                                    break;

                                case ('U'):
                                    array_caracteresE[i] = 'w';
                                    break;

                                case ('v'):
                                    array_caracteresE[i] = '(';
                                    break;

                                case ('V'):
                                    array_caracteresE[i] = 'q';
                                    break;

                                case ('W'):
                                    array_caracteresE[i] = 'u';
                                    break;

                                case ('w'):
                                    array_caracteresE[i] = 'a';
                                    break;

                                case ('x'):
                                    array_caracteresE[i] = '8';
                                    break;

                                case ('X'):
                                    array_caracteresE[i] = 'E';
                                    break;

                                case ('Y'):
                                    array_caracteresE[i] = '-';
                                    break;

                                case ('y'):
                                    array_caracteresE[i] = '?';
                                    break;

                                case ('z'):
                                    array_caracteresE[i] = '|';
                                    break;

                                case ('Z'):
                                    array_caracteresE[i] = '+';
                                    break;

                                case (' '):
                                    array_caracteresE[i] = '=';
                                    break;

                                default:

                                    break;

                            }
                            i++;
                        } while (i < array_caracteresE.length);

                        for (int a = 0; a < array_caracteresE.length; a++) {
                            textoDesencriptadoJtxt.setText(String.valueOf(array_caracteresE));

                        }
                        break;

                    default:
                        if(i==0){

                        JOptionPane.showMessageDialog(null,ERROR_LLAVE);
                        
                        }

                        break;
                }
                i++;
            } while (i < array_caracteresE.length);
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
            java.util.logging.Logger.getLogger(desencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desencriptacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField llaveJtxt;
    private javax.swing.JEditorPane textoDesencriptadoJtxt;
    private javax.swing.JEditorPane textoEncriptadoJtxt;
    // End of variables declaration//GEN-END:variables
}
