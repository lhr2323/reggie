package com.itheima.reggie.dto;

import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

/*
DTO 全称为Data Transfer Object，即数据传输对象，一般用于展示层与服务层的数据传输
为什么使用？  客户端传输的数据与实体类的属性并不是一一对应（有实体类不存在的属性），需要通过继承来扩充属性
 */
@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
