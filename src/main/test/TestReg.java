import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lxc
 * @Title: TestReg
 * @ProjectName maven-cxf
 * @Description: TODO
 * @date 2019/1/2 9:10
 */
public class TestReg {

    @Test
    public void testShow() {
        System.out.println("Hello");
    }

    @Test
    public void testReg1() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com");
        while (m.find( )) {
            System.out.println(m.group(0));
        }
    }

    @Test
    public void testReg2(){
        List<String> stringList = new ArrayList<String>();
        String str ="sffddffdd43ewwrre";
        String reg = "\\d+";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()){
            stringList.add(matcher.group());
        }
        String num = "";
        for(String s : stringList){
            num+= s;
        }

        System.out.println(num);
    }
}
