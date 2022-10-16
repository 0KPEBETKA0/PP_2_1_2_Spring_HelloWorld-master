import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat bean3 = applicationContext.getBean("сat", Cat.class);
        System.out.println(bean3.getMessage());
        Cat bean4 = applicationContext.getBean("сat", Cat.class);
        System.out.println(bean4.getMessage());

        System.out.println("HelloWorld: " + (bean1 == bean2));
        System.out.println("Cat: " + (bean3 == bean4));
    }
}