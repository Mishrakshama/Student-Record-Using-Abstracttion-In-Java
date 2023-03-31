package project;

public class StudentDemo {
	public static void main(String arg[])
	  {
	    Online o = new Online("Jane Doe", 1000, "Coursera", 9);
	    o.basics();
	    o.subjects();
	    o.learningcost();
	    o.details();
	  }
}
