import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MainForm extends JFrame implements ActionListener{
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuFile = new JMenu("File");
	private JMenu menuOption = new JMenu("Option");
	private JMenuItem menuFileLogin = new JMenuItem("Login");
	private JMenuItem menuFileRegister = new JMenuItem("Register");
	
	private LoginForm loginForm;
	private JDesktopPane jdPane = new JDesktopPane();

	
	public MainForm() {
		add(jdPane);
		
		menuBar.add(menuFile);
		menuFile.add(menuFileLogin);
		menuFile.add(new JSeparator());
		menuFile.add(menuFileRegister);
		menuBar.add(menuOption);
		
		setJMenuBar(menuBar);
		
		menuFileLogin.addActionListener(this);
		
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MainForm();
	}
	
	public void doLogin() {
		menuOption.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj.equals(menuFileLogin)) {
			if(loginForm == null || loginForm.isClosed()) {
				loginForm = new LoginForm(this);
				jdPane.add(loginForm);
			}
		}
	}

}
