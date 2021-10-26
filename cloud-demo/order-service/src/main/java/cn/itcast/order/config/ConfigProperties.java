package cn.itcast.order.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(value = "common")//拼接Nacos中common.name
public class ConfigProperties {
    private String name;
}
