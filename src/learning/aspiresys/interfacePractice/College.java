package learning.aspiresys.interfacePractice;

public interface College {
	 void print();
	 default void quota()
	{
		System.out.println("EVERY COLLEGE HAS 20% OF SPORTS QUOTA");
	}

}
