package christu.deadman.springtutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Candidate {
	public static void main(String[] args) {

//		Student student = new Student();
//		MathCheat cheat = new MathCheat();
//		student.setMathCheat(cheat);
//		student.setstudentId(3);
//		student.cheating();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = context.getBean("student",Student.class);
		student.cheating();
		AnotherStudent anotherStudent = context.getBean("anotherstudent",AnotherStudent.class);
		anotherStudent.cheating();


	}

}
