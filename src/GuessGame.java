import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class GuessGame {
	    private JFrame frame;
	    private JLabel lb1, lb2,lb3;
	    private JTextField tf1;
	    private JButton btn1, btn2, btn3;

	    public GuessGame(){
	    	Random ran = new Random();
	    	int ans = ran.nextInt(100);
	        // �إ� JFrame ����A�P�ɳ]�w���D
	        frame = new JFrame("�q�Ʀr�C��");
	        // �]�w�G��
	        frame.setLayout(null);
	        
	        // �إ߼���
	        lb1 = new JLabel("�п�J0-100���Ʀr : ");
	        lb1.setBounds(5, 5, 200, 20); // �]�w����y��
	        frame.add(lb1); // �N����[�J����
	        
	        // �إߤ�r��
	        tf1 = new JTextField();
	        tf1.setBounds(107, 5, 100, 20); // �]�w����y��
	        frame.add(tf1); // �N����[�J����
	        
	        // �إ�"�T�{"���s 
	        btn1 = new JButton("�e�X");
	        btn1.setBounds(5, 37, 100, 20); // �]�w����y��
	        frame.add(btn1); // �N����[�J����
	        btn1.addActionListener(new ActionListener() { // ���U�ƥ�A�ϥΰΦW���O���ΦW����
	            // �B�zĲ�o���ƥ�
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try{
	        	    	if(Integer.parseInt(tf1.getText()) == ans) {
	        	    		lb2.setText("����F!  �ӱj�F�a!");
	        	    	}else {
	        	    	    lb2.setText("�q���o!  �[�o�n��!");
	        	    	}
	                }catch(Exception ex){
	                    // JOptionPane �i�H���P�u�X�@�Ӽзǹ�ܮ�
	                    JOptionPane.showMessageDialog(null, "�п�J�Ʀr", "��J���~", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
	        
	        // �إ�"�M��"���s
	        btn2 = new JButton("�M��");
	        btn2.setBounds(107, 37, 100, 20); // �]�w����y��
	        frame.add(btn2); // �N����[�J����
	        btn2.addActionListener(new ActionListener() { // ���U�ƥ�A�ϥΰΦW���O���ΦW����
	            // �B�zĲ�o���ƥ�
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                tf1.setText(""); // �N��r�زM��
	                lb2.setText(""); // �N lb2 ���ҲM��
	            }

	        });
	        
	        // �إ�"�I�ڬݵ���"���s
	        btn3 = new JButton("�n��! �I�ڬݵ���");
	        btn3.setBounds(5, 70, 150, 20); // �]�w����y��
	        frame.add(btn3); // �N����[�J����
	        btn3.addActionListener(new ActionListener() { // ���U�ƥ�A�ϥΰΦW���O���ΦW����
	            // �B�zĲ�o���ƥ�
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               lb3.setText("���׬O " + ans);
	            }

	        });
	        
	        // �إ߼���
	        lb2 = new JLabel("");
	        lb2.setBounds(220, 5, 100, 20); // �]�w����y��
	        frame.add(lb2); // �N����[�J����
	        
	        // �]�w�����j�p
	        frame.setSize(350, 150);
	        // ��ܵ���
	        frame.setVisible(true);
	        
	        // �إ߼���
	        lb3 = new JLabel("");
	        lb3.setBounds(5, 100, 200, 40); // �]�w����y��
	        frame.add(lb3); // �N����[�J����
	        
	        // �]�w�����j�p
	        frame.setSize(350, 200);
	        // ��ܵ���
	        frame.setVisible(true);
	        
	        String path = "/resource/numbers.png";
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Guess.class.getResource(path)));;
	        
			frame.setLocationRelativeTo(null);
			// JFrame �����������]�w�A���o�@��~�൲���{��
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	
}
