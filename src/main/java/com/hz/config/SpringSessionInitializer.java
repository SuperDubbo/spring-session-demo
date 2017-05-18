package com.hz.config;

import com.hz.redis.RedisHttpSessionConfig;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by Jack on 2017/5/18.
 */
public class SpringSessionInitializer extends AbstractHttpSessionApplicationInitializer {

    public SpringSessionInitializer() {
        super(RedisHttpSessionConfig.class);
    }
}
