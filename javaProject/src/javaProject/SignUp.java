package javaProject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame {
	
	public SignUp(){
	JPanel panel = new JPanel();
	JLabel lblName = new JLabel("이름 : ");
	JLabel lblBurth = new JLabel("생년월일 : ");
	JLabel lblId = new JLabel("ID : ");
	JButton btnIdCheck = new JButton("중복 확인");
	JLabel lblPwd = new JLabel("비밀번호 : ");
	JLabel lblPwdCheck = new JLabel("비밀번호 확인 : ");
	JLabel lblPhone = new JLabel("핸드폰 번호 : ");
	JLabel lblEmail = new JLabel("이메일 : ");
	JTextField txtName = new JTextField(12);
	JTextField txtBurth = new JTextField(12);
	JTextField txtId = new JTextField(12);
	JPasswordField txtPwd = new JPasswordField(12);
	JPasswordField txtPwdCheck = new JPasswordField(12);
	JTextField txtPhone = new JTextField(12);
	JTextField txtEmail = new JTextField(12);
	JButton btnLogin = new JButton("회원가입");
	JButton btnCancel = new JButton("취소");
	
	
	panel.add(lblName);
	panel.add(txtName);
	panel.add(lblBurth);
	panel.add(txtBurth);	
	panel.add(lblId);
	panel.add(txtId);
	panel.add(btnIdCheck);
	panel.add(lblPwd);
	panel.add(txtPwd);
	panel.add(lblPwdCheck);
	panel.add(txtPwdCheck);
	panel.add(lblPhone);
	panel.add(txtPhone);
	panel.add(lblEmail);
	panel.add(txtEmail);
	panel.add(btnCancel);
	panel.add(btnLogin);
	
	
	add(panel);

	setTitle("회원가입");
	setVisible(true);
	setSize(800,600);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	new SignUp();
	
}
}