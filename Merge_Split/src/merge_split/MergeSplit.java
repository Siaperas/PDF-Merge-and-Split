/*Copyright 2017 Pavlos Siaperas

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. */
package merge_split;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

public class MergeSplit extends javax.swing.JFrame {

    /**
     * Creates new form MergeSplit
     */
    public MergeSplit() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    //initiliase the GUI of the program
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        RotateGroup = new javax.swing.ButtonGroup();
        jFileChooser3 = new javax.swing.JFileChooser();
        ConvertGroup = new javax.swing.ButtonGroup();
        SplitGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        DestinationMergeButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        MergeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        SplitPagesField = new javax.swing.JTextField();
        SplitAuthorLabel = new javax.swing.JLabel();
        SplitNameLabel = new javax.swing.JLabel();
        SplitNameField = new javax.swing.JTextField();
        SplitDestinationField = new javax.swing.JTextField();
        SplitDestinationLabel = new javax.swing.JLabel();
        SplitFileField = new javax.swing.JTextField();
        SplitFileLabel = new javax.swing.JLabel();
        SplitFileButton = new javax.swing.JButton();
        SplitDestinationButton = new javax.swing.JButton();
        SplitButton = new javax.swing.JButton();
        SingleButton = new javax.swing.JRadioButton();
        MultipleButton = new javax.swing.JRadioButton();
        SplitAuthorField = new javax.swing.JTextField();
        RotatePanel = new javax.swing.JPanel();
        RotateButton = new javax.swing.JButton();
        RotateDestinationLabel = new javax.swing.JLabel();
        RotateDestinationField = new javax.swing.JTextField();
        RotateFileButton = new javax.swing.JButton();
        RotateNameLabel = new javax.swing.JLabel();
        RotateNameField = new javax.swing.JTextField();
        RotateAuthorField = new javax.swing.JTextField();
        RotateAuthorLabel = new javax.swing.JLabel();
        RotatePagesField = new javax.swing.JTextField();
        RotatePagesLabel = new javax.swing.JLabel();
        RotateFileLabel = new javax.swing.JLabel();
        RotateFileField = new javax.swing.JTextField();
        RotateDestinationButton = new javax.swing.JButton();
        Rotate90 = new javax.swing.JRadioButton();
        Rotate180 = new javax.swing.JRadioButton();
        Rotate270 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        ConvertFileField = new javax.swing.JTextField();
        ConvertDestinationField = new javax.swing.JTextField();
        ConvertDestinationLabel = new javax.swing.JLabel();
        ConvertFileLabel = new javax.swing.JLabel();
        ConvertNameLabel = new javax.swing.JLabel();
        ConvertNameField = new javax.swing.JTextField();
        ConvertFileButton = new javax.swing.JButton();
        ConvertDestinationButton = new javax.swing.JButton();
        ConvertButton = new javax.swing.JButton();
        ConvertPagesField = new javax.swing.JTextField();
        ConvertPagesLabel = new javax.swing.JLabel();
        pngbutton = new javax.swing.JRadioButton();
        jpgbutton = new javax.swing.JRadioButton();
        gifbutton = new javax.swing.JRadioButton();
        bmpbutton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        ImageFileLabel = new javax.swing.JLabel();
        ImageFileField = new javax.swing.JTextField();
        ImageFileButton = new javax.swing.JButton();
        ImageDestinationButton = new javax.swing.JButton();
        ImageDestinationField = new javax.swing.JTextField();
        ImageDestinationLabel = new javax.swing.JLabel();
        ImageNameLabel = new javax.swing.JLabel();
        ImageNameField = new javax.swing.JTextField();
        ImageAuthorLabel = new javax.swing.JLabel();
        ImageAuthorField = new javax.swing.JTextField();
        RotateButton1 = new javax.swing.JButton();

