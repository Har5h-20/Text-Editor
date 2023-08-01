import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class TextEditor extends JFrame {
private JTextArea textArea;
private JScrollPane scrollPane;
private JMenuBar menuBar;
private JMenu fileMenu, editMenu, formatMenu;
private JMenuItem openItem, saveItem, exitItem;
private JMenuItem cutItem, copyItem, pasteItem;
private JMenuItem fontTypeItem, fontSizeItem, fontCaseItem;
private JMenuItem findItem, replaceItem, replaceAllItem;
private JMenuItem countItem, printItem;
private JFileChooser fileChooser;
private File file;

public TextEditor() {
super("Text Editor");
textArea = new JTextArea();
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
scrollPane = new JScrollPane(textArea);
scrollPane.setPreferredSize(new Dimension(400, 300));
add(scrollPane);
// Create menu bar
menuBar = new JMenuBar();
fileMenu = new JMenu("File");
editMenu = new JMenu("Edit");
formatMenu = new JMenu("Format");
menuBar.add(fileMenu);
menuBar.add(editMenu);
menuBar.add(formatMenu);

// File menu items
openItem = new JMenuItem("Open");
saveItem = new JMenuItem("Save");
exitItem = new JMenuItem("Exit");
fileMenu.add(openItem);
fileMenu.add(saveItem);
fileMenu.add(exitItem);

// Edit menu items
cutItem = new JMenuItem("Cut");
copyItem = new JMenuItem("Copy");
pasteItem = new JMenuItem("Paste");
editMenu.add(cutItem);
editMenu.add(copyItem);
editMenu.add(pasteItem);

// Format menu items
fontTypeItem = new JMenuItem("Font Type");
fontSizeItem = new JMenuItem("Font Size");
fontCaseItem = new JMenuItem("Font Case");
formatMenu.add(fontTypeItem);
formatMenu.add(fontSizeItem);
formatMenu.add(fontCaseItem);

// Other menu items
findItem = new JMenuItem("Find");
replaceItem = new JMenuItem("Replace");
replaceAllItem = new JMenuItem("Replace All");
countItem = new JMenuItem("Count");
printItem = new JMenuItem("Print");
editMenu.add(findItem);
editMenu.add(replaceItem);
editMenu.add(replaceAllItem);
formatMenu.add(countItem);
formatMenu.add(printItem);

// Set menu bar
setJMenuBar(menuBar);

// File chooser
fileChooser = new JFileChooser();

// Action listeners for menu items
openItem.addActionListener(new OpenListener());
saveItem.addActionListener(new SaveListener());
// Create menu bar
menuBar = new JMenuBar();
fileMenu = new JMenu("File");
editMenu = new JMenu("Edit");
formatMenu = new JMenu("Format");
menuBar.add(fileMenu);
menuBar.add(editMenu);
menuBar.add(formatMenu);

// File menu items
openItem = new JMenuItem("Open");
saveItem = new JMenuItem("Save");
exitItem = new JMenuItem("Exit");
fileMenu.add(openItem);
fileMenu.add(saveItem);
fileMenu.add(exitItem);

// Edit menu items
cutItem = new JMenuItem("Cut");
copyItem = new JMenuItem("Copy");
pasteItem = new JMenuItem("Paste");
editMenu.add(cutItem);
editMenu.add(copyItem);
editMenu.add(pasteItem);

// Format menu items
fontTypeItem = new JMenuItem("Font Type");
fontSizeItem = new JMenuItem("Font Size");
fontCaseItem = new JMenuItem("Font Case");
formatMenu.add(fontTypeItem);
formatMenu.add(fontSizeItem);
formatMenu.add(fontCaseItem);

// Other menu items
findItem = new JMenuItem("Find");
replaceItem = new JMenuItem("Replace");
replaceAllItem = new JMenuItem("Replace All");
countItem = new JMenuItem("Count");
printItem = new JMenuItem("Print");
editMenu.add(findItem);
editMenu.add(replaceItem);
editMenu.add(replaceAllItem);
formatMenu.add(countItem);
formatMenu.add(printItem);

// Set menu bar
setJMenuBar(menuBar);

// File chooser
fileChooser = new JFileChooser();

// Action listeners for menu items
openItem.addActionListener(new OpenListener());
saveItem.addActionListener(new
SaveListener());
exitItem.addActionListener(new ExitListener());
cutItem.addActionListener(new CutListener());
copyItem.addActionListener(new CopyListener());
pasteItem.addActionListener(new PasteListener());
fontTypeItem.addActionListener(new FontTypeListener());

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
pack();
setVisible(true);
}

// Open file listener
private class OpenListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
int result = fileChooser.showOpenDialog(TextEditor.this);
if (result == JFileChooser.APPROVE_OPTION) {
file = fileChooser.getSelectedFile();
try {
Scanner input = new Scanner(file);
textArea.setText("");
while (input.hasNext()) {
textArea.append(input.nextLine() + "\n");
}
input.close();
}
catch (IOException ex) {
JOptionPane.showMessageDialog(TextEditor.this, ex);
}
}
}
}

// Save file listener
private class SaveListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
int result = fileChooser.showSaveDialog(TextEditor.this);
if (result == JFileChooser.APPROVE_OPTION) {
file = fileChooser.getSelectedFile();
try {
FileWriter writer = new FileWriter(file);
writer.write(textArea.getText());
writer.close();
}
catch (IOException ex) {
JOptionPane.showMessageDialog(TextEditor.this, ex);
}
}
}
}

