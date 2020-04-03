package net.gaven.redisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 缓存  排行榜  top N  添加积分  uid查找排行
 *
 */
@SpringBootApplication
@MapperScan("net.gaven.redisdemo.mapper")
public class RedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApplication.class, args);
    }

}
