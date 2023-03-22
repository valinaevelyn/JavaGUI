import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainForm extends JFrame implements ActionListener, WindowListener, MouseListener{
	private JPanel panel_north = new JPanel();
	private JLabel lbl_register = new JLabel("REGISTRATION");
	
	private JPanel panel_center = new JPanel();
	private JTextField txt_username = new JTextField();
	private JPasswordField txt_password = new JPasswordField();
	private JTextArea txt_address = new JTextArea();
	private JComboBox<String> combo_hobby = new JComboBox<>();
	private JRadioButton radio_male = new JRadioButton("Male");
	private JRadioButton radio_female = new JRadioButton("Female");
	
	private JPanel panel_south = new JPanel();
	private JButton btn_submit = new JButton("Submit");
	private JButton btn_clear = new JButton("Clear");
	
	public void initComponents() {
		setLayout(new BorderLayout());
		
		//Header
		panel_north.setLayout(new FlowLayout());
		panel_north.add(lbl_register);
		add(panel_north, "North");
		
		//Content
		panel_center.setLayout(new GridLayout(6, 2));
		
		panel_center.add(new JLabel("Username"));
		panel_center.add(txt_username);
		
		panel_center.add(new JLabel("Password"));
		panel_center.add(txt_password);
		
		panel_center.add(new JLabel("Address"));
		panel_center.add(txt_address);
		
		panel_center.add(new JLabel("Hobby"));
		combo_hobby.addItem("Makan");
		combo_hobby.addItem("Mendengarkan Musik");
		combo_hobby.addItem("Membaca Buku");
		panel_center.add(combo_hobby);
		
		panel_center.add(new JLabel("Gender"));
		JPanel panel_gender = new JPanel();
		panel_gender.setLayout(new GridLayout(2,1));
		ButtonGroup bg_gender = new ButtonGroup();
		bg_gender.add(radio_male);
		bg_gender.add(radio_female);
		panel_gender.add(radio_male);
		panel_gender.add(radio_female);
		panel_center.add(panel_gender);
		
		add(panel_center, "Center");
		
		
		//Footer
		panel_south.setLayout(new FlowLayout());
		panel_south.add(btn_submit);
		btn_submit.addActionListener(this);
		panel_south.add(btn_clear);
		btn_clear.addActionListener(this);
		add(panel_south, "South");
		
		setTitle("Registration Form");
		setVisible(true);
		setSize(400, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public MainForm() {
		initComponents();
	}
	
	public static void main(String[] args) {
		new MainForm();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj.equals(btn_submit)) {
			String username = txt_username.getText();
			String password = txt_password.getPassword().toString();
			String gender = "";
			
			if(radio_male.isSelected()) {
				gender = "Male";
			}else if(radio_female.isSelected()) {
				gender = "Female";
			}
			
			String hobby = combo_hobby.getSelectedItem().toString();
			
			if(username.equals("")) {
				JOptionPane.showMessageDialog(null, "Username Must be Filled");
			}else {
				JOptionPane.showMessageDialog(null, "Success");
				System.exit(0);
			}
			
			
		}else if(obj.equals(btn_clear)) {
			txt_username.setText("");
			txt_password.setText("");
			txt_address.setText("");
			radio_female.setSelected(false);
			radio_male.setSelected(false);
		}
	}

}
