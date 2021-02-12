import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;


class VentanaGrid extends JFrame{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	public VentanaGrid() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout");
		setLocationRelativeTo(null);
		setSize(800, 520);
		//setLayout(null);
		
		JLabel txtTexto1 = new JLabel("The clasic form includes all visible fields for this list");
		metodoMagico(txtTexto1, 0, 0, 1, 2);
		
		JLabel txtTexto2 = new JLabel("Form Options");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		metodoMagico(txtTexto2, 0, 2, 1, 1);
		
		JLabel txtTexto3 = new JLabel("Include the following:");
		metodoMagico(txtTexto3, 0, 3, 1, 1);
		
		JCheckBox check1 = new JCheckBox("a title for your form");
		metodoMagico(check1, 0, 5, 1, 1);
		
		JTextField caja1 = new JTextField(10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		metodoMagico(caja1, 0, 6, 1, 2);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton opcion1 = new JRadioButton("only required fields");
		bg.add(opcion1);
		metodoMagico(opcion1, 0, 8, 1, 1);
		JRadioButton opcion2 = new JRadioButton("all fields");
		bg.add(opcion2);
		metodoMagico(opcion2, 0, 9, 1, 1);
		
		JLabel txtTexto4 = new JLabel("(edit required fields in the form builder)");
		metodoMagico(txtTexto4, 0, 10, 1, 2);
		
		JCheckBox check2 = new JCheckBox("interest group fields");
		metodoMagico(check2, 0, 12, 1, 1);
		JCheckBox check3 = new JCheckBox("required field indicators");
		metodoMagico(check3, 0, 13, 1, 1);
		
		JLabel txtTexto5 = new JLabel("Set form width");
		metodoMagico(txtTexto5, 0, 14, 1, 1);
		JTextField caja2 = new JTextField(10);
		metodoMagico(caja2, 0, 15, 1, 2);
		
		JLabel txtTexto6 = new JLabel("Enhance your form");
		metodoMagico(txtTexto6, 0, 17, 1, 1);
		
		JCheckBox check4 = new JCheckBox("enable evil popup mode");
		metodoMagico(check4, 0, 18, 1, 1);
		JCheckBox check5 = new JCheckBox("disable all JavaScript");
		metodoMagico(check5, 0, 19, 1, 1);
		JCheckBox check6 = new JCheckBox("include archive link");
		metodoMagico(check6, 0, 20, 1, 1);
		JCheckBox check7 = new JCheckBox("include MonkeyRewards link");
		metodoMagico(check7, 0, 21, 1, 1);
		
		JLabel x = new JLabel("    ");
		metodoMagico(x, 3, 0, 20, 1);
		JLabel txtTexto7 = new JLabel("Preview");
		metodoMagico(txtTexto7, 4, 0, 1, 1);
		
		JLabel txtTexto8 = new JLabel("Email Adress");
		metodoMagico(txtTexto8, 4, 2, 1, 1);
		JFormattedTextField correo = new JFormattedTextField();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		metodoMagico(correo, 4, 3, 1, 3);
		
		JLabel txtTexto9 = new JLabel("First Name");
		metodoMagico(txtTexto9, 4, 5, 1, 1);
		JTextField caja3 = new JTextField(10);
		metodoMagico(caja3, 4, 6, 1, 3);
		
		JLabel txtTexto10 = new JLabel("Last Name");
		metodoMagico(txtTexto10, 4, 7, 1, 1);
		JTextField caja4 = new JTextField(10);
		metodoMagico(caja4, 4, 8, 1, 3);
		
		ImageIcon icono = new ImageIcon("src/img/icono.png");
		JButton btnSubscribe = new JButton();
		btnSubscribe.setIcon(icono);
		metodoMagico(btnSubscribe, 4, 10, 1, 2);
		
		JLabel txtTexto11 = new JLabel("Copy/ Paste onto your site");
		metodoMagico(txtTexto11, 4, 12, 1, 1);
		JTextArea area1 = new JTextArea();
		gbc.fill = GridBagConstraints.VERTICAL;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		area1.setLineWrap(true);
		area1.setWrapStyleWord(true);
		metodoMagico(area1, 4, 13, 7, 3);
		
		
		pack();
		setVisible(true);
	}
	
	public void metodoMagico(JComponent c, int gx, int gy, int gh, int gw) {
		gbc.gridx = gx;
		gbc.gridy= gy;
		gbc.gridheight = gh;
		gbc.gridwidth = gw;
		//gbc.fill = f;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	
}


public class ProgramaGridBag {

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaGrid();
				
			}
		});

	}

}
