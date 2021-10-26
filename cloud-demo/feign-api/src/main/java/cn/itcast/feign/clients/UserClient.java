package cn.itcast.feign.clients;


import cn.itcast.feign.config.InterceptorFeignConfiguration;
import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.CollectionFormat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userservice",configuration = InterceptorFeignConfiguration.class)
public interface UserClient {

    @GetMapping("/user/{id}")
//    @CollectionFormat(feign.CollectionFormat.CSV)
    User findById(@PathVariable("id") Long id);
//    User findById(@SpringQueryMap Long id);
}
