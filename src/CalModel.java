import java.util.Observable;

public class CalModel extends Observable{
	private int result;
	
	public void add(int a, int b){
		this.result = a+b;
		this.setChanged();
		this.notifyObservers(Integer.toString(this.getResult()));
	}
	
	public void sub(int a, int b){
		this.result = a-b;
		this.setChanged();
		this.notifyObservers(Integer.toString(this.getResult()));
	}
	
	public void div(int a, int b){
		if(b != 0){
			this.result = a/b;
			this.setChanged();
			this.notifyObservers(Integer.toString(this.getResult()));
		}
	}
	
	public void mul(int a, int b){
			this.result = a*b;
			this.setChanged();
			this.notifyObservers(Integer.toString(this.getResult()));
	}	
	
	
	public int getResult(){
		return this.result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
