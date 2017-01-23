import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class GUIiRadio 
{

	private JFrame frmSomy;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btnSubir;
	private JButton btnBajar;
	private JButton btnAmFm;
	private JButton btnOnoff;
	private JLabel lblEstacion;
	
	private Radio llamarRadio = new Radio();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIiRadio window = new GUIiRadio();
					window.frmSomy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIiRadio() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmSomy = new JFrame();
		frmSomy.setResizable(false);
		frmSomy.setTitle("SOMY");
		frmSomy.setBounds(100, 100, 360, 250);
		frmSomy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmSomy.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRadioSomy = new JLabel("Radio SOMY");
		lblRadioSomy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRadioSomy.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadioSomy.setBounds(117, 11, 119, 33);
		panel.add(lblRadioSomy);
		
		lblEstacion = new JLabel("0.00");
		lblEstacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstacion.setBounds(145, 118, 64, 14);
		panel.add(lblEstacion);
		
		btnBajar = new JButton("-");
		btnBajar.setBounds(89, 114, 46, 23);
		btnBajar.addActionListener(new JButtonL());
		panel.add(btnBajar);
		
		btnSubir = new JButton("+");
		btnSubir.setBounds(219, 114, 46, 23);
		btnSubir.addActionListener(new JButtonL());
		panel.add(btnSubir);
		
		btn1 = new JButton("1");
		btn1.setBounds(10, 148, 46, 23);
		btn1.addActionListener(new JButtonL());
		panel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(67, 148, 46, 23);
		btn2.addActionListener(new JButtonL());
		panel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(124, 148, 46, 23);
		btn3.addActionListener(new JButtonL());
		panel.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(181, 148, 46, 23);
		btn4.addActionListener(new JButtonL());
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(238, 148, 46, 23);
		btn5.addActionListener(new JButtonL());
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(295, 148, 46, 23);
		btn6.addActionListener(new JButtonL());
		panel.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 182, 46, 23);
		btn7.addActionListener(new JButtonL());
		panel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(67, 182, 46, 23);
		btn8.addActionListener(new JButtonL());
		panel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(124, 182, 46, 23);
		btn9.addActionListener(new JButtonL());
		panel.add(btn9);
		
		btn10 = new JButton("10");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn10.setBounds(181, 182, 46, 23);
		btn10.addActionListener(new JButtonL());
		panel.add(btn10);
		
		btn11 = new JButton("11");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn11.setBounds(238, 182, 46, 23);
		btn11.addActionListener(new JButtonL());
		panel.add(btn11);
		
		btn12 = new JButton("12");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn12.addActionListener(new JButtonL());
		btn12.setBounds(295, 182, 46, 23);
		panel.add(btn12);
		
		btnAmFm = new JButton("AM / FM");
		btnAmFm.setBounds(138, 81, 77, 23);
		btnAmFm.addActionListener(new JButtonL());
		panel.add(btnAmFm);
		
		btnOnoff = new JButton("On / Off");
		btnOnoff.setBounds(131, 47, 89, 23);
		btnOnoff.addActionListener(new JButtonL());		
		panel.add(btnOnoff);
	}
	
	public void Encender(boolean isOn)
	{
		btn1.setEnabled(isOn);
		btn2.setEnabled(isOn);
		btn3.setEnabled(isOn);
		btn4.setEnabled(isOn);
		btn5.setEnabled(isOn);
		btn6.setEnabled(isOn);
		btn7.setEnabled(isOn);
		btn8.setEnabled(isOn);
		btn9.setEnabled(isOn);
		btn10.setEnabled(isOn);
		btn11.setEnabled(isOn);
		btn12.setEnabled(isOn);
		btnAmFm.setEnabled(isOn);
		btnAmFm.setEnabled(isOn);
		btnSubir.setEnabled(isOn);
		btnBajar.setEnabled(isOn);
	}
	
	private class JButtonL implements ActionListener, MouseListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if (e.getSource().equals(btnOnoff))
			{
				Encender(llamarRadio.isOn());
				llamarRadio.OnOff();
			}
			
			if (e.getSource().equals(btnSubir))
			{
				llamarRadio.Forward();
				lblEstacion.setText(Double.toString(Math.round(Float.parseFloat(llamarRadio.getStation())*10)/10.0));
			}
			
			if (e.getSource().equals(btnBajar))
			{
				llamarRadio.Backward();
				lblEstacion.setText(Double.toString(Math.round(Float.parseFloat(llamarRadio.getStation())*10)/10.0));
			}
			
			if(e.getSource().equals(btnAmFm))
			{
				llamarRadio.changeFrecuency();
			}
			
			if (e.getSource().equals(btn1) || e.getSource().equals(btn2) || e.getSource().equals(btn3) || e.getSource().equals(btn4) || 
					e.getSource().equals(btn5) || e.getSource().equals(btn6) || e.getSource().equals(btn7) || e.getSource().equals(btn8) || 
					e.getSource().equals(btn9) || e.getSource().equals(btn10) || e.getSource().equals(btn11) || e.getSource().equals(btn12))
			{
				llamarRadio.setMemory(Integer.parseInt(((JButton) e.getSource()).getText())-1);
				System.out.println(Double.parseDouble(((JButton) e.getSource()).getText())-1);
				System.out.println(llamarRadio.Memorias[Integer.parseInt(((JButton) e.getSource()).getText())-1].station);
			}
		}
		
		@Override
		public void mousePressed(MouseEvent a) 
		{
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseClicked(MouseEvent e) {
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

		public void mouseReleased(MouseEvent e) 
		{
			
		}
	}
}
