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
		metodoMagico(txtTexto1, 0, 0, 2, 1);
		
		JLabel txtTexto7 = new JLabel("Preview");
		metodoMagico(txtTexto7, 4, 0, 1, 1);
		
		JLabel txtTexto2 = new JLabel("Form Options");
		metodoMagico(txtTexto2, 0, 2, 1, 1);
		
		JLabel txtTexto3 = new JLabel("Include the following:");
		metodoMagico(txtTexto3, 0, 4, 1, 1);
		
		JCheckBox check1 = new JCheckBox("a title for your form");
		metodoMagico(check1, 0, 5, 1, 1);
		
		JTextField caja1 = new JTextField(10);
		metodoMagico(caja1, 0, 6, 2, 1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton opcion1 = new JRadioButton("only required fields");
		bg.add(opcion1);
		metodoMagico(opcion1, 0, 8, 1, 1);
		JRadioButton opcion2 = new JRadioButton("all fields");
		bg.add(opcion2);
		metodoMagico(opcion2, 0, 9, 1, 1);
		
		JLabel txtTexto4 = new JLabel("(edit required fields in the form builder)");
		metodoMagico(txtTexto4, 0, 10, 2, 1);
		
		JCheckBox check2 = new JCheckBox("interest group fields");
		metodoMagico(check2, 0, 12, 1, 1);
		JCheckBox check3 = new JCheckBox("required field indicators");
		metodoMagico(check3, 0, 13, 1, 1);
		
		JLabel txtTexto5 = new JLabel("Set form width");
		metodoMagico(txtTexto5, 0, 14, 1, 1);
		JTextField caja2 = new JTextField(10);
		metodoMagico(caja2, 0, 15, 2, 1);
		
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
