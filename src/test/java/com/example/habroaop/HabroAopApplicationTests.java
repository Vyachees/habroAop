package com.example.habroaop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


class HabroAopApplicationTests extends AbstractTest {

    @Autowired
    private MyService service;

    @Test
    public void testLoggable() {
        List<String> list = new ArrayList<>();
        list.add("test");

        service.method1(list);
        service.method2();
        Assert.assertTrue(service.check());
    }

    @Test
    public void testCache() {

        int num1 = service.cachemethod3(1);
        int num2 = service.cachemethod3(2);
        int num3 = service.cachemethod3(1);
        int num4 = service.cachemethod3(2);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

}
