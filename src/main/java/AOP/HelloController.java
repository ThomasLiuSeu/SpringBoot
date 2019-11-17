package AOP;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2019/6/13.
 */
@RestController
public class HelloController {

    @RequestMapping (value ="/hello1", method = RequestMethod.GET)
    public String Hello() {
        String sentance = "HI Thomas";
        System.out.println(sentance);
        return sentance;
    }
}
