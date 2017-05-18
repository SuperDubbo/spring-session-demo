package com.hz.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Jack on 2017/5/18.
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 7200
)
public class RedisHttpSessionConfig {


    /**
     * 如果在application.properties中配置了redis连接相关信息，此处可以忽略
     * 如果两处都存在时，以代码里面的配置为准
     * @return
     */
    @Bean
    public RedisConnectionFactory connectionFactory(){
        JedisConnectionFactory connectionFactory=new JedisConnectionFactory();
        connectionFactory.setPort(6379);
        connectionFactory.setHostName("localhost");
        return connectionFactory;
    }
}
