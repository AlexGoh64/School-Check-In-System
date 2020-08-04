
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentForm extends JFrame {
    static StudentForm frame;
    private JPanel contentpane;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JLabel jlabel;
    public int i=1;
    
    
    public static void main(String args[]) {
        		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StudentForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }
     
        public StudentForm(){
            

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setBackground(java.awt.Color.lightGray);
        setForeground(java.awt.Color.lightGray);
        contentpane = new JPanel();
        contentpane.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        contentpane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contentpane.setForeground(new java.awt.Color(255, 255, 255));
        
        jlabel = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        

        
        jlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlabel.setForeground(java.awt.Color.gray);
        jlabel.setText("Student Check In");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel2.setText("Student ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel3.setText("Temperature (c):");

        jTextField1.setBackground(java.awt.Color.white);

        jTextField2.setBackground(java.awt.Color.white);

        jTextField3.setBackground(java.awt.Color.white);
        
        jButton1 = new JButton();
        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton1.setForeground(java.awt.Color.darkGray);
        jButton1.setText("Check In");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=jTextField1.getText();
                String studentid=jTextField2.getText();
                String temperature=jTextField3.getText();
                
                try {
                    StudentDao.save(name,studentid,temperature);
                } catch (IOException ex) {
                    Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(StudentForm.this,"Checked in successfully!");
                StudentForm.main(new String[]{});
                frame.dispose();
                
            }
        });
        jButton2 = new JButton();
        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton2.setForeground(java.awt.Color.darkGray);
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                AdminSuccess.main(new String[]{});
                frame.dispose();             
            }
        });

        javax.swing.GroupLayout contentpaneLayout = new javax.swing.GroupLayout(contentpane);
        contentpane.setLayout(contentpaneLayout);
        contentpaneLayout.setHorizontalGroup(
            contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentpaneLayout.createSequentialGroup()
                .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentpaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentpaneLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3))
                            .addGroup(contentpaneLayout.createSequentialGroup()
                                .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)))))
                    .addGroup(contentpaneLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentpaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        contentpaneLayout.setVerticalGroup(
            contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentpaneLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

    }

                
}
