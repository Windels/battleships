/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.windels.battleships.io.impl;

import com.windels.battleships.controller.GameBoard;
import com.windels.battleships.io.Input;
import com.windels.battleships.io.Output;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


/**
 *
 * @author joshw
 */
public class BattleshipsGui extends javax.swing.JFrame implements Input, Output {

    /**
     * Creates new form GuiInterface
     */
    public BattleshipsGui() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        battleShipsGrid = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridOutput = new javax.swing.JTextArea();
        buttonPanel = new javax.swing.JPanel();
        newGameButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        exitGameButton = new javax.swing.JButton();
        saveGameButton = new javax.swing.JButton();
        loadGameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        outputTextPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        displayGameTextArea = new javax.swing.JTextArea();
        counterPanel = new javax.swing.JPanel();
        shotsTakenCounterLabelText = new javax.swing.JLabel();
        shipsRemainingCounterLabelText = new javax.swing.JLabel();
        remainingShipsCounter = new javax.swing.JTextField();
        shotsTakenCounter = new javax.swing.JTextField();
        shootButton = new javax.swing.JButton();
        shotTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        battleShipsGrid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        gridOutput.setColumns(20);
        gridOutput.setRows(5);
        jScrollPane2.setViewportView(gridOutput);

        javax.swing.GroupLayout battleShipsGridLayout = new javax.swing.GroupLayout(battleShipsGrid);
        battleShipsGrid.setLayout(battleShipsGridLayout);
        battleShipsGridLayout.setHorizontalGroup(
            battleShipsGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        battleShipsGridLayout.setVerticalGroup(
            battleShipsGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        exitGameButton.setText("Exit Game");
        exitGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameButtonActionPerformed(evt);
            }
        });

        saveGameButton.setText("Save Game");
        saveGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGameButtonActionPerformed(evt);
            }
        });

        loadGameButton.setText("Load Game");
        loadGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitGameButton)
                .addContainerGap())
        );

        jLabel1.setText("Battleshite");

        displayGameTextArea.setEditable(false);
        displayGameTextArea.setColumns(20);
        displayGameTextArea.setLineWrap(true);
        displayGameTextArea.setRows(5);
        jScrollPane3.setViewportView(displayGameTextArea);

        javax.swing.GroupLayout outputTextPanelLayout = new javax.swing.GroupLayout(outputTextPanel);
        outputTextPanel.setLayout(outputTextPanelLayout);
        outputTextPanelLayout.setHorizontalGroup(
            outputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
            .addGroup(outputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );
        outputTextPanelLayout.setVerticalGroup(
            outputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(outputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
        );

        shotsTakenCounterLabelText.setText("Shots Taken");

        shipsRemainingCounterLabelText.setText("Ships Remaining");

        remainingShipsCounter.setToolTipText("");
        remainingShipsCounter.setActionCommand("<Not Set>");

        shotsTakenCounter.setEditable(false);

        javax.swing.GroupLayout counterPanelLayout = new javax.swing.GroupLayout(counterPanel);
        counterPanel.setLayout(counterPanelLayout);
        counterPanelLayout.setHorizontalGroup(
            counterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, counterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(counterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(counterPanelLayout.createSequentialGroup()
                        .addComponent(shipsRemainingCounterLabelText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(shotsTakenCounterLabelText)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, counterPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(remainingShipsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(shotsTakenCounter)
                        .addContainerGap())))
        );
        counterPanelLayout.setVerticalGroup(
            counterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(counterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(counterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(counterPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(shipsRemainingCounterLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(shotsTakenCounterLabelText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(counterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remainingShipsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shotsTakenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        shootButton.setText("Go");
        shootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battleShipsGrid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputTextPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(shotTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(shootButton))
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(counterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(counterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shootButton)
                            .addComponent(shotTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(battleShipsGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outputTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        userComm = new Command(ConsoleCommandManager.NEWGAME);
        notifyCommand();
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void shootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootButtonActionPerformed
        String shotLocation = shotTextField.getText();
        userComm = new Command(shotLocation);
        shotTextField.setText("");
        notifyCommand();
    }//GEN-LAST:event_shootButtonActionPerformed

    private void exitGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameButtonActionPerformed
        userComm = new Command(ConsoleCommandManager.EXITGAME);
        notifyCommand();
    }//GEN-LAST:event_exitGameButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        userComm = new Command(ConsoleCommandManager.HELPMENU);
        notifyCommand();
    }//GEN-LAST:event_helpButtonActionPerformed

    private void saveGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGameButtonActionPerformed
        
        
        /* ORIGINAL FILE LOAD CODE, MIGHT BE USEFUL
        final JFileChooser loadMenu = new JFileChooser();
        int returnVal = loadMenu.showOpenDialog(this);
        loadMenu.setCurrentDirectory(new File(System.getProperty("user.dir")));
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String fileName = loadMenu.getName();
            userComm = new Command(ConsoleCommandManager.LOADGAME, fileName);
            notifyCommand();
        } else {
           // log.append("Open command cancelled by user." + newline);
        } 
        */
    }//GEN-LAST:event_saveGameButtonActionPerformed

    private void loadGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGameButtonActionPerformed
        userComm = new Command(ConsoleCommandManager.LISTGAMES);
        notifyCommand();
    }//GEN-LAST:event_loadGameButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel battleShipsGrid;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel counterPanel;
    private javax.swing.JTextArea displayGameTextArea;
    private javax.swing.JButton exitGameButton;
    private javax.swing.JTextArea gridOutput;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loadGameButton;
    private javax.swing.JButton newGameButton;
    private javax.swing.JPanel outputTextPanel;
    private javax.swing.JTextField remainingShipsCounter;
    private javax.swing.JButton saveGameButton;
    private javax.swing.JLabel shipsRemainingCounterLabelText;
    private javax.swing.JButton shootButton;
    private javax.swing.JTextField shotTextField;
    private javax.swing.JTextField shotsTakenCounter;
    private javax.swing.JLabel shotsTakenCounterLabelText;
    // End of variables declaration//GEN-END:variables

    //Start of Josh custom variable declaration
    private Command userComm = null;
    //End of custom variable declaration
    
    //Start of Josh custom methods
    private synchronized void notifyCommand() {
        notifyAll();
    }
    
    
    //INPUT METHODS BELOW
    @Override
    public synchronized Command getUserInput()   {
        while (userComm == null) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        Command givenComm = new Command(userComm);
        userComm = null;
        return givenComm;
    }
    
    
    @Override
    public void close() {
        //GUI closes automatically with System exit called from Battleships at the mo.
        //Can change in future if necessary.
    }

    @Override
    public String getHelpText() {
        return "Use the menu options on the right hand side" + "\n"
                + "to get around. To take a shot, simply click" + "\n"
                + "on the grid location!";
    }

    
    //OUTPUT METHODS BELOW
    @Override
    public void renderGameBoard(GameBoard gameBoard) {
        gridOutput.setText(ConsoleGridGenerator.generateSmallGrid(gameBoard));
        remainingShipsCounter.setText(String.valueOf(gameBoard.getNumberOfRemainingShips()));
        shotsTakenCounter.setText(String.valueOf(gameBoard.getTotalShotsTaken()));
    }

    @Override
    public void displayInGameText(String text) {
        displayGameTextArea.append(text + "\n\n");
        displayGameTextArea.setCaretPosition(displayGameTextArea.getDocument().getLength());
    }

    @Override
    public void displayGameAdminText(String gameControlText) {
        JOptionPane.showMessageDialog(this, gameControlText,
                "Battleshite", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void displaySavedGames(List<String> savedGames) {
        
    }
    
    public String getFileName(List<String> savedGames) {
        JList list = new JList(savedGames.toArray());
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        String selection = (String) JOptionPane.showInputDialog(
                this,
                "Select a saved game",
                "Load game",
                JOptionPane.PLAIN_MESSAGE,
                null,
                savedGames.toArray(),
                savedGames.toArray()[0]);
        System.out.println(selection);
        return selection;
    }
    
        
    //End of Josh custom methods
}
