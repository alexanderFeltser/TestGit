import java.util.ArrayList;
import java.util.List;

public class TestGit {
	private List<String> names;
	private List<List<String>> teams;

	public TestGit(List<String> names) {

		this.names = names;
		teams = new ArrayList<>();
		teams.add(names);

	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Anatoly");
		nameList.add("Sasha");

		TestGit test = new TestGit(nameList);
		System.out.println("First line");
		System.out.println("Second line , after commit");
		System.out.println("third line ");
		System.out.println(test.getNames().toString());
	}
}
