import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Class        CrapSimulationGUI.java
 * File         Die.java
 *              CustomerInfo.java
 *              PrintUtilities.java  
 * Description  This program follows the game
 * Environment  PC, Windows 8, JDK 8.1
 * History log  2/22/2017 - Setting up GUI
 *              2/27/2017 - Set up Die.java
 *              3/01/2017 - Add code blocks for JButtons
 *              3/03/2017
 * @author      Evan Wansa
 * Version      1.0.0
 * @see         javax.swing.JFrame 
 *              Project 3 
 *              Due date: 3/09/2017
 */

public class CrapSimulationGUI extends javax.swing.JFrame {
    //Constants representing 6-side die
    public final int MAX = 6;
    //Constants representing winning/losing dice rolls
    public final int  LUCKY = 7;
    public final int  NOT_LUCKY = 7;
    public final int  ELEVEN_WIN = 11;
    public final int  SNAKE_EYES = 2;
    public final int CRAPS = 3;
    public final int BOX_CARS = 12;
    //Instance variables
    int sum = 0;
    int point = 0;
    int rollPlay = 0;
    int sumFreq = 0;
    int dieFreq[] = new int[MAX];
    double diePerc[] = new double[MAX];
    DecimalFormat percent = new DecimalFormat("#0.00%");
    
