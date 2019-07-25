package com.litsoft.cctv.common;

import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author linsa
 * @date 2019-07-24 10:52
 **/
@Configuration
@MapperScan(basePackages = "com.litsoft.cctv.mapper")
public class DataSourceConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "jdbc.ds")
    public DataSource readDataSource() {
        return new DruidDataSource();
    }
}
