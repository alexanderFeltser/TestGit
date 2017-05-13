import java.util.ArrayList;
import java.util.List;

public class TestGit {
	private List<String> names;

	public TestGit(List<String> names) {

		this.names = names;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public TestGit() {
		this.names = new ArrayList<String>();
		this.names.add("Anatoly");
		this.names.add("Sasha");
	}

	public static void main(String[] args) {
		TestGit test = new TestGit();
		System.out.println("First line");
		System.out.println("Second line , after commit");
		System.out.println("third line ");
		System.out.println(test.getNames().toString());
	}
}
