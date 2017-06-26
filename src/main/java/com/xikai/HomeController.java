package com.xikai;

import com.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xikaixiong on 6/25/17.
 */
@RestController
public class HomeController {
    //this is property based inject which is not the best way for testing
    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/")
    public String home() {
        return notificationService.toString();
    }
}
