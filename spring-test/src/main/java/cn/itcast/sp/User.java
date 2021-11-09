package cn.itcast.sp;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
