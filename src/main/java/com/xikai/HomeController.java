package com.xikai;

import com.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xikaixiong on 6/25/17.
 */
@RestController
public class HomeController {
    //this is property based injection which is not the best way for testing
//    @Autowired
    private NotificationService notificationService ;

    @Value("${my.secret}")
    private String mySecret;

    @Value("${spring.profiles.active}")
    private String enviroment;

    @Value("${pageController.msg}")
    private String pageControllerMsg;

    @Value("${msg}")
    private String msg;

    //constructor based injection
    @Autowired
    public HomeController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/")
    public String home() {
//        return notificationService.toString()+pageControllerMsg+mySecret;
        return msg;
    }
}
