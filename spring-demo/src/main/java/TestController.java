import com.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Object student = context.getBean("student");
		System.out.println(student.toString());
		context.close();

	}

}
