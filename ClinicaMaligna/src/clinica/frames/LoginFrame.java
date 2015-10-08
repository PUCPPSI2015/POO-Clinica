package clinica.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;






import javax.swing.*;


public class LoginFrame extends JFrame implements WindowListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//botoes
	private JTextField idCampo, senhaCampo;
	private JButton submitBotao;
	
	public LoginFrame(){
		this.setSize(480, 480);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Login");
		this.setLocationRelativeTo(null);
		addWindowListener(this);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBorder( BorderFactory.createLoweredBevelBorder() );
		
		JPanel panel = new JPanel();
		panel.setLayout( new GridBagLayout() );
		panel.setBorder( BorderFactory.createEmptyBorder(30,0,15,45) );
		
		addGridItem(panel, new JLabel("ID: "), 0, 0, 1, 1, GridBagConstraints.EAST);
		addGridItem(panel, new JLabel("Senha : "), 0, 1, 1, 1, GridBagConstraints.EAST);
		
		idCampo = new JTextField(16);
		senhaCampo = new JTextField(16);
		
		addGridItem(panel, idCampo, 1, 0, 1, 1, GridBagConstraints.WEST);
		addGridItem(panel, senhaCampo, 1, 1, 1, 1, GridBagConstraints.WEST);
		
		submitBotao = new JButton("Logar nessa joça!!!!!!");
		
		OnButtonClickListener handle = new OnButtonClickListener();
		submitBotao.addActionListener(handle);
		
		addGridItem(panel, submitBotao, 1, 5, 1, 1, GridBagConstraints.WEST);
		
		loginPanel.add(panel); 
		this.add(loginPanel);
		this.setVisible(true); 
		
		
	}
	/* metodo para posicionar os negocio direito */
	private void addGridItem(JPanel p, JComponent c, int x, int y, int width, int height, int align)
	{
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;      
		gc.gridheight = height;    
		gc.weightx = 100.0;
		gc.weighty = 100.0;
		gc.insets = new Insets(5,5,5,5);    //margin interno
		gc.anchor = align;
		gc.fill = GridBagConstraints.NONE;
		p.add(c,  gc);
	}
	/** Inner class para captiurar evento de click */
	private class OnButtonClickListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			String Senha, ID;
			
			if (event.getSource() == submitBotao)
			{
				
				ID = idCampo.getText();
				Senha = senhaCampo.getText();
				
				
				if ( ID.equals("") || Senha.equals("")  )
				{
					JOptionPane.showMessageDialog(	LoginFrame.this, 
							"Favor preencher os campos", "Message", JOptionPane.INFORMATION_MESSAGE);
					idCampo.requestFocus();    
				}	

				else if ( ID.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*") == true )
				{
					JOptionPane.showMessageDialog(	LoginFrame.this, 
							"Campo nome errado", "Message", JOptionPane.INFORMATION_MESSAGE);			
					idCampo.requestFocus();   
				}
			}
		}

		
	}
	
	
	public void windowClosed(WindowEvent e) {
		
    }

    public void windowOpened(WindowEvent e) {
    	
    }

    public void windowIconified(WindowEvent e) {
        
    }

    public void windowDeiconified(WindowEvent e) {
        
    }

    public void windowActivated(WindowEvent e) {
        
    }

    public void windowDeactivated(WindowEvent e) {
        
    }

    public void windowGainedFocus(WindowEvent e) {
      
    }

    public void windowLostFocus(WindowEvent e) {
        
    }

    public void windowStateChanged(WindowEvent e) {
       
    }
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}


