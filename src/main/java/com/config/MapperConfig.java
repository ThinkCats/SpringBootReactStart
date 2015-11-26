package com.config;

import lombok.Value;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by Wanglei on 15/11/26.
 */


@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@MapperScan("com.mapper")
public class MapperConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public DataSourceTransactionManager transactionManager()
    {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        transactionManager.setNestedTransactionAllowed(true);
        return transactionManager;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeAliasesPackage("com.domain");
        return sessionFactory;
    }

}
