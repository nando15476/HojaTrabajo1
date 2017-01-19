import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIRadio extends JFrame {
	
	Control radio = new Control();
	JButton buttonMenos;
	JButton buttonMas;
	JButton btnApagar;
	JButton btnFm;
	JButton btnAm;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton button11;
	JButton button12;
	
	JLabel labelAmFm;
	JLabel lblEstacionActual;
	
	boolean AmFm;
	boolean apagado = false;
	boolean guardar = true;
	
	double[] am = new double[12];
	double[] fm = new double[12];
	
	
	private JPanel contentPane;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRadio frame = new GUIRadio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIRadio() {
		Action accion = new Action();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRadio = new JLabel("RADIO");
		lblRadio.setBounds(242, 11, 58, 14);
		contentPane.add(lblRadio);
		
		JLabel lblEstacion = new JLabel("Estacion");
		lblEstacion.setBounds(64, 68, 53, 14);
		contentPane.add(lblEstacion);
		
		buttonMenos = new JButton("-");
		buttonMenos.setBounds(10, 92, 41, 29);
		contentPane.add(buttonMenos);
		buttonMenos.addActionListener(accion);
		
		lblEstacionActual = new JLabel("87.9");
		lblEstacionActual.setBounds(53, 93, 53, 27);
		contentPane.add(lblEstacionActual);
		
		buttonMas = new JButton("+");
		buttonMas.setBounds(116, 91, 41, 29);
		contentPane.add(buttonMas);
		buttonMas.addActionListener(accion);
		
		btnApagar = new JButton("Apagar");
		btnApagar.setBounds(10, 7, 89, 23);
		contentPane.add(btnApagar);
		btnApagar.addActionListener(accion);
		
		btnFm = new JButton("FM");
		btnFm.setBounds(437, 7, 53, 23);
		contentPane.add(btnFm);
		btnFm.addActionListener(accion);
		
		btnAm = new JButton("AM");
		btnAm.setBounds(374, 7, 53, 23);
		contentPane.add(btnAm);
		btnAm.addActionListener(accion);
		
		button1 = new JButton("1");
		button1.setBounds(211, 123, 53, 23);
		contentPane.add(button1);
		button1.addActionListener(accion);
		
		button2 = new JButton("2");
		button2.setBounds(274, 123, 53, 23);
		contentPane.add(button2);
		button2.addActionListener(accion);
		
		button3 = new JButton("3");
		button3.setBounds(337, 123, 53, 23);
		contentPane.add(button3);
		button3.addActionListener(accion);
		
		button4 = new JButton("4");
		button4.setBounds(400, 123, 55, 23);
		contentPane.add(button4);
		button4.addActionListener(accion);
		
		button5 = new JButton("5");
		button5.setBounds(211, 157, 53, 23);
		contentPane.add(button5);
		button5.addActionListener(accion);
		
		button6 = new JButton("6");
		button6.setBounds(274, 157, 53, 23);
		contentPane.add(button6);
		button6.addActionListener(accion);
		
		button7 = new JButton("7");
		button7.setBounds(337, 157, 53, 23);
		contentPane.add(button7);
		button7.addActionListener(accion);
		
		button8 = new JButton("8");
		button8.setBounds(400, 157, 55, 23);
		contentPane.add(button8);
		button8.addActionListener(accion);
		
		button9 = new JButton("9");
		button9.setBounds(211, 191, 53, 23);
		contentPane.add(button9);
		button9.addActionListener(accion);
		
		button10 = new JButton("10");
		button10.setBounds(274, 191, 53, 23);
		contentPane.add(button10);
		button10.addActionListener(accion);
		
		button11 = new JButton("11");
		button11.setBounds(339, 191, 53, 23);
		contentPane.add(button11);
		button11.addActionListener(accion);
		
		button12 = new JButton("12");
		button12.setBounds(402, 191, 53, 23);
		contentPane.add(button12);
		button12.addActionListener(accion);
		
		JLabel lblPresets = new JLabel("PreSets");
		lblPresets.setBounds(307, 99, 46, 14);
		contentPane.add(lblPresets);
		
		labelAmFm = new JLabel("FM");
		labelAmFm.setBounds(237, 33, 46, 14);
		contentPane.add(labelAmFm);
		
		btnFm.setVisible(false);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(242, 64, 111, 23);
		contentPane.add(btnGuardar);
		btnGuardar.addActionListener(accion);
		
	}
	
	public void Encender(boolean encendido){
		button1.setEnabled(encendido);
		button2.setEnabled(encendido);
		button3.setEnabled(encendido);
		button4.setEnabled(encendido);
		button5.setEnabled(encendido);
		button6.setEnabled(encendido);
		button7.setEnabled(encendido);
		button8.setEnabled(encendido);
		button9.setEnabled(encendido);
		button10.setEnabled(encendido);
		button11.setEnabled(encendido);
		button12.setEnabled(encendido);
		buttonMas.setEnabled(encendido);
		buttonMenos.setEnabled(encendido);
		btnGuardar.setEnabled(encendido);
	}
	
	public class Action implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			JButton boton = (JButton) e.getSource();
			
			if(labelAmFm.getText().equals("AM")){
				AmFm = true;
			}
			else{
				AmFm = false;
			}
			if(e.getSource().equals(buttonMenos)){
				lblEstacionActual.setText(Double.toString(radio.estacion
						(AmFm, false, Double.parseDouble(lblEstacionActual.getText()))));
			}
			else if(e.getSource().equals(buttonMas)){
				lblEstacionActual.setText(Double.toString(radio.estacion
						(AmFm, true, Double.parseDouble(lblEstacionActual.getText()))));
			}
			else if(e.getSource().equals(btnAm)){
				labelAmFm.setText("AM");
				lblEstacionActual.setText("530");
				btnFm.setVisible(true);
				btnAm.setVisible(false);
			}
			else if(e.getSource().equals(btnFm)){
				labelAmFm.setText("FM");
				lblEstacionActual.setText("87.9");
				btnAm.setVisible(true);
				btnFm.setVisible(false);
			}
			else if(e.getSource().equals(btnApagar)){
				if(btnApagar.getText().equals("Apagar")){
					Encender(false);
					btnApagar.setText("Encender");
					if(AmFm == true){
						btnFm.setEnabled(false);
					}
					else{
						btnAm.setEnabled(false);
					}
				}
				else{
					Encender(true);
					btnApagar.setText("Apagar");
					if(AmFm == true){
						btnFm.setEnabled(true);
					}
					else{
						btnAm.setEnabled(true);
					}
				}
			}
			else if(e.getSource().equals(button1) || e.getSource().equals(button2) || e.getSource().equals(button3) || e.getSource().equals(button4) || 
						e.getSource().equals(button5) || e.getSource().equals(button6) || e.getSource().equals(button7) || e.getSource().equals(button8) || 
						e.getSource().equals(button9) || e.getSource().equals(button10) || e.getSource().equals(button11) || e.getSource().equals(button12)){
				if(AmFm == true){
					if(guardar == true){
						radio.guardar(Integer.parseInt(boton.getText()) - 1, Double.parseDouble(lblEstacionActual.getText()), am);
					}
					else{
						if(am[Integer.parseInt(boton.getText()) - 1] != 0.0){
							lblEstacionActual.setText(Double.toString(radio.seleccionar(Integer.parseInt(boton.getText()) - 1, Double.parseDouble(lblEstacionActual.getText()), am)));
						}
						else{
							JOptionPane.showMessageDialog(null,  "Este PreSet no tiene nada guardado", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
				else{
					if(guardar == true){
						radio.guardar(Integer.parseInt(boton.getText()) - 1, Double.parseDouble(lblEstacionActual.getText()), fm);
					}
					else{
						if(fm[Integer.parseInt(boton.getText()) - 1] != 0.0){
							lblEstacionActual.setText(Double.toString(radio.seleccionar(Integer.parseInt(boton.getText()) - 1, Double.parseDouble(lblEstacionActual.getText()), fm)));
						}
						else{
							JOptionPane.showMessageDialog(null,  "Este PreSet no tiene nada guardado", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
			else if(e.getSource().equals(btnGuardar)){
				if(guardar == true){
					btnGuardar.setText("Seleccionar");
					guardar = false;
				}
				else{
					btnGuardar.setText("Guardar");
					guardar = true;
				}
			}
		}
	}
}