import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

import java.io.IOException;

/**
 * 测试服务调用情况
 */
public class ConsumerApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService=applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用完成");
        System.in.read(); //方便控制台查看 进行阻塞
    }

}
