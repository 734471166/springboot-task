package netwanho.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {

    //每隔五秒触发一次
    @Scheduled(cron = "0/5 * * * * *")
    public void work(){
        System.out.println("执行了任务work()");
    }

    //特定的时间触发
    @Scheduled(cron = "30 58 15 * * *")
    public void work1(){
        System.out.println("执行了任务work1()");
    }

    //固定时间间隔
    //每隔五秒执行一次
    @Scheduled(fixedDelay = 1000*5)
    public void work3(){
        System.out.println("执行了work3()");
    }

    //固定频率任务
    @Scheduled(fixedRate = 1000*5)
    public void work4(){
        System.out.println("执行了work4()");
    }


}
