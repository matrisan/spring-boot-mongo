package com.github.mongo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

/**
 * <p>
 * 创建时间为 14:39 2019-08-20
 * 项目名称 spring-boot-mongo
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Setter
@Getter
@ToString
@Document(collection = "complex_data")
public class ComplexDataDO {

    @Id
    private String id;

    @Indexed(unique = true)
    private String name;

    private Map<String, Integer> data;

}
