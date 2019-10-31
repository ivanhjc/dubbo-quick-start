package net.ivanhjc.demo.dubbo.quick.start.provider;


import net.ivanhjc.demo.dubbo.quick.start.api.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}