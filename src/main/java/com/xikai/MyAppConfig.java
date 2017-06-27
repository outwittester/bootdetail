package com.xikai;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xikaixiong on 6/26/17.
 */
@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyAppConfig {

    private String appName;
    private String appDescription;
    private String adminFirstName;
    private String adminLastName;
    private String adminEmail;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "MyAppConfig is{"+appName+'\''+appDescription+'\''+adminFirstName+'\''+adminLastName+'\''+adminEmail+"}";
    }
}
