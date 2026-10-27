package com.example.demo.activities;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface TestActivity {
    @ActivityMethod
    String sayHello(String name);
}
