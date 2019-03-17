import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainProviderAppliction {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("provider.xml");

        //启动容器
        applicationContext.start();

        System.in.read(); //方便控制台查看 进行阻塞



    }
}
