package javaProject;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {
	public static void main(String[] args) {
		new Login();
	}
	
	public Login() {
		JPanel panel = new JPanel();
		JLabel lblId = new JLabel("ID : ");
		JLabel lblPwd = new JLabel("비밀번호 : ");
		JTextField txtID = new JTextField(12);
		JPasswordField txtPwd = new JPasswordField(10);
		JButton btnLogin = new JButton("로그인");
		JButton btnIdFind = new JButton("ID 찾기");
		JButton btnPwdFind = new JButton("비밀번호 찾기");
		JButton btnSingUp = new JButton("회원가입");
		panel.setLayout( null );
		
		btnLogin.setBounds(500, 180, 120, 50);
		btnIdFind.setBounds(350, 300, 120, 50);
		btnPwdFind.setBounds(500, 300, 120, 50);
		btnSingUp.setBounds(200, 300, 120, 50);
		lblId.setBounds(300, 155, 100, 50);
		txtID.setBounds(320, 170, 150, 20);
		lblPwd.setBounds(260, 200, 100, 50);
		txtPwd.setBounds(320, 215, 150, 20);
		
		panel.add(lblId);
		panel.add(txtID);
		panel.add(lblPwd);
		panel.add(txtPwd);
		panel.add(btnLogin);
		panel.add(btnPwdFind);
		panel.add(btnIdFind);
		panel.add(btnSingUp);
		
		
		
		add(panel);
		
		
		setTitle("Login");
		setVisible(true);
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


}
