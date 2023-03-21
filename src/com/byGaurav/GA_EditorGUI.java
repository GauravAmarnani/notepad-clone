//Author : Gaurav Amarnani.

//Package Name : 
package com.byGaurav;

//Importing Files : 
import static java.lang.System.out;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;
import javax.swing.undo.UndoManager;

//Initialization Class :  
public class GA_EditorGUI extends JFrame 
{
    String fileName;
    Clipboard clipboard = getToolkit().getSystemClipboard();
    public GA_EditorGUI() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutText = new javax.swing.JMenuItem();
        copyText = new javax.swing.JMenuItem();
        pasteText = new javax.swing.JMenuItem();
        formatMenu = new javax.swing.JMenu();
        wordWrap = new javax.swing.JMenuItem();
        fontText = new javax.swing.JMenuItem();
        colorText = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        aboutEditor = new javax.swing.JMenuItem();
        feedback = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        searchLabel.setText("Enter Text :");

        searchField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        searchButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);
        UndoManager um = new UndoManager();
        textArea.getDocument().addUndoableEditListener(
            new UndoableEditListener()
            {
                public void undoableEditHappened(UndoableEditEvent e)
                {
                    um.addEdit(e.getEdit());
                }
            }
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(searchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFile.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        newFile.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_Artboard_20_5208390.png")); // NOI18N
        newFile.setText("New File");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        fileMenu.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        openFile.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_Open_1493293.png")); // NOI18N
        openFile.setText("Open File");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        fileMenu.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        saveFile.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_Down_arrow_download_button_downloading_file_download_save_file_1_4850516.png")); // NOI18N
        saveFile.setText("Save File");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        fileMenu.add(saveFile);

        exitFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exitFile.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        exitFile.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_icon-close-circled_211650.png")); // NOI18N
        exitFile.setText("Exit File");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileActionPerformed(evt);
            }
        });
        fileMenu.add(exitFile);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        cutText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cutText.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_ic_content_cut_48px_3669368.png")); // NOI18N
        cutText.setText("Cut");
        cutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextActionPerformed(evt);
            }
        });
        editMenu.add(cutText);

        copyText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        copyText.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_copy_2639798.png")); // NOI18N
        copyText.setText("Copy");
        copyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextActionPerformed(evt);
            }
        });
        editMenu.add(copyText);

        pasteText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pasteText.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_paste_103675.png")); // NOI18N
        pasteText.setText("Paste");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        editMenu.add(pasteText);

        jMenuBar1.add(editMenu);

        formatMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        formatMenu.setLabel("Format");

        wordWrap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        wordWrap.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        wordWrap.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_drive-ms-word_326625.png")); // NOI18N
        wordWrap.setText("Word Wrap");
        formatMenu.add(wordWrap);

        fontText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        fontText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        fontText.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_pen_stroke_sketch_doodle_lineart_136_451442.png")); // NOI18N
        fontText.setText("Fonts ");
        formatMenu.add(fontText);

        colorText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        colorText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        colorText.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_ic_palette_48px_352576.png")); // NOI18N
        colorText.setText("Color");
        colorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorTextActionPerformed(evt);
            }
        });
        formatMenu.add(colorText);

        jMenuBar1.add(formatMenu);

        aboutMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        aboutMenu.setLabel("About");

        aboutEditor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        aboutEditor.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        aboutEditor.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_v-31_3162614.png")); // NOI18N
        aboutEditor.setText("About GA_Editor");
        aboutMenu.add(aboutEditor);

        feedback.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        feedback.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        feedback.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Desktop\\Temp_Images\\iconfinder_ic_feedback_48px_3669434.png")); // NOI18N
        feedback.setText("Feedback");
        aboutMenu.add(feedback);

        jMenuBar1.add(aboutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter
    {
        public MyHighlightPainter(Color c) 
        {
            super(c);
        }   
    }
    
    Highlighter.HighlightPainter myHighlightPainter = new MyHighlightPainter(Color.YELLOW);
    
    public void remove(JTextComponent textComp)
    {
        try
        {
            Highlighter removeHighlighter = textComp.getHighlighter();
            Highlighter.Highlight[] remove = removeHighlighter.getHighlights();
            
            for(int i = 0 ; i < remove.length ; i++)
            {
                if(remove[i].getPainter() instanceof MyHighlightPainter)
                {
                    removeHighlighter.removeHighlight(remove[i]);
                }
            }
        }
        catch(Exception e)
        {
            out.println("Sorry.\nIt didn't remove.");
        }
    }
    
    public void highlight(JTextComponent textComp , String pattern)
    {
        remove(textComp);
        try
        {
            Highlighter highlighter = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0 , doc.getLength());
            int pos = 0;
            
            while((pos = text.toUpperCase().indexOf(pattern.toUpperCase() , pos)) >= 0)
            {
                highlighter.addHighlight(pos, pos + pattern.length(), myHighlightPainter);
                pos += pattern.length();
            }
        }
        catch(Exception e)
        {
            out.println("Sorry.\nDidn't Work.");
        }
    }
    
    private void colorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if(searchField.getText().isEmpty())
        {
            searchField.setText("Search Bar is empty.");       }
        else
        {
            highlight(textArea , searchField.getText());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        textArea.setText("");
        setTitle(fileName);
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        FileDialog fileDialog = new FileDialog(GA_EditorGUI.this , "Open File" , FileDialog.LOAD);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null)
        {
            fileName = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(fileName);
        }
        
        try
        {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            StringBuilder text = new StringBuilder();
            String line = null;
            
            while((line = fileReader.readLine()) != null)
            {
                text.append(line + "\n");
                textArea.setText(text.toString());
            }
            fileReader.close();
        }
        catch(IOException ioe)
        {
            out.println("Sorry.\nFile Not Found.");
        }
        /*
        FileDialog fileDialog = new FileDialog(Java_notepad_text.this , "Open File" , FileDialog.LOAD);
        fileDialog.setVisible(true);
        fileDialog.setLocationRelativeTo(null);
        if(fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            StringBuilder text = new StringBuilder();
            String line = null;
            if(!(fileReader==null)) {
                while((line = fileReader.readLine()) != null) {
                text.append(line + "\n");
                mainarea.setText(text.toString());
                }
                fileReader.close();
            }
        }
        catch(Exception e) { 
        }
        */
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        FileDialog fileDialog = new FileDialog(GA_EditorGUI.this , "Save File." , FileDialog.SAVE);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null)
        {
            fileName = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(fileName);
        }
        
        try
        {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(textArea.getText());
            setTitle(fileName);
            fileWriter.close();
        }
        catch(IOException ioe)
        {
            out.println("Sorry.\nFile Not Found.");
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFileActionPerformed

    private void cutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextActionPerformed
        String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cutTextActionPerformed

    private void copyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextActionPerformed
        String copyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipboard.setContents(copySelection, copySelection);
    }//GEN-LAST:event_copyTextActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed
        try
        {
            Transferable pasteText = clipboard.getContents(GA_EditorGUI.this);
            String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(sel,textArea.getSelectionStart() , textArea.getSelectionEnd());
        }
        catch(Exception e)
        {
            out.println("Sorry.\nDidn't Work.");
        }
    }//GEN-LAST:event_pasteTextActionPerformed
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GA_EditorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutEditor;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem colorText;
    private javax.swing.JMenuItem copyText;
    private javax.swing.JMenuItem cutText;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitFile;
    private javax.swing.JMenuItem feedback;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fontText;
    private javax.swing.JMenu formatMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem pasteText;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JMenuItem wordWrap;
    // End of variables declaration//GEN-END:variables
}
