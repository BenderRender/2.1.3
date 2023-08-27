import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanLast = applicationContext.getBean("helloworld",HelloWorld.class);

        Cat beanFirstCat = applicationContext.getBean("cat",Cat.class);
        Cat beanLastCat = applicationContext.getBean("cat",Cat.class);

        System.out.println(bean == beanLast);
        System.out.println(beanFirstCat == beanLastCat);
    }
}