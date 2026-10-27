package com.example.demo.worflows;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface TestWorkFlow {
    @WorkflowMethod
    String sayHello(String name);
}
