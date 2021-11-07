import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.jobs.WorkflowJob

dslFactory.pipelineJob('job-dsl-plugin') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/shettyshrikanth/service-template.git')
                    }
                    branch('*/master')
                }
            }
            lightweight()
        }
    }
}