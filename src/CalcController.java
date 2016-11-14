import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController implements ActionListener {
	private CalModel m;
	private CalcView v;

	public CalcController(CalModel m) {
		this.m = m;
	}

	public void setView(CalcView v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String action = arg0.getActionCommand();
		int firstValue = v.getFirstValue();
		int secondValue = v.getSecondValue();
		
		if(action.equals(v.add())){
			m.add(firstValue, secondValue);
		}
		else if(action.equals(v.sub())){
			m.sub(firstValue, secondValue);
		}
		else if(action.equals(v.mul())){
			m.mul(firstValue, secondValue);
		}
		else if(action.equals(v.div())){
			m.div(firstValue, secondValue);
		}
		
	}
}
