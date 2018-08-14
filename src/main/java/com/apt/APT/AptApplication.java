package com.apt.APT;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class AptApplication {

	public static void main(String[] args) {
		SpringApplication.run(AptApplication.class, args);
	}
	
	
	 @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan("com.apt.APT");
	        Properties hibernateProperties = new Properties();
	        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.SQLServer2012Dialect");
	        hibernateProperties.put("hibernate.show_sql", "yes");
	        hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
	        sessionFactory.setHibernateProperties(hibernateProperties);
	        return sessionFactory;
	    }
	 
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        dataSource.setUrl("jdbc:sqlserver://localhost;databaseName=test");
	        dataSource.setUsername("test");
	        dataSource.setPassword("pass@12345");
	        return dataSource;
	    }
	 
	 @Bean
	    public HibernateTransactionManager transactionManager() {
	        HibernateTransactionManager txManager = new HibernateTransactionManager();
	        txManager.setSessionFactory(sessionFactory().getObject());
	        return txManager;
	    }
	 
	 @Bean
	 @Qualifier(value = "entityManager")
	 public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
	     return entityManagerFactory.createEntityManager();
	 }

}
