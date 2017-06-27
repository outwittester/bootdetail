package com.foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by xikaixiong on 6/26/17.
 */
//@Configuration tells this class is a source of bean definition for the application context
@Configuration
public class DataSourceConfig {


    public DataSourceConfig() {
    }

    @Bean(name="datasource")
    @Profile(value = "development")
    DataSource development() {
        return new DataSource("my-development-url", 9999);
    }

    @Bean(name="datasource")
    @Profile(value = "production")
    DataSource production() {
        return new DataSource("my-production-url", 9999);
    }
}
