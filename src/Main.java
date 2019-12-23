import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
/*//        不使用框架之前的步骤
//        创建一个HelloWorld对象
        HelloWorld hello = new HelloWorld();
//        为实例对象的属性赋值
        hello.setName("Spring");
//        调用对象方法
        hello.sayHello();*/

//创建一个Spring的IOC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        调用sayHello方法
        helloWorld.sayHello();
    }
}
