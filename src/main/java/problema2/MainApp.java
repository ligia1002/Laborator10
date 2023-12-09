package problema2;

import java.io.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_lab10.xml");
        Vehicul veh = (Vehicul) context.getBean("vehicul");
        System.out.println(veh);
        Vehicul autoturism1 = (Vehicul) context.getBean("auto1");
        System.out.println(autoturism1);
        Vehicul autoturism2= (Vehicul) context.getBean("auto2");
        System.out.println(autoturism2);

    }
}

