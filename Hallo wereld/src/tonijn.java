
public class tonijn {
	private String meisjesName;
	public void SetName (String name) {
		meisjesName=name;
	}
	public String getName () {
		return meisjesName;
	}
	public void saying () {
		System.out.printf("Jouw eerste vriendin was %s", getName ());
	}

}
