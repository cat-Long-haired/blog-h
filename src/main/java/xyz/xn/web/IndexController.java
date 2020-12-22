package xyz.xn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.xn.NotFoundException;

@Controller
public class IndexController {

     @GetMapping("/")
     public String index () {
//        int i = 1/0;
//        String blog = null;
//        if (blog == null) {
//           throw new NotFoundException("博客找不到");
//        }
//        System.out.println("----index----");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

}
