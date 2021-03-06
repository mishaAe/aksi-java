package ru.formatq.telegram.aksi.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class AppConfig {

    @Bean
    TelegramBotsApi telegramBotsApi() {
        return new TelegramBotsApi();
    }

    @PostConstruct
    public void init() throws Exception {
        ApiContextInitializer.init();
    }

}