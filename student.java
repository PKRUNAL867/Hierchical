package hire_example;

public class student extends Employee{

	private  String div;

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}
	@Override
	public String toString() {
		return "[Div=" + getDiv() + ", Name="+ getName() + ", City=" + getCity()+",Department="+ getDep()+"]";


	
	}
}
	

