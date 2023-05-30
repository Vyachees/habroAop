package com.example.habroaop;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    public void method1(List<String> list) {
        list.add("method1");
        System.out.println("MyService method1 list.size=" + list.size());
    }


    public void method2() {
        System.out.println("MyService method2");
    }

    @Cacheable("cachemethod3")
    public int cachemethod3(int id) {

        System.out.println("cachemethod3 with " + id);
        return imitationGetFromDB(id);
    }

    public int imitationGetFromDB(int id) {
        if (id == 1) {
            System.out.println("get from db by " + id);
            return 100;
        } else if (id == 2) {
            System.out.println("get from db by " + id);
            return 200;
        } else {
            System.out.println("get from db by " + id);
            return 0;
        }
    }

    public boolean check() {
        System.out.println("MyService check");
        return true;
    }
}