    /**
     *
     * @throws IOException
     */
    public CrapSimulationGUI() throws IOException {
        try
        {
        Thread.sleep(4000);
        }
        catch(Exception e) 
        {            
        }
        initComponents();
        
        //Sets icon for form
        this.setIconImage(Toolkit.getDefaultToolkit().
                getImage("src/Images/Icon.png"));
        
        //Sets the form title
        this.setTitle("Crap Simulation");
        
        //Centers the form at start.
        setLocationRelativeTo(null);
        
        // Default button for rollJButton
        rootPane.setDefaultButton(rollJButton);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsJPanel = new javax.swing.JPanel();
        rollJButton = new javax.swing.JButton();
        statisticsJButton = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        exitJButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        infoJTextArea = new javax.swing.JTextArea();
        sumJLabel = new javax.swing.JLabel();
        statusJLabel = new javax.swing.JLabel();
        pointsJLabel = new javax.swing.JLabel();
        statusresultJLabel = new javax.swing.JLabel();
        sumresultJLabel = new javax.swing.JLabel();
        pointsresultJLabel = new javax.swing.JLabel();
        dieOneJLabel = new javax.swing.JLabel();
        dieTwoJLabel = new javax.swing.JLabel();
        textDieOneJLabel = new javax.swing.JLabel();
        textDieTwoJLabel = new javax.swing.JLabel();
        redDiceJLabel = new javax.swing.JLabel();
        resultJLabel = new javax.swing.JLabel();
        crapJMenu = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        printFormJMenuItem = new javax.swing.JMenuItem();
        saveJMenuItem = new javax.swing.JMenuItem();
        fileMenuJSeparator = new javax.swing.JPopupMenu.Separator();
        quitMenuItem = new javax.swing.JMenuItem();
        actionJMenu = new javax.swing.JMenu();
        rollJMenuItem = new javax.swing.JMenuItem();
        statisticsJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        buttonsJPanel.setLayout(new java.awt.GridLayout(1, 5, 2, 2));

        rollJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rollJButton.setText("Roll");
        rollJButton.setSelected(true);
        rollJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollJButtonActionPerformed(evt);
            }
        });
        buttonsJPanel.add(rollJButton);

        statisticsJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        statisticsJButton.setText("Statistics");
        statisticsJButton.setEnabled(false);
        buttonsJPanel.add(statisticsJButton);

        printJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        printJButton.setText("Print");
        printJButton.setEnabled(false);
        printJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJButtonActionPerformed(evt);
            }
        });
        buttonsJPanel.add(printJButton);

        clearJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearJButton.setText("Clear");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        buttonsJPanel.add(clearJButton);

        exitJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitJButton.setText("Exit");
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJButtonActionPerformed(evt);
            }
        });
        buttonsJPanel.add(exitJButton);

        titleJLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        titleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Title.png"))); // NOI18N

        infoJTextArea.setEditable(false);
        infoJTextArea.setBackground(new java.awt.Color(0, 204, 0));
        infoJTextArea.setColumns(20);
        infoJTextArea.setRows(5);
        JScrollPane.setViewportView(infoJTextArea);

        sumJLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        sumJLabel.setText("Sum = ");

        statusJLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        statusJLabel.setText("Status :");

        pointsJLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pointsJLabel.setText("Points =");

        statusresultJLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        sumresultJLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        pointsresultJLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        dieOneJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/die1.png"))); // NOI18N

        dieTwoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/die1.png"))); // NOI18N

        textDieOneJLabel.setText("Die 1");

        textDieTwoJLabel.setText("Die 2");

        redDiceJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dice.png"))); // NOI18N

        resultJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Result.png"))); // NOI18N

        fileJMenu.setText("File");

        clearJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        printFormJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        printFormJMenuItem.setMnemonic('P');
        printFormJMenuItem.setText("Print Form");
        printFormJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFormJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printFormJMenuItem);

        saveJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        saveJMenuItem.setMnemonic('S');
        saveJMenuItem.setText("Save");
        saveJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveJMenuItem);
        fileJMenu.add(fileMenuJSeparator);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(quitMenuItem);

        crapJMenu.add(fileJMenu);

        actionJMenu.setMnemonic('S');
        actionJMenu.setText("Action");

        rollJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        rollJMenuItem.setMnemonic('R');
        rollJMenuItem.setText("Roll");
        rollJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollJMenuItemActionPerformed(evt);
            }
        });
        actionJMenu.add(rollJMenuItem);

        statisticsJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        statisticsJMenuItem.setMnemonic('S');
        statisticsJMenuItem.setText("Statistics");
        actionJMenu.add(statisticsJMenuItem);

        crapJMenu.add(actionJMenu);

        helpJMenu.setMnemonic('a');
        helpJMenu.setText("Help");

        aboutJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        crapJMenu.add(helpJMenu);

        setJMenuBar(crapJMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redDiceJLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dieOneJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textDieOneJLabel)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dieTwoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textDieTwoJLabel)))
                        .addGap(18, 18, 18)
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sumJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumresultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pointsJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pointsresultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusresultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(resultJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(redDiceJLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dieOneJLabel)
                                        .addComponent(dieTwoJLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textDieOneJLabel)
                                        .addComponent(textDieTwoJLabel))))
                            .addGap(61, 61, 61)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(resultJLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sumJLabel)
                            .addComponent(sumresultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(statusJLabel)
                            .addComponent(statusresultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pointsJLabel)
                            .addComponent(pointsresultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(buttonsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJButtonActionPerformed
        //Quits the program
        System.exit(0);
    }//GEN-LAST:event_exitJButtonActionPerformed

    private void rollJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollJButtonActionPerformed
        //int sum = 0;
        
        
        Die die1 = new Die();
        Die die2 = new Die();
        die1.setSide((byte)die1.roll());
        die2.setSide((byte)die2.roll());
        sum = die1.getSide() + die2.getSide();
        dieOneJLabel.setIcon(new ImageIcon(("src/Images/die" + die1.getSide() + ".png")));
        dieTwoJLabel.setIcon(new ImageIcon(("src/Images/die" + die2.getSide() + ".png")));
          
        
        //Count the frequency of the two die
        for (int i = 0; i < MAX; i++) {
            if (i + 1 == die1.getSide()) {
                dieFreq[i]++;
                sumFreq++;
            }
            if (i + 1 == die2.getSide()) {
                dieFreq[i]++;
                sumFreq++;
            }
        }
        
        for (int i = 0; i < MAX; i++) {
            diePerc[i] = ((double)dieFreq[i] / sumFreq);
        }
        
        infoJTextArea.setText(printInfo().toString());
        sumresultJLabel.setText(String.valueOf(sum));
        statisticsJButton.setEnabled( true );
        printJButton.setEnabled( true );
        
        
//----LOGIC ERROR-----------------

        if (rollPlay == 0) {
            switch (sum) {
                // win on first roll
                case LUCKY:
                case ELEVEN_WIN:
                    statusresultJLabel.setText("You win!!!");
//            dieFreq = null;
//            sumFreq = 0;
//            diePerc = null;
                    rollPlay = 0;
                    break;

                case SNAKE_EYES:
                case CRAPS:
                case BOX_CARS:
                    statusresultJLabel.setText("You lost!!!");
//            dieFreq = null;
//            sumFreq = 0;
//            diePerc = null;
                    rollPlay = 0;
                    break;

                // Point in instance variable
                default:

                    //Set the point and output result
                    point = sum;

                    // update the point value
                    pointsresultJLabel.setText(String.valueOf(sum));
                    statusresultJLabel.setText(null);
            }
            rollPlay++;
        } 
        else // determine the sum matches point
        {
            if (sum == point) {
                statusresultJLabel.setText("You win!!!");
            } // determine outcome the sum consider lose
            else if (sum == NOT_LUCKY) {
                statusresultJLabel.setText("You lose!!!");
            } else {
                sumresultJLabel.setText(String.valueOf(sum));
                pointsresultJLabel.setText(String.valueOf(point));
            }
            rollPlay++;
        }

                         
      
        
    }//GEN-LAST:event_rollJButtonActionPerformed

    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJButtonActionPerformed
        //Prints the text area with the invoice
        try {
            infoJTextArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CrapSimulationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_printJButtonActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed

        //Displays the about form
        CrapSimAboutForm about = new CrapSimAboutForm(this,true);
        about.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    private void printFormJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFormJMenuItemActionPerformed

        // Prints the form
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printFormJMenuItemActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed

        // Clears all the the textfields and the text area
        infoJTextArea.setText(null);
        sumresultJLabel.setText(null);
        rollJButton.requestFocus();
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void rollJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollJMenuItemActionPerformed
        
        //execute rollJButton
        rollJButton.doClick();
    }//GEN-LAST:event_rollJMenuItemActionPerformed

    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        //execute clearJButton
        clearJButton.doClick();
    }//GEN-LAST:event_clearJMenuItemActionPerformed

    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        //execute printJButton
        printJButton.doClick();
    }//GEN-LAST:event_printJMenuItemActionPerformed

    private void saveJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuItemActionPerformed
      
        // Saves the text area onto a text file.

        JFileChooser chooser = new JFileChooser();
        //Dialogue for user to select save location
        chooser.setCurrentDirectory(new File("C:\\"));        
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION)
            {
                try(FileWriter fw = new FileWriter(chooser.getSelectedFile()+".txt"))
                {
                    fw.write(infoJTextArea.getText());
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();

                }
            }
    }//GEN-LAST:event_saveJMenuItemActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        //execute exitJButton
        exitJButton.doClick();
    }//GEN-LAST:event_quitMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(CrapSimulationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrapSimulationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrapSimulationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrapSimulationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try
                {
                new CrapSimulationGUI().setVisible(true);
                }
                  catch (IOException ex) {
                    Logger.getLogger(CrapSimulationGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    public String printInfo(){
        StringBuffer output = new StringBuffer("Face     " + "Frequency     " + "Percent\n");
        for (int i = 0; i < MAX; i++) {
            output.append((i + 1) + "            " + dieFreq[i] + "\t         " + percent.format(diePerc[i]) + "\n");
        }
        return output.toString();
    }
    public void reset(){
        
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JMenu actionJMenu;
    private javax.swing.JPanel buttonsJPanel;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JMenuBar crapJMenu;
    private javax.swing.JLabel dieOneJLabel;
    private javax.swing.JLabel dieTwoJLabel;
    private javax.swing.JButton exitJButton;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JPopupMenu.Separator fileMenuJSeparator;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JTextArea infoJTextArea;
    private javax.swing.JLabel pointsJLabel;
    private javax.swing.JLabel pointsresultJLabel;
    private javax.swing.JMenuItem printFormJMenuItem;
    private javax.swing.JButton printJButton;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JLabel redDiceJLabel;
    private javax.swing.JLabel resultJLabel;
    private javax.swing.JButton rollJButton;
    private javax.swing.JMenuItem rollJMenuItem;
    private javax.swing.JMenuItem saveJMenuItem;
    private javax.swing.JButton statisticsJButton;
    private javax.swing.JMenuItem statisticsJMenuItem;
    private javax.swing.JLabel statusJLabel;
    private javax.swing.JLabel statusresultJLabel;
    private javax.swing.JLabel sumJLabel;
    private javax.swing.JLabel sumresultJLabel;
    private javax.swing.JLabel textDieOneJLabel;
    private javax.swing.JLabel textDieTwoJLabel;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables

}
