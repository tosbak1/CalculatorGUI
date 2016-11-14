
public class Run {
	public static void main(String[] args) {
		CalModel m = new CalModel();
		CalcController c = new CalcController(m);
		CalcView v = new CalcView(c);
		c.setView(v);

		m.addObserver(v);
	}
}
