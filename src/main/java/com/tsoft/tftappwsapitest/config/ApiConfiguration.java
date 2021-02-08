package com.tsoft.tftappwsapitest.config;

import com.tsoft.tftappwsapitest.config.filters.ApiTestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {

    /*@Bean
    public FilterRegistrationBean dawsonApiFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new ApiTestFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }*/
}
