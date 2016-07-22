import com.builder.Developer;
import com.builder.ResponseVO;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Developer developer = new Developer.Builder("Mac pro").setBook("白夜行").setPhone("lePhone").build();
        System.out.println("Hello World!");

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("name", "傅作魁");
        ResponseVO responseVO = new ResponseVO.Success( data).build();
        ResponseVO responseVO1 = new ResponseVO.Fail( "1001", "as系统错误").setErrorcode("9001").setErrormsg("openk系统错误").build();
        System.out.println("Hello World!");
    }
}
