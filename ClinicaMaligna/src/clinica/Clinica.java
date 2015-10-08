package clinica;

import java.awt.Font;

import javax.swing.UIManager;

import clinica.frames.*;

public class Clinica{

	
	public static LoginFrame loginTela;
	
	
	public static void main(String[] args) {
		//definir fontes
		UIManager.put("Button.font", new Font("Calibri",Font.PLAIN,16) );
		UIManager.put("TextField.font", new Font("Arial",Font.PLAIN,14));
		UIManager.put("Table.font", new Font("Arial",Font.PLAIN,14));
		UIManager.put("Label.font", new Font("Arial",Font.PLAIN,14));
		
		loginTela = new LoginFrame();

	}

}
