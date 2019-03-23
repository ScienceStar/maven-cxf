import clientServer.MyServiceImplService;
import org.example.mywsdl.IMyService;
import org.junit.Test;

/**
 *@program: maven-cxf
 *@description: webservice客户端测试
 *@author: liuxincheng
 *@create: 2019-03-21 15:57
 */
public class WebService {

    @Test
    public void testClient2(){
        MyServiceImplService service=new MyServiceImplService();
        IMyService ms=service.getMyServiceImplPort();
        System.out.println(ms.minus(20,5));
        System.out.println("运算结束......................!");
    }
}