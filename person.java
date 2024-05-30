package hire_example;

public class person {
	private String name,city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", city=" + city + "]";
	}
	

}
