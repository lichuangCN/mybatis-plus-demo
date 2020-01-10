package site.muzhi.mp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

/**
 * MyBatisPlusConfig
 *
 * @author: lichuang
 * @date: 2020/01/09
 * @description: ..
 */

public class MyBatisPlusConfig {

    private final static Logger logger = LoggerFactory.getLogger(MyBatisPlusConfig.class);

    /**
     * 注册分页插件
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        logger.debug("注册分页插件");
        return new PaginationInterceptor();
    }


}