        jFileChooser1.setCurrentDirectory(new File(USERDIR +"/Desktop"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("*.pdf", "pdf"));
        jFileChooser1.setAcceptAllFileFilterUsed(false);

        jFileChooser2.setCurrentDirectory(new File(USERDIR +"/Desktop"));
        jFileChooser2.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        jFileChooser3.setCurrentDirectory(new File(USERDIR +"/Desktop"));
        jFileChooser3.setAcceptAllFileFilterUsed(false);
        jFileChooser3.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg"
            ,"jpeg", "png", "gif","tiff", "bmp"));

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Merge & Split by Pavlos Siaperas");
    setIconImage(img.getImage());
    setResizable(false);

    jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

    dtm = new DefaultTableModel(0, 0)
    {
        @Override
        public boolean isCellEditable(int row, int column)
        {
            if(column==2){
                return true;}
            else{
                return false;}
        }
    };

    String header[] = new String[] { "Filename", "Total","Pages","Password"};

    // add header in table model
    dtm.setColumnIdentifiers(header);
    // add header in table model
    jTable1.setModel(dtm);
    jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    jScrollPane1.setViewportView(jTable1);
    TableColumn column = null;
    for (int i = 0; i < 4; i++) {
        column = jTable1.getColumnModel().getColumn(i);
        if (i == 0) {
            column.setPreferredWidth(300); //first column is bigger
            column.setResizable(false);
        } else {
            column.setPreferredWidth(104);
            column.setResizable(false);

        }
    }
    jTable1.getTableHeader().setReorderingAllowed(false);

    jLabel1.setText("Destination Folder:");

    DestinationMergeButton.setText("Browse");
    DestinationMergeButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            DestinationMergeButtonActionPerformed(evt);
        }
    });

    jTextField1.setFocusable(false);

    jTextField2.setText("Merged");

    MergeButton.setBackground(new java.awt.Color(101, 137, 241));
    MergeButton.setFont(new java.awt.Font("FrankRuehl", 1, 24)); // NOI18N
    MergeButton.setForeground(new java.awt.Color(255, 255, 255));
    MergeButton.setText("Merge");
    MergeButton.setToolTipText("Merge the Selected PDFs");
    MergeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
    MergeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    MergeButton.setFocusPainted(false);
    MergeButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            MergeButtonActionPerformed(evt);
        }
    });

    jLabel2.setText("Name");

    jLabel3.setText("Author");

    AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/merge_split/plus.png"))); // NOI18N
    AddButton.setBorder(null);
    AddButton.setBorderPainted(false);
    AddButton.setContentAreaFilled(false);
    AddButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddButtonActionPerformed(evt);
        }
    });

    RemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/merge_split/minus.png"))); // NOI18N
    RemoveButton.setBorder(null);
    RemoveButton.setContentAreaFilled(false);
    RemoveButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RemoveButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(41, 41, 41)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(19, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DestinationMergeButton)
                        .addComponent(MergeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(AddButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(RemoveButton)))
            .addGap(46, 46, 46)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(DestinationMergeButton))
            .addGap(18, 18, 18)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addComponent(MergeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(22, Short.MAX_VALUE))
    );

    String username=System.getProperty("user.name");
    if(!username.equals(null)){
        jTextField3.setText(username);}

    jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/merge_split/merge.png")), jPanel5); // NOI18N

    SplitPagesField.setToolTipText("Please enter , for single intervals and - for multiple selection.");

    SplitAuthorLabel.setText("Author:");

    SplitNameLabel.setText("Name:");

    SplitDestinationField.setFocusable(false);

    SplitDestinationLabel.setText("Destination Folder:");

    SplitFileLabel.setText("File:");

    SplitFileButton.setText("Browse");
    SplitFileButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SplitFileButtonActionPerformed(evt);
        }
    });

    SplitDestinationButton.setText("Browse");
    SplitDestinationButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SplitDestinationButtonActionPerformed(evt);
        }
    });

    SplitButton.setBackground(new java.awt.Color(101, 137, 241));
    SplitButton.setFont(new java.awt.Font("FrankRuehl", 1, 24)); // NOI18N
    SplitButton.setForeground(new java.awt.Color(255, 255, 255));
    SplitButton.setText("Split");
    SplitButton.setToolTipText("Split the Selected PDF");
    SplitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
    SplitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    SplitButton.setFocusPainted(false);
    SplitButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SplitButtonActionPerformed(evt);
        }
    });

    SingleButton.setText("Split into Single Files");
    SingleButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SingleButtonActionPerformed(evt);
        }
    });

    MultipleButton.setText("Page Selection");
    MultipleButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            MultipleButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SplitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(307, 307, 307))
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(SingleButton)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SplitFileLabel)
                        .addComponent(SplitDestinationLabel)
                        .addComponent(SplitAuthorLabel)
                        .addComponent(SplitNameLabel)
                        .addComponent(MultipleButton))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SplitPagesField)
                        .addComponent(SplitNameField)
                        .addComponent(SplitDestinationField)
                        .addComponent(SplitFileField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SplitAuthorField))))
            .addGap(29, 29, 29)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SplitFileButton)
                .addComponent(SplitDestinationButton))
            .addGap(104, 104, 104))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(100, 100, 100)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SplitFileLabel)
                .addComponent(SplitFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(SplitFileButton))
            .addGap(27, 27, 27)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SplitDestinationLabel)
                .addComponent(SplitDestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(SplitDestinationButton))
            .addGap(27, 27, 27)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SplitNameLabel)
                .addComponent(SplitNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SplitAuthorLabel)
                .addComponent(SplitAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MultipleButton)
                .addComponent(SplitPagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addComponent(SingleButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
            .addComponent(SplitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40))
    );

    username=System.getProperty("user.name");
    if(!username.equals(null)){
        RotateAuthorField.setText(username);}
    SplitGroup.add(SingleButton);
    SingleButton.setSelected(true);
    SplitGroup.add(MultipleButton);
    MultipleButton.setSelected(true);
    username=System.getProperty("user.name");
    if(!username.equals(null)){
        SplitAuthorField.setText(username);}

    jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/merge_split/split.png")), jPanel6); // NOI18N

    RotateButton.setBackground(new java.awt.Color(101, 137, 241));
    RotateButton.setFont(new java.awt.Font("FrankRuehl", 1, 24)); // NOI18N
    RotateButton.setForeground(new java.awt.Color(255, 255, 255));
    RotateButton.setText("Rotate");
    RotateButton.setToolTipText("Rotate the Selected PDFs");
    RotateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
    RotateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    RotateButton.setFocusPainted(false);
    RotateButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RotateButtonActionPerformed(evt);
        }
    });

    RotateDestinationLabel.setText("Destination Folder:");

    RotateDestinationField.setFocusable(false);

    RotateFileButton.setText("Browse");
    RotateFileButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RotateFileButtonActionPerformed(evt);
        }
    });

    RotateNameLabel.setText("Name:");

    RotateAuthorLabel.setText("Author:");

    RotatePagesField.setToolTipText("Please enter , for single intervals and - for multiple selection.");

    RotatePagesLabel.setText("Pages:");

    RotateFileLabel.setText("File:");

    RotateDestinationButton.setText("Browse");
    RotateDestinationButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RotateDestinationButtonActionPerformed(evt);
        }
    });

    Rotate90.setText("Rotate 90 degrees");

    Rotate180.setText("Rotate 180 degrees");

    Rotate270.setText("Rotate 270 degrees");

    javax.swing.GroupLayout RotatePanelLayout = new javax.swing.GroupLayout(RotatePanel);
    RotatePanel.setLayout(RotatePanelLayout);
    RotatePanelLayout.setHorizontalGroup(
        RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(RotatePanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RotateDestinationLabel)
                .addComponent(RotatePagesLabel)
                .addComponent(RotateFileLabel)
                .addComponent(RotateNameLabel)
                .addComponent(RotateAuthorLabel))
            .addGap(34, 34, 34)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(RotateFileField)
                .addComponent(RotatePagesField)
                .addComponent(RotateAuthorField, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(RotateNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(RotateDestinationField, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(RotatePanelLayout.createSequentialGroup()
                    .addComponent(Rotate90)
                    .addGap(45, 45, 45)
                    .addComponent(Rotate180)
                    .addGap(45, 45, 45)
                    .addComponent(Rotate270)))
            .addGap(18, 18, 18)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RotateFileButton)
                .addComponent(RotateDestinationButton))
            .addContainerGap(88, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RotatePanelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RotateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(307, 307, 307))
    );
    RotatePanelLayout.setVerticalGroup(
        RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RotatePanelLayout.createSequentialGroup()
            .addContainerGap(121, Short.MAX_VALUE)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RotateFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RotateFileLabel)
                .addComponent(RotateFileButton))
            .addGap(18, 18, 18)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RotatePagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RotatePagesLabel))
            .addGap(18, 18, 18)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RotateDestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RotateDestinationButton)
                .addComponent(RotateDestinationLabel))
            .addGap(18, 18, 18)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RotateNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RotateNameLabel))
            .addGap(18, 18, 18)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RotateAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RotateAuthorLabel))
            .addGap(57, 57, 57)
            .addGroup(RotatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Rotate180)
                .addComponent(Rotate90)
                .addComponent(Rotate270))
            .addGap(18, 18, 18)
            .addComponent(RotateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41))
    );

    username=System.getProperty("user.name");
    if(!username.equals(null)){
        RotateAuthorField.setText(username);}
    RotateGroup.add(Rotate90);
    Rotate90.setSelected(true);
    RotateGroup.add(Rotate180);
    Rotate180.setSelected(false);
    RotateGroup.add(Rotate270);
    Rotate270.setSelected(false);

    jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/merge_split/rotate.png")), RotatePanel, ""); // NOI18N

    jTabbedPane2.setToolTipText("");

    ConvertFileField.setFocusable(false);

    ConvertDestinationField.setFocusable(false);

    ConvertDestinationLabel.setText("Destination Folder:");

    ConvertFileLabel.setText("File:");

    ConvertNameLabel.setText("Name:");

    ConvertFileButton.setText("Browse");
    ConvertFileButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ConvertFileButtonActionPerformed(evt);
        }
    });

    ConvertDestinationButton.setText("Browse");
    ConvertDestinationButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ConvertDestinationButtonActionPerformed(evt);
        }
    });

    ConvertButton.setBackground(new java.awt.Color(101, 137, 241));
    ConvertButton.setFont(new java.awt.Font("FrankRuehl", 1, 24)); // NOI18N
    ConvertButton.setForeground(new java.awt.Color(255, 255, 255));
    ConvertButton.setText("Convert");
    ConvertButton.setToolTipText("Convert the Selected PDF");
    ConvertButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
    ConvertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    ConvertButton.setFocusPainted(false);
    ConvertButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ConvertButtonActionPerformed(evt);
        }
    });

    ConvertPagesField.setToolTipText("Please enter , for single intervals and - for multiple selection.");

    ConvertPagesLabel.setText("Pages:");

    pngbutton.setText("PNG");

    jpgbutton.setText("JPG");

    gifbutton.setText("GIF");

    bmpbutton.setText("BMP");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConvertFileLabel)
                .addComponent(ConvertDestinationLabel)
                .addComponent(ConvertNameLabel)
                .addComponent(ConvertPagesLabel))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gifbutton)
                        .addComponent(pngbutton))
                    .addGap(36, 36, 36)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpgbutton)
                        .addComponent(bmpbutton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                    .addComponent(ConvertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(ConvertNameField)
                .addComponent(ConvertPagesField)
                .addComponent(ConvertDestinationField, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(ConvertFileField))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConvertDestinationButton)
                .addComponent(ConvertFileButton))
            .addContainerGap(96, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(79, 79, 79)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ConvertFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ConvertFileLabel)
                .addComponent(ConvertFileButton))
            .addGap(31, 31, 31)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ConvertDestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ConvertDestinationLabel)
                .addComponent(ConvertDestinationButton))
            .addGap(32, 32, 32)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ConvertNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ConvertNameLabel))
            .addGap(34, 34, 34)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ConvertPagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ConvertPagesLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pngbutton)
                        .addComponent(jpgbutton))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gifbutton)
                        .addComponent(bmpbutton))
                    .addGap(57, 57, 57))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(ConvertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58))))
    );

    ConvertGroup.add(pngbutton);
    pngbutton.setSelected(true);
    ConvertGroup.add(jpgbutton);
    jpgbutton.setSelected(false);
    ConvertGroup.add(gifbutton);
    gifbutton.setSelected(false);
    ConvertGroup.add(bmpbutton);
    bmpbutton.setSelected(false);

    jTabbedPane2.addTab("PDF to Image", jPanel2);

    ImageFileLabel.setText("File:");

    ImageFileField.setFocusable(false);

    ImageFileButton.setText("Browse");
    ImageFileButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ImageFileButtonActionPerformed(evt);
        }
    });

    ImageDestinationButton.setText("Browse");
    ImageDestinationButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ImageDestinationButtonActionPerformed(evt);
        }
    });

    ImageDestinationField.setFocusable(false);

    ImageDestinationLabel.setText("Destination Folder:");

    ImageNameLabel.setText("Name:");

    ImageAuthorLabel.setText("Author:");

    RotateButton1.setBackground(new java.awt.Color(101, 137, 241));
    RotateButton1.setFont(new java.awt.Font("FrankRuehl", 1, 24)); // NOI18N
    RotateButton1.setForeground(new java.awt.Color(255, 255, 255));
    RotateButton1.setText("Convert");
    RotateButton1.setToolTipText("Convert the Selected Image");
    RotateButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
    RotateButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    RotateButton1.setFocusPainted(false);
    RotateButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RotateButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ImageDestinationLabel)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ImageFileLabel)
                                .addComponent(ImageAuthorLabel))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ImageAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ImageFileField, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ImageDestinationButton)
                        .addComponent(ImageFileButton)))
                .addComponent(ImageNameLabel))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(305, 305, 305)
            .addComponent(RotateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(305, 305, 305))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageDestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE)))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(100, 100, 100)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ImageFileLabel)
                .addComponent(ImageFileButton)
                .addComponent(ImageFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ImageDestinationLabel)
                .addComponent(ImageDestinationButton))
            .addGap(26, 26, 26)
            .addComponent(ImageNameLabel)
            .addGap(23, 23, 23)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ImageAuthorLabel)
                .addComponent(ImageAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
            .addComponent(RotateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(59, 59, 59))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(ImageDestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(ImageNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE)))
    );

    username=System.getProperty("user.name");
    if(!username.equals(null)){
        ImageAuthorField.setText(username);}

    jTabbedPane2.addTab("Image to PDF", jPanel1);

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane2)
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
    );

    jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/merge_split/convert.png")), jPanel8); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Choose the destination folder where the files will be merged
    private void DestinationMergeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationMergeButtonActionPerformed

        String fileName;
        int returnVal = jFileChooser2.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser2.getSelectedFile();
            try {
                fileName = file.toString();
                jTextField1.setText(fileName);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem accessing file.", "Problem accessing file", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_DestinationMergeButtonActionPerformed
    //Add file to the list of file to be merged
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        String fileName;
        int returnVal = jFileChooser1.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            fileName = file.toString();
            PDDocument doc = null;
            String code = "";
            try {
                doc = PDDocument.load(file);
                if (doc.isEncrypted()) {

                    doc.setAllSecurityToBeRemoved(true);

                }
            } catch (IOException ex) {

            }
            if (doc == null) {
                JFrame frame = new JFrame("Input Dialog Example 3");

                code = JOptionPane.showInputDialog(frame,
                        "Enter password",
                        "PDF is encrypted",
                        JOptionPane.WARNING_MESSAGE
                );
                try {
                    doc = PDDocument.load(file, code);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Wrong Password.", "Wrong Password", JOptionPane.WARNING_MESSAGE);

                }

            }
            if (doc != null) {
                int count = doc.getNumberOfPages();

                String currentpages;
                if (count > 1) {
                    currentpages = "1 - " + count;
                } else {
                    currentpages = "1";
                }
                boolean isOriginalDocEncrypted = doc.isEncrypted();

                String column4;
                if (isOriginalDocEncrypted) {
                    column4 = code;
                } else {
                    column4 = "ok";
                }
                dtm.addRow(new Object[]{fileName, count, currentpages, column4});
                try {
                    doc.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Problem accessing file.", "Problem accessing file", JOptionPane.WARNING_MESSAGE);
                }

                arr.add(file);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }

    }//GEN-LAST:event_AddButtonActionPerformed
    //Merge File Action performed
    private void MergeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeButtonActionPerformed
        try {
            PDDocument samplePdf = new PDDocument();
            ArrayList<PDDocument> list = new ArrayList<>();
            for (int i = 0; i < dtm.getRowCount(); i++) {
                File file = new File((String) dtm.getValueAt(i, 0));
                String code = (String) dtm.getValueAt(i, 3);
                PDDocument doc1;
                if (code.equals("ok")) {
                    doc1 = PDDocument.load(file);
                } else {
                    doc1 = PDDocument.load(file, code);

                }
                list.add(doc1);
                doc1.setAllSecurityToBeRemoved(true);
                TreeSet tree = findPages((String) dtm.getValueAt(i, 2));
                for (int j = 0; j < doc1.getNumberOfPages(); j++) {
                    if (tree.contains(j + 1)) {
                        samplePdf.addPage(doc1.getPage(j));
                    }

                }

            }
            System.out.println("Number:" + samplePdf.getNumberOfPages());

            String destination = jTextField1.getText() + "\\" + jTextField2.getText() + ".pdf";
            PDDocumentInformation info = samplePdf.getDocumentInformation();
            info.setAuthor(jTextField3.getText());
            File output = new File(destination);

            samplePdf.save(output);

            samplePdf.close();
            for (int i = 0; i < list.size(); i++) {
                list.get(i).close();
            }
        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, "Your input is incorrect. Please fill all the fields.", "Input warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_MergeButtonActionPerformed
    //Remove File from list of chosen files to be merged
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        try {
            int selectedRow = jTable1.getSelectedRow();
            Object selectedObject = (Object) jTable1.getModel().getValueAt(selectedRow, 0);
            String filename = (String) selectedObject;
            arr.remove(new File(filename));
            dtm.removeRow(selectedRow);
        } catch (Exception e) {

        }


    }//GEN-LAST:event_RemoveButtonActionPerformed
    //Rotate PDF action performed
    private void RotateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateButtonActionPerformed
        try {

            PDDocument samplePdf = new PDDocument();
            File file = new File(RotateFileField.getText());
            PDDocument doc1;
            if (rotatecode.equals("ok")) {
                doc1 = PDDocument.load(file);
            } else {
                doc1 = PDDocument.load(file, rotatecode);

            }
            doc1.setAllSecurityToBeRemoved(true);
            TreeSet tree = findPages(RotatePagesField.getText());
            for (int j = 0; j < doc1.getNumberOfPages(); j++) {
                PDPage page = doc1.getPage(j);

                if (tree.contains(j + 1)) {

                    if (Rotate90.isSelected()) {
                        page.setRotation(90);
                        samplePdf.addPage(page);
                    } else if (Rotate180.isSelected()) {
                        page.setRotation(180);
                        samplePdf.addPage(page);
                    } else if (Rotate270.isSelected()) {
                        page.setRotation(270);
                        samplePdf.addPage(page);
                    }
                } else {
                    samplePdf.addPage(page);

                }

            }

            System.out.println("Number:" + samplePdf.getNumberOfPages());

            String destination = RotateDestinationField.getText() + "\\" + RotateNameField.getText() + ".pdf";
            PDDocumentInformation info = samplePdf.getDocumentInformation();
            info.setAuthor(RotateAuthorField.getText());
            File output = new File(destination);

            samplePdf.save(output);

            samplePdf.close();
        } catch (IOException ex) {
            Logger.getLogger(MergeSplit.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Your input is incorrect. Please fill all the fields.", "Input warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_RotateButtonActionPerformed
    //File to rotate chosen
    private void RotateFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateFileButtonActionPerformed
        String fileName;
        int returnVal = jFileChooser1.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            fileName = file.toString();
            PDDocument doc = null;
            try {
                doc = PDDocument.load(file);
                if (doc.isEncrypted()) {

                    doc.setAllSecurityToBeRemoved(true);

                }
            } catch (IOException ex) {

            }
            rotatecode = "";
            if (doc == null) {
                JFrame frame = new JFrame("Input Dialog Example 3");

                rotatecode = JOptionPane.showInputDialog(frame,
                        "Enter password",
                        "PDF is encrypted",
                        JOptionPane.WARNING_MESSAGE
                );
                try {
                    doc = PDDocument.load(file, rotatecode);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Wrong Password.", "Wrong Password", JOptionPane.WARNING_MESSAGE);

                }

            }

            if (doc != null) {
                int count = doc.getNumberOfPages();

                String currentpages;
                if (count > 1) {
                    currentpages = "1 - " + count;
                } else {
                    currentpages = "1";
                }
                RotatePagesField.setText(currentpages);
                RotateFileField.setText(fileName);
                String name = file.getName();
                int pos = name.lastIndexOf(".");
                if (pos > 0) {
                    name = name.substring(0, pos);
                }
                name = name + "Rotated";
                RotateNameField.setText(name);
                try {
                    doc.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Problem finishing process.", "Problem finishing process", JOptionPane.WARNING_MESSAGE);
                }

            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_RotateFileButtonActionPerformed
    //Destination folder of destination action chosen
    private void RotateDestinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateDestinationButtonActionPerformed

        String fileName;
        int returnVal = jFileChooser2.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser2.getSelectedFile();
            try {
                fileName = file.toString();
                RotateDestinationField.setText(fileName);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem accessing file.", "Problem accessing file", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_RotateDestinationButtonActionPerformed
    //Image File chosen to be converted to PDF
    private void ImageFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageFileButtonActionPerformed
        String fileName;
        int returnVal = jFileChooser3.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser3.getSelectedFile();
            try {

                ImageFileField.setText(file.toString());
                String name = file.getName();
                int pos = name.lastIndexOf(".");
                if (pos > 0) {
                    name = name.substring(0, pos);
                }
                name = name + "toPDF";
                ImageNameField.setText(name);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Image could not be opened.", "Image could not be opened", JOptionPane.WARNING_MESSAGE);
            }

        }


    }//GEN-LAST:event_ImageFileButtonActionPerformed
    //Image to PDF conversion destination folder choice
    private void ImageDestinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageDestinationButtonActionPerformed

        String fileName;
        int returnVal = jFileChooser2.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser2.getSelectedFile();
            try {
                fileName = file.toString();
                ImageDestinationField.setText(fileName);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem accessing file.", "Problem accessing file", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_ImageDestinationButtonActionPerformed
    //Rotate Action
    private void RotateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateButton1ActionPerformed
        PDDocument document = new PDDocument();
        InputStream in = null;
        BufferedImage bimg = null;

        try {
            in = new FileInputStream((String) ImageFileField.getText());

            bimg = ImageIO.read(in);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image could not be read.", "Image could not be read", JOptionPane.WARNING_MESSAGE);
        }
        float width = bimg.getWidth();
        float height = bimg.getHeight();
        PDPage page = new PDPage(new PDRectangle(width, height));
        document.addPage(page);
        PDImageXObject imgpdf;
        try {
            imgpdf = PDImageXObject.createFromFile((String) ImageFileField.getText(), document);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.drawImage(imgpdf, 0, 0);
            }

            in.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image could not be converted.", "Proccess could not be finished", JOptionPane.WARNING_MESSAGE);
        }
        String destination = ImageDestinationField.getText() + "\\" + ImageNameField.getText() + ".pdf";
        PDDocumentInformation info = document.getDocumentInformation();
        info.setAuthor(ImageAuthorField.getText());
        File output = new File(destination);

        try {
            document.save(output);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Not all fields were filled.", "Input Problem", JOptionPane.WARNING_MESSAGE);
        }
        try {
            document.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Not all fields were filled.", "Input Problem", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_RotateButton1ActionPerformed
    //File chosen to convert
    private void ConvertFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertFileButtonActionPerformed
        String fileName;
        int returnVal = jFileChooser1.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            fileName = file.toString();
            PDDocument doc = null;
            try {
                doc = PDDocument.load(file);
                if (doc.isEncrypted()) {

                    doc.setAllSecurityToBeRemoved(true);

                }
            } catch (IOException ex) {

            }
            convertcode = "";
            if (doc == null) {
                JFrame frame = new JFrame("Input Dialog Example 3");

                convertcode = JOptionPane.showInputDialog(frame,
                        "Enter password",
                        "PDF is encrypted",
                        JOptionPane.WARNING_MESSAGE
                );
                try {
                    doc = PDDocument.load(file, rotatecode);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Wrong Password.", "Wrong Password", JOptionPane.WARNING_MESSAGE);
                }

            }
            if (doc != null) {
                int count = doc.getNumberOfPages();

                String currentpages;
                if (count > 1) {
                    currentpages = "1 - " + count;
                } else {
                    currentpages = "1";
                }
                ConvertPagesField.setText(currentpages);
                ConvertFileField.setText(fileName);
                String name = file.getName();
                int pos = name.lastIndexOf(".");
                if (pos > 0) {
                    name = name.substring(0, pos);
                }
                ConvertNameField.setText(name);
                try {
                    doc.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Problem accessing file.", "Problem accessing file", JOptionPane.WARNING_MESSAGE);
                }

            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_ConvertFileButtonActionPerformed
    //Destination folder of Convert Action
    private void ConvertDestinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertDestinationButtonActionPerformed

        String fileName;
        int returnVal = jFileChooser2.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser2.getSelectedFile();
            try {
                fileName = file.toString();
                ConvertDestinationField.setText(fileName);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem accessing file.", "Problem accessing file", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_ConvertDestinationButtonActionPerformed
//Convert PDF to Image
    private void ConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertButtonActionPerformed
        PDDocument document = null;
        try {
            document = PDDocument.load(new File((String) ConvertFileField.getText()), convertcode);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problem opening pdf.", "Problem opening pdf", JOptionPane.WARNING_MESSAGE);
        }
        TreeSet tree = findPages((String) ConvertPagesField.getText());

        PDFRenderer pdfRenderer = new PDFRenderer(document);
        for (int page = 0; page < document.getNumberOfPages(); ++page) {
            BufferedImage bim = null;
            try {
                bim = pdfRenderer.renderImageWithDPI(page, 300, ImageType.RGB);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Problem rendering image.", "Problem rendering image", JOptionPane.WARNING_MESSAGE);

            }

            // suffix in filename will be used as the file format
            String destination = ConvertDestinationField.getText() + "\\" + ConvertNameField.getText();
            String image = ".png";
            if (pngbutton.isSelected()) {
                image = ".png";
            } else if (bmpbutton.isSelected()) {
                image = ".bmp";
            } else if (gifbutton.isSelected()) {
                image = ".gif";
            } else if (jpgbutton.isSelected()) {
                image = ".jpg";
            }
            try {
                if (tree.contains(page + 1)) {

                    ImageIOUtil.writeImage(bim, destination + "-" + (page + 1) + image, 300);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Problem output image.", "Problem output image", JOptionPane.WARNING_MESSAGE);
                java.util.logging.Logger.getLogger(MergeSplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

            }
        }
        try {
            document.close();
        } catch (IOException ex) {
            Logger.getLogger(MergeSplit.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_ConvertButtonActionPerformed
    //Split PDF Action
    private void SplitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SplitButtonActionPerformed
        try {

            File file = new File(SplitFileField.getText());
            PDDocument doc1;
            if (splitcode.equals("ok")) {
                doc1 = PDDocument.load(file);
            } else {
                doc1 = PDDocument.load(file, splitcode);

            }
            doc1.setAllSecurityToBeRemoved(true);

            if (MultipleButton.isSelected()) {
                PDDocument pdf1 = new PDDocument();
                PDDocument pdf2 = new PDDocument();
                TreeSet tree = findPages(SplitPagesField.getText());
                for (int j = 0; j < doc1.getNumberOfPages(); j++) {
                    PDPage page = doc1.getPage(j);
                    if (tree.contains(j + 1)) {
                        pdf1.addPage(page);
                    } else {
                        pdf2.addPage(page);

                    }
                }
                String destination1 = SplitDestinationField.getText() + "\\" + SplitNameField.getText() + "1.pdf";
                String destination2 = SplitDestinationField.getText() + "\\" + SplitNameField.getText() + "2.pdf";

                PDDocumentInformation info = pdf1.getDocumentInformation();
                info.setAuthor(SplitAuthorField.getText());
                PDDocumentInformation info2 = pdf2.getDocumentInformation();
                info2.setAuthor(SplitAuthorField.getText());
                if (pdf1.getNumberOfPages() > 0) {
                    File output1 = new File(destination1);
                    pdf1.save(output1);
                }
                if (pdf2.getNumberOfPages() > 0) {
                    File output2 = new File(destination2);
                    pdf2.save(output2);
                }
                pdf1.close();
                pdf2.close();
            } else if (SingleButton.isSelected()) {

                for (int j = 0; j < doc1.getNumberOfPages(); j++) {
                    PDDocument pdf1 = new PDDocument();

                    PDPage page = doc1.getPage(j);
                    pdf1.addPage(page);
                    int pagenumber = j + 1;
                    String destination1 = SplitDestinationField.getText() + "\\" + SplitNameField.getText() + pagenumber + ".pdf";

                    PDDocumentInformation info = pdf1.getDocumentInformation();
                    info.setAuthor(SplitAuthorField.getText());

                    if (pdf1.getNumberOfPages() > 0) {
                        File output1 = new File(destination1);
                        pdf1.save(output1);
                    }

                    pdf1.close();
                }

            }
            doc1.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Your input is incorrect. Please fill all the fields.", "Input warning", JOptionPane.WARNING_MESSAGE);
            java.util.logging.Logger.getLogger(MergeSplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_SplitButtonActionPerformed

    private void MultipleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipleButtonActionPerformed
        SplitPagesField.setVisible(true);
    }//GEN-LAST:event_MultipleButtonActionPerformed

    private void SingleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleButtonActionPerformed
        SplitPagesField.setVisible(false);

    }//GEN-LAST:event_SingleButtonActionPerformed
    //Choose what file is chosen
    private void SplitFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SplitFileButtonActionPerformed
        String fileName;
        int returnVal = jFileChooser1.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            fileName = file.toString();
            PDDocument doc = null;
            try {
                doc = PDDocument.load(file);
                if (doc.isEncrypted()) {

                    doc.setAllSecurityToBeRemoved(true);

                }
            } catch (IOException ex) {

            }
            splitcode = "";
            if (doc == null) {
                JFrame frame = new JFrame("Input Dialog Example 3");

                splitcode = JOptionPane.showInputDialog(frame,
                        "Enter password",
                        "PDF is encrypted",
                        JOptionPane.WARNING_MESSAGE
                );
                try {
                    doc = PDDocument.load(file, rotatecode);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Wrong Password.", "Wrong Password", JOptionPane.WARNING_MESSAGE);

                }

            }

            if (doc != null) {
                int count = doc.getNumberOfPages();

                String currentpages;
                if (count > 1) {
                    currentpages = "1 - " + count;
                } else {
                    currentpages = "1";
                }
                SplitPagesField.setText(currentpages);
                SplitFileField.setText(fileName);
                String name = file.getName();
                int pos = name.lastIndexOf(".");
                if (pos > 0) {
                    name = name.substring(0, pos);
                }
                name = name + "Split";
                SplitNameField.setText(name);
                try {
                    doc.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Problem finishing process.", "Problem finishing process", JOptionPane.WARNING_MESSAGE);
                }

            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_SplitFileButtonActionPerformed
    //Choose the Destionation Folder of the Split Function
    private void SplitDestinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SplitDestinationButtonActionPerformed
        String fileName;
        int returnVal = jFileChooser2.showOpenDialog((Component) evt.getSource());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser2.getSelectedFile();
            try {
                fileName = file.toString();
                SplitDestinationField.setText(fileName);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem accessing file.", "Problem accessing file", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_SplitDestinationButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MergeSplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //image icon
        img = new ImageIcon("C:\\Users\\123\\Documents\\NetBeansProjects\\Merge_Split\\src\\merge_split\\MergeIcon.png");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MergeSplit().setVisible(true);
        });
    }
    
    
    //find the pages that were chosen
    public TreeSet findPages(String pages) {
        HashSet hs = new HashSet();
        pages = pages.replace(" ", "");
        String[] pagesarray = pages.split(",");

        for (String pagesarray1 : pagesarray) {
            if (pagesarray1.contains("-")) {
                String[] minmax = pagesarray1.split("-");
                try {
                    int min = Integer.parseInt(minmax[0]);
                    int max = Integer.parseInt(minmax[1]);

                    for (int j = min; j <= max; j++) {
                        hs.add(j);
                    }
                } catch (Exception e) {
                }
            } else {
                try {
                    hs.add(Integer.parseInt(pagesarray1));
                } catch (Exception e) {
                }
            }
        }
        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(hs);

        return myTreeSet;

    }
    private static String rotatecode;
    private static String convertcode;
    private static String splitcode;
    private static ArrayList<File> arr = new ArrayList<>();
    private static DefaultTableModel dtm;
    private static final String USERDIR = System.getProperty("user.home");
    private static ImageIcon img;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ConvertButton;
    private javax.swing.JButton ConvertDestinationButton;
    private javax.swing.JTextField ConvertDestinationField;
    private javax.swing.JLabel ConvertDestinationLabel;
    private javax.swing.JButton ConvertFileButton;
    private javax.swing.JTextField ConvertFileField;
    private javax.swing.JLabel ConvertFileLabel;
    private javax.swing.ButtonGroup ConvertGroup;
    private javax.swing.JTextField ConvertNameField;
    private javax.swing.JLabel ConvertNameLabel;
    private javax.swing.JTextField ConvertPagesField;
    private javax.swing.JLabel ConvertPagesLabel;
    private javax.swing.JButton DestinationMergeButton;
    private javax.swing.JTextField ImageAuthorField;
    private javax.swing.JLabel ImageAuthorLabel;
    private javax.swing.JButton ImageDestinationButton;
    private javax.swing.JTextField ImageDestinationField;
    private javax.swing.JLabel ImageDestinationLabel;
    private javax.swing.JButton ImageFileButton;
    private javax.swing.JTextField ImageFileField;
    private javax.swing.JLabel ImageFileLabel;
    private javax.swing.JTextField ImageNameField;
    private javax.swing.JLabel ImageNameLabel;
    private javax.swing.JButton MergeButton;
    private javax.swing.JRadioButton MultipleButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JRadioButton Rotate180;
    private javax.swing.JRadioButton Rotate270;
    private javax.swing.JRadioButton Rotate90;
    private javax.swing.JTextField RotateAuthorField;
    private javax.swing.JLabel RotateAuthorLabel;
    private javax.swing.JButton RotateButton;
    private javax.swing.JButton RotateButton1;
    private javax.swing.JButton RotateDestinationButton;
    private javax.swing.JTextField RotateDestinationField;
    private javax.swing.JLabel RotateDestinationLabel;
    private javax.swing.JButton RotateFileButton;
    private javax.swing.JTextField RotateFileField;
    private javax.swing.JLabel RotateFileLabel;
    private javax.swing.ButtonGroup RotateGroup;
    private javax.swing.JTextField RotateNameField;
    private javax.swing.JLabel RotateNameLabel;
    private javax.swing.JTextField RotatePagesField;
    private javax.swing.JLabel RotatePagesLabel;
    private javax.swing.JPanel RotatePanel;
    private javax.swing.JRadioButton SingleButton;
    private javax.swing.JTextField SplitAuthorField;
    private javax.swing.JLabel SplitAuthorLabel;
    private javax.swing.JButton SplitButton;
    private javax.swing.JButton SplitDestinationButton;
    private javax.swing.JTextField SplitDestinationField;
    private javax.swing.JLabel SplitDestinationLabel;
    private javax.swing.JButton SplitFileButton;
    private javax.swing.JTextField SplitFileField;
    private javax.swing.JLabel SplitFileLabel;
    private javax.swing.ButtonGroup SplitGroup;
    private javax.swing.JTextField SplitNameField;
    private javax.swing.JLabel SplitNameLabel;
    private javax.swing.JTextField SplitPagesField;
    private javax.swing.JRadioButton bmpbutton;
    private javax.swing.JRadioButton gifbutton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton jpgbutton;
    private javax.swing.JRadioButton pngbutton;
    // End of variables declaration//GEN-END:variables
}
