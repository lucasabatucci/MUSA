/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Davide Guastella
 */
public class MusaConfigGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MusaConfigGUI() 
    {
    	list_model 		= new DefaultListModel();
    	paramsTable 	= new HashMap<String,String>();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jasonBeliefTextArea = new javax.swing.JTextArea();
        injectJasonBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        goalNameTextField = new javax.swing.JTextField();
        goalPackTextField = new javax.swing.JTextField();
        goalDescriptionTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        goalSPECparamList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        varNameTextField = new javax.swing.JTextField();
        varValueTextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        addParamBtn = new javax.swing.JButton();
        removeParamBtn = new javax.swing.JButton();
        addGoalToDBBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        goalsComboBox = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        injectGoalBtn = new javax.swing.JButton();
        injectPackBtn = new javax.swing.JButton();
        removeGoalBtn = new javax.swing.JButton();
        goalInfoBtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dbIPTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dbPortTextField = new javax.swing.JTextField();
        dbNameTextField = new javax.swing.JTextField();
        dbUserTextField = new javax.swing.JTextField();
        dbPasswordTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        configFilePathTextField = new javax.swing.JTextField();
        chooseCfgFileBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Jason Beliefs");

        jasonBeliefTextArea.setColumns(20);
        jasonBeliefTextArea.setRows(5);
        jasonBeliefTextArea.setName("jasonGoalsTextArea"); // NOI18N
        jScrollPane2.setViewportView(jasonBeliefTextArea);

        injectJasonBtn.setText("Inject goal(s)");
        
        loadJasonFromFileBtn = new JButton("Load from file");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addGap(0, 476, Short.MAX_VALUE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
        					.addComponent(loadJasonFromFileBtn)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(injectJasonBtn, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel6)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(injectJasonBtn)
        				.addComponent(loadJasonFromFileBtn))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Jason injection", jPanel2);

        jPanel1.setBorder(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Submit new GoalSPEC goal"));

        jLabel1.setText("Name");

        jLabel2.setText("Pack");

        jLabel3.setText("Description");

        goalNameTextField.setName("nameTextField"); // NOI18N

        goalPackTextField.setName("packTextField"); // NOI18N

        goalDescriptionTextField.setName("descriptionTextField"); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameters"));

        jScrollPane1.setViewportView(goalSPECparamList);

        jLabel4.setText("Var name");

        jLabel5.setText("Var value");

        addParamBtn.setText("Add parameter");
        addParamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(addParamBtn);

        removeParamBtn.setText("Remove parameter");
        jPanel7.add(removeParamBtn);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varNameTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varValueTextField)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(varNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(varValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        addGoalToDBBtn.setText("Add goal to database");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goalNameTextField)
                            .addComponent(goalPackTextField)
                            .addComponent(goalDescriptionTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addGoalToDBBtn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(goalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(goalPackTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(goalDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGoalToDBBtn))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Goals in database")));

        goalsComboBox.setToolTipText("");
        goalsComboBox.addItemListener(new ItemListener() 
		{	
			public void itemStateChanged(ItemEvent itemEvent) 
			{
				SetCurrentGoal(itemEvent);
			}
		});
        goalsComboBox.setName("goalsInDBComboBox"); // NOI18N

        injectGoalBtn.setText("Inject goal");
        injectGoalBtn.setFocusable(false);
        injectGoalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        injectGoalBtn.setName("btnInjectSelection"); // NOI18N
        injectGoalBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel6.add(injectGoalBtn);

        injectPackBtn.setText("Inject pack");
        injectPackBtn.setFocusable(false);
        injectPackBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        injectPackBtn.setName("btnInjectGoalPack"); // NOI18N
        injectPackBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        injectPackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().setLayout(new MigLayout("", "[634px]", "[638px]"));
        
        panel_1 = new JPanel();
        jTabbedPane1.addTab("Goal fusion", null, panel_1, null);
        panel_1.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 41, 581, 128);
        panel_1.add(scrollPane);
        
        goalTextArea_A = new JTextArea();
        scrollPane.setViewportView(goalTextArea_A);
        
        JLabel lblGoalPackA = new JLabel("Goal pack A");
        lblGoalPackA.setBounds(12, 14, 92, 15);
        panel_1.add(lblGoalPackA);
        
        loadPackABtn = new JButton("Load from file");
        loadPackABtn.setBounds(12, 178, 159, 25);
        panel_1.add(loadPackABtn);
        
        JLabel lblGoalPackB = new JLabel("Goal pack B");
        lblGoalPackB.setBounds(12, 215, 92, 15);
        panel_1.add(lblGoalPackB);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(12, 242, 581, 128);
        panel_1.add(scrollPane_1);
        
        goalTextArea_B = new JTextArea();
        scrollPane_1.setViewportView(goalTextArea_B);
        
        loadPackBBtn = new JButton("Load from file");
        loadPackBBtn.setBounds(12, 382, 159, 25);
        panel_1.add(loadPackBBtn);
        
        mergeAndInjectGoalsBtn = new JButton("Merge and inject");
        mergeAndInjectGoalsBtn.setBounds(401, 382, 192, 25);
        panel_1.add(mergeAndInjectGoalsBtn);
        
        mergeAndSaveBtn = new JButton("Merge and save to file");
        mergeAndSaveBtn.setBounds(401, 419, 192, 25);
        panel_1.add(mergeAndSaveBtn);
        jPanel6.add(injectPackBtn);

        removeGoalBtn.setText("Remove goal");
        removeGoalBtn.setFocusable(false);
        removeGoalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeGoalBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel6.add(removeGoalBtn);

        goalInfoBtn.setText("Goal info");
        goalInfoBtn.setFocusable(false);
        goalInfoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goalInfoBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel6.add(goalInfoBtn);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goalsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(goalsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GoalSPEC injection", jPanel1);

        jLabel7.setText("IP address");

        jLabel8.setText("Database name");

        jLabel9.setText("User");

        jLabel10.setText("Password");

        jLabel11.setText("Port");

        jLabel12.setText("Load from configuration file");

        chooseCfgFileBtn.setText("Choose file");
        
        submitDBconfigBtn = new JButton("Submit data");
        
        setDBconfigAsDefault = new JButton("Set as default");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10Layout.setHorizontalGroup(
        	jPanel10Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel10Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel10Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel10Layout.createSequentialGroup()
        					.addGroup(jPanel10Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel10Layout.createSequentialGroup()
        							.addGroup(jPanel10Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel7)
        								.addComponent(jLabel11)
        								.addComponent(jLabel8)
        								.addComponent(jLabel9)
        								.addComponent(jLabel10))
        							.addGap(29)
        							.addGroup(jPanel10Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(dbPasswordTextField, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        								.addComponent(dbUserTextField, 426, 426, 426)
        								.addComponent(dbNameTextField, 426, 426, 426)
        								.addComponent(dbPortTextField, 426, 426, 426)
        								.addComponent(dbIPTextField, 426, 426, 426)))
        						.addGroup(jPanel10Layout.createSequentialGroup()
        							.addComponent(jLabel12)
        							.addGap(0, 371, Short.MAX_VALUE))
        						.addGroup(jPanel10Layout.createSequentialGroup()
        							.addComponent(configFilePathTextField, 448, 448, 448)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(chooseCfgFileBtn)))
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
        					.addGroup(jPanel10Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(submitDBconfigBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        						.addComponent(setDBconfigAsDefault, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(445))))
        );
        jPanel10Layout.setVerticalGroup(
        	jPanel10Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel10Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(dbIPTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11)
        				.addComponent(dbPortTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(dbNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(dbUserTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel10)
        				.addComponent(dbPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addComponent(jLabel12)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(configFilePathTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(chooseCfgFileBtn))
        			.addGap(26)
        			.addComponent(submitDBconfigBtn)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(setDBconfigAsDefault)
        			.addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel10.setLayout(jPanel10Layout);

        jTabbedPane1.addTab("Database configuration", jPanel10);

        quitBtn.setText("Quit");
        quitBtn.setName("quitButton"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("MUSA configuration panel");
        
        aboutMUSAbtn = new JButton("About MUSA");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9Layout.setHorizontalGroup(
        	jPanel9Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel9Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel9Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jTabbedPane1)
        				.addGroup(jPanel9Layout.createSequentialGroup()
        					.addComponent(aboutMUSAbtn)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(quitBtn, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel9Layout.createSequentialGroup()
        					.addComponent(jLabel13)
        					.addGap(0, 428, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
        	jPanel9Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel9Layout.createSequentialGroup()
        			.addGap(6)
        			.addComponent(jLabel13)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(quitBtn)
        				.addComponent(aboutMUSAbtn))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9.setLayout(jPanel9Layout);
        
        JPanel panel = new JPanel();
        jTabbedPane1.addTab("MUSA startup", null, panel, null);
        
        startMUSABtn = new JButton("Start MUSA");
        startMUSABtn.setBounds(174, 12, 276, 25);
        
        panel.setLayout(null);
        panel.add(startMUSABtn);
        
        stopMUSABtn = new JButton("Stop MUSA");
        stopMUSABtn.setBounds(171, 49, 279, 25);
        panel.add(stopMUSABtn);
        getContentPane().add(jPanel9, "cell 0 0,alignx left,aligny top");

        pack();
    }// </editor-fold>                        

    /**
     * Show the current selected goal info in combobox (goalSPEC).
     */
    public void showCurrentSelectedGoalInfo()
    {
    	String s = "Name: "+ getSelectedGoalName()+"\nPack: "+getSelectedGoalPack()+"\nDescription: "+getSelectedGoalDescription();
		JOptionPane.showMessageDialog(this, s);
    }
    
    /**
     * Set the informations on the goal selected in the goals combobox (goalSPEC tab).
     * 
     */
    protected void SetCurrentGoal(ItemEvent itemEvent) 
    {
    	if(this.goalsComboBox.getSelectedIndex() < 0)
    	{
    		selectedGoalName			= null;
    		selectedGoalPack 			= null;
    		selectedGoalDescription 	= null;
    		return;
    	}
    	
    	String selectedItem = getGoalComboboxSelectedItem(itemEvent.getItemSelectable());		//Get the selected goal
		Scanner sc = new Scanner(selectedItem);
		sc.useDelimiter("\\S*(ID:|name:|pack:|description:)\\S*");					//Get the goal data (name,pack,description and id)
		
		sc.next();				 	//Ignore ID 
		selectedGoalName 			= sc.next().trim();
		selectedGoalPack 			= sc.next().trim();
		selectedGoalDescription 	= sc.next().trim();
		
		sc.close();
		
		//Remove white spaces
		selectedGoalName.replaceAll("\\s", "");

		//TODO trovare una soluzione piu ragionevole...
		String s = "";
		for(int i=0;i<selectedGoalPack.length(); i++)
		{
			if(selectedGoalPack.charAt(i) != (char)32)
				s = s + selectedGoalPack.charAt(i);
		}
		selectedGoalPack = s;
		
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusaConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusaConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusaConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusaConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusaConfigGUI().setVisible(true);
            }
        });
    }
    
    
    
    public javax.swing.JButton getAddParamBtn()
    {
    	return this.addParamBtn;
    }

    public javax.swing.JButton getInjectJasonBtn()
    {
    	return this.injectJasonBtn;
    }

    public javax.swing.JButton getRemoveParamBtn()
    {
    	return this.removeParamBtn;
    }

    public javax.swing.JButton getAddGoalToDbbtn()
    {
    	return this.addGoalToDBBtn;
    }

    public javax.swing.JButton getQuitBtn()
    {
    	return this.quitBtn;
    }

    public javax.swing.JButton getInjectGoalBtn()
    {
    	return this.injectGoalBtn;
    }

    public javax.swing.JButton getInjectPackBtn()
    {
    	return this.injectPackBtn;
    }

    public javax.swing.JButton getRemoveGoalBtn()
    {
    	return this.removeGoalBtn;
    }

    public javax.swing.JButton getGoalInfoBtn()
    {
    	return this.goalInfoBtn;
    }

    public javax.swing.JButton getChooseCfgFileBtn()
    {
    	return this.chooseCfgFileBtn;
    }
    
    
    public javax.swing.JButton getsubmitDBconfigBtn()
    {
    	return this.submitDBconfigBtn;
    }

    
    public javax.swing.JButton getStopMUSABtn()
    {
    	return this.stopMUSABtn;
    }

    public javax.swing.JButton getStartMUSABtn()
    {
    	return this.startMUSABtn;
    }

    public javax.swing.JButton getSetDBconfigAsDefault()
    {
    	return this.setDBconfigAsDefault;
    }
    
    
    public javax.swing.JButton getLoadJasonFromFileBtn()
    {
    	return this.loadJasonFromFileBtn;
    }

    public javax.swing.JButton getAboutMUSAbtn()
    {
    	return this.aboutMUSAbtn;
    }
    
    public javax.swing.JButton getMergeAndInjectGoalsBtn()
    {
    	return this.mergeAndInjectGoalsBtn;
    }

    public javax.swing.JButton getMergeAndSaveBtn()
    {
    	return this.mergeAndSaveBtn;
    }

    public javax.swing.JButton getLoadPackABtn()
    {
    	return this.loadPackABtn;
    }

    public javax.swing.JButton getLoadPackBBtn()
    {
    	return this.loadPackBBtn;
    }

    public javax.swing.JTextArea getGoalTextArea_A()
    {
    	return this.goalTextArea_A;
    }

    public javax.swing.JTextArea getGoalTextArea_B()
    {
    	return this.goalTextArea_B;
    }
    
    public javax.swing.JTextArea getJasonBeliefTextArea()
    {
    	return this.jasonBeliefTextArea;
    }
    
    public javax.swing.JTextField getGoalNameTextField()
    {
    	return this.goalNameTextField;
    }
    
    public javax.swing.JTextField getGoalPackTextField()
    {
    	return this.goalPackTextField;
    }

    public javax.swing.JTextField getGoalDescriptionTextField()
    {
    	return this.goalDescriptionTextField;
    }

    public javax.swing.JTextField getDbPasswordTextField()
    {
    	return this.dbPasswordTextField;
    }

    public javax.swing.JTextField getConfigFilePathTextField()
    {
    	return this.configFilePathTextField;
    }

    

    public javax.swing.JTextField getVarNameTextField()
    {
    	return this.varNameTextField;
    }

    public javax.swing.JTextField getVarValueTextField()
    {
    	return this.varValueTextField;
    }

    public javax.swing.JTextField getDbIptextField()
    {
    	return this.dbIPTextField;
    }

    public javax.swing.JTextField getDbPortTextField()
    {
    	return this.dbPortTextField;
    }

    public javax.swing.JTextField getDbNameTextField()
    {
    	return this.dbNameTextField;
    }

    public javax.swing.JTextField getDbUserTextField()
    {
    	return this.dbUserTextField;
    }
    
    public javax.swing.JComboBox getGoalsComboBox()
    {
    	return this.goalsComboBox;
    }
    
    public HashMap<String,String> getParamsTable()
	{
		return paramsTable;
	}
    
    public String getSelectedGoalName()
    {
    	return this.selectedGoalName;
    }
    
    public String getSelectedGoalPack()
    {
    	return this.selectedGoalPack;
    }
    
    public String getSelectedGoalDescription()
    {
    	return this.selectedGoalDescription;
    }
    
    public DefaultListModel getGoalSPECgoalsListModel()
    {
    	return this.list_model;
    }
    
    public javax.swing.JList getGoalSPECparamList()
    {
    	return this.goalSPECparamList;
    }
    
    
    public void setGoalSPECgoalsListModel(DefaultListModel l)
    {
    	this.list_model = l;
    }
    
    /**
	 * Return the text of the selected item in the combobox control.
	 */
	static private String getGoalComboboxSelectedItem(ItemSelectable is) 
	{
	    Object selected[] = is.getSelectedObjects();
	    return ((selected.length == 0) ? "" : (String) selected[0]);
	}
	


    // Variables declaration - do not modify                     
    private javax.swing.JButton addParamBtn;
    private javax.swing.JButton injectJasonBtn;
    private javax.swing.JButton removeParamBtn;
    private javax.swing.JButton addGoalToDBBtn;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton injectGoalBtn;
    private javax.swing.JButton injectPackBtn;
    private javax.swing.JButton removeGoalBtn;
    private javax.swing.JButton goalInfoBtn;
    private javax.swing.JButton chooseCfgFileBtn;
    private javax.swing.JButton submitDBconfigBtn;
    private javax.swing.JButton setDBconfigAsDefault;
    private javax.swing.JButton stopMUSABtn;
    private javax.swing.JButton startMUSABtn;
    private javax.swing.JButton loadJasonFromFileBtn;
    private javax.swing.JButton aboutMUSAbtn;
    private javax.swing.JButton mergeAndInjectGoalsBtn;
    private javax.swing.JButton mergeAndSaveBtn;
    private javax.swing.JButton loadPackABtn;
    private javax.swing.JButton loadPackBBtn;
    private JTextArea goalTextArea_A;
    private JTextArea goalTextArea_B;
    private javax.swing.JComboBox goalsComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList goalSPECparamList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jasonBeliefTextArea;
    private javax.swing.JTextField goalNameTextField;
    private javax.swing.JTextField goalPackTextField;
    private javax.swing.JTextField goalDescriptionTextField;
    private javax.swing.JTextField dbPasswordTextField;
    private javax.swing.JTextField configFilePathTextField;    
    private javax.swing.JTextField varNameTextField;
    private javax.swing.JTextField varValueTextField;
    private javax.swing.JTextField dbIPTextField;
    private javax.swing.JTextField dbPortTextField;
    private javax.swing.JTextField dbNameTextField;
    private javax.swing.JTextField dbUserTextField;
    // End of variables declaration        
    
    private HashMap<String,String> paramsTable;
    private String selectedGoalName 			= null;
	private String selectedGoalPack 			= null;
	private String selectedGoalDescription 		= null;
	private DefaultListModel  list_model;
	private JPanel panel_1;
}
