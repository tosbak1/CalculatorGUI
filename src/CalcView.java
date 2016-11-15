import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CalcView extends JFrame implements Observer {
	private ActionListener listener;
	private JFrame frame;
	private JPanel panel;
	private JRadioButton add, sub, div, mul;
	private JTextField value1, value2, result;
	private JLabel value1Label, value2Label;
	private Border border;
	
	private CalModel cm;
	
	public CalcView(ActionListener al){
		this.listener = al;
		
		this.frame = new JFrame("Calculator");
		this.frame.setSize(300, 300);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,2));
		
		value1 = new JTextField();
		value2 = new JTextField();
		result = new JTextField();
		
		border = BorderFactory.createLineBorder(Color.BLACK);

		value1.setBorder(border);
		value2.setBorder(border);
		result.setBorder(border);
		
		
		value1.setEditable(true);
		value2.setEditable(true);
		result.setEditable(false);
		
		value1Label = new JLabel("Initial value");
		value2Label = new JLabel("Second value");
		
		add = new JRadioButton("Add");
		sub = new JRadioButton("Sub");
		div = new JRadioButton("Div");
		mul = new JRadioButton("Mul");

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(add);
		bgroup.add(sub);
		bgroup.add(div);
		bgroup.add(mul);
		
		add.addActionListener(listener);
		sub.addActionListener(listener);
		div.addActionListener(listener);
		mul.addActionListener(listener);
		
		panel.add(value1Label);
		panel.add(value1);
		panel.add(value2Label);
		panel.add(value2);
		panel.add(add);
		panel.add(sub);
		panel.add(div);
		panel.add(mul);
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(result, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	
	}
	
	public int getFirstValue(){
		return Integer.parseInt(value1.getText());
	}
	
	public int getSecondValue(){
		return Integer.parseInt(value2.getText());
	}
	
	public String add(){
		return this.add.getActionCommand();
	}
	public String sub(){
		return this.sub.getActionCommand();
	}
	public String div(){
		return this.div.getActionCommand();
	}
	public String mul(){
		return this.mul.getActionCommand();
	}
	
	public static void main(String[] args){
		CalModel cm = new CalModel();
		CalcController a = new CalcController(cm);
		CalcView cv = new CalcView(a);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String result = (String) arg;
		this.result.setText(result);
	}

}
