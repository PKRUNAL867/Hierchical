package hire_example;

public class Employee extends person {
	private String dep;

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [dep=" + dep + "]";
	}

}