// Exit program listener
private class ExitListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
}

// Cut listener
private class CutListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
textArea.cut();
}
}

// Copy listener
private class CopyListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
textArea.copy();
}
}

// Paste listener
private class PasteListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
textArea.paste();
}
}

// Font type listener
private class FontTypeListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String fontType = JOptionPane.showInputDialog(TextEditor.this, "Enter font type:");
exitItem.addActionListener(new ExitListener());
cutItem.addActionListener(new CutListener());
copyItem.addActionListener(new CopyListener());
pasteItem.addActionListener(new PasteListener());
fontTypeItem.addActionListener(new FontTypeListener());
fontSizeItem.addActionListener(new FontSizeListener());
fontCaseItem.addActionListener(new FontCaseListener());
findItem.addActionListener(new FindListener());
replaceItem.addActionListener(new ReplaceListener());
replaceAllItem.addActionListener(new ReplaceAllListener());
countItem.addActionListener(new CountListener());

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
pack();
setVisible(true);
}

// Open file listener
private class OpenListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
int result = fileChooser.showOpenDialog(TextEditor.this);
if (result == JFileChooser.APPROVE_OPTION) {
file = fileChooser.getSelectedFile();
try {
Scanner input = new Scanner(file);
textArea.setText("");
while (input.hasNext()) {
textArea.append(input.nextLine() + "\n");
}
input.close();
}
catch (IOException ex) {
JOptionPane.showMessageDialog(TextEditor.this, ex);
}
}
}
}

// Save file listener
private class SaveListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
int result = fileChooser.showSaveDialog(TextEditor.this);
if (result == JFileChooser.APPROVE_OPTION) {
file = fileChooser.getSelectedFile();
try {
FileWriter writer = new FileWriter(file);
writer.write(textArea.getText());
writer.close();
}
catch (IOException ex) {
JOptionPane.showMessageDialog(TextEditor.this, ex);
}
}
}
}

// Exit program listener
private class ExitListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
}

// Cut listener
private class CutListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
textArea.cut();
}
}

// Copy listener
private class CopyListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
textArea.copy();
}
}

// Paste listener
private class PasteListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
textArea.paste();
}
}


// Font size listener
private class FontSizeListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String fontSizeStr = JOptionPane.showInputDialog(TextEditor.this, "Enter font size:");
int fontSize = Integer.parseInt(fontSizeStr);
textArea.setFont(new Font(textArea.getFont().getName(), textArea.getFont().getStyle(), fontSize));
}
}

// Font case listener
private class FontCaseListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String fontCase = JOptionPane.showInputDialog(TextEditor.this, "Enter font case (upper, lower, or title):");
if (fontCase.equalsIgnoreCase("upper")) {
textArea.setText(textArea.getText().toUpperCase());
}
else if (fontCase.equalsIgnoreCase("lower")) {
textArea.setText(textArea.getText().toLowerCase());
}
else if (fontCase.equalsIgnoreCase("title")) {
textArea.setText(toTitleCase(textArea.getText()));
}
}
}
// Convert string to title case
private String toTitleCase(String str) {
String[] words = str.split(" ");
StringBuilder sb = new StringBuilder();
for (int i = 0; i < words.length; i++) {
sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
}
return sb.toString();
}

// Find listener
private class FindListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String searchStr = JOptionPane.showInputDialog(TextEditor.this, "Enter search string:");
String text = textArea.getText();
int index = text.indexOf(searchStr);
if (index >= 0) {
textArea.setCaretPosition(index);
textArea.setSelectionStart(index);
textArea.setSelectionEnd(index + searchStr.length());
}
else {
JOptionPane.showMessageDialog(TextEditor.this, "Search string not found.");
}
}
}

// Replace listener
private class ReplaceListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String searchStr = JOptionPane.showInputDialog(TextEditor.this, "Enter search string:");
String replaceStr = JOptionPane.showInputDialog(TextEditor.this, "Enter replace string:");
int index = textArea.getText().indexOf(searchStr);
if (index >= 0) {
textArea.replaceRange(replaceStr, index, index + searchStr.length());
}
else {
JOptionPane.showMessageDialog(TextEditor.this, "Search string not found.");
}
}
}

// Replace all listener
private class ReplaceAllListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String
searchStr = JOptionPane.showInputDialog(TextEditor.this, "Enter search string:");
String replaceStr = JOptionPane.showInputDialog(TextEditor.this, "Enter replace string:");
String text = textArea.getText();
String replacedText = text.replaceAll(searchStr, replaceStr);
textArea.setText(replacedText);
}
}

// Count listener
private class CountListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String selectedText = textArea.getSelectedText();
if (selectedText == null || selectedText.isEmpty()) {
JOptionPane.showMessageDialog(TextEditor.this, "No text selected.");
return;
}
String[] words = selectedText.split(" ");
int numWords = words.length;
int numChars = selectedText.length();
JOptionPane.showMessageDialog(TextEditor.this, "Number of words: " + numWords + "\n"
+ "Number of characters: " + numChars);
}
}
}
}
public static void main(String[] args) {
  new TextEditor();
  }