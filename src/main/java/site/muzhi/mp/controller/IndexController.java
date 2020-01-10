package site.muzhi.mp.controller;/**
 * @author lichuang
 * @date 2020/1/9
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lichuang
 * @date: 2020/01/09
 * @description: TODO
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
