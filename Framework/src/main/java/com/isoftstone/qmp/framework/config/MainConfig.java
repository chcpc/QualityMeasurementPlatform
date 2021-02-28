package com.isoftstone.qmp.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.isoftstone.qmp.business.dao")
public class MainConfig {
}
