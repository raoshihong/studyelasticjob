package com.rao.study.elasticjob.elasticjob;

import com.dangdang.ddframe.job.api.JobExecutionMultipleShardingContext;
import com.dangdang.ddframe.job.plugin.job.type.simple.AbstractSimpleElasticJob;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoanApplicationJob extends AbstractSimpleElasticJob{//elasticJob一定要实现相应的Job类

    public void process(JobExecutionMultipleShardingContext shardingContext) {
        log.info(""+shardingContext.getJobName());
    }
}
