package Components;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;


public class RibbonButton extends JButton{
	
	private static final long serialVersionUID = 1L;

	public RibbonButton(String s , String t){
		
		super(s);

		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				setContentAreaFilled(true);
				setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setContentAreaFilled(false);
				setOpaque(false);
			}


			
		});

		setContentAreaFilled(false);
		setOpaque(false);
		
		setToolTipText(t);
	}
	
	public void setAccelerator(KeyStroke stroke){
		
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(stroke, 0);
		getActionMap().put(0, new AbstractAction() {
			
			private static final long serialVersionUID = -8218382033869091796L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				doClick();
			}
		});
	}
}

