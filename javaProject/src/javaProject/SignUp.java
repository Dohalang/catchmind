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
	JLabel lblName = new JLabel("�̸� : ");
	JLabel lblBurth = new JLabel("������� : ");
	JLabel lblId = new JLabel("ID : ");
	JButton btnIdCheck = new JButton("�ߺ� Ȯ��");
	JLabel lblPwd = new JLabel("��й�ȣ : ");
	JLabel lblPwdCheck = new JLabel("��й�ȣ Ȯ�� : ");
	JLabel lblPhone = new JLabel("�ڵ��� ��ȣ : ");
	JLabel lblEmail = new JLabel("�̸��� : ");
	JTextField txtName = new JTextField(12);
	JTextField txtBurth = new JTextField(12);
	JTextField txtId = new JTextField(12);
	JPasswordField txtPwd = new JPasswordField(12);
	JPasswordField txtPwdCheck = new JPasswordField(12);
	JTextField txtPhone = new JTextField(12);
	JTextField txtEmail = new JTextField(12);
	JButton btnLogin = new JButton("ȸ������");
	JButton btnCancel = new JButton("���");
	
	
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

	setTitle("ȸ������");
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