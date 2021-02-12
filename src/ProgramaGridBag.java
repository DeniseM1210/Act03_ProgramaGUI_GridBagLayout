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
