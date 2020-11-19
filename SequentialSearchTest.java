public class SequentialSearchTest{
	public static void main(String[] args) {
		SequentialSearch<String, Integer> obj = new SequentialSearch<String, Integer>();
		obj.put("Dawa",7);
		obj.put("Nima",8);
		obj.put("Karma",10);
		obj.put("Sum",5);
		obj.delete("");

		assert(obj.size() == 3);

		System.out.println(obj.keys());
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());

        System.out.println("Test Cases Passed");

	}
}