import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class LoginForm extends JInternalFrame implements ActionListener{
	private JButton btnLogin = new JButton("Login");
	private MainForm mainForm;
	
	public LoginForm(MainForm mainForm) {
		this.mainForm = mainForm;
		
		setLayout(new FlowLayout());
		add(btnLogin);
		btnLogin.addActionListener(this);
		
		setTitle("Login Form");
		setClosable(true);
		setSize(200, 400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj.equals(btnLogin)) {
			mainForm.doLogin();
			dispose();
		}
	}
}
