package org.kyle.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author kyle1
 * @Description TODO
 * @Date 2022/6/20 16:42
 * @Version 1.0
 */
@Component
public class RunDemo implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        new Thread(()-> {
            while (true) {
                System.out.println(Thread.currentThread().getName()+"-------------");
            }
        }).run();
        new Thread(()-> {
            while (true) {
                System.out.println(Thread.currentThread().getName()+"-------------");
            }
        }).run();
    }
}
