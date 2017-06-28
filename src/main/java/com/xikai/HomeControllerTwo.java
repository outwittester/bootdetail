package com.xikai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xikaixiong on 6/27/17.
 */

@Controller
@RequestMapping("/posts")
public class HomeControllerTwo {
    @RequestMapping("/")
    public String leaf() {
        return "views/list";
    }
}
