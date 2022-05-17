package ai.jobiak.collections;
import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		Course c1 = new Course("BCL1", "Computer Basics", 20, 500);
		Course c2 = new Course("PGL1", "Algorithms", 40, 2500);
		Course c3 = new Course("AdvProgL3", "Java Programming", 60, 5000);
		Course c4 = new Course("AdvProgL3", "Java Programming", 60, 5000);                                                        TreeSet courseTree=new TreeSet();
		courseTree.add(c1);
		courseTree.add(c2);
		courseTree.add(c3);
		courseTree.add(c4);
		System.out.println(courseTree);
	}
}