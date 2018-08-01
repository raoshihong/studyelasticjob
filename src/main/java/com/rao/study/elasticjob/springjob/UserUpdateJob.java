package com.rao.study.elasticjob.springjob;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserUpdateJob {

    @Scheduled(cron = "3/10 * * * * ?")  //从第三秒开始,每隔10秒执行一次
    public void task(){
        log.info("任务调度中");
    }
}
